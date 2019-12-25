package cleon.common.calendar.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ICalendar extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("9f210355-c37c-11e5-9455-d97b1b986284");
  
  public java.lang.Integer selectStartYear();
  
  // relations
  
  public java.util.List<? extends cleon.common.calendar.metamodel.spec.javamodel.IYear> selectYears();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,9f210355-c37c-11e5-9455-d97b1b986284,klSYhCgg4Myc4/WumLeJDnULoko=] */
