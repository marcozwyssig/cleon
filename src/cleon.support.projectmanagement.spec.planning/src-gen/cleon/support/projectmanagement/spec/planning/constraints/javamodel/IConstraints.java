package cleon.support.projectmanagement.spec.planning.constraints.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IConstraints extends cleon.common.doc.spec.doc.chapter.javamodel.IChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("f8f6cf2c-d42d-11e6-8a1d-7fdd5d29730e");
  
  // relations
  
  public cleon.support.projectmanagement.spec.planning.constraints.javamodel.IDependencies selectDependencies();
  
  public cleon.support.projectmanagement.spec.planning.constraints.javamodel.IDistinctions selectDistinctions();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,f8f6cf2c-d42d-11e6-8a1d-7fdd5d29730e,lXsKgSz07qtekMFadCO9XOZ+GDY=] */
