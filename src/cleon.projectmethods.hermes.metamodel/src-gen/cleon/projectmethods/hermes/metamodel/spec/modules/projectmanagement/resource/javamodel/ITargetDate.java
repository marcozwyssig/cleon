package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITargetDate extends cleon.common.resources.metamodel.spec.workstate.javamodel.IWorkStateAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("2ed622a1-20ba-11e6-9bb5-2b7a5dccc043");
  
  // relations
  
  public cleon.common.calendar.metamodel.spec.javamodel.IDay selectDeadline();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,2ed622a1-20ba-11e6-9bb5-2b7a5dccc043,dOUzYr2dpNjRXLPPxdQYaAyzcjU=] */
