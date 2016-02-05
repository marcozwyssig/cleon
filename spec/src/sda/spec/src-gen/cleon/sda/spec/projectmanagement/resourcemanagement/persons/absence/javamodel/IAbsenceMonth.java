package cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbsenceMonth extends ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("ce3dada8-c4c8-11e5-8558-4b8affb7767c");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.javamodel.IAbsenseDay> selectAbsenseDay();
  
  public cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IMonth selectMonth();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,ce3dada8-c4c8-11e5-8558-4b8affb7767c,tI8JwfjU2uKPmgtzFAY8MAi10uU=] */
