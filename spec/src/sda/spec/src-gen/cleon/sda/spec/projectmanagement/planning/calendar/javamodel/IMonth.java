package cleon.sda.spec.projectmanagement.planning.calendar.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IMonth extends cleon.sda.spec.projectmanagement.planning.calendar.javamodel.ICalendarItem {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("59aa44e4-c37c-11e5-9455-d97b1b986284");
  
  // relations
  
  public java.util.List<? extends cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay> selectDays();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,59aa44e4-c37c-11e5-9455-d97b1b986284,tU9kUOc+1ZzYbOCGOMLZIqHv5DU=] */
