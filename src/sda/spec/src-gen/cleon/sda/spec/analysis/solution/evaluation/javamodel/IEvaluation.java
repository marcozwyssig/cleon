package cleon.sda.spec.analysis.solution.evaluation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IEvaluation extends ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("7f4013d4-3c1a-11e5-9962-cf3035adb922");
  
  // attributes
  
  public java.lang.String selectAssessment();
  
  public cleon.sda.spec.analysis.solution.drivers.javamodel.IGoal selectGoal();
  
  public cleon.sda.spec.analysis.solution.evaluation.javamodel.IScore selectScore();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,7f4013d4-3c1a-11e5-9962-cf3035adb922,gfaUvyX4A9M0kRBB3B6LQaVPalw=] */
