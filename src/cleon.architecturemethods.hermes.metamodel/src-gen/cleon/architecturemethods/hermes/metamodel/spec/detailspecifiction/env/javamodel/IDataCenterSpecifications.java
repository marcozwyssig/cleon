package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.env.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDataCenterSpecifications extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IAbstractEnvironmentSpecification, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("214db42e-001c-11f0-945c-87b19aec41f4");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.env.javamodel.IHostSpecification> selectHostSpecification();
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.supplynode.javamodel.ISupplyDataCenter selectDatacenter();
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.supplynode.javamodel.ISupplySiteNode selectSite();
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.javamodel.IDeploymentEnvironmentRootNode selectEnvironment();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,214db42e-001c-11f0-945c-87b19aec41f4,/J0S8dCVLNS8eqxPS2PDtm5oqDE=] */
