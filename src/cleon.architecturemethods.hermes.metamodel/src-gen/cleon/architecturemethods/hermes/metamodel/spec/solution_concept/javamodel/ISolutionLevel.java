package cleon.architecturemethods.hermes.metamodel.spec.solution_concept.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISolutionLevel extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractNamedChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("712f18b7-17b4-11f1-8320-993712c2541b");
  
  // relations
  
  public cleon.architecturemethods.hermes.metamodel.spec.solution_concept.requirements.javamodel.IRequirements selectRequirements();
  
  public java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.solution_concept.solutionvariants.javamodel.IAbstractSolutionOptions> selectSolutionOptions();
  
  public cleon.architecturemethods.hermes.metamodel.spec.solution_concept.evaluation.javamodel.IEvaluation selectEvaluation();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,712f18b7-17b4-11f1-8320-993712c2541b,S0yM61ATNiYnBEPN073b+t6Bix8=] */
