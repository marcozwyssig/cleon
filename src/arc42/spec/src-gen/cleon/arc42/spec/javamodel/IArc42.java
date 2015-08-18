package cleon.arc42.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IArc42 extends cleon.doc.spec.document.javamodel.IDocument, cleon.doc.spec.document.javamodel.INoChaptersInDocument {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("2cbcf671-ffcc-11e4-ac0a-959b440f987f");
  
  // relations
  
  public cleon.arc42.spec._01_introduction_and_goals.javamodel.I__V_1_aE_IntroductionAndGoals select__V_1_aE_introduction_aE_and_aE_goals();
  
  public cleon.arc42.spec._05_buildingblockview.javamodel.I__V_5_aE_BuildingBlockView select__V_5_aE_buildingblockview();
  
  public cleon.arc42.spec._07_deployment_view.javamodel.I__V_7_aE_DeploymentView select__V_7_aE_deploymentview();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,2cbcf671-ffcc-11e4-ac0a-959b440f987f,gONH+bBjbCkcK+JISSPr7iHXgG8=] */
