package cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel;

import java.time.Duration;
import java.time.Instant;
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
import cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractPhysicalNetwork;

import java.util.stream.Stream;

public class CidrValidationAspect implements IResourceValidationAspect {

	@Override
	public void validate(final ValidationContext validationContext, final List<IResourceInconsistency> validationList) {
		final var typeSystem = TypeSystem.create(validationContext.getReadJobExecutor());
		final var resourceRepository = typeSystem.getResourceRepository();
		final var cidr = resourceRepository.getResource(IIPv4_Mask.class, validationContext.getResource());
		final var networkObj = IPv4_Mask_Aware.selectToMeCidrs(cidr);
		if( !(networkObj instanceof IAbstractPhysicalNetwork)) {
			return;
		}

		final var start = Instant.now();
		final var network = Select.simpleName(validationContext.getReadJobExecutor(), cidr.getResource());

		try {
			final var range = cidr.extension(IIPv4_MaskFunctions.class).SelectIPRange();
			final var subnet = new SubnetUtils(network);
			final var cidrStatement = Select.relationStatementOrNull(validationContext.getReadJobExecutor(), Ipv4Package.IPv4_aE_Mask_aE_Aware_cidrs, IPv4_Mask_Aware.selectToMeCidrs(cidr).getResource());
			
			final var subNetInfo = subnet.getInfo();
			final var calculatedNetworkAddress = subNetInfo.getNetworkAddress();

	        // Check if the provided CIDR notation correctly matches the calculated network range
			final var isCidrNotationCorrect = network.split("/")[0].equals(calculatedNetworkAddress);
	        if( !isCidrNotationCorrect && cidr.selectMask() != 32) {
		        validationList.add(new SingleStatementInconsistency(cidrStatement, String.format("Invalid CIDR " + network + ". Expected Network Address: " + calculatedNetworkAddress, cidrStatement)));
		        return;
	        }
	        
			// Performance with validation of extensive networks		
			if (cidr.selectMask() < 24) {
			    Logger.instance().logInfo(String.format("Validation skipped (%s)", network));
			    return;
			}
	        
			final var allAddresses = subNetInfo.getAllAddresses();

			Stream.of(allAddresses).forEach(ip -> {
			    final var ipv4 = range.extension(IIPRangeFunctions.class).toIPv4(ip);
			    if (ipv4 == null) {
			        // Add final quick fix
			        final var fixMissingIP = new FixMissingIPQuickfix(subnet, range, () -> true);
			        validationList.add(new SingleStatementInconsistency(cidrStatement, String.format("IP address %s not in IP range", ip), fixMissingIP));
			    }
			});
		}
		finally {
			final var finish = Instant.now();
			final var timeElapsed = Duration.between(start, finish).toMillis();
			if (timeElapsed > 100) {
			    Logger.instance().logInfo(String.format("Validation time for %s took %d ms", this.getClass().getSimpleName(), timeElapsed));
			}			
		}


	}
}
