package cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel;

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
import cleon.sda.spec.projectmanagement.planning.calendar.FunctionSpace.DayFunctionsImpl;
import cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay;
import cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IMonth;
import cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IYear;
import cleon.sda.spec.projectmanagement.planning.calendar.javamodel.Month;
import cleon.sda.spec.projectmanagement.planning.calendar.javamodel.Year;
import cleon.sda.spec.projectmanagement.planning.sprintplanning.SprintplanningPackage;
import cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.javamodel.IAbsenceMonth;
import cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.javamodel.IAbsences;
import cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.javamodel.IAbsenseDay;
import cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.javamodel.IAbsenseYear;
import cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson;

public class CapacityPerDayInitializerAspect extends AbstractInitializationAspect {

	private IAbsenseYear getAbsenseYear(IAbsences absences, IYear year)
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

	private IAbsenceMonth getAbsenseMonth(IAbsenseYear absenseYear, IMonth month)
	{
		Optional<? extends IAbsenceMonth> hasMonth = absenseYear.selectAbsenseMonth().values().stream().filter(x -> x.selectMonth() == month).findFirst();
		if(hasMonth.isPresent())
		{
			return hasMonth.get();
		}
		return null;
	}	

	private IAbsenseDay getAbsenseDay(IAbsenceMonth absenseMonth, IDay day)
	{
		Optional<? extends IAbsenseDay> hasDay = absenseMonth.selectAbsenseDay().values().stream().filter(x -> x.selectDay() == day).findFirst();
		if(hasDay.isPresent())
		{
			return hasDay.get();
		}
		return null;		
	}		
	
	@Override
	public void initialize(IModifiable modifiable, INode clazz, Package pkg, INode newInstance) {
		
		try
		{
			ITypeSystem typeSystem = TypeSystem.create(modifiable);
			IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();
			ICapacityPerDay capacityPerDay = resourceRepository.getResource(ICapacityPerDay.class, newInstance);
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
						Update.createStatement(modifiable, pkg, newInstance, SprintplanningPackage.CapacityPerDay_capacity, LiteralUtil.create(0));
						return;
					}
				}
			}
			if( DayFunctionsImpl.INSTANCE.IsWeekend(day))
			{
				Update.createStatement(modifiable, pkg, newInstance, SprintplanningPackage.CapacityPerDay_capacity, LiteralUtil.create(0));	
			}
			else
			{
				Update.createStatement(modifiable, pkg, newInstance, SprintplanningPackage.CapacityPerDay_capacity, LiteralUtil.create(8));		
			}
					
		}
		catch(Exception e)
		{
			Update.createStatement(modifiable, pkg, newInstance, SprintplanningPackage.CapacityPerDay_capacity, LiteralUtil.create(e.toString()));			
			
		}

	}
}
