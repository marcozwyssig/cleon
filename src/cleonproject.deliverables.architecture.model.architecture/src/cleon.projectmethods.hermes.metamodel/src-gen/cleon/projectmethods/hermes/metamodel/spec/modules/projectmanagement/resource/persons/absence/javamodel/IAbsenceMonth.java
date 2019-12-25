package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.absence.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbsenceMonth extends ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("ce3dada8-c4c8-11e5-8558-4b8affb7767c");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.absence.javamodel.IAbsenseDay> selectAbsenseDay();
  
  public cleon.common.calendar.metamodel.spec.javamodel.IMonth selectMonth();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,ce3dada8-c4c8-11e5-8558-4b8affb7767c,NLFnsWjMHPIDug8JQEwLP9VUAVk=] */
