package cleon.common.calendar.metamodel.spec.javamodel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.OptionalInt;

import ch.actifsource.core.INode;
import ch.actifsource.core.Package;
import ch.actifsource.core.Resource;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.model.aspects.AbstractInitializationAspect;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.core.util.LiteralUtil;
import cleon.common.calendar.metamodel.spec.SpecPackage;

public class YearInitializerAspect extends AbstractInitializationAspect {
	@Override
	public void initialize(IModifiable modifiable, INode clazz, Package pkg,
			INode newInstance) {
		
		ITypeSystem typeSystem = TypeSystem.create(modifiable);
		IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();
		
		IYear year = resourceRepository.getResource(IYear.class, newInstance);
		ICalendar calendar = Calendar.selectToMeYears(year);
		Integer startYear = calendar.selectStartYear();
		OptionalInt maxYear = calendar.selectYears().stream().filter(y -> y.selectIdentifier() != null).mapToInt(x -> x.selectIdentifier()).max();
		if( maxYear.isPresent())
		{
			startYear = maxYear.getAsInt() + 1;
		}
		
		Update.createStatement(modifiable, pkg, newInstance, SpecPackage.CalendarItem_identifier, LiteralUtil.create(startYear));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM");
		
		for(int i=1;i<13;++i)
		{
			Resource month = Update.createResourceNoDefaults(modifiable, pkg, SpecPackage.Month);
			Update.createStatement(modifiable, pkg, month, SpecPackage.CalendarItem_identifier, LiteralUtil.create(i));
			Update.createStatement(modifiable, pkg, newInstance, SpecPackage.Year_months, month);		
			
			try {
				Date start = sdf.parse(startYear + "." + i);
				java.util.Calendar c = java.util.Calendar.getInstance();
				c.setTime(start);
				int maxDay = c.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);
				for(int co=1; co<maxDay+1; co++){
				    Resource day = Update.createResourceNoDefaults(modifiable, pkg, SpecPackage.Day);
				    Update.createStatement(modifiable, pkg, day, SpecPackage.CalendarItem_identifier, LiteralUtil.create(co));
				    Update.createStatement(modifiable, pkg, month, SpecPackage.Month_days, day);	
				    c.add(java.util.Calendar.DATE, 1);
				}
				
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
	}
}


