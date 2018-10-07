package cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IWorkItemBase extends cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IWorkItem, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IEffortAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("d52dddaa-28af-11e7-b0c5-5d730025d0c2");
  
  public java.lang.String selectReference();
  
  // relations
  
  public cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IText selectAnalysis();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,d52dddaa-28af-11e7-b0c5-5d730025d0c2,ZiXtgZrT39FCzDQEbw0hmk1YrJI=] */
