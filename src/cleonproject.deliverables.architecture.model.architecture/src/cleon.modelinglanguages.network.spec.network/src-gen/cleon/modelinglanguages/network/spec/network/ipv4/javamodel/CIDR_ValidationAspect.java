package cleon.modelinglanguages.network.spec.network.ipv4.javamodel;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

import ch.actifsource.core.INode;
import ch.actifsource.core.Package;
import ch.actifsource.core.Resource;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.javamodel.Statement;
import ch.actifsource.core.job.IWriteJobExecutor;
import ch.actifsource.core.job.Select;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.model.aspects.AbstractInitializationAspect;
import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.undo.GlobalEditContext;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.core.util.LiteralUtil;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.SingleStatementInconsistency;
import ch.actifsource.core.validation.quickfix.IInconsistencyEnablement;
import ch.actifsource.environment.EnvironmentPlugin;
import cleon.modelinglanguages.network.spec.network.ipv4.FunctionSpace_IP.IAbstractIPv4Functions;
import cleon.modelinglanguages.network.spec.network.ipv4.FunctionSpace_IP.IIPRangeFunctions;
import cleon.modelinglanguages.network.spec.network.ipv4.FunctionSpace_IP.IIPv4_MaskFunctions;
import cleon.modelinglanguages.network.spec.network.ipv4.Ipv4Package;
import cleon.modelinglanguages.network.spec.network.javamodel.AbstractNetwork;
import cleon.modelinglanguages.network.spec.network.javamodel.AbstractNetworks;

public class CIDR_ValidationAspect implements IResourceValidationAspect {

	@Override
	public void validate(ValidationContext validationContext, List<IResourceInconsistency> validationList) {
		ITypeSystem typeSystem = TypeSystem.create(validationContext.getReadJobExecutor());
		IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();
		IIPv4_Mask cidr = resourceRepository.getResource(IIPv4_Mask.class, validationContext.getResource());		
		IIPRange range = cidr.extension(IIPv4_MaskFunctions.class).SelectIPRange();
		
		SubnetUtils subnet = new SubnetUtils(Select.simpleName(validationContext.getReadJobExecutor(), cidr.getResource()));
	    ch.actifsource.core.Statement cidrStatement = Select.relationStatementOrNull(validationContext.getReadJobExecutor(), Ipv4Package.IPv4_aE_Mask_aE_Aware_cidr, IPv4_Mask_Aware.selectToMeCidr(cidr).getResource());
	    
	    for( String ip : subnet.getInfo().getAllAddresses())
		{
			IIPv4_D ipv4 = range.extension(IIPRangeFunctions.class).toIPv4(ip);	
			if(ipv4 == null)
			{		
				// Add quick fix
				FixMissingIPQuickfix fixMissingIP = new FixMissingIPQuickfix(subnet, range, new IInconsistencyEnablement() {
					@Override
				    public boolean isEnabled() {
				      return true;
				    }
				});				
				
				validationList.add(new SingleStatementInconsistency(cidrStatement, String.format("IP address %s not in IP range", ip), fixMissingIP));
			}
			
		}		
	}
}
