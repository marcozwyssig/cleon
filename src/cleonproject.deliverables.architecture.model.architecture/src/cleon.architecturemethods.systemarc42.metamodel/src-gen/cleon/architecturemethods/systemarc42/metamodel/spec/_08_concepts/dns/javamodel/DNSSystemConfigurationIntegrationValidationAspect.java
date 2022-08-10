package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.dns.javamodel;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.PredicateInconsistency;
import ch.actifsource.util.log.Logger;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.dns.DnsPackage;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.dns.FunctionSpace_DNS.IDNSSystemConfigurationIntegrationFunctions;

public class DNSSystemConfigurationIntegrationValidationAspect implements IResourceValidationAspect {

	@Override
	public void validate(final ValidationContext context, final List<IResourceInconsistency> inconsistencyList) {
		final var start = Instant.now();
		try {
			final var typeSystem = TypeSystem.create(context.getReadJobExecutor());
			final var resourceRepository = typeSystem.getResourceRepository();
			final var dnsSystemConfigurationScope = resourceRepository.getResource(IDNSSystemConfigurationIntegration.class, context.getResource());
			final var dnsSystemConfigurationScopeFunctions = dnsSystemConfigurationScope.extension(IDNSSystemConfigurationIntegrationFunctions.class);

			if (dnsSystemConfigurationScopeFunctions.HasAccessConfigurationWithUseIPFalseTo() && !dnsSystemConfigurationScope.selectAllowDNSRecords() ) {
				inconsistencyList.add(new PredicateInconsistency(context.getPackage(), context.getResource(),
						DnsPackage.DNSSystemConfigurationIntegration_allowDNSRecords, "allowed DNS records needs to be enabled (used in access)"));
			}
		} finally {
			final var finish = Instant.now();
			final var timeElapsed = Duration.between(start, finish).toMillis();
			if( timeElapsed > 100 ) {
				Logger.instance().logInfo(String.format("Validation time for %s took %d ms", this.getClass().getSimpleName(), timeElapsed));
			}

		}

	}
}