package cleon.support.projectmanagement.spec.planning.constraints.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IConstraint extends cleon.common.doc.spec.doc.chapter.javamodel.IChapter, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("531b7044-d42e-11e6-8a1d-7fdd5d29730e");
  
  // relations
  
  public cleon.support.projectmanagement.spec.planning.javamodel.IPlanning selectProject();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,531b7044-d42e-11e6-8a1d-7fdd5d29730e,0JOyR4buNXCCDi763gLlP9kw9YI=] */
