package cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

import ch.actifsource.core.Statement;
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

import javax.annotation.CheckForNull;

public class CidrValidationAspect implements IResourceValidationAspect {

	@Override
	public void validate(final ValidationContext validationContext, final List<IResourceInconsistency> validationList) {
		final var typeSystem = TypeSystem.create(validationContext.getReadJobExecutor());
		final var resourceRepository = typeSystem.getResourceRepository();
		final var cidr = resourceRepository.getResource(IIPv4_Mask.class, validationContext.getResource());
		final var networkObj = IPv4_Mask_Aware.selectToMeCidrs(cidr);
		
		if (!(networkObj instanceof IAbstractPhysicalNetwork)) {
			return;
		}

		final var start = Instant.now();
		final var network = Select.simpleName(validationContext.getReadJobExecutor(), cidr.getResource());

		try {
			if (shouldSkipValidation(network)) {
				return;
			}
			validateCidr(validationContext, cidr, network, validationList);
		} finally {
			logValidationTime(start);
		}
	}
	
	private static boolean shouldSkipValidation(final String network) {
		final int mask = Integer.parseInt(network.split("/")[1]);
		if (mask < 24) {
			Logger.instance().logInfo(String.format("Validation skipped (%s)", network));
			return true;
		}
		return false;
	}
	

	private static void validateCidr(final ValidationContext validationContext, final IIPv4_Mask cidr, final String network, final List<IResourceInconsistency> validationList) {
		final var range = cidr.extension(IIPv4_MaskFunctions.class).SelectIPRange();
		final var subnet = new SubnetUtils(network);
		final var cidrStatement = Select.relationStatementOrNull(validationContext.getReadJobExecutor(), Ipv4Package.IPv4_aE_Mask_aE_Aware_cidrs, IPv4_Mask_Aware.selectToMeCidrs(cidr).getResource());
		final var subNetInfo = subnet.getInfo();
		final var calculatedNetworkAddress = subNetInfo.getNetworkAddress();

		if (!isCidrNotationCorrect(network, calculatedNetworkAddress, cidr)) {
			validationList.add(new SingleStatementInconsistency(cidrStatement, String.format("Invalid CIDR %s. Expected Network Address: %s", network, calculatedNetworkAddress, cidrStatement)));
			return;
		}

		validateIpAddresses(range, subNetInfo, subnet, cidrStatement, validationList);
	}

	private static boolean isCidrNotationCorrect(final String network, final String calculatedNetworkAddress, final IIPv4_Mask cidr) {
		return network.split("/")[0].equals(calculatedNetworkAddress) || cidr.selectMask() == 32;
	}

	private static  void validateIpAddresses(final IIPRange range, final SubnetUtils.SubnetInfo subNetInfo, final SubnetUtils subnet, final @CheckForNull Statement cidrStatement, final List<IResourceInconsistency> validationList) {
		final var allAddresses = subNetInfo.getAllAddresses();

		Stream.of(allAddresses).forEach(ip -> {
			final var ipv4 = range.extension(IIPRangeFunctions.class).toIPv4(ip);
			if (ipv4 == null) {
				final var fixMissingIP = new FixMissingIPQuickfix(subnet, range, () -> true);
				validationList.add(new SingleStatementInconsistency(cidrStatement, String.format("IP address %s not in IP range", ip), fixMissingIP));
			}
		});
	}

	private void logValidationTime(final Instant start) {
		final var finish = Instant.now();
		final var timeElapsed = Duration.between(start, finish).toMillis();
		if (timeElapsed > 100) {
			Logger.instance().logInfo(String.format("Validation time for %s took %d ms", this.getClass().getSimpleName(), timeElapsed));
		}
	}
}
