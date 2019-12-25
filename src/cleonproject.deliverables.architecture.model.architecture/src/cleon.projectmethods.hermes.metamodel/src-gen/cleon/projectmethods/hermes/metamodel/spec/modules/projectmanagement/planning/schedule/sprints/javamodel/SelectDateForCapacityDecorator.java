package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel;

import java.util.ArrayList;
import java.util.List;

import ch.actifsource.core.INode;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.job.IReadJobExecutor;
import ch.actifsource.core.model.aspects.AspectImplementationDecorator;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.set.INodeSet;
import ch.actifsource.core.set.NodeSet;
import cleon.common.calendar.metamodel.spec.FunctionSpace.DayFunctionsImpl;
import cleon.common.calendar.metamodel.spec.FunctionSpace.ICalendarFunctions;
import cleon.common.calendar.metamodel.spec.javamodel.ICalendar;
import cleon.common.calendar.metamodel.spec.javamodel.IDay;
import cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.javamodel.Schedule;

public class SelectDateForCapacityDecorator extends AspectImplementationDecorator {

	public static List<IDay> getDays(IPersonCapacity capacity) {
		ISprint sprint = Sprint.selectToMeSprintCapacity(SprintCapacity.selectToMePersonCapacity(capacity));
		ISprints sprints = Sprints.selectToMeSprints(sprint);

		ICalendar calender = Schedule.selectToMeSprints(sprints).selectCalendar();

		IDay start = sprint.selectStart();
		java.util.Date startDate = DayFunctionsImpl.INSTANCE.GetDate(start);

		IDay end = sprint.selectEnd();
		java.util.Date endDate = DayFunctionsImpl.INSTANCE.GetDate(end);

		java.time.LocalDate startLocalDate = startDate.toInstant().atZone(java.time.ZoneId.systemDefault())
				.toLocalDate();
		java.time.LocalDate endLocalDate = endDate.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();

		List<IDay> days = new ArrayList<IDay>();
		for (java.time.LocalDate date = startLocalDate; date
				.isBefore(endLocalDate.plusDays(1)); date = date.plusDays(1)) {
			java.util.Date utilDate = java.util.Date
					.from(date.atStartOfDay(java.time.ZoneId.systemDefault()).toInstant());
			IDay dayObj = calender.extension(ICalendarFunctions.class).GetDay(utilDate);
			days.add(dayObj);
		}
		return days;

	}

	public INodeSet getDecoratableNodes(IReadJobExecutor executor, INode subject, INode decoratingRelation) {
		ITypeSystem typeSystem = TypeSystem.create(executor);
		IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();

		IPersonCapacity capacity = resourceRepository.getResource(IPersonCapacity.class, subject);

		List<IDay> days = getDays(capacity);
		NodeSet dayNodeSet = new NodeSet();
		days.stream().forEach(x -> dayNodeSet.add(x.getResource()));
		return dayNodeSet;
	}
}
