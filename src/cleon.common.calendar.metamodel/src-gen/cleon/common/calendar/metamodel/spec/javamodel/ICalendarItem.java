package cleon.common.calendar.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ICalendarItem extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("7440e8c6-c37c-11e5-9455-d97b1b986284");
  
  public java.lang.Integer selectIdentifier();
  
  // relations
  
  public java.util.List<? extends cleon.common.calendar.metamodel.spec.javamodel.ICalendarItem> selectSubCalendarItems();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,7440e8c6-c37c-11e5-9455-d97b1b986284,IOn4r83Y8csMBRd0lvN2w65bG7k=] */
