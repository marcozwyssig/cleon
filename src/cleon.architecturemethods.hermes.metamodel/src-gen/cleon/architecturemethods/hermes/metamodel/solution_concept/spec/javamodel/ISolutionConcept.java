package cleon.architecturemethods.hermes.metamodel.solution_concept.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISolutionConcept extends cleon.common.doc.metamodel.spec.document.javamodel.INamedDocument, cleon.common.doc.metamodel.spec.chapter.about.javamodel.IAboutAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("9cff9835-d32d-11ef-802e-175af1a41dfa");
  
  // relations
  
  public cleon.architecturemethods.hermes.metamodel.solution_concept.spec.background.javamodel.IBackground selectBackgrouund();
  
  public cleon.architecturemethods.hermes.metamodel.solution_concept.spec.requirements.javamodel.IRequirements selectRequirements();
  
  public cleon.architecturemethods.hermes.metamodel.solution_concept.spec.solutionvariants.javamodel.ISolutionVariants selectSolution();
  
  public cleon.architecturemethods.hermes.metamodel.solution_concept.spec.evaluation.javamodel.IEvaluation selectEvaluation();
  
  public cleon.architecturemethods.hermes.metamodel.solution_concept.spec.conclusion.javamodel.IConclusion selectConclusion();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,9cff9835-d32d-11ef-802e-175af1a41dfa,J712v61Vdc1mcfxp59v5WhWF4nw=] */
