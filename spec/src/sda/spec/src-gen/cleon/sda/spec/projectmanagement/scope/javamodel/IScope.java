package cleon.sda.spec.projectmanagement.scope.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IScope extends cleon.doc.spec.document.javamodel.ISubDocument, cleon.doc.spec.chapter.javamodel.INoChapters, cleon.sda.spec.projectmanagement.javamodel.IProjectDocument {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("fef60a9b-a7d8-11e5-82dd-3b995d9c840c");
  
  // relations
  
  public cleon.sda.spec.projectmanagement.scope.outcome.javamodel.IOutcomes selectOutcome();
  
  public cleon.sda.spec.projectmanagement.scope.javamodel.IBacklogs selectBacklogs();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,fef60a9b-a7d8-11e5-82dd-3b995d9c840c,ZoiXh76N/mJnokkBQvCMVdnmaSc=] */
