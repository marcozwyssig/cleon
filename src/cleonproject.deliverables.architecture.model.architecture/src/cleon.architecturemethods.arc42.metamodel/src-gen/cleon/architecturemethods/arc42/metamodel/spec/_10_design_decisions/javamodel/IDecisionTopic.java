package cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDecisionTopic extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractNamedChapter, cleon.common.doc.metamodel.spec.javamodel.INoDocumentElementComposite, cleon.common.doc.metamodel.spec.chapter.javamodel.INoChapters {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("ab88bc9d-ecde-11e8-8149-8542373915bf");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions.javamodel.IProblem selectProblem();
  
  public cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions.javamodel.IConstraints selectConstraints();
  
  public cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions.javamodel.IAssumptions selectAssumptions();
  
  public cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions.javamodel.IConsideredAlternatives selectConsideredAlternatives();
  
  public cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions.javamodel.IDecision selectDecision();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,ab88bc9d-ecde-11e8-8149-8542373915bf,G21DD2Kd7z2IlN5CPaAtwIeI/w4=] */
