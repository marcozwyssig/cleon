package cleon.common.calendar.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class CalendarItem extends DynamicResource implements ICalendarItem {

  // abstract implementation, only used for static method calls
  private CalendarItem() {
    super(ICalendarItem.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.common.calendar.metamodel.spec.javamodel.ICalendarItem selectToMeSubCalendarItems(cleon.common.calendar.metamodel.spec.javamodel.ICalendarItem object) {
    return _getToMeSingle(object.getRepository(), cleon.common.calendar.metamodel.spec.javamodel.ICalendarItem.class, cleon.common.calendar.metamodel.spec.SpecPackage.CalendarItem_subCalendarItems, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7440e8c6-c37c-11e5-9455-d97b1b986284,DDOeqgcyQGRAW0hOL5CBzuD9UbE=] */
