package cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel;

import java.util.List;

import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.PredicateInconsistency;
import cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprint;
import cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.FunctionSpace.ISprintBacklogFunctions;
import cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.SprintplanningPackage;

public class SprintBacklogValidationAspect implements IResourceValidationAspect {

	@Override
	public void validate(ValidationContext context, List<IResourceInconsistency> inconsistencyList) {
  	  	ITypeSystem typeSystem = TypeSystem.create(context.getReadJobExecutor());
		IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();
		
		ISprintBacklog sprintBacklog = resourceRepository.getResource(ISprintBacklog.class, context.getResource());		
		ISprint sprint = sprintBacklog.extension(ISprintBacklogFunctions.class).GetSprint();
		
		if( (!sprint.selectState().isDone()))
		{
			return;
		}
		
		boolean allDone = sprintBacklog.selectWorkItems().stream().allMatch(x -> x.selectState().isDone());
		if(!(allDone))
		{
			inconsistencyList.add(new PredicateInconsistency(context
					.getPackage(), context.getResource(),
					SprintplanningPackage.SprintBacklog_workItems,
					"The state of workitems in sprint needs to be done"));			
		}
	}
}
