package cleon.common.analysis.spec.analysis.solution.drivers.javamodel;

import java.util.List;

import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.PredicateInconsistency;
import cleon.common.analysis.spec.analysis.solution.FunctionSpace_Analysis.ICriteriaAggregateFunctions;
import cleon.common.analysis.spec.analysis.solution.drivers.DriversPackage;

public class CriteriasValidationAspect implements IResourceValidationAspect {

	public void validate(ValidationContext context,
			List<IResourceInconsistency> inconsistencyList) 
		{
			ITypeSystem typeSystem = context.getTypeSystem();
			IDynamicResourceRepository resourceRepository = typeSystem
					.getResourceRepository();
			
			ICriterias criteriaComposite = resourceRepository.getResource(
					ICriterias.class, context.getResource());
			
			if( criteriaComposite.selectCriterias().size() == 0)
			{
				return;
			}
			
			int sum = criteriaComposite.selectCriterias().stream().mapToInt(x -> x.extension(ICriteriaAggregateFunctions.class).GetWeighting()).sum();
			if( sum != 100)
			{
				String errormessage = String.format("The sum of weighting must be 100%% over all goals (actual sum is %1$d%%)", sum);
				inconsistencyList.add(new PredicateInconsistency(context
						.getPackage(), context.getResource(),
						DriversPackage.CriteriaAggregateAware_criterias,
						errormessage));			
			}
		
		}	
	
}
