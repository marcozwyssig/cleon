package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel;

import java.util.ArrayList;
import java.util.List;

import ch.actifsource.core.INode;
import ch.actifsource.core.job.IReadJobExecutor;
import ch.actifsource.core.model.aspects.AspectImplementationDecorator;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.set.INodeSet;
import ch.actifsource.core.set.NodeSet;
import cleon.common.calendar.metamodel.spec.FunctionSpace_Calendar.ICalendarFunctions;
import cleon.common.calendar.metamodel.spec.FunctionSpace_Calendar.IDayFunctions;
import cleon.common.calendar.metamodel.spec.javamodel.IDay;
import cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.javamodel.Schedule;

public class SelectDateForCapacityDecorator extends AspectImplementationDecorator {

	public static List<IDay> getDays(IPersonCapacity capacity) {
		final var sprint = Sprint.selectToMeSprintCapacity(SprintCapacity.selectToMePersonCapacity(capacity));
		final var sprints = Sprints.selectToMeSprints(sprint);

		final var calender = Schedule.selectToMeSprints(sprints).selectCalendar();

		final var start = sprint.selectStart();
		final var startDate = start.extension(IDayFunctions.class).GetDate();

		final var end = sprint.selectEnd();
		final var endDate = end.extension(IDayFunctions.class).GetDate();

		final var startLocalDate = startDate.toInstant().atZone(java.time.ZoneId.systemDefault())
				.toLocalDate();
		final var endLocalDate = endDate.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();

		final List<IDay> days = new ArrayList<>();
		for (var date = startLocalDate; date
				.isBefore(endLocalDate.plusDays(1)); date = date.plusDays(1)) {
			final var utilDate = java.util.Date
					.from(date.atStartOfDay(java.time.ZoneId.systemDefault()).toInstant());
			final var dayObj = calender.extension(ICalendarFunctions.class).GetDay(utilDate);
			days.add(dayObj);
		}
		return days;

	}

	@Override
	public INodeSet getDecoratableNodes(IReadJobExecutor executor, INode subject, INode decoratingRelation) {
		final var typeSystem = TypeSystem.create(executor);
		final var resourceRepository = typeSystem.getResourceRepository();

		final var capacity = resourceRepository.getResource(IPersonCapacity.class, subject);

		final var days = getDays(capacity);
		final var dayNodeSet = new NodeSet();
		days.stream().forEach(x -> dayNodeSet.add(x.getResource()));
		return dayNodeSet;
	}
}
