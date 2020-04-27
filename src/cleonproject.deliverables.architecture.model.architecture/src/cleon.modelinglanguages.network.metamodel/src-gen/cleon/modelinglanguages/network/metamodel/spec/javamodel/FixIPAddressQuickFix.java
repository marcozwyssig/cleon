package cleon.modelinglanguages.network.metamodel.spec.javamodel;

import java.util.ArrayList;
import java.util.List;

import ch.actifsource.core.job.Update;
import ch.actifsource.core.undo.GlobalEditContext;
import ch.actifsource.core.undo.IEditContext;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.core.validation.quickfix.AbstractQuickFix;
import ch.actifsource.core.validation.quickfix.IInconsistencyEnablement;
import ch.actifsource.util.collection.IList;
import cleon.modelinglanguages.network.metamodel.spec.FunctionSpace_Network.IAbstractNetworkFunctions;
import cleon.modelinglanguages.network.metamodel.spec.FunctionSpace_Network.IAbstractPhysicalNetworkFunctions;
import cleon.modelinglanguages.network.metamodel.spec.SpecPackage;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.FunctionSpace_IP.IIPRangeFunctions;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.FunctionSpace_IP.IIPv4_DFunctions;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.FunctionSpace_IP.IPRangeFunctions;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPRange;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_A;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_B;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_C;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_D;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IPv4_A;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IPv4_B;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IPv4_C;

public class FixIPAddressQuickFix extends AbstractQuickFix {

	private List<IAbstractNetworkNode> nodes;
	private IAbstractPhysicalNetwork _abstractPhysicalNetwork;
	
	public FixIPAddressQuickFix(IAbstractPhysicalNetwork abstractPhysicalNetwork, List<IAbstractNetworkNode> toFixedList, IInconsistencyEnablement enablement ) {
    	super(String.format("fix IP address"), "TODO", enablement);
    	this.nodes = toFixedList;
    	_abstractPhysicalNetwork= abstractPhysicalNetwork;
	}
	
	@Override
	protected void doApply(IModifiable modifiable) {
		IIPRange range = _abstractPhysicalNetwork.extension(IAbstractNetworkFunctions.class).GetIPRange();
		IIPRangeFunctions functions = range.extension(IIPRangeFunctions.class);
						
		_abstractPhysicalNetwork.selectCidr().stream().forEach(x -> {
			String cidrRange = x.selectIPv4();
			String[] parts = cidrRange.trim().split("\\.");
			
			for( IAbstractNetworkNode node : nodes) {
				String newIP = String.format("%1$d.%2$d.%3$d.%4$d", Integer.parseInt(parts[0]), Integer.parseInt(parts[1]), Integer.parseInt(parts[2]), node.selectIPv4_D().selectIp());
				IIPv4_D newIPObj = functions.toIPv4(newIP);
				if(newIPObj == null) {
					throw new RuntimeException("IP " + newIP + " has not been found");
				}
				
				Update.createOrModifyStatement(modifiable, _abstractPhysicalNetwork.getPackage(), node.getResource(), SpecPackage.AbstractNetworkNode_iPv4_aE_D, newIPObj.getResource());			
			}			
		});

	}

	@Override
	protected IEditContext getEditContext() {
		return GlobalEditContext.DEFAULT;
	}

}
