package cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISolutionsEvaluation extends ch.actifsource.core.javamodel.IDecorator, cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("38e891b4-3c1a-11e5-9962-cf3035adb922");
  
  // relations
  
  public cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.solutions.javamodel.ISolution selectSolution();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.javamodel.IKnockoutEvaluation> selectKnockoutEvaluation();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.javamodel.IWeightingEvaluation> selectWeightingEvaluation();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,38e891b4-3c1a-11e5-9962-cf3035adb922,mjwOcAzrInGChG2xUltAP7eXhjA=] */
