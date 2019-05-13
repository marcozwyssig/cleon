package cleon.modelinglanguages.network.spec.network.ipv4.javamodel;

import java.net.InetAddress;
import java.net.UnknownHostException;

import ch.actifsource.core.INode;
import ch.actifsource.core.Package;
import ch.actifsource.core.Resource;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.job.Select;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.model.aspects.AbstractInitializationAspect;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.core.util.LiteralUtil;
import cleon.modelinglanguages.network.spec.network.ipv4.FunctionSpace_IP.IAbstractIPv4Functions;
import cleon.modelinglanguages.network.spec.network.ipv4.FunctionSpace_IP.IIPv4_MaskFunctions;
import cleon.modelinglanguages.network.spec.network.ipv4.Ipv4Package;
import cleon.modelinglanguages.network.spec.network.javamodel.AbstractNetwork;
import cleon.modelinglanguages.network.spec.network.javamodel.AbstractNetworks;

public class CIDR_InitializerAspect extends AbstractInitializationAspect {
	@Override
	public void initialize(IModifiable modifiable, INode clazz, Package pkg, INode newInstance) {
		
		ITypeSystem typeSystem = TypeSystem.create(modifiable);
		IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();
		
		IIPv4_Mask cidr = resourceRepository.getResource(IPv4_Mask.class, newInstance);
		IIPRange ipRange = cidr.extension(IIPv4_MaskFunctions.class).SelectIPRange();
		
		SubnetUtils subnet = new SubnetUtils(Select.simpleName(modifiable, cidr.getResource()));
		for( String ip : subnet.getInfo().getAllAddresses())
		{
			String[] parts = ip.trim().split("\\.");
			Resource Ipv4_A = createClassAIP(modifiable, resourceRepository, pkg, ipRange.getResource(), Integer.parseInt(parts[0]));
			Resource Ipv4_B = createClassBIP(modifiable, resourceRepository, pkg, Ipv4_A, Integer.parseInt(parts[1]));
			Resource Ipv4_C = createClassCIP(modifiable, resourceRepository, pkg, Ipv4_B, Integer.parseInt(parts[2]));
			createClassDIP(modifiable, resourceRepository, pkg, Ipv4_C, Integer.parseInt(parts[3]));
		}
	}
	
	private Resource createClassAIP(IModifiable modifiable, IDynamicResourceRepository dynamicResource, Package pkg, Resource parent, Integer ip)
	{
		IIPRange range = dynamicResource.getResource(IIPRange.class, parent);
		for( IIPv4_A ipv4 : range.selectIPv4_A())
		{
			if( ipv4.selectIp().equals(ip))
			{
				return ipv4.getResource();
			}
		}
		return createIPs(modifiable, pkg, Ipv4Package.IPv4_aE_A, parent, Ipv4Package.IPRange_iPv4_aE_A, ip);		
	}
	
	private Resource createClassBIP(IModifiable modifiable, IDynamicResourceRepository dynamicResource, Package pkg, Resource parent, Integer ip)
	{
		IIPv4_A range = dynamicResource.getResource(IIPv4_A.class, parent);
		for( IIPv4_B ipvB : range.selectIPv4_B())
		{
			if( ipvB.selectIp().equals(ip))
			{
				return ipvB.getResource();
			}
		}
		return createIPs(modifiable, pkg, Ipv4Package.IPv4_aE_B, parent, Ipv4Package.IPv4_aE_A_iPv4_aE_B, ip);		
	}	
	
	private Resource createClassCIP(IModifiable modifiable, IDynamicResourceRepository dynamicResource, Package pkg, Resource parent, Integer ip)
	{
		IIPv4_B range = dynamicResource.getResource(IIPv4_B.class, parent);
		for( IIPv4_C ipvC : range.selectIPv4_C())
		{
			if( ipvC.selectIp().equals(ip))
			{
				return ipvC.getResource();
			}
		}
		return createIPs(modifiable, pkg, Ipv4Package.IPv4_aE_C, parent, Ipv4Package.IPv4_aE_B_iPv4_aE_C, ip);		
	}	
	
	private Resource createClassDIP(IModifiable modifiable, IDynamicResourceRepository dynamicResource, Package pkg, Resource parent, Integer ip)
	{
		IIPv4_C range = dynamicResource.getResource(IIPv4_C.class, parent);
		for( IIPv4_D ipvD : range.selectIPv4_D())
		{
			if( ipvD.selectIp().equals(ip))
			{
				return ipvD.getResource();
			}
		}
		return createIPs(modifiable, pkg, Ipv4Package.IPv4_aE_D, parent, Ipv4Package.IPv4_aE_C_iPv4_aE_D, ip);		
	}		
	
	private Resource createIPs(IModifiable modifiable, Package pkg, Resource resource, Resource parent, Resource relation, Integer ip) {
		Resource ipObj = Update.createResourceNoDefaults(modifiable, pkg, resource);
		Update.createStatement(modifiable, pkg, ipObj, Ipv4Package.AbstractIPv4_ip, LiteralUtil.create(ip));
		Update.createStatement(modifiable, pkg, parent, relation, ipObj);
		return ipObj;			
	}
}
