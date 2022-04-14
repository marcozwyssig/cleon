package cleon.modelinglanguages.network.metamodel.spec.javamodel;

import java.util.List;

import ch.actifsource.core.job.Update;
import ch.actifsource.core.undo.GlobalEditContext;
import ch.actifsource.core.undo.IEditContext;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.core.validation.quickfix.AbstractQuickFix;
import ch.actifsource.core.validation.quickfix.IInconsistencyEnablement;
import cleon.modelinglanguages.network.metamodel.spec.FunctionSpace_Network.IAbstractNetworkFunctions;
import cleon.modelinglanguages.network.metamodel.spec.SpecPackage;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.FunctionSpace_IP.IIPRangeFunctions;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPRange;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_D;

public class FixIPAddressQuickFix extends AbstractQuickFix {

	private final List<IAbstractNetworkNode> nodes;
	private final IAbstractPhysicalNetwork _abstractPhysicalNetwork;

	public FixIPAddressQuickFix(IAbstractPhysicalNetwork abstractPhysicalNetwork,
			List<IAbstractNetworkNode> toFixedList, IInconsistencyEnablement enablement) {
		super(String.format("fix IP address"), "TODO", enablement);
		this.nodes = toFixedList;
		_abstractPhysicalNetwork = abstractPhysicalNetwork;
	}

	@Override
	protected void doApply(IModifiable modifiable) {
		final IIPRange range = _abstractPhysicalNetwork.extension(IAbstractNetworkFunctions.class).GetIPRange();
		final IIPRangeFunctions functions = range.extension(IIPRangeFunctions.class);

		_abstractPhysicalNetwork.selectCidrs().stream().forEach(x -> {
			final String cidrRange = x.selectIPv4();
			final String[] parts = cidrRange.trim().split("\\.");

			for (final IAbstractNetworkNode node : nodes) {
				final String newIP = String.format("%1$d.%2$d.%3$d.%4$d", Integer.parseInt(parts[0]),
						Integer.parseInt(parts[1]), Integer.parseInt(parts[2]), node.selectIPv4_D().selectIp());
				final IIPv4_D newIPObj = functions.toIPv4(newIP);
				if (newIPObj == null) {
					throw new RuntimeException("IP " + newIP + " has not been found");
				}

				Update.createOrModifyStatement(modifiable, _abstractPhysicalNetwork.getPackage(), node.getResource(),
						SpecPackage.AbstractNetworkNode_iPv4_aE_D, newIPObj.getResource());
			}
		});

	}

	@Override
	protected IEditContext getEditContext() {
		return GlobalEditContext.DEFAULT;
	}

}
