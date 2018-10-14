package cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IScope extends cleon.common.doc.spec.doc.chapter.javamodel.IChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("8c485ce0-3eb3-11e7-a89c-83d57940f0e3");
  
  // relations
  
  public cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.javamodel.IDeliverables selectDeliverables();
  
  public cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.javamodel.IOutcomes selectOutcomes();
  
  public cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.javamodel.IWorkpackages selectWorkpackages();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,8c485ce0-3eb3-11e7-a89c-83d57940f0e3,4qoUok9ejek6VG/ScuYizk5HYtg=] */
