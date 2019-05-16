package cleon.modelinglanguages.network.spec.network.ipv4.javamodel;

import java.awt.image.PackedColorModel;

import ch.actifsource.core.Package;
import ch.actifsource.core.PackagedResource;
import ch.actifsource.core.Resource;
import ch.actifsource.core.Statement;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.job.IWriteJobExecutor;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.undo.IEditContext;
import ch.actifsource.core.undo.RootResourceEditContext;
import ch.actifsource.core.update.FixOwnership;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.core.util.LiteralUtil;
import ch.actifsource.core.validation.quickfix.AbstractQuickFix;
import ch.actifsource.core.validation.quickfix.IInconsistencyEnablement;
import cleon.modelinglanguages.network.spec.network.ipv4.Ipv4Package;

public class FixMissingIPQuickfix extends AbstractQuickFix {
	
	private PackagedResource fRootResource;
	private Statement fStatement;

	protected FixMissingIPQuickfix(String title, String description, IInconsistencyEnablement enablement, PackagedResource rootResource, Statement statement) {
		super(title, description, enablement);
		fRootResource = rootResource;
		fStatement = statement;
	}

	@Override
	protected IEditContext getEditContext() {
		return new RootResourceEditContext(this.fRootResource);		
	}

	@Override
	protected void doApply(IModifiable modifiable) {
		FixMissingIP fixOwnership = new FixMissingIP(this.fStatement.getPackage());
	    fixOwnership.executeOn(modifiable);
	    
//		ITypeSystem typeSystem = TypeSystem.create(modifiable);
//		IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();
//		
//		IIPv4_Mask cidr = resourceRepository.getResource(IIPv4_Mask.class, var1.getResource());
//		IIPRange ipRange = cidr.extension(IIPv4_MaskFunctions.class).SelectIPRange();
//		
//		SubnetUtils subnet = new SubnetUtils(Select.simpleName(modifiable, cidr.getResource()));
//		for( String ip : subnet.getInfo().getAllAddresses())
//		{
//			String[] parts = ip.trim().split("\\.");
//			Resource Ipv4_A = createClassAIP(modifiable, resourceRepository, var1.getPackage(), ipRange.getResource(), Integer.parseInt(parts[0]));
//			Resource Ipv4_B = createClassBIP(modifiable, resourceRepository, var1.getPackage(), Ipv4_A, Integer.parseInt(parts[1]));
//			Resource Ipv4_C = createClassCIP(modifiable, resourceRepository, var1.getPackage(), Ipv4_B, Integer.parseInt(parts[2]));
//			createClassDIP(modifiable, resourceRepository, var1.getPackage(), Ipv4_C, Integer.parseInt(parts[3]));
//		}
	    
	}
	
	private Resource createClassAIP(IWriteJobExecutor modifiable, IDynamicResourceRepository dynamicResource, Package pkg, Resource parent, Integer ip)
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
	
	private Resource createClassBIP(IWriteJobExecutor modifiable, IDynamicResourceRepository dynamicResource, Package pkg, Resource parent, Integer ip)
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
	
	private Resource createClassCIP(IWriteJobExecutor modifiable, IDynamicResourceRepository dynamicResource, Package pkg, Resource parent, Integer ip)
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
	
	private Resource createClassDIP(IWriteJobExecutor modifiable, IDynamicResourceRepository dynamicResource, Package pkg, Resource parent, Integer ip)
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
	
	private Resource createIPs(IWriteJobExecutor modifiable, Package pkg, Resource resource, Resource parent, Resource relation, Integer ip) {
		Resource ipObj = Update.createResourceNoDefaults(modifiable, pkg, resource);
		Update.createStatement(modifiable, pkg, ipObj, Ipv4Package.AbstractIPv4_ip, LiteralUtil.create(ip));
		Update.createStatement(modifiable, pkg, parent, relation, ipObj);
		return ipObj;			
	}
		

}
