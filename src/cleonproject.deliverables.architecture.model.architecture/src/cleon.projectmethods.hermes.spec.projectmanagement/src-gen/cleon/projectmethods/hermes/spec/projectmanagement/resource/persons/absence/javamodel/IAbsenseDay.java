package cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.absence.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbsenseDay extends ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("d157be88-c4c8-11e5-8558-4b8affb7767c");
  
  // relations
  
  public cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.absence.javamodel.IAbsenseReason selectReason();
  
  public cleon.common.resources.spec.calendar.javamodel.IDay selectDay();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,d157be88-c4c8-11e5-8558-4b8affb7767c,tr0oxKykiCc20dJUCbr1Z4nsHMw=] */
