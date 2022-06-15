package cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel;

import java.util.List;

import ch.actifsource.core.job.Select;
import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.SingleStatementInconsistency;
import ch.actifsource.util.log.Logger;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.FunctionSpace_IP.IIPRangeFunctions;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.FunctionSpace_IP.IIPv4_MaskFunctions;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.Ipv4Package;

public class CidrValidationAspect implements IResourceValidationAspect {

	@Override
	public void validate(ValidationContext validationContext, List<IResourceInconsistency> validationList) {
		final var typeSystem = TypeSystem.create(validationContext.getReadJobExecutor());
		final var resourceRepository = typeSystem.getResourceRepository();
		final var cidr = resourceRepository.getResource(IIPv4_Mask.class, validationContext.getResource());

		try {
			final var range = cidr.extension(IIPv4_MaskFunctions.class).SelectIPRange();
			final var network = Select.simpleName(validationContext.getReadJobExecutor(), cidr.getResource());

			// Performance with validation of big networks
			if( cidr.selectMask() < 21 ) {
				Logger.instance().logInfo(String.format("Validation skipped (%s)", network));
				return;
			}

			final var subnet = new SubnetUtils(network);
			final var cidrStatement = Select.relationStatementOrNull(validationContext.getReadJobExecutor(), Ipv4Package.IPv4_aE_Mask_aE_Aware_cidrs, IPv4_Mask_Aware.selectToMeCidrs(cidr).getResource());

			for( final String ip : subnet.getInfo().getAllAddresses())
			{
				final var ipv4 = range.extension(IIPRangeFunctions.class).toIPv4(ip);
				if(ipv4 == null)
				{
					// Add quick fix
					final var fixMissingIP = new FixMissingIPQuickfix(subnet, range, () -> true);
					validationList.add(new SingleStatementInconsistency(cidrStatement, String.format("IP address %s not in IP range", ip), fixMissingIP));
				}

			}
		} catch (final IllegalArgumentException e) {
			e.printStackTrace();
		}
	}
}
