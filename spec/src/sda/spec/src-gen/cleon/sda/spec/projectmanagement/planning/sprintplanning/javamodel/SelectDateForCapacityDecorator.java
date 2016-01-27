package cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel;

import java.util.Date;

import cleon.sda.spec.projectmanagement.planning.calendar.CalendarPackage;
import cleon.sda.spec.projectmanagement.planning.calendar.FunctionSpace.DayFunctionsImpl;
import cleon.sda.spec.projectmanagement.planning.calendar.javamodel.ICalendar;
import cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay;
import cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IMonth;
import cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IYear;
import cleon.sda.spec.projectmanagement.planning.javamodel.Planning;
import cleon.sda.spec.projectmanagement.planning.releaseplanning.javamodel.ReleasePlanning;
import ch.actifsource.core.INode;
import ch.actifsource.core.Resource;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.job.IReadJobExecutor;
import ch.actifsource.core.job.Select;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.model.aspects.AspectImplementationDecorator;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.set.INodeSet;
import ch.actifsource.core.set.NodeSet;
import ch.actifsource.core.util.LiteralUtil;

public class SelectDateForCapacityDecorator extends
		AspectImplementationDecorator {

	public INodeSet getDecoratableNodes(IReadJobExecutor executor,
			INode subject, INode decoratingRelation) {
		ITypeSystem typeSystem = TypeSystem.create(executor);
		IDynamicResourceRepository resourceRepository = typeSystem
				.getResourceRepository();

		IPersonCapacity capacity = resourceRepository.getResource(
				IPersonCapacity.class, subject);

		ISprintPlanning sprintPlanning = SprintPlanning
				.selectToMeSprintCapacity(SprintCapacity
						.selectToMePersonCapacity(capacity));
		ICalendar calender = Planning.selectToMeSprintPlanning(SprintPlannings.selectToMeSprintplannings(
				sprintPlanning)).selectCalendar();

		IDay start = sprintPlanning.selectSprint().selectStart();
		java.util.Date startDate = DayFunctionsImpl.INSTANCE.GetDate(start);

		IDay end = sprintPlanning.selectSprint().selectEnd();
		java.util.Date endDate = DayFunctionsImpl.INSTANCE.GetDate(end);
		
		java.time.LocalDate startLocalDate = startDate.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
		java.time.LocalDate endLocalDate = endDate.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();

		NodeSet dayNodeSet = new NodeSet();
		for (java.time.LocalDate date = startLocalDate; date.isBefore(endLocalDate.plusDays(1)); date = date.plusDays(1)) {
			int year = date.getYear();
			int month = date.getMonthValue();
			int day = date.getDayOfMonth();
			try
			{

				IYear yearObj = calender.selectYears().stream().filter(x -> x.selectIdentifier().equals(year)).findFirst().get();
				IMonth monthObj = yearObj.selectMonths().stream().filter(x -> x.selectIdentifier().equals(month)).findFirst().get();
				IDay dayObj = monthObj.selectDays().stream().filter(x -> x.selectIdentifier().equals(day)).findFirst().get();
				dayNodeSet.add(dayObj.getResource());					
			}
			catch(Exception e)
			{
				dayNodeSet.add(LiteralUtil.create(e.toString() + startDate));
			}
		}

		return dayNodeSet;
	}
}
