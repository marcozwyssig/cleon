package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel;

import ch.actifsource.core.INode;
import ch.actifsource.core.Package;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.core.util.LiteralUtil;
import cleon.common.calendar.metamodel.spec.FunctionSpace_Calendar.ICalendarFunctions;
import cleon.common.calendar.metamodel.spec.FunctionSpace_Calendar.IDayFunctions;
import cleon.common.resources.metamodel.spec.id.javamodel.BusinessObjectIdInitializerAspect;
import cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.releases.ReleasesPackage;
import cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.FunctionSpace_Sprints.ISprintFunctions;

public class SprintInitializerAspect extends BusinessObjectIdInitializerAspect<ISprint>  {

	public SprintInitializerAspect() {
		super(ISprint.class);
	}

	@Override
	public void initialize(IModifiable modifiable, INode clazz, Package pkg, INode newInstance) {

		super.initialize(modifiable, clazz, pkg, newInstance);

		try
		{
			final var typeSystem = TypeSystem.create(modifiable);
			final var resourceRepository = typeSystem.getResourceRepository();
			final var sprint = resourceRepository.getResource(ISprint.class, newInstance);
			final var sprintFunctions = sprint.extension(ISprintFunctions.class);
			final var lastSprint = sprintFunctions.LastSprint();
			if( lastSprint == null)
			{
				return;
			}

			final var endDate = lastSprint.selectEnd().extension(IDayFunctions.class).GetDate();
			final var startDate = addDays(endDate, 1);
			final var newEndDate = addDays(startDate, sprintFunctions.GetSprints().selectDaysPerSprint() - 1);
			final var calendarFunctions = sprintFunctions.GetCalendar().extension(ICalendarFunctions.class);

			final var startDay = calendarFunctions.GetDay(startDate);
			Update.createStatement(modifiable, pkg, newInstance, ReleasesPackage.TimePlan_start, startDay.getResource());

			final var endDay = calendarFunctions.GetDay(newEndDate);
			Update.createStatement(modifiable, pkg, newInstance, ReleasesPackage.TimePlan_end, endDay.getResource());

		}
		catch(final Exception e)
		{
			Update.createStatement(modifiable, pkg, newInstance, ReleasesPackage.TimePlan_start, LiteralUtil.create(e.toString()));
		}
	}

	private java.util.Date addDays( java.util.Date date, int days)
	{
		final var endLocalDate = date.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
		final var startLocalDate = endLocalDate.plusDays(days);
		return java.util.Date.from(startLocalDate.atStartOfDay(java.time.ZoneId.systemDefault()).toInstant());

	}
}