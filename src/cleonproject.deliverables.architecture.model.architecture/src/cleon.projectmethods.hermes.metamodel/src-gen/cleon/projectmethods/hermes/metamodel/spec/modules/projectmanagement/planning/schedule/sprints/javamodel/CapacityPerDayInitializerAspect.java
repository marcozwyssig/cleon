package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel;

import java.util.Optional;

import ch.actifsource.core.INode;
import ch.actifsource.core.Package;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.model.aspects.AbstractInitializationAspect;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.core.util.LiteralUtil;
import cleon.common.calendar.metamodel.spec.FunctionSpace.DayFunctionsImpl;
import cleon.common.calendar.metamodel.spec.javamodel.IDay;
import cleon.common.calendar.metamodel.spec.javamodel.IMonth;
import cleon.common.calendar.metamodel.spec.javamodel.IYear;
import cleon.common.calendar.metamodel.spec.javamodel.Month;
import cleon.common.calendar.metamodel.spec.javamodel.Year;
import cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ICapacityPerDay;
import cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.PersonCapacity;
import cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.SprintsPackage;
import cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.absence.javamodel.IAbsenceMonth;
import cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.absence.javamodel.IAbsences;
import cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.absence.javamodel.IAbsenseDay;
import cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.absence.javamodel.IAbsenseYear;
import cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IPerson;

public class CapacityPerDayInitializerAspect extends AbstractInitializationAspect {

	private static IAbsenseYear getAbsenseYear(IAbsences absences, IYear year)
	{
		if( absences != null && absences.selectAbsenseYear() != null)
		{
			Optional<? extends IAbsenseYear> hasYear = absences.selectAbsenseYear().values().stream().filter(y -> y.selectYear() == year).findFirst();
			if(hasYear.isPresent())
			{
				return hasYear.get();
			}
		}
		return null;
				
	}

	private static IAbsenceMonth getAbsenseMonth(IAbsenseYear absenseYear, IMonth month)
	{
		Optional<? extends IAbsenceMonth> hasMonth = absenseYear.selectAbsenseMonth().values().stream().filter(x -> x.selectMonth() == month).findFirst();
		if(hasMonth.isPresent())
		{
			return hasMonth.get();
		}
		return null;
	}	

	private static IAbsenseDay getAbsenseDay(IAbsenceMonth absenseMonth, IDay day)
	{
		Optional<? extends IAbsenseDay> hasDay = absenseMonth.selectAbsenseDay().values().stream().filter(x -> x.selectDay() == day).findFirst();
		if(hasDay.isPresent())
		{
			return hasDay.get();
		}
		return null;		
	}		
	
	public static int getCapacity(ICapacityPerDay capacityPerDay)
	{
		IDay day = capacityPerDay.selectDay();
		IMonth month = Month.selectToMeDays(day);
		IYear year = Year.selectToMeMonths(month);
		IPerson person = PersonCapacity.selectToMeCapacityPerDay(capacityPerDay).selectPerson();
		
		IAbsences absences = person.selectAbsences();
		IAbsenseYear absenseYear = getAbsenseYear(absences, year);
		if( absenseYear != null)
		{
			IAbsenceMonth absenseMonth = getAbsenseMonth(absenseYear, month);
			if( absenseMonth != null)
			{
				IAbsenseDay absenseDay = getAbsenseDay(absenseMonth, day);
				if( absenseDay != null)
				{
					return 0;
				}
			}
		}
		if( DayFunctionsImpl.INSTANCE.IsWeekend(day))
		{
			return 0;

		}
		else
		{
			return 8;
		}

	}
	
	@Override
	public void initialize(IModifiable modifiable, INode clazz, Package pkg, INode newInstance) {
		try
		{
			ITypeSystem typeSystem = TypeSystem.create(modifiable);
			IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();
			ICapacityPerDay capacityPerDay = resourceRepository.getResource(ICapacityPerDay.class, newInstance);	
			Update.createStatement(modifiable, pkg, newInstance, SprintsPackage.CapacityPerDay_capacity, LiteralUtil.create(getCapacity(capacityPerDay)));	
		}
		catch(Exception e)
		{
			Update.createStatement(modifiable, pkg, newInstance, SprintsPackage.CapacityPerDay_capacity, LiteralUtil.create(e.toString()));			
		}	
	}
}