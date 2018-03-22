package cleon.deployment.devops.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface I__V_7_aE_DevOpsDeploymentView extends cleon.conception.framework.spec.arc42._07_deployment_view.javamodel.I__V_7_aE_DeploymentView {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("a574eba1-41b4-11e5-a2b3-edc7f3343844");
  
  // relations
  
  public cleon.deployment.devops.spec.code.javamodel.ICode selectCode();
  
  public cleon.deployment.devops.spec.build.javamodel.IBuild selectBuild();
  
  public java.util.List<? extends cleon.deployment.devops.spec.test.javamodel.ITest> selectTest();
  
  public cleon.deployment.devops.spec.release.javamodel.IRelease selectRelease();
  
  public java.util.List<? extends cleon.deployment.devops.spec.deploy.javamodel.IDeploy> selectDeploy();
  
  public java.util.List<? extends cleon.deployment.devops.spec.operate.javamodel.IOperate> selectOperates();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,a574eba1-41b4-11e5-a2b3-edc7f3343844,XBbi5a9hDEt6CSPb4BW6SPLkE18=] */
