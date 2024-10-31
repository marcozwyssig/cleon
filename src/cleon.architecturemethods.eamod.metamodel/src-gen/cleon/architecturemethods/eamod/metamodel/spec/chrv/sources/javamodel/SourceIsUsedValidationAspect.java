package cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.javamodel;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

import ch.actifsource.core.job.Select;
import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency.NodeRole;
import ch.actifsource.core.validation.inconsistency.SingleResourceInconsistency;
import ch.actifsource.util.log.Logger;
import cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.FunctionSpace_Source.ISourceFunctions;

public class SourceIsUsedValidationAspect implements IResourceValidationAspect
{

	@Override
	public void validate(ValidationContext context, List<IResourceInconsistency> inconsistencyList) {
		final var start = Instant.now();
		try {

			final var typeSystem = context.getTypeSystem();
			final var resourceRepository = typeSystem.getResourceRepository();

			final var source = resourceRepository.getResource(ISource.class, context.getResource());
			if (!validate(source)) {
				final var name = Select.simpleName(context.getReadJobExecutor(), context.getResource());
				final var errormessage = String.format("Resource %1$s with id %2$d is not used in any other objects (like requirements, driver, etc.)", name,
						source.selectIdentifier());
				inconsistencyList.add(new SingleResourceInconsistency(context.getPackage(), context.getResource(), NodeRole.Subject, errormessage));
			}
		} finally {
			final var finish = Instant.now();
			final var timeElapsed = Duration.between(start, finish).toMillis();
			if( timeElapsed > 100 ) {
				Logger.instance().logInfo(String.format("Validation time for %s took %d ms", this.getClass().getSimpleName(), timeElapsed));
			}

		}
	}

	private boolean validate(ISource source)
	{
		final var sourceAwares = source.extension(ISourceFunctions.class).GetAllUsedSourceAware();
		if( sourceAwares.isEmpty() )
		{
			return source.selectComposites().stream().anyMatch(this::validate);
		}
		return true;

	}

}