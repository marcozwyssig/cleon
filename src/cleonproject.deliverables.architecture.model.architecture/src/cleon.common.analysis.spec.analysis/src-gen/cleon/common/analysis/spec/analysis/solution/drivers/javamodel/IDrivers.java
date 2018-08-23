package cleon.common.analysis.spec.analysis.solution.drivers.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDrivers extends cleon.common.doc.spec.doc.chapter.javamodel.IChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("877f094b-3c14-11e5-9962-cf3035adb922");
  
  // relations
  
  public cleon.common.analysis.spec.analysis.solution.drivers.javamodel.IContext selectContext();
  
  public cleon.common.analysis.spec.analysis.solution.drivers.javamodel.ICriterias selectCriterias();
  
  public java.util.List<? extends cleon.common.analysis.spec.analysis.solution.drivers.javamodel.ISource> selectSources();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,877f094b-3c14-11e5-9962-cf3035adb922,HhnWvcXIQXDI10e6DUlVMS909H8=] */
