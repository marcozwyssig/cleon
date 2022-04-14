package cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

import ch.actifsource.core.INode;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.job.IReadJobExecutor;
import ch.actifsource.core.job.Select;
import ch.actifsource.core.model.aspects.AspectImplementationDecorator;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.set.INodeSet;
import ch.actifsource.core.set.NodeSet;
import ch.actifsource.util.log.Logger;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.FunctionSpace_IP.IIPRangeFunctions;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.FunctionSpace_IP.IIPv4_MaskFunctions;
import cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractPhysicalNetwork;

public class CidrAspectDecorator extends AspectImplementationDecorator {

	private static void addNetworks(IReadJobExecutor executor, IIPv4_Mask cidr, NodeSet ipNodeSet) {
		final IIPRange range = cidr.extension(IIPv4_MaskFunctions.class).SelectIPRange();
		if( range == null) {			
			return;
		}

		if (cidr.selectMask() <= 20 && cidr.selectMask() > 32) {
			return;
		}

		try {
			final SubnetUtils subnet = new SubnetUtils(Select.simpleName(executor, cidr.getResource()));

			if (cidr.selectMask() == 32 ) {
				final IIPv4_D ipv4 = range.extension(IIPRangeFunctions.class).toIPv4(subnet.getInfo().getAddress());				
				if( ipv4 != null) {
					ipNodeSet.add(ipv4.getResource());
				}				
			} else {
				for( final String ip : subnet.getInfo().getAllAddresses())
				{
					final IIPv4_D ipv4 = range.extension(IIPRangeFunctions.class).toIPv4(ip);
					if( ipv4 != null) {
						ipNodeSet.add(ipv4.getResource());
					}
				}				
			}
		} catch (final IllegalArgumentException e) {
			final StringWriter out = new StringWriter();
			final PrintWriter writer = new PrintWriter(out);

			e.printStackTrace(writer);
			writer.flush();

			Logger.instance().logInfo(out.toString());

		}		
	}

	@Override
	public INodeSet getDecoratableNodes(IReadJobExecutor executor, INode subject, INode decoratingRelation) {
		final ITypeSystem typeSystem = TypeSystem.create(executor);
		final IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();

		final IAbstractPhysicalNetwork network = resourceRepository.getResource(IAbstractPhysicalNetwork.class, subject); 
		final NodeSet ipNodeSet = new NodeSet();
		final List<? extends IIPv4_Mask> cidrs = network.selectCidrs();
		cidrs.stream().forEach(x -> addNetworks(executor, x, ipNodeSet));
		return ipNodeSet;
	}
}