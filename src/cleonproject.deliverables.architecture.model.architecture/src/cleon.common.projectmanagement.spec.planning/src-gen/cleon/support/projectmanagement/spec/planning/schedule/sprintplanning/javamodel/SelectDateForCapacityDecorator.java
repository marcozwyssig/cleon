package cleon.support.projectmanagement.spec.planning.schedule.sprintplanning.javamodel;

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
import ch.actifsource.core.util.LiteralUtil;
import cleon.common.resources.spec.calendar.FunctionSpace.DayFunctionsImpl;
import cleon.common.resources.spec.calendar.FunctionSpace.ICalendarFunctions;
import cleon.common.resources.spec.calendar.javamodel.ICalendar;
import cleon.common.resources.spec.calendar.javamodel.IDay;
import cleon.support.projectmanagement.spec.planning.schedule.javamodel.Schedule;

public class SelectDateForCapacityDecorator extends
		AspectImplementationDecorator {

	public static List<IDay> getDays(IPersonCapacity capacity)
	{
		ISprintPlanning sprintPlanning = SprintPlanning
				.selectToMeSprintCapacity(SprintCapacity
						.selectToMePersonCapacity(capacity));
		
		ICalendar calender = Schedule.selectToMeSprintPlanning(SprintPlannings.selectToMeSprintplannings(
				sprintPlanning)).selectCalendar();

		IDay start = sprintPlanning.selectSprint().selectStart();
		java.util.Date startDate = DayFunctionsImpl.INSTANCE.GetDate(start);

		IDay end = sprintPlanning.selectSprint().selectEnd();
		java.util.Date endDate = DayFunctionsImpl.INSTANCE.GetDate(end);
		
		java.time.LocalDate startLocalDate = startDate.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
		java.time.LocalDate endLocalDate = endDate.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();

		List<IDay> days = new ArrayList<IDay>();
		for (java.time.LocalDate date = startLocalDate; date.isBefore(endLocalDate.plusDays(1)); date = date.plusDays(1)) {
			java.util.Date utilDate = java.util.Date.from(date.atStartOfDay(java.time.ZoneId.systemDefault()).toInstant());
			IDay dayObj = calender.extension(ICalendarFunctions.class).GetDay(utilDate);
			days.add(dayObj);					
		}
		return days;
		
	}
	
	public INodeSet getDecoratableNodes(IReadJobExecutor executor,
			INode subject, INode decoratingRelation) {
		ITypeSystem typeSystem = TypeSystem.create(executor);
		IDynamicResourceRepository resourceRepository = typeSystem
				.getResourceRepository();

		IPersonCapacity capacity = resourceRepository.getResource(
				IPersonCapacity.class, subject);
		
		List<IDay> days = getDays(capacity);
		NodeSet dayNodeSet = new NodeSet();
		days.stream().forEach(x -> dayNodeSet.add(x.getResource()));
		return dayNodeSet;
	}
}
