package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface I__V_7_aE_DevOpsDeploymentView extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.javamodel.IDeploymentView {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("a574eba1-41b4-11e5-a2b3-edc7f3343844");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.code.javamodel.ICode selectCode();
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.build.javamodel.IBuild selectBuild();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.test.javamodel.ITest> selectTest();
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.release.javamodel.IRelease selectRelease();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.deploy.javamodel.IDeploy> selectDeploy();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.operate.javamodel.IOperate> selectOperates();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,a574eba1-41b4-11e5-a2b3-edc7f3343844,D0q30xM/ygsejmUoxl/oiXhr4yk=] */
