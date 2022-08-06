package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel;

import java.util.Optional;

import ch.actifsource.core.INode;
import ch.actifsource.core.Package;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.model.aspects.AbstractInitializationAspect;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.core.util.LiteralUtil;
import cleon.common.calendar.metamodel.spec.FunctionSpace_Calendar.IDayFunctions;
import cleon.common.calendar.metamodel.spec.javamodel.IDay;
import cleon.common.calendar.metamodel.spec.javamodel.IMonth;
import cleon.common.calendar.metamodel.spec.javamodel.IYear;
import cleon.common.calendar.metamodel.spec.javamodel.Month;
import cleon.common.calendar.metamodel.spec.javamodel.Year;
import cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.SprintsPackage;
import cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.absence.javamodel.IAbsenceMonth;
import cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.absence.javamodel.IAbsences;
import cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.absence.javamodel.IAbsenseDay;
import cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.absence.javamodel.IAbsenseYear;

public class CapacityPerDayInitializerAspect extends AbstractInitializationAspect {

	private static IAbsenseYear getAbsenseYear(IAbsences absences, IYear year)
	{
		if( absences != null && absences.selectAbsenseYear() != null)
		{
			final Optional<? extends IAbsenseYear> hasYear = absences.selectAbsenseYear().values().stream().filter(y -> y.selectYear() == year).findFirst();
			if(hasYear.isPresent())
			{
				return hasYear.get();
			}
		}
		return null;

	}

	private static IAbsenceMonth getAbsenseMonth(IAbsenseYear absenseYear, IMonth month)
	{
		final Optional<? extends IAbsenceMonth> hasMonth = absenseYear.selectAbsenseMonth().values().stream().filter(x -> x.selectMonth() == month).findFirst();
		if(hasMonth.isPresent())
		{
			return hasMonth.get();
		}
		return null;
	}

	private static IAbsenseDay getAbsenseDay(IAbsenceMonth absenseMonth, IDay day)
	{
		final Optional<? extends IAbsenseDay> hasDay = absenseMonth.selectAbsenseDay().values().stream().filter(x -> x.selectDay() == day).findFirst();
		if(hasDay.isPresent())
		{
			return hasDay.get();
		}
		return null;
	}

	public static int getCapacity(ICapacityPerDay capacityPerDay)
	{
		final var day = capacityPerDay.selectDay();
		final var month = Month.selectToMeDays(day);
		final var year = Year.selectToMeMonths(month);
		final var person = PersonCapacity.selectToMeCapacityPerDay(capacityPerDay).selectPerson();

		final var absences = person.selectAbsences();
		final var absenseYear = getAbsenseYear(absences, year);
		if( absenseYear != null)
		{
			final var absenseMonth = getAbsenseMonth(absenseYear, month);
			if( absenseMonth != null)
			{
				final var absenseDay = getAbsenseDay(absenseMonth, day);
				if( absenseDay != null)
				{
					return 0;
				}
			}
		}
		if( day.extension(IDayFunctions.class).IsWeekend())
		{
			return 0;

		}
		return 8;

	}

	@Override
	public void initialize(IModifiable modifiable, INode clazz, Package pkg, INode newInstance) {
		try
		{
			final var typeSystem = TypeSystem.create(modifiable);
			final var resourceRepository = typeSystem.getResourceRepository();
			final var capacityPerDay = resourceRepository.getResource(ICapacityPerDay.class, newInstance);
			Update.createStatement(modifiable, pkg, newInstance, SprintsPackage.CapacityPerDay_capacity, LiteralUtil.create(getCapacity(capacityPerDay)));
		}
		catch(final Exception e)
		{
			Update.createStatement(modifiable, pkg, newInstance, SprintsPackage.CapacityPerDay_capacity, LiteralUtil.create(e.toString()));
		}
	}
}