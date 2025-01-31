package cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IWindowsServerHostLicensing extends ch.actifsource.core.javamodel.IDecorator, cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel.IAmountAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("e6437b2d-dfc8-11ef-b0be-9b4cac321140");
  
  public java.lang.Integer selectPhysicalCores();
  
  public java.lang.Integer selectVms();
  
  public java.lang.Integer selectAmount();
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.javamodel.IBuildNode selectHost();
  
  public cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.javamodel.IMicrosoftServerLicense selectMicrosoftServerLicense();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,e6437b2d-dfc8-11ef-b0be-9b4cac321140,vap6VZw1qvxzoygEmOSPHi8zu9s=] */
