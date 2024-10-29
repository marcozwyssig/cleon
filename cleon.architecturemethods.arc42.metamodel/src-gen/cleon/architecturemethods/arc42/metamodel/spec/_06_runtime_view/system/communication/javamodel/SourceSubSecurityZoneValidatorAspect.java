package cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.PredicateInconsistency;
import ch.actifsource.util.log.Logger;
import cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.CommunicationPackage;
import cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.FunctionSpace_Communication.ISourceInSubSecurityZoneFunctions;
import cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.domain.javamodel.IGlobalDomain;
import cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.network_segmentation.subzonepolicy.javamodel.IIntraSubZoneAccessPolicy;

public class SourceSubSecurityZoneValidatorAspect implements IResourceValidationAspect {

	@Override
	public void validate(ValidationContext validationContext, List<IResourceInconsistency> validationList) {
		final var start = Instant.now();
		try {

			final var typeSystem = TypeSystem.create(validationContext.getReadJobExecutor());
			final var resourceRepository = typeSystem.getResourceRepository();
			final var sourceSubSecurityZone = resourceRepository.getResource(ISourceInSubSecurityZone.class, validationContext.getResource());
			final var sourceSubSecurityZoneFunctions = sourceSubSecurityZone.extension(ISourceInSubSecurityZoneFunctions.class);

			if( sourceSubSecurityZoneFunctions.IsAny() && sourceSubSecurityZone.selectThreatMitigations().isEmpty()) {
				validationList.add(new PredicateInconsistency(validationContext.getPackage(), sourceSubSecurityZone.getResource(),
						CommunicationPackage.SourceInSubSecurityZone_threatMitigations, "on any connection there is at least one threat mitigation required"));
			}

			final var isIntra = sourceSubSecurityZone.selectSubZoneAccessPolicy() instanceof IIntraSubZoneAccessPolicy;
			if( isIntra && sourceSubSecurityZone.selectUsedInDomains().stream().anyMatch(x -> x instanceof IGlobalDomain ) ) {
				validationList.add(new PredicateInconsistency(validationContext.getPackage(), sourceSubSecurityZone.getResource(),
						CommunicationPackage.SourceInSubSecurityZone_usedInDomains, "some of the domain(s) are not allowed on a intra connection"));
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
