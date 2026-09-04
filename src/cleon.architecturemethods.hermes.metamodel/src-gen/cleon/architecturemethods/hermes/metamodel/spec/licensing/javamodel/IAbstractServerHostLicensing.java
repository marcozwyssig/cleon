package cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbstractServerHostLicensing extends ch.actifsource.core.javamodel.IDecorator, cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel.IAmountAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("f8e15c70-dfdd-11ef-8b41-bffcdee4ee9e");
  
  public java.lang.Integer selectPhysicalCores();
  
  public java.lang.Integer selectVms();
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.javamodel.IBuildNode selectHost();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,f8e15c70-dfdd-11ef-8b41-bffcdee4ee9e,GK9IgvaD19eUkasX+w3hPauUMJM=] */
