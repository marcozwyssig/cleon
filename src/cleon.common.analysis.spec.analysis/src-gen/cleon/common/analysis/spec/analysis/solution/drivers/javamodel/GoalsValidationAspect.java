package cleon.common.analysis.spec.analysis.solution.drivers.javamodel;

import java.util.List;

import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.job.Select;
import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.PredicateInconsistency;
import cleon.common.analysis.spec.analysis.solution.drivers.DriversPackage;

public class GoalsValidationAspect implements IResourceValidationAspect {

	public void validate(ValidationContext context,
			List<IResourceInconsistency> inconsistencyList) 
		{
			ITypeSystem typeSystem = context.getTypeSystem();
			IDynamicResourceRepository resourceRepository = typeSystem
					.getResourceRepository();
			
			IGoals goals = resourceRepository.getResource(
					IGoals.class, context.getResource());
			
			int sum = goals.selectCategories().stream().mapToInt(x -> x.selectGoals().stream().mapToInt(y -> y.selectWeighting()).sum()).sum();
			if( sum != 100)
			{
				String name = Select.simpleName(context.getReadJobExecutor(), goals.getResource());
				String errormessage = String.format("The sum of weighting must be 100%% over all goals (actual sum is %1$d%%)", sum);
				inconsistencyList.add(new PredicateInconsistency(context
						.getPackage(), context.getResource(),
						DriversPackage.Drivers_goal,
						errormessage));			
			}
		
		}	
	
}
