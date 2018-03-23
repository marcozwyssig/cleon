package cleon.support.projectmanagement.spec.steering.riskmanagement.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRiskManagement extends cleon.common.doc.spec.doc.document.javamodel.IDocument {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("be6ee992-3249-11e6-ab4d-73a9260c8088");
  
  // relations
  
  public cleon.support.projectmanagement.spec.steering.riskmanagement.javamodel.IRiskClassification selectRiskClassification();
  
  public cleon.support.projectmanagement.spec.steering.riskmanagement.risks.javamodel.IRisks selectRisks();
  
  public java.util.List<? extends cleon.support.projectmanagement.spec.steering.riskmanagement.assessments.javamodel.IAssessments> selectAssessments();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,be6ee992-3249-11e6-ab4d-73a9260c8088,HfxRvTBXSkNoLfTm6my9Sr38+Qk=] */
