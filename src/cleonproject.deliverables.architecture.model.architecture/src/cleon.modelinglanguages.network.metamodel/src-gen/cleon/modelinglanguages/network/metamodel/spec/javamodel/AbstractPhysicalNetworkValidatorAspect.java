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
import cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.SubnetUtils;

public class AbstractPhysicalNetworkValidatorAspect implements IResourceValidationAspect {
	private final int LOW = 32;

	@Override
	public void validate(ValidationContext validationContext, List<IResourceInconsistency> validationList) {
		final ITypeSystem typeSystem = TypeSystem.create(validationContext.getReadJobExecutor());
		final IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();
		final IAbstractPhysicalNetwork abstractPhysicalNetwork = resourceRepository
				.getResource(IAbstractPhysicalNetwork.class, validationContext.getResource());

		validate(validationContext, validationList, abstractPhysicalNetwork);
	}

	private void validate(ValidationContext validationContext, List<IResourceInconsistency> validationList,
			IAbstractPhysicalNetwork abstractPhysicalNetwork) {
		final java.util.Map<Resource, ? extends IAbstractNetworkNode> nodeMap = abstractPhysicalNetwork.selectNodes();
		if (nodeMap == null) {
			return;
		}

		final List<? extends IIPv4_Mask> cidrs = abstractPhysicalNetwork.selectCidr();
		final Collection<? extends IAbstractNetworkNode> nodes = nodeMap.values();
		final ArrayList<IAbstractNetworkNode> toFixedList = new ArrayList<>();
		for (final IAbstractNetworkNode node : nodes) {
			boolean isInRange = false;
			for (final IIPv4_Mask cidr : cidrs) {
				final String ip = Select.simpleName(validationContext.getReadJobExecutor(),
						node.selectIPv4_D().getResource());
				if (cidr.selectMask() == LOW) {
					isInRange = cidr.selectIPv4().equals(ip);

				} else {
					final SubnetUtils subnet = new SubnetUtils(
							Select.simpleName(validationContext.getReadJobExecutor(), cidr.getResource()));
					isInRange = subnet.getInfo().isInRange(ip);
				}
				if (isInRange) {
					break;
				}
			}
			if (!isInRange) {
				toFixedList.add(node);
			}
		}

		if (!toFixedList.isEmpty()) {

			// Add quick fix
			final FixIPAddressQuickFix fixMissingIP = new FixIPAddressQuickFix(abstractPhysicalNetwork, toFixedList,
					() -> true);

			for (final IAbstractNetworkNode node : toFixedList) {
				final String ip = Select.simpleName(validationContext.getReadJobExecutor(),
						node.selectIPv4_D().getResource());

				final ch.actifsource.core.Statement nodeNetwork = Select.relationStatementOrNull(
						validationContext.getReadJobExecutor(),
						cleon.modelinglanguages.network.metamodel.spec.SpecPackage.AbstractPhysicalNetwork_nodes,
						abstractPhysicalNetwork.getResource());

				final String message = String.format("IP address %s is valid and can maybe be moved", ip);
				validationList.add(new SingleStatementInconsistency(nodeNetwork, message, fixMissingIP));
			}
		}
	}
}
