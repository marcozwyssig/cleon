package cleon.analysis.spec.evaluation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISolutionsEvaluation extends ch.actifsource.core.javamodel.IDecorator, cleon.doc.spec.chapter.javamodel.IChapter, cleon.doc.spec.chapter.javamodel.INoChapters {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("38e891b4-3c1a-11e5-9962-cf3035adb922");
  
  // relations
  
  public cleon.analysis.spec.solutions.javamodel.ISolution selectSolution();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.analysis.spec.evaluation.javamodel.IEvaluation> selectEvaluation();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,38e891b4-3c1a-11e5-9962-cf3035adb922,HgrxHsZahSeZqX985N8+f0qklWE=] */
