package cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.PredicateInconsistency;
import ch.actifsource.util.log.Logger;
import cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.CommunicationPackage;

public class SourceValidatorAspect implements IResourceValidationAspect {

	@Override
	public void validate(ValidationContext validationContext, List<IResourceInconsistency> validationList) {
		final var start = Instant.now();
		try {

			final var typeSystem = TypeSystem.create(validationContext.getReadJobExecutor());
			final var resourceRepository = typeSystem.getResourceRepository();
			final var source = resourceRepository.getResource(ISource.class, validationContext.getResource());

			if (source.selectAccessAllowed().isEmpty()) {
				validationList.add(new PredicateInconsistency(validationContext.getPackage(), source.getResource(),
						CommunicationPackage.Source_accessAllowed, "at least one allowed connection is required"));
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
