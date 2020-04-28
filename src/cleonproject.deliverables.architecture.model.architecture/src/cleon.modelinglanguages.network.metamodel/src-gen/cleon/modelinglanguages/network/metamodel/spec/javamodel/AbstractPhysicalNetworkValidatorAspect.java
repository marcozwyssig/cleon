package cleon.modelinglanguages.network.metamodel.spec.javamodel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import ch.actifsource.core.Resource;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.job.Select;
import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.SingleStatementInconsistency;
import ch.actifsource.core.validation.quickfix.IInconsistencyEnablement;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.SubnetUtils;

public class AbstractPhysicalNetworkValidatorAspect implements IResourceValidationAspect {

	@Override
	public void validate(ValidationContext validationContext, List<IResourceInconsistency> validationList) {
		ITypeSystem typeSystem = TypeSystem.create(validationContext.getReadJobExecutor());
		IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();
		IAbstractPhysicalNetwork abstractPhysicalNetwork = resourceRepository
				.getResource(IAbstractPhysicalNetwork.class, validationContext.getResource());
		
		
		validate(validationContext, validationList, abstractPhysicalNetwork);
	}
	
	private void validate(ValidationContext validationContext, List<IResourceInconsistency> validationList, IAbstractPhysicalNetwork abstractPhysicalNetwork) {
		java.util.Map<Resource, ? extends IAbstractNetworkNode> nodeMap = abstractPhysicalNetwork.selectNodes();
		if (nodeMap == null) {
			return;
		}

		List<? extends IIPv4_Mask> cidrs = abstractPhysicalNetwork.selectCidr();
		Collection<? extends IAbstractNetworkNode> nodes = nodeMap.values();
		ArrayList<IAbstractNetworkNode> toFixedList = new ArrayList<IAbstractNetworkNode>();
		for (IAbstractNetworkNode node : nodes) {
			boolean isInRange = false;
			for( IIPv4_Mask cidr : cidrs) {
				SubnetUtils subnet = new SubnetUtils(
						Select.simpleName(validationContext.getReadJobExecutor(), cidr.getResource()));
				
				isInRange = subnet.getInfo().isInRange(
						Select.simpleName(validationContext.getReadJobExecutor(), node.selectIPv4_D().getResource()));
				if(isInRange) {
					break;
				}
			}
			if (!isInRange) {
				toFixedList.add(node);
			}			
		}

		if (!toFixedList.isEmpty()) {
			
			// Add quick fix
			FixIPAddressQuickFix fixMissingIP = new FixIPAddressQuickFix(abstractPhysicalNetwork, toFixedList,
					new IInconsistencyEnablement() {
						@Override
						public boolean isEnabled() {
							return true;
						}
					});

			for (IAbstractNetworkNode node : toFixedList) {
				String ip = Select.simpleName(validationContext.getReadJobExecutor(), node.selectIPv4_D().getResource());
				
				ch.actifsource.core.Statement nodeNetwork = Select.relationStatementOrNull(
						validationContext.getReadJobExecutor(),
						cleon.modelinglanguages.network.metamodel.spec.SpecPackage.AbstractPhysicalNetwork_nodes,
						abstractPhysicalNetwork.getResource());

				String message = String.format("IP address %s is valid and can maybe be moved", ip);
				validationList.add(new SingleStatementInconsistency(nodeNetwork, message, fixMissingIP));
			}
		}		
	}
}
