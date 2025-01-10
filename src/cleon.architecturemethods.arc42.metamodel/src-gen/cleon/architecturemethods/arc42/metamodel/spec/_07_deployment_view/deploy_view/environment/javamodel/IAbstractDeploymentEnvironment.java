package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy_view.environment.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbstractDeploymentEnvironment extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy_view.javamodel.IEnvironment {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("e2b8a19e-cf62-11ef-9cfd-2b4b2f5c36ec");
  
  public java.lang.String selectHostGroupPrefix();
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy_view.environment.javamodel.IDeploymentLevel> selectLevel_1();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy_view.environment.javamodel.IDeploymentLevel> selectLevel_2();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy_view.environment.javamodel.IDeploymentLevel> selectLevel_3();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy_view.environment.javamodel.IDeploymentLevel> selectLevel_4();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy_view.environment.javamodel.IDeploymentLevel> selectLevel_5();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy_view.environment.javamodel.IDeploymentLevel> selectLevel_6();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy_view.environment.javamodel.IDeploymentLevel> selectLevel_7();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy_view.environment.javamodel.IDeploymentLevel> selectLevel_8();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,e2b8a19e-cf62-11ef-9cfd-2b4b2f5c36ec,3MFfJiNVPjA2DxIij/w0WbLUw28=] */
