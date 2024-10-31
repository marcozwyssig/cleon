package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.PredicateInconsistency;
import ch.actifsource.util.log.Logger;
import cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.FunctionSpace_Sprints.ISprintBacklogFunctions;
import cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.SprintsPackage;

public class SprintBacklogValidationAspect implements IResourceValidationAspect {

	@Override
	public void validate(ValidationContext context, List<IResourceInconsistency> inconsistencyList) {
		final var start = Instant.now();
		try {

			final var typeSystem = TypeSystem.create(context.getReadJobExecutor());
			final var resourceRepository = typeSystem.getResourceRepository();

			final var sprintBacklog = resourceRepository.getResource(ISprintBacklog.class, context.getResource());
			final var sprint = sprintBacklog.extension(ISprintBacklogFunctions.class).GetSprint();

			if( !sprint.selectState().isDone())
			{
				return;
			}

			final var allDone = sprintBacklog.selectWorkItems().stream().allMatch(x -> x.selectState().isDone());
			if(!allDone)
			{
				inconsistencyList.add(new PredicateInconsistency(context
						.getPackage(), context.getResource(),
						SprintsPackage.SprintBacklog_workItems,
						"The state of workitems in sprint needs to be done"));
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
