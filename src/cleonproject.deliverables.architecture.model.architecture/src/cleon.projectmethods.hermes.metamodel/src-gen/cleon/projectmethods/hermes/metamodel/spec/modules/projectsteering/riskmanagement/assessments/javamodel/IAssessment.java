package cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAssessment extends ch.actifsource.core.javamodel.IDecorator, cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, cleon.common.doc.metamodel.spec.chapter.javamodel.INoChapters, cleon.common.doc.metamodel.spec.chapter.javamodel.INoParagraph {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("2b557b98-324a-11e6-ab4d-73a9260c8088");
  
  // relations
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.javamodel.IRisk selectRisk();
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.analysis.javamodel.IRiskAnalysis selectAnalysis();
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.action.javamodel.IAction selectActions();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,2b557b98-324a-11e6-ab4d-73a9260c8088,tEIqOm8dW/3hjT2hnwdWBmygHjY=] */
