package cleon.common.analysis.spec.analysis.solution.evaluation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISolutionsEvaluation extends ch.actifsource.core.javamodel.IDecorator, cleon.common.doc.spec.doc.chapter.javamodel.IChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("38e891b4-3c1a-11e5-9962-cf3035adb922");
  
  // relations
  
  public cleon.common.analysis.spec.analysis.solution.solutions.javamodel.ISolution selectSolution();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.analysis.spec.analysis.solution.evaluation.javamodel.IEvaluation> selectEvaluation();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,38e891b4-3c1a-11e5-9962-cf3035adb922,vg5hylkZcpgsth6ucpHwE7lmHKQ=] */
