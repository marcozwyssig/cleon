package cleon.modelinglanguages.network.metamodel.spec.javamodel;

import java.util.Collection;
import java.util.List;

import ch.actifsource.core.INode;
import ch.actifsource.core.Resource;
import ch.actifsource.core.job.Select;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.model.aspects.impl.AbstractAllInstancesRefactorerAspect;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.update.IModifiable;
import cleon.modelinglanguages.network.metamodel.spec.SpecPackage;
import cleon.modelinglanguages.network.metamodel.spec.FunctionSpace_Network.IAbstractNetworkFunctions;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.FunctionSpace_IP.IIPRangeFunctions;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask;

public class MoveIpAndHostRefactorAspect extends AbstractAllInstancesRefactorerAspect {
	public MoveIpAndHostRefactorAspect() {
		super("1.0", 2020, 1, 3, "reassign ip and host objects", SpecPackage.AbstractPhysicalNetwork);
	}

	@Override
	protected void refactor(final IModifiable modifiable, final ch.actifsource.core.Package _package, final INode node) {
		final var typeSystem = TypeSystem.create(modifiable);
		final var resourceRepository = typeSystem.getResourceRepository();
		final var abstractPhysicalNetwork = resourceRepository
				.getResource(IAbstractPhysicalNetwork.class, node);
		final List<? extends IIPv4_Mask> cidrs = abstractPhysicalNetwork.selectCidrs();
		if (cidrs.isEmpty()) {
			return;
		}
		refactor(modifiable, abstractPhysicalNetwork);		
	}

	private void refactor(final IModifiable modifiable, final IAbstractPhysicalNetwork abstractPhysicalNetwork) {
		final java.util.Map<Resource, ? extends IAbstractNetworkNode> nodeMap = abstractPhysicalNetwork.selectNodes();
		if (nodeMap == null) {
			return;
		}

		final var range = abstractPhysicalNetwork.extension(IAbstractNetworkFunctions.class).GetIPRange();
		final var functions = range.extension(IIPRangeFunctions.class);

		final Collection<? extends IAbstractNetworkNode> nodes = nodeMap.values();
		for (final IAbstractNetworkNode networkNode : nodes) {

			final var newIP = Select.simpleName(modifiable, networkNode.selectIp().getResource());
			final var newIPObj = functions.toIPv4(newIP);
			if (newIPObj == null) {
				throw new RuntimeException("IP " + newIP + " has not been found");
			}

			Update.createOrModifyStatement(modifiable, abstractPhysicalNetwork.getPackage(), networkNode.getResource(),
					SpecPackage.AbstractNetworkNode_ip, newIPObj.getResource());
		}
	}
}