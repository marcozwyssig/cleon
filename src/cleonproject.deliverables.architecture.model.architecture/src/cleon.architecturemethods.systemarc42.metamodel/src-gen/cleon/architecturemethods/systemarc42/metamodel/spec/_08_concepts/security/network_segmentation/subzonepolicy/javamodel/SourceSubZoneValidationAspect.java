package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel;

import ch.actifsource.core.job.Select;
import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.PredicateInconsistency;
import ch.actifsource.core.validation.inconsistency.SingleStatementInconsistency;
import ch.actifsource.util.log.Logger;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.FunctionSpace_SubzonePolicy.ISubZoneAccessPolicyFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.ActivityPackage;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.SubzonepolicyPackage;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

public class SourceSubZoneValidationAspect  implements IResourceValidationAspect {
	@Override
	public void validate(ValidationContext validationContext, List<IResourceInconsistency> validationList) {
		final var start = Instant.now();
		try {
			final var typeSystem = TypeSystem.create(validationContext.getReadJobExecutor());
			final var resourceRepository = typeSystem.getResourceRepository();
			final var sourceSubZone = resourceRepository.getResource(ISourceSubZone.class, validationContext.getResource());
			
			for( var subZoneAccessPolicy : sourceSubZone.selectDestinationSubZonePolicy().values()) {
				final var functions = subZoneAccessPolicy.extension(ISubZoneAccessPolicyFunctions.class);
				if( sourceSubZone.selectSourceSecuritySubZone().equals(subZoneAccessPolicy.selectPolicyForDestinationSecuritySubZone())) {
					return;
				}

				if( !functions.HasSources() ) {
					validationList.add(new PredicateInconsistency(validationContext.getPackage(), subZoneAccessPolicy.getResource(), SubzonepolicyPackage.SourceSubZone_destinationSubZonePolicy, String.format("no communication to this subzone")));
				}				
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
