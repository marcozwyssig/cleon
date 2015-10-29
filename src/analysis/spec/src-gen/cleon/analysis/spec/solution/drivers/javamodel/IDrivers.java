package cleon.analysis.spec.solution.drivers.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDrivers extends cleon.doc.spec.document.javamodel.ISubDocument, cleon.doc.spec.document.javamodel.INoSubDocuments {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("877f094b-3c14-11e5-9962-cf3035adb922");
  
  // relations
  
  public cleon.analysis.spec.solution.drivers.javamodel.IContext selectContext();
  
  public cleon.analysis.spec.solution.drivers.javamodel.IGoals selectGoal();
  
  public java.util.List<? extends cleon.analysis.spec.solution.drivers.javamodel.ISource> selectSources();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,877f094b-3c14-11e5-9962-cf3035adb922,buCuSzVqXOKcxiEjsqe/KZxXKIc=] */
