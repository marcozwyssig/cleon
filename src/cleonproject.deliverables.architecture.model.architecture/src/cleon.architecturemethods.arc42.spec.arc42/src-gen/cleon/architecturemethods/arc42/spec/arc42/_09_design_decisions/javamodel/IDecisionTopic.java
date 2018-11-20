package cleon.architecturemethods.arc42.spec.arc42._09_design_decisions.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDecisionTopic extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractNamedChapter, cleon.common.doc.spec.doc.javamodel.INoDocumentElementComposite {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("ab88bc9d-ecde-11e8-8149-8542373915bf");
  
  // relations
  
  public cleon.architecturemethods.arc42.spec.arc42._09_design_decisions.javamodel.IProblem selectProblem();
  
  public cleon.architecturemethods.arc42.spec.arc42._09_design_decisions.javamodel.IConstraints selectConstraints();
  
  public cleon.architecturemethods.arc42.spec.arc42._09_design_decisions.javamodel.IAssumptions selectAssumptions();
  
  public cleon.architecturemethods.arc42.spec.arc42._09_design_decisions.javamodel.IConsideredAlternatives selectConsideredAlternatives();
  
  public cleon.architecturemethods.arc42.spec.arc42._09_design_decisions.javamodel.IDecision selectDecision();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,ab88bc9d-ecde-11e8-8149-8542373915bf,RnanoCMiU92B+8t+p3l65osuNl0=] */
