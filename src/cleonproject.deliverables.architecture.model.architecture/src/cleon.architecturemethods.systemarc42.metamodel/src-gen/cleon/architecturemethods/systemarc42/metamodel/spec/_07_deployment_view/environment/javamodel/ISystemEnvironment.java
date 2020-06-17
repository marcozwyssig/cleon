package cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISystemEnvironment extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.javamodel.IEnvironment, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.javamodel.IRootNode {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("7372f8ef-ef40-11e8-be8a-b748ff8f0a75");
  
  public java.lang.String selectHostGroupPrefix();
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.IDeploymentLevel> selectLevel_1();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.IDeploymentLevel> selectLevel_2();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.IDeploymentLevel> selectLevel_3();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.IDeploymentLevel> selectLevel_4();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.IDeploymentLevel> selectLevel_5();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.IDeploymentLevel> selectLevel_6();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.IDeploymentLevel> selectLevel_7();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.IDeploymentLevel> selectLevel_8();
  
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment> selectIncludeEnvironment();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,7372f8ef-ef40-11e8-be8a-b748ff8f0a75,YAY2VMeVlxL+ZEibs+E7KcJtrOM=] */
