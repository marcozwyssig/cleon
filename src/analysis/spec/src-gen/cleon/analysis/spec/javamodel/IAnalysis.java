package cleon.analysis.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAnalysis extends cleon.doc.spec.chapter.javamodel.IChapterWithDescription, cleon.doc.spec.document.javamodel.INamedDocument, cleon.doc.spec.chapter.javamodel.INoChapters {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c647eff4-3c0e-11e5-9962-cf3035adb922");
  
  // relations
  
  public cleon.analysis.spec.drivers.javamodel.IDrivers selectDrivers();
  
  public cleon.analysis.spec.solutions.javamodel.ISolutions selectSolution();
  
  public cleon.analysis.spec.evaluation.javamodel.IEvaluations selectEvaluation();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c647eff4-3c0e-11e5-9962-cf3035adb922,vP1jUm2GkNDX4x7Eh/68uOwaURk=] */
