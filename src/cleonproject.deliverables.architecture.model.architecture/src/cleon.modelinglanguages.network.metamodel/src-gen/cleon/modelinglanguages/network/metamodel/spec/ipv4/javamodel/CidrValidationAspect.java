package cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel;

import java.util.List;

import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.job.Select;
import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.SingleStatementInconsistency;
import ch.actifsource.core.validation.quickfix.IInconsistencyEnablement;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.FunctionSpace_IP.IIPRangeFunctions;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.FunctionSpace_IP.IIPv4_MaskFunctions;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.Ipv4Package;

public class CidrValidationAspect implements IResourceValidationAspect {

	@Override
	public void validate(ValidationContext validationContext, List<IResourceInconsistency> validationList) {
		ITypeSystem typeSystem = TypeSystem.create(validationContext.getReadJobExecutor());
		IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();
		IIPv4_Mask cidr = resourceRepository.getResource(IIPv4_Mask.class, validationContext.getResource());		
		IIPRange range = cidr.extension(IIPv4_MaskFunctions.class).SelectIPRange();
		
		try {
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
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}		
	}
}
