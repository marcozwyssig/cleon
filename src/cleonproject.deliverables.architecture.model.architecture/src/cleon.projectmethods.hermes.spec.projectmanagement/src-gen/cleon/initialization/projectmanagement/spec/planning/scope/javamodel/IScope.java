package cleon.initialization.projectmanagement.spec.planning.scope.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IScope extends cleon.common.doc.spec.doc.chapter.javamodel.IChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("8c485ce0-3eb3-11e7-a89c-83d57940f0e3");
  
  // relations
  
  public cleon.initialization.projectmanagement.spec.planning.scope.deliverable.javamodel.IDeliverables selectDeliverables();
  
  public cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel.IOutcomes selectOutcomes();
  
  public cleon.initialization.projectmanagement.spec.planning.scope.workpackage.javamodel.IWorkpackages selectWorkpackages();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,8c485ce0-3eb3-11e7-a89c-83d57940f0e3,n4kD1xPlhdbt1NtERARcxK11PJ8=] */
