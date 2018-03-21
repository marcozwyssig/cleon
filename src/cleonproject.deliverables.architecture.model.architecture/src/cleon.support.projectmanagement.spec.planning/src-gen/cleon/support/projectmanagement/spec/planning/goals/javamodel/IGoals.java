package cleon.support.projectmanagement.spec.planning.goals.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IGoals extends cleon.common.doc.spec.doc.chapter.javamodel.IChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("84cb4681-bc87-11e6-b169-a12bde5a1c7c");
  
  // relations
  
  public cleon.support.projectmanagement.spec.planning.goals.javamodel.IProjectGoals selectProjectGoals();
  
  public cleon.support.projectmanagement.spec.planning.goals.javamodel.ISystemGoals selectSystemGoals();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,84cb4681-bc87-11e6-b169-a12bde5a1c7c,YO7mXiBmZ+uedF0rkIK5kVKCtU4=] */