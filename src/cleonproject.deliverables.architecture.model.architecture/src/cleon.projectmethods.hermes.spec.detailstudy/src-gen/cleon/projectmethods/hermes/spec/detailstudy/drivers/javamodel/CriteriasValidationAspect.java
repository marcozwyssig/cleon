package cleon.projectmethods.hermes.spec.detailstudy.drivers.javamodel;

import java.util.List;

import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.PredicateInconsistency;
import cleon.projectmethods.hermes.spec.detailstudy.FunctionSpace_Detailstudy.IAbstractCriteriaFunctions;
import cleon.projectmethods.hermes.spec.detailstudy.drivers.DriversPackage;

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
			
			double sum = criteriaComposite.selectCriterias().stream().mapToDouble(x -> x.extension(IAbstractCriteriaFunctions.class).GetWeighting()).sum();
			if( sum != 100)
			{
				String errormessage = String.format("The sum of weighting must be 100 over all goals (actual sum is %.2f)", sum);
				inconsistencyList.add(new PredicateInconsistency(context
						.getPackage(), context.getResource(),
						DriversPackage.CriteriaAggregateAware_criterias,
						errormessage));			
			}
		
		}	
	
}
