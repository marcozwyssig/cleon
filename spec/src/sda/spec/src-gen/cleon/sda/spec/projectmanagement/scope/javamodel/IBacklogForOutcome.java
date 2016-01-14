package cleon.sda.spec.projectmanagement.scope.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IBacklogForOutcome extends ch.actifsource.core.javamodel.IDecorator, cleon.doc.spec.chapter.javamodel.IChapter, cleon.doc.spec.chapter.javamodel.INoChapters {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("b59f22b9-b9c1-11e5-a5dc-db9071475fc6");
  
  // relations
  
  public cleon.sda.spec.projectmanagement.scope.outcome.javamodel.IOutcome selectOutcome();
  
  public cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IBacklog selectBacklog();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,b59f22b9-b9c1-11e5-a5dc-db9071475fc6,nozmmooZCrhZM8G4ahZKas3c7QQ=] */
