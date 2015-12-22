package cleon.sda.spec.analysis.solution.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISolutionAnalysis extends cleon.doc.spec.document.javamodel.INamedDocument, cleon.doc.spec.chapter.javamodel.INoChapters {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c647eff4-3c0e-11e5-9962-cf3035adb922");
  
  // relations
  
  public cleon.sda.spec.analysis.solution.drivers.javamodel.IDrivers selectDrivers();
  
  public cleon.sda.spec.analysis.solution.solutions.javamodel.ISolutions selectSolution();
  
  public cleon.sda.spec.analysis.solution.evaluation.javamodel.IEvaluations selectEvaluation();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c647eff4-3c0e-11e5-9962-cf3035adb922,/zujuAGeEke3NcWR7jwDXkEwLTA=] */
