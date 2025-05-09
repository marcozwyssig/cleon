package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[acb90998-20c6-11e6-9bb5-2b7a5dccc043,imports]] */
import java.util.ArrayList;
import cleon.common.calendar.metamodel.spec.FunctionSpace_Calendar.IDayFunctions;
import cleon.common.calendar.metamodel.spec.javamodel.*;
/* End Protected Region   [[acb90998-20c6-11e6-9bb5-2b7a5dccc043,imports]] */

public class FunctionSpace_Schedule {

  /* Begin Protected Region [[acb90998-20c6-11e6-9bb5-2b7a5dccc043]] */

  /* End Protected Region   [[acb90998-20c6-11e6-9bb5-2b7a5dccc043]] */


  public static interface ITargetDateFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b5d11302-20c6-11e6-9bb5-2b7a5dccc043")
    public java.lang.Boolean IsLate();

  }
  
  public static interface ITargetDateFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("b5d11302-20c6-11e6-9bb5-2b7a5dccc043")
    public java.lang.Boolean IsLate(final ch.actifsource.core.javamodel.IResource targetDate);

  }
  
  public static class TargetDateFunctionsImpl implements ITargetDateFunctionsImpl {

    public static final ITargetDateFunctionsImpl INSTANCE = new TargetDateFunctionsImpl();

    private TargetDateFunctionsImpl() {}

    @Override
    public java.lang.Boolean IsLate(final ch.actifsource.core.javamodel.IResource targetDate) {
      /* Begin Protected Region [[b5d11302-20c6-11e6-9bb5-2b7a5dccc043]] */
      if( targetDate.selectState().isDone())
      {
      	return false;
      }
      final var day = targetDate.selectDeadline().extension(IDayFunctions.class).GetDate();
      final var today = java.time.LocalDateTime.now().toLocalDate();
      final var targetDateDate = day.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
      return today.isAfter(targetDateDate);

      /* End Protected Region   [[b5d11302-20c6-11e6-9bb5-2b7a5dccc043]] */
    }

  }
  
  public static class TargetDateFunctions {

    private TargetDateFunctions() {}

    public static java.lang.Boolean IsLate(final ch.actifsource.core.javamodel.IResource targetDate) {
      return DynamicResourceUtil.invoke(ITargetDateFunctionsImpl.class, TargetDateFunctionsImpl.INSTANCE, targetDate).IsLate(targetDate);
    }

  }

  public static interface IScheduleFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("234caa05-aaa6-11e8-b25a-7dd9f85a27ad")
    public List<ch.actifsource.core.javamodel.IResource> SelectMonths();

  }
  
  public static interface IScheduleFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("234caa05-aaa6-11e8-b25a-7dd9f85a27ad")
    public List<ch.actifsource.core.javamodel.IResource> SelectMonths(final ch.actifsource.core.javamodel.IResource schedule);

  }
  
  public static class ScheduleFunctionsImpl implements IScheduleFunctionsImpl {

    public static final IScheduleFunctionsImpl INSTANCE = new ScheduleFunctionsImpl();

    private ScheduleFunctionsImpl() {}

    @Override
    public List<ch.actifsource.core.javamodel.IResource> SelectMonths(final ch.actifsource.core.javamodel.IResource schedule) {
      /* Begin Protected Region [[234caa05-aaa6-11e8-b25a-7dd9f85a27ad]] */
      final var releases = schedule.selectReleases();
      final var calendar = schedule.selectCalendar();
      final var startMonth = Month.selectToMeDays(releases.selectStart());
      final var startYear = Year.selectToMeMonths(startMonth);
      final var endMonth = Month.selectToMeDays(releases.selectEnd());
      final var endyear = Year.selectToMeMonths(endMonth);
      final List<IMonth> months = new ArrayList<>();

      for(final IYear year : calendar.selectYears())
      {
      	if(year.selectIdentifier() >= startYear.selectIdentifier() && year.selectIdentifier() <= endyear.selectIdentifier())
      	{
      		for(final IMonth month : year.selectMonths())
      		{
      			if( month.selectIdentifier() >= startMonth.selectIdentifier() && month.selectIdentifier() <= endMonth.selectIdentifier())
      			{
      				months.add(month);
      			}
      		}
      	}
      }
      return months;
      /* End Protected Region   [[234caa05-aaa6-11e8-b25a-7dd9f85a27ad]] */
    }

  }
  
  public static class ScheduleFunctions {

    private ScheduleFunctions() {}

    public static List<ch.actifsource.core.javamodel.IResource> SelectMonths(final ch.actifsource.core.javamodel.IResource schedule) {
      return DynamicResourceUtil.invoke(IScheduleFunctionsImpl.class, ScheduleFunctionsImpl.INSTANCE, schedule).SelectMonths(schedule);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,acb90998-20c6-11e6-9bb5-2b7a5dccc043,y59fDqfAv1SwEZwZD0nP8FVgWds=] */
