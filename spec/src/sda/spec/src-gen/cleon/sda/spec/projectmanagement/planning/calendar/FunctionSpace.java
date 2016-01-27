package cleon.sda.spec.projectmanagement.planning.calendar;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[5c700e8e-c391-11e5-a9c9-53d676410f3e,imports]] */

/* End Protected Region   [[5c700e8e-c391-11e5-a9c9-53d676410f3e,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[5c700e8e-c391-11e5-a9c9-53d676410f3e]] */
  
  /* End Protected Region   [[5c700e8e-c391-11e5-a9c9-53d676410f3e]] */


  public static interface IDayFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("64248f6f-c391-11e5-a9c9-53d676410f3e")
    public java.util.Date GetDate();

    @IDynamicResourceExtension.MethodId("8f42ec9d-c4c4-11e5-8558-4b8affb7767c")
    public java.lang.String FormattedDate();

    @IDynamicResourceExtension.MethodId("7fe5f4be-c4cb-11e5-8558-4b8affb7767c")
    public java.lang.Boolean IsWeekend();

  }
  
  public static interface IDayFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("64248f6f-c391-11e5-a9c9-53d676410f3e")
    public java.util.Date GetDate(final cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay day);

    @IDynamicResourceExtension.MethodId("8f42ec9d-c4c4-11e5-8558-4b8affb7767c")
    public java.lang.String FormattedDate(final cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay day);

    @IDynamicResourceExtension.MethodId("7fe5f4be-c4cb-11e5-8558-4b8affb7767c")
    public java.lang.Boolean IsWeekend(final cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay day);

  }
  
  public static class DayFunctionsImpl implements IDayFunctionsImpl {

    public static final IDayFunctionsImpl INSTANCE = new DayFunctionsImpl();

    private DayFunctionsImpl() {}

    @Override
    public java.util.Date GetDate(final cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay day) {
      /* Begin Protected Region [[64248f6f-c391-11e5-a9c9-53d676410f3e]] */
    	cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IMonth month = cleon.sda.spec.projectmanagement.planning.calendar.javamodel.Month.selectToMeDays(day);
    	cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IYear year = cleon.sda.spec.projectmanagement.planning.calendar.javamodel.Year.selectToMeMonths(month);
    	java.time.LocalDate localDateTime = java.time.LocalDate.of(year.selectIdentifier(), month.selectIdentifier(), day.selectIdentifier()); 
    	return java.util.Date.from(localDateTime.atStartOfDay().atZone(java.time.ZoneId.systemDefault()).toInstant());
      // XXX implement template function here   
      /* End Protected Region   [[64248f6f-c391-11e5-a9c9-53d676410f3e]] */
    }

    @Override
    public java.lang.String FormattedDate(final cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay day) {
      /* Begin Protected Region [[8f42ec9d-c4c4-11e5-8558-4b8affb7767c]] */
    	java.util.Date date = GetDate(day);
    	java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd_EEE");
    	return dateFormat.format(date);
      // XXX implement template function here   
      /* End Protected Region   [[8f42ec9d-c4c4-11e5-8558-4b8affb7767c]] */
    }

    @Override
    public java.lang.Boolean IsWeekend(final cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay day) {
      /* Begin Protected Region [[7fe5f4be-c4cb-11e5-8558-4b8affb7767c]] */
      java.util.Date date = GetDate(day);
      java.time.DayOfWeek dayOfWeek = date.toInstant().atZone(java.time.ZoneId.systemDefault()).getDayOfWeek();
      if(dayOfWeek == java.time.DayOfWeek.SATURDAY || dayOfWeek == java.time.DayOfWeek.SUNDAY )
      {
    	  return true;
      }
      return false;
      /* End Protected Region   [[7fe5f4be-c4cb-11e5-8558-4b8affb7767c]] */
    }

  }
  
  public static class DayFunctions {

    private DayFunctions() {}

    public static java.util.Date GetDate(final cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay day) {
      return DynamicResourceUtil.invoke(IDayFunctionsImpl.class, DayFunctionsImpl.INSTANCE, day).GetDate(day);
    }

    public static java.lang.String FormattedDate(final cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay day) {
      return DynamicResourceUtil.invoke(IDayFunctionsImpl.class, DayFunctionsImpl.INSTANCE, day).FormattedDate(day);
    }

    public static java.lang.Boolean IsWeekend(final cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay day) {
      return DynamicResourceUtil.invoke(IDayFunctionsImpl.class, DayFunctionsImpl.INSTANCE, day).IsWeekend(day);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,5c700e8e-c391-11e5-a9c9-53d676410f3e,/FSs8GlIaLyUAunf/uGvs+3KGYA=] */
