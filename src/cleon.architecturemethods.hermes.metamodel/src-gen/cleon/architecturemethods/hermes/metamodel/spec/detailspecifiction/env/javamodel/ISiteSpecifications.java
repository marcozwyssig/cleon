package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.env.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISiteSpecifications extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IAbstractEnvironmentSpecification, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("f85316f3-001a-11f0-945c-87b19aec41f4");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.supplynode.javamodel.ISupplySiteNode selectSite();
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.javamodel.IDeploymentEnvironmentRootNode selectEnvironment();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.env.javamodel.IDataCenterSpecifications> selectLocationSpecification();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,f85316f3-001a-11f0-945c-87b19aec41f4,WL6b4ytrYLvgdoUz7q3UXywzxK4=] */
