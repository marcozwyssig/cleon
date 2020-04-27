package cleon.modelinglanguages.network.metamodel.spec.javamodel;

import java.util.Collection;
import java.util.List;

import ch.actifsource.core.INode;
import ch.actifsource.core.Resource;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.job.Select;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.model.aspects.impl.AbstractAllInstancesRefactorerAspect;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.update.IModifiable;
import cleon.modelinglanguages.network.metamodel.spec.SpecPackage;
import cleon.modelinglanguages.network.metamodel.spec.FunctionSpace_Network.IAbstractNetworkFunctions;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.FunctionSpace_IP.IIPRangeFunctions;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPRange;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_D;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask;

public class MoveIpAndHostRefactorAspect extends AbstractAllInstancesRefactorerAspect {
	public MoveIpAndHostRefactorAspect() {
		super("1.0", 2020, 1, 3, "reassign ip and host objects", SpecPackage.AbstractPhysicalNetwork);
	}

	@Override
	protected void refactor(IModifiable modifiable, ch.actifsource.core.Package _package, INode node) {
		ITypeSystem typeSystem = TypeSystem.create(modifiable);
		IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();
		IAbstractPhysicalNetwork abstractPhysicalNetwork = resourceRepository
				.getResource(IAbstractPhysicalNetwork.class, node);
		List<? extends IIPv4_Mask> cidrs = abstractPhysicalNetwork.selectCidr();
		if (cidrs.isEmpty()) {
			return;
		}
		refactor(modifiable, abstractPhysicalNetwork);		
	}

	private void refactor(IModifiable modifiable, IAbstractPhysicalNetwork abstractPhysicalNetwork) {
		java.util.Map<Resource, ? extends IAbstractNetworkNode> nodeMap = abstractPhysicalNetwork.selectNodes();
		if (nodeMap == null) {
			return;
		}

		IIPRange range = abstractPhysicalNetwork.extension(IAbstractNetworkFunctions.class).GetIPRange();
		IIPRangeFunctions functions = range.extension(IIPRangeFunctions.class);

		Collection<? extends IAbstractNetworkNode> nodes = nodeMap.values();
		for (IAbstractNetworkNode networkNode : nodes) {

			String newIP = Select.simpleName(modifiable, networkNode.selectIPv4_D().getResource());
			IIPv4_D newIPObj = functions.toIPv4(newIP);
			if (newIPObj == null) {
				throw new RuntimeException("IP " + newIP + " has not been found");
			}

			Update.createOrModifyStatement(modifiable, abstractPhysicalNetwork.getPackage(), networkNode.getResource(),
					SpecPackage.AbstractNetworkNode_iPv4_aE_D, newIPObj.getResource());
		}
	}
}