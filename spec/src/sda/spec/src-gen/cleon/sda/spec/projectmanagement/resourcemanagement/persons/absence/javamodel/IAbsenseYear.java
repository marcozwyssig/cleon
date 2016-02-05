package cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbsenseYear extends ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c661b9c8-c4c6-11e5-8558-4b8affb7767c");
  
  // relations
  
  public cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IYear selectYear();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.javamodel.IAbsenceMonth> selectAbsenseMonth();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c661b9c8-c4c6-11e5-8558-4b8affb7767c,YnL5GsXk0a72K2YyhLqxks5GJnE=] */
