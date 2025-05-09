package cleon.common.calendar.metamodel.spec;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[5c700e8e-c391-11e5-a9c9-53d676410f3e,imports]] */
import cleon.common.calendar.metamodel.spec.javamodel.*;
/* End Protected Region   [[5c700e8e-c391-11e5-a9c9-53d676410f3e,imports]] */

public class FunctionSpace_Calendar {

  /* Begin Protected Region [[5c700e8e-c391-11e5-a9c9-53d676410f3e]] */

  /* End Protected Region   [[5c700e8e-c391-11e5-a9c9-53d676410f3e]] */


  public static interface IDayFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("64248f6f-c391-11e5-a9c9-53d676410f3e")
    public java.util.Date GetDate();

    @IDynamicResourceExtension.MethodId("8f42ec9d-c4c4-11e5-8558-4b8affb7767c")
    public java.lang.String FormattedDate();

    @IDynamicResourceExtension.MethodId("7fe5f4be-c4cb-11e5-8558-4b8affb7767c")
    public java.lang.Boolean IsWeekend();

    @IDynamicResourceExtension.MethodId("3df57966-4e70-11e6-a89e-4beefb17234f")
    public java.lang.String ShortFormattedDate();

    @IDynamicResourceExtension.MethodId("21fe9ba8-d6a9-11e6-a1b8-05a222dbc1bd")
    public java.lang.String FormattedDay();

  }
  
  public static interface IDayFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("64248f6f-c391-11e5-a9c9-53d676410f3e")
    public java.util.Date GetDate(final ch.actifsource.core.javamodel.IResource day);

    @IDynamicResourceExtension.MethodId("8f42ec9d-c4c4-11e5-8558-4b8affb7767c")
    public java.lang.String FormattedDate(final ch.actifsource.core.javamodel.IResource day);

    @IDynamicResourceExtension.MethodId("7fe5f4be-c4cb-11e5-8558-4b8affb7767c")
    public java.lang.Boolean IsWeekend(final ch.actifsource.core.javamodel.IResource day);

    @IDynamicResourceExtension.MethodId("3df57966-4e70-11e6-a89e-4beefb17234f")
    public java.lang.String ShortFormattedDate(final ch.actifsource.core.javamodel.IResource day);

    @IDynamicResourceExtension.MethodId("21fe9ba8-d6a9-11e6-a1b8-05a222dbc1bd")
    public java.lang.String FormattedDay(final ch.actifsource.core.javamodel.IResource day);

  }
  
  public static class DayFunctionsImpl implements IDayFunctionsImpl {

    public static final IDayFunctionsImpl INSTANCE = new DayFunctionsImpl();

    private DayFunctionsImpl() {}

    @Override
    public java.util.Date GetDate(final ch.actifsource.core.javamodel.IResource day) {
      /* Begin Protected Region [[64248f6f-c391-11e5-a9c9-53d676410f3e]] */
      final var month = Month.selectToMeDays(day);
      final var year = Year.selectToMeMonths(month);
      final var localDateTime = java.time.LocalDate.of(year.selectIdentifier(),
      		month.selectIdentifier(), day.selectIdentifier());
      return java.util.Date
      		.from(localDateTime.atStartOfDay().atZone(java.time.ZoneId.systemDefault()).toInstant());
      /* End Protected Region   [[64248f6f-c391-11e5-a9c9-53d676410f3e]] */
    }

    @Override
    public java.lang.String FormattedDate(final ch.actifsource.core.javamodel.IResource day) {
      if (day == null) { return null; }
      final var date = GetDate(day);
      final var dateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd_EEE", java.util.Locale.ENGLISH);
      return dateFormat.format(date);
    }

    @Override
    public java.lang.Boolean IsWeekend(final ch.actifsource.core.javamodel.IResource day) {
      /* Begin Protected Region [[7fe5f4be-c4cb-11e5-8558-4b8affb7767c]] */
      final var date = GetDate(day);
      final var dayOfWeek = date.toInstant().atZone(java.time.ZoneId.systemDefault()).getDayOfWeek();
      if (dayOfWeek == java.time.DayOfWeek.SATURDAY || dayOfWeek == java.time.DayOfWeek.SUNDAY) {
      	return true;
      }
      return false;
      /* End Protected Region   [[7fe5f4be-c4cb-11e5-8558-4b8affb7767c]] */
    }

    @Override
    public java.lang.String ShortFormattedDate(final ch.actifsource.core.javamodel.IResource day) {
      /* Begin Protected Region [[3df57966-4e70-11e6-a89e-4beefb17234f]] */
      if (day == null)
      {
      	return null;
      }

      final var date = GetDate(day);
      final var dateFormat = new java.text.SimpleDateFormat("yyyyMMdd", java.util.Locale.ENGLISH);
      return dateFormat.format(date);
      /* End Protected Region   [[3df57966-4e70-11e6-a89e-4beefb17234f]] */
    }

    @Override
    public java.lang.String FormattedDay(final ch.actifsource.core.javamodel.IResource day) {
      /* Begin Protected Region [[21fe9ba8-d6a9-11e6-a1b8-05a222dbc1bd]] */
      if (day == null)
      {
      	return null;
      }
      final var date = GetDate(day);
      final var dateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.ENGLISH);
      return dateFormat.format(date);
      /* End Protected Region   [[21fe9ba8-d6a9-11e6-a1b8-05a222dbc1bd]] */
    }

  }
  
  public static class DayFunctions {

    private DayFunctions() {}

    public static java.util.Date GetDate(final ch.actifsource.core.javamodel.IResource day) {
      return DynamicResourceUtil.invoke(IDayFunctionsImpl.class, DayFunctionsImpl.INSTANCE, day).GetDate(day);
    }

    public static java.lang.String FormattedDate(final ch.actifsource.core.javamodel.IResource day) {
      return DynamicResourceUtil.invoke(IDayFunctionsImpl.class, DayFunctionsImpl.INSTANCE, day).FormattedDate(day);
    }

    public static java.lang.Boolean IsWeekend(final ch.actifsource.core.javamodel.IResource day) {
      return DynamicResourceUtil.invoke(IDayFunctionsImpl.class, DayFunctionsImpl.INSTANCE, day).IsWeekend(day);
    }

    public static java.lang.String ShortFormattedDate(final ch.actifsource.core.javamodel.IResource day) {
      return DynamicResourceUtil.invoke(IDayFunctionsImpl.class, DayFunctionsImpl.INSTANCE, day).ShortFormattedDate(day);
    }

    public static java.lang.String FormattedDay(final ch.actifsource.core.javamodel.IResource day) {
      return DynamicResourceUtil.invoke(IDayFunctionsImpl.class, DayFunctionsImpl.INSTANCE, day).FormattedDay(day);
    }

  }

  public static interface ICalendarFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0c672790-8a12-11e6-8085-d9bdba2de943")
    public ch.actifsource.core.javamodel.IResource GetDay(final java.util.Date time);

    @IDynamicResourceExtension.MethodId("0098270f-d6a8-11e6-a1b8-05a222dbc1bd")
    public ch.actifsource.core.javamodel.IResource Now();

  }
  
  public static interface ICalendarFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("0c672790-8a12-11e6-8085-d9bdba2de943")
    public ch.actifsource.core.javamodel.IResource GetDay(final java.util.Date time, final ch.actifsource.core.javamodel.INamedResource calendar);

    @IDynamicResourceExtension.MethodId("0098270f-d6a8-11e6-a1b8-05a222dbc1bd")
    public ch.actifsource.core.javamodel.IResource Now(final ch.actifsource.core.javamodel.INamedResource calendar);

  }
  
  public static class CalendarFunctionsImpl implements ICalendarFunctionsImpl {

    public static final ICalendarFunctionsImpl INSTANCE = new CalendarFunctionsImpl();

    private CalendarFunctionsImpl() {}

    @Override
    public ch.actifsource.core.javamodel.IResource GetDay(final java.util.Date time, final ch.actifsource.core.javamodel.INamedResource calendar) {
      /* Begin Protected Region [[0c672790-8a12-11e6-8085-d9bdba2de943]] */
      final var date = time.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
      final var year = date.getYear();
      final var month = date.getMonthValue();
      final var day = date.getDayOfMonth();
      final IYear yearObj = calendar.selectYears().stream().filter(x -> x.selectIdentifier().equals(year)).findFirst()
      		.get();
      final IMonth monthObj = yearObj.selectMonths().stream().filter(x -> x.selectIdentifier().equals(month))
      		.findFirst().get();
      return monthObj.selectDays().stream().filter(x -> x.selectIdentifier().equals(day)).findFirst().get();
      /* End Protected Region   [[0c672790-8a12-11e6-8085-d9bdba2de943]] */
    }

    @Override
    public ch.actifsource.core.javamodel.IResource Now(final ch.actifsource.core.javamodel.INamedResource calendar) {
      /* Begin Protected Region [[0098270f-d6a8-11e6-a1b8-05a222dbc1bd]] */
      return GetDay(new java.util.Date(), calendar);
      /* End Protected Region   [[0098270f-d6a8-11e6-a1b8-05a222dbc1bd]] */
    }

  }
  
  public static class CalendarFunctions {

    private CalendarFunctions() {}

    public static ch.actifsource.core.javamodel.IResource GetDay(final java.util.Date time, final ch.actifsource.core.javamodel.INamedResource calendar) {
      return DynamicResourceUtil.invoke(ICalendarFunctionsImpl.class, CalendarFunctionsImpl.INSTANCE, calendar).GetDay(time, calendar);
    }

    public static ch.actifsource.core.javamodel.IResource Now(final ch.actifsource.core.javamodel.INamedResource calendar) {
      return DynamicResourceUtil.invoke(ICalendarFunctionsImpl.class, CalendarFunctionsImpl.INSTANCE, calendar).Now(calendar);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,5c700e8e-c391-11e5-a9c9-53d676410f3e,2ihLkCCcPn7MarIrr8JmNbwH2B0=] */
