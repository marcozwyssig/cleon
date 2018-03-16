package cleon.support.projectmanagement.spec.resource.persons.absence.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbsenseYear extends ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c661b9c8-c4c6-11e5-8558-4b8affb7767c");
  
  // relations
  
  public cleon.common.resources.spec.calendar.javamodel.IYear selectYear();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.support.projectmanagement.spec.resource.persons.absence.javamodel.IAbsenceMonth> selectAbsenseMonth();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c661b9c8-c4c6-11e5-8558-4b8affb7767c,r25y0P57/8IKPyFssEgc/gbN8Sw=] */
