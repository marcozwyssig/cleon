package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel;

import ch.actifsource.core.Statement;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.job.Select;
import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.SingleStatementInconsistency;
import ch.actifsource.util.log.Logger;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.FunctionSpace_SubzonePolicy.ISubZoneAccessPolicyFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.SubzonepolicyPackage;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

public class SubZoneAccessPolicyValidationAspect  implements IResourceValidationAspect {
	@Override
	public void validate(ValidationContext validationContext, List<IResourceInconsistency> validationList) {
		final var start = Instant.now();
		try {
			final var typeSystem = TypeSystem.create(validationContext.getReadJobExecutor());
			final var resourceRepository = typeSystem.getResourceRepository();
			final var subZoneAccessPolicy = resourceRepository.getResource(ISubZoneAccessPolicy.class, validationContext.getResource());
			final var sourceSubZone = SourceSubZone.selectToMeDestinationSubZonePolicy(subZoneAccessPolicy);

			final var functions = subZoneAccessPolicy.extension(ISubZoneAccessPolicyFunctions.class);
			if( sourceSubZone.selectSourceSecuritySubZone().equals(subZoneAccessPolicy.selectPolicyForDestinationSecuritySubZone())) {
				return;
			}

			if( !functions.HasSources() ) {

				final var targetSubZone = Select.relationStatementOrNull(validationContext.getReadJobExecutor(), SubzonepolicyPackage.SourceSubZone_destinationSubZonePolicy, SourceSubZone.selectToMeDestinationSubZonePolicy(subZoneAccessPolicy).getResource());
				validationList.add(new SingleStatementInconsistency(targetSubZone, String.format("no communication to this subzone")));
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
