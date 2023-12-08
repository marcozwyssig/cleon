package cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import ch.actifsource.core.INode;
import ch.actifsource.core.job.IReadJobExecutor;
import ch.actifsource.core.job.Select;
import ch.actifsource.core.model.aspects.AspectImplementationDecorator;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.set.INodeSet;
import ch.actifsource.core.set.NodeSet;
import ch.actifsource.util.log.Logger;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.FunctionSpace_IP.IIPRangeFunctions;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.FunctionSpace_IP.IIPv4_MaskFunctions;
import cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractPhysicalNetwork;

public class CidrAspectDecorator extends AspectImplementationDecorator {

	private static void addNetworks(IReadJobExecutor executor, IIPv4_Mask cidr, NodeSet ipNodeSet) {
	    final int mask = cidr.selectMask();
	    final var range = cidr.extension(IIPv4_MaskFunctions.class).SelectIPRange();
	    if ((range == null) || (mask <= 20 && mask > 32)) {
	        return;
	    }

	    try {
	        final var subnet = new SubnetUtils(Select.simpleName(executor, cidr.getResource()));
	        final var rangeFunctions = range.extension(IIPRangeFunctions.class);
	        if (mask == 32) {
	            addIPv4Address(rangeFunctions, subnet.getInfo().getAddress(), ipNodeSet);
	        } else {
	            for (final String ip : subnet.getInfo().getAllAddresses()) {
	                addIPv4Address(rangeFunctions, ip, ipNodeSet);
	            }
	        }
	    } catch (final IllegalArgumentException e) {
	        logException(e);
	    }
	}
	
	private static void addIPv4Address(IIPRangeFunctions range, String ipAddress, NodeSet ipNodeSet) {
	    final var ipv4 = range.toIPv4(ipAddress);
	    if (ipv4 != null) {
	        ipNodeSet.add(ipv4.getResource());
	    }
	}

	private static void logException(Exception e) {
	    try (StringWriter out = new StringWriter();
	        PrintWriter writer = new PrintWriter(out)) {
	        e.printStackTrace(writer);
	        Logger.instance().logInfo(out.toString());
	    } catch (IOException e1) {
			// TODO Auto-generated catch block
	    	Logger.instance().logInfo(e1.toString());
		}
	}	

	@Override
	public INodeSet getDecoratableNodes(IReadJobExecutor executor, INode subject, INode decoratingRelation) {
	    final var typeSystem = TypeSystem.create(executor);
	    final var network = typeSystem.getResourceRepository().getResource(IAbstractPhysicalNetwork.class, subject);
	    final var ipNodeSet = new NodeSet();
	    for (IIPv4_Mask cidr : network.selectCidrs()) {
	        addNetworks(executor, cidr, ipNodeSet);
	    }
	    return ipNodeSet;
	}
}