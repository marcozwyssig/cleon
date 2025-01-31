package cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IWindowsServerLicense extends cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel.IAbstractProductEnvironmentLicensing {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("e8f6bf82-dfbe-11ef-b0be-9b4cac321140");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.javamodel.IBuildNode> selectHosts();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.javamodel.IWindowsServerHostLicensing> selectWindowsServerHostLicensing();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,e8f6bf82-dfbe-11ef-b0be-9b4cac321140,6No7zineNIPfZbM1EAs/bAQH7J8=] */
