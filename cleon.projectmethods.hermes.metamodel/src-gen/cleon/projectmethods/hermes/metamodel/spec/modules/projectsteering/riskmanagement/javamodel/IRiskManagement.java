package cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRiskManagement extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("be6ee992-3249-11e6-ab4d-73a9260c8088");
  
  // relations
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.javamodel.IRiskClassification selectRiskClassification();
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.javamodel.IRisks selectRisks();
  
  public java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.javamodel.IAssessments> selectAssessments();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,be6ee992-3249-11e6-ab4d-73a9260c8088,/8pYNrFWOaCtn8cPGvXSvBsO+Y8=] */
