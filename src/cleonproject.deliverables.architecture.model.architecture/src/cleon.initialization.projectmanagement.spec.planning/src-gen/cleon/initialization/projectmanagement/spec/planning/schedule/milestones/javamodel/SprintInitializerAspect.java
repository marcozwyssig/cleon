package cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel;

import ch.actifsource.core.INode;
import ch.actifsource.core.Package;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.core.util.LiteralUtil;
import cleon.common.resources.spec.calendar.FunctionSpace.ICalendarFunctions;
import cleon.common.resources.spec.calendar.FunctionSpace.IDayFunctions;
import cleon.common.resources.spec.calendar.javamodel.IDay;
import cleon.common.resources.spec.resources.id.javamodel.BusinessObjectIdInitializerAspect;
import cleon.initialization.projectmanagement.spec.planning.schedule.milestones.*;
import cleon.initialization.projectmanagement.spec.planning.schedule.milestones.FunctionSpace.ISprintFunctions;

public class SprintInitializerAspect extends BusinessObjectIdInitializerAspect<ISprint>  {
	
	

	public SprintInitializerAspect() {
		super(ISprint.class);
	}

	@Override
	public void initialize(IModifiable modifiable, INode clazz, Package pkg, INode newInstance) {
		
		super.initialize(modifiable, clazz, pkg, newInstance);
		
		try
		{
			ITypeSystem typeSystem = TypeSystem.create(modifiable);
			IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();
			ISprint sprint = resourceRepository.getResource(ISprint.class, newInstance);
			ISprintFunctions sprintFunctions = sprint.extension(ISprintFunctions.class);
			ISprint lastSprint = sprintFunctions.LastSprint();
			if( lastSprint == null)
			{
				return;
			}
			
			java.util.Date endDate = lastSprint.selectEnd().extension(IDayFunctions.class).GetDate();
			java.util.Date startDate = addDays(endDate, 1);
			java.util.Date newEndDate = addDays(startDate, sprintFunctions.GetMilestones().selectDaysPerSprint() - 1);
			ICalendarFunctions calendarFunctions = sprintFunctions.GetCalendar().extension(ICalendarFunctions.class);
			
			IDay startDay = calendarFunctions.GetDay(startDate);
			Update.createStatement(modifiable, pkg, newInstance, MilestonesPackage.TimePlan_start, startDay.getResource());
			
			IDay endDay = calendarFunctions.GetDay(newEndDate);
			Update.createStatement(modifiable, pkg, newInstance, MilestonesPackage.TimePlan_end, endDay.getResource());
			
		}
		catch(Exception e)
		{
			Update.createStatement(modifiable, pkg, newInstance, MilestonesPackage.TimePlan_start, LiteralUtil.create(e.toString()));			
			
		}

	}
	
	private java.util.Date addDays( java.util.Date date, int days)
	{
		java.time.LocalDate endLocalDate = date.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
		java.time.LocalDate startLocalDate = endLocalDate.plusDays(days);
		return java.util.Date.from(startLocalDate.atStartOfDay(java.time.ZoneId.systemDefault()).toInstant());
		
	}
}
