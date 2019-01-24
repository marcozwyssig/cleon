package cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.weighting.javamodel;

import java.util.List;

import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.PredicateInconsistency;
import cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.weighting.FunctionSpace_Weighting.IWeightingCriteriaFunctions;
import cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.weighting.WeightingPackage;

public class CriteriasValidationAspect implements IResourceValidationAspect {

	public void validate(ValidationContext context,
			List<IResourceInconsistency> inconsistencyList) 
	{
		ITypeSystem typeSystem = context.getTypeSystem();
		IDynamicResourceRepository resourceRepository = typeSystem
				.getResourceRepository();
		
		IWeightingCriterias criteriaComposite = resourceRepository.getResource(
				IWeightingCriterias.class, context.getResource());
		
		if( criteriaComposite.selectWeightingCriterias().size() == 0)
		{
			return;
		}
		
		double sum = criteriaComposite.selectWeightingCriterias().stream().mapToDouble(x -> x.extension(IWeightingCriteriaFunctions.class).GetWeighting()).sum();
		if( sum != 100)
		{
			String errormessage = String.format("The sum of weighting must be 100 over all goals (actual sum is %.2f)", sum);
			inconsistencyList.add(new PredicateInconsistency(context
					.getPackage(), context.getResource(),
					WeightingPackage.WeightingCriteriaAggregateAware_weightingCriterias,
					errormessage));			
		}
	
	}
}