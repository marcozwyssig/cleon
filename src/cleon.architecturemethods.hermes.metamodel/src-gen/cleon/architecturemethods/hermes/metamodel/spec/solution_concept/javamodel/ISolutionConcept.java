package cleon.architecturemethods.hermes.metamodel.spec.solution_concept.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISolutionConcept extends cleon.common.doc.metamodel.spec.document.javamodel.INamedDocument, cleon.common.doc.metamodel.spec.chapter.about.javamodel.IAboutAware, cleon.common.glossary.metamodel.spec.javamodel.IGlossaryAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("9cff9835-d32d-11ef-802e-175af1a41dfa");
  
  // relations
  
  public cleon.architecturemethods.hermes.metamodel.spec.solution_concept.background.javamodel.IBackground selectBackground();
  
  public java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.solution_concept.javamodel.ISolutionLevel> selectSolutionLevels();
  
  public cleon.architecturemethods.hermes.metamodel.spec.solution_concept.conclusion.javamodel.IConclusion selectConclusion();
  
  public cleon.common.doc.metamodel.spec.chapter.appendix.javamodel.IAppendix selectAppendix();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,9cff9835-d32d-11ef-802e-175af1a41dfa,Yy+wSQhx982o8v3D5JkjmB9T8Ok=] */
