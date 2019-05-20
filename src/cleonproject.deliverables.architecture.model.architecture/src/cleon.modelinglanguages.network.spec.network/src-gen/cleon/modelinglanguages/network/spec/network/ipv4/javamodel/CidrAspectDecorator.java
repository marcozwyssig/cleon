package cleon.modelinglanguages.network.spec.network.ipv4.javamodel;

import ch.actifsource.core.INode;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.job.IReadJobExecutor;
import ch.actifsource.core.job.Select;
import ch.actifsource.core.model.aspects.AspectImplementationDecorator;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.set.INodeSet;
import ch.actifsource.core.set.NodeSet;
import cleon.modelinglanguages.network.spec.network.ipv4.FunctionSpace_IP.IIPRangeFunctions;
import cleon.modelinglanguages.network.spec.network.ipv4.FunctionSpace_IP.IIPv4_MaskFunctions;
import cleon.modelinglanguages.network.spec.network.javamodel.IAbstractNetwork;
import cleon.modelinglanguages.network.spec.network.javamodel.IAbstractPhysicalNetwork;

public class CidrAspectDecorator extends AspectImplementationDecorator {

	public INodeSet getDecoratableNodes(IReadJobExecutor executor, INode subject, INode decoratingRelation) {
		ITypeSystem typeSystem = TypeSystem.create(executor);
		IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();

		IAbstractPhysicalNetwork network = resourceRepository.getResource(IAbstractPhysicalNetwork.class, subject); 
		IIPv4_Mask cidr = network.selectCidr();		
		IIPRange range = cidr.extension(IIPv4_MaskFunctions.class).SelectIPRange();
		if( range == null) {			
			return null;
		}
		
		try {
			SubnetUtils subnet = new SubnetUtils(Select.simpleName(executor, cidr.getResource()));
			
			NodeSet ipNodeSet = new NodeSet();
			for( String ip : subnet.getInfo().getAllAddresses())
			{
				IIPv4_D ipv4 = range.extension(IIPRangeFunctions.class).toIPv4(ip);
				if( ipv4 != null) {
					ipNodeSet.add(ipv4.getResource());
				}
			}

			return ipNodeSet;
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		return null;
	}
}
