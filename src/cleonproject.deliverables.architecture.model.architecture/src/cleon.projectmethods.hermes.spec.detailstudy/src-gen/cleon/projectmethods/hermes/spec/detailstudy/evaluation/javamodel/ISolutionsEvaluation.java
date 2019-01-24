package cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISolutionsEvaluation extends ch.actifsource.core.javamodel.IDecorator, cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("38e891b4-3c1a-11e5-9962-cf3035adb922");
  
  // relations
  
  public cleon.projectmethods.hermes.spec.detailstudy.solutions.javamodel.ISolution selectSolution();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.IKnockoutEvaluation> selectKnockoutEvaluation();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.IWeightingEvaluation> selectWeightingEvaluation();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,38e891b4-3c1a-11e5-9962-cf3035adb922,zXoFF6AiF/0tF3kaDYTevgXiiaY=] */
