package cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IWeightingEvaluation extends cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.IEvaluation {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("7f4013d4-3c1a-11e5-9962-cf3035adb922");
  
  // relations
  
  public cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel.IScore selectScore();
  
  public cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.weighting.javamodel.IWeightingCriteria selectCriteria();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,7f4013d4-3c1a-11e5-9962-cf3035adb922,OA1nGqn/xLvPrQkg+DHs5ZkS6V8=] */
