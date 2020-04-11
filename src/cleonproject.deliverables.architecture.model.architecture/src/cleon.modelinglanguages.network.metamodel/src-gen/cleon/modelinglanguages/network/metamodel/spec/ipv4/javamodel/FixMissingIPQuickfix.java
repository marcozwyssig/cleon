package cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel;

import ch.actifsource.core.Package;
import ch.actifsource.core.Resource;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.job.IWriteJobExecutor;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.undo.GlobalEditContext;
import ch.actifsource.core.undo.IEditContext;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.core.util.LiteralUtil;
import ch.actifsource.core.validation.quickfix.AbstractQuickFix;
import ch.actifsource.core.validation.quickfix.IInconsistencyEnablement;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.FunctionSpace_IP.IIPRangeFunctions;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.FunctionSpace_IP.IIPv4_AFunctions;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.FunctionSpace_IP.IIPv4_BFunctions;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.FunctionSpace_IP.IIPv4_CFunctions;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.Ipv4Package;

public class FixMissingIPQuickfix extends AbstractQuickFix {
	private IIPRange range;
	private SubnetUtils subnet;

	public FixMissingIPQuickfix(SubnetUtils subnet, IIPRange range, IInconsistencyEnablement enablement) {
	    super(String.format("add IP address to IP range"), "TODO", enablement);
		this.subnet = subnet;
		this.range = range;
	    
	}


	@Override
	protected IEditContext getEditContext() {
	      return GlobalEditContext.DEFAULT;
	}

	@Override
	protected void doApply(IModifiable modifiable) {
		ITypeSystem typeSystem = TypeSystem.create(modifiable);
		IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();
		
		for( String ip : subnet.getInfo().getAllAddresses())
		{
			String[] parts = ip.trim().split("\\.");
			Resource Ipv4_A = createClassAIP(modifiable, resourceRepository, range.getPackage(), parts[0]);
			Resource Ipv4_B = createClassBIP(modifiable, resourceRepository, range.getPackage(), Ipv4_A, parts[1]);
			Resource Ipv4_C = createClassCIP(modifiable, resourceRepository, range.getPackage(), Ipv4_B, parts[2]);
			createClassDIP(modifiable, resourceRepository, range.getPackage(), Ipv4_C, parts[3]);	 			
		}

	}
	
	private Resource createClassAIP(IWriteJobExecutor modifiable, IDynamicResourceRepository dynamicResource, Package pkg, String ip)
	{
		IIPv4_A ipv4 = range.extension(IIPRangeFunctions.class).FindIP(ip);
		if( ipv4 != null)
		{
			return ipv4.getResource();
		}

		return createIPs(modifiable, pkg, Ipv4Package.IPv4_aE_A, range.getResource(), Ipv4Package.IPRange_iPv4_aE_A, ip);		
	}
	
	private Resource createClassBIP(IWriteJobExecutor modifiable, IDynamicResourceRepository dynamicResource, Package pkg, Resource parent, String ip)
	{
		IIPv4_A ipvA = dynamicResource.getResource(IIPv4_A.class, parent);
		IIPv4_B ipvB = ipvA.extension(IIPv4_AFunctions.class).FindIP(ip);
		if( ipvB != null)
		{
			return ipvB.getResource();
		}

		return createIPs(modifiable, pkg, Ipv4Package.IPv4_aE_B, parent, Ipv4Package.IPv4_aE_A_iPv4_aE_B, ip);		
	}	
	
	private Resource createClassCIP(IWriteJobExecutor modifiable, IDynamicResourceRepository dynamicResource, Package pkg, Resource parent, String ip)
	{
		IIPv4_B ipvB = dynamicResource.getResource(IIPv4_B.class, parent);
		IIPv4_C ipvC = ipvB.extension(IIPv4_BFunctions.class).FindIP(ip);
		if( ipvC != null)
		{
			return ipvC.getResource();
		}
		
		return createIPs(modifiable, pkg, Ipv4Package.IPv4_aE_C, parent, Ipv4Package.IPv4_aE_B_iPv4_aE_C, ip);		
	}	
	
	private Resource createClassDIP(IWriteJobExecutor modifiable, IDynamicResourceRepository dynamicResource, Package pkg, Resource parent, String ip)
	{
		IIPv4_C ipvC = dynamicResource.getResource(IIPv4_C.class, parent);
		IIPv4_D ipvD = ipvC.extension(IIPv4_CFunctions.class).FindIP(ip);
		if( ipvD != null)
		{
			return ipvD.getResource();
		}
		return createIPs(modifiable, pkg, Ipv4Package.IPv4_aE_D, parent, Ipv4Package.IPv4_aE_C_iPv4_aE_D, ip);		
	}		
	
	private Resource createIPs(IWriteJobExecutor modifiable, Package pkg, Resource resource, Resource parent, Resource relation, String ip) {
		Resource ipObj = Update.createResourceNoDefaults(modifiable, pkg, resource);
		Update.createStatement(modifiable, pkg, ipObj, Ipv4Package.AbstractIPv4_ip, LiteralUtil.create(ip));
		Update.createStatement(modifiable, pkg, parent, relation, ipObj);
		return ipObj;			
	}
}
