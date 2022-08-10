package cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.weighting.javamodel;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.PredicateInconsistency;
import ch.actifsource.util.log.Logger;
import cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.weighting.FunctionSpace_Weighting.IWeightingCriteriaFunctions;
import cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.weighting.WeightingPackage;

public class CriteriasValidationAspect implements IResourceValidationAspect {

	@Override
	public void validate(ValidationContext context,
			List<IResourceInconsistency> inconsistencyList)
	{
		final var start = Instant.now();
		try {

			final var typeSystem = context.getTypeSystem();
			final var resourceRepository = typeSystem
					.getResourceRepository();

			final var criteriaComposite = resourceRepository.getResource(
					IWeightingCriterias.class, context.getResource());

			if( criteriaComposite.selectWeightingCriterias().size() == 0)
			{
				return;
			}

			final var sum = criteriaComposite.selectWeightingCriterias().stream().mapToDouble(x -> x.extension(IWeightingCriteriaFunctions.class).GetWeighting()).sum();
			if( sum != 100)
			{
				final var errormessage = String.format("The sum of weighting must be 100 over all goals (actual sum is %.2f)", sum);
				inconsistencyList.add(new PredicateInconsistency(context
						.getPackage(), context.getResource(),
						WeightingPackage.WeightingCriteriaAggregateAware_weightingCriterias,
						errormessage));
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