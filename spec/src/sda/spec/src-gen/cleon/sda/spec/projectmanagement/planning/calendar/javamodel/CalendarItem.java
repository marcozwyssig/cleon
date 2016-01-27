package cleon.sda.spec.projectmanagement.planning.calendar.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class CalendarItem extends DynamicResource implements ICalendarItem {

  // abstract implementation, only used for static method calls
  private CalendarItem() {
    super(ICalendarItem.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.sda.spec.projectmanagement.planning.calendar.javamodel.ICalendarItem selectToMeSubCalendarItems(cleon.sda.spec.projectmanagement.planning.calendar.javamodel.ICalendarItem object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.projectmanagement.planning.calendar.javamodel.ICalendarItem.class, cleon.sda.spec.projectmanagement.planning.calendar.CalendarPackage.CalendarItem_subCalendarItems, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7440e8c6-c37c-11e5-9455-d97b1b986284,6DdNT3YCUrxc1VEk6UTrVv7U03M=] */
