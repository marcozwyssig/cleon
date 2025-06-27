package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.env.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISiteSpecifications extends ch.actifsource.core.javamodel.IDecorator, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscmp.javamodel.IAbstractListOfSysCfgSpecifications {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("f85316f3-001a-11f0-945c-87b19aec41f4");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.supplynode.javamodel.ISupplySiteNode selectSite();
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.javamodel.IDeploymentEnvironmentRootNode selectEnvironment();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.env.javamodel.IDataCenterSpecifications> selectDataCenterSpecification();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,f85316f3-001a-11f0-945c-87b19aec41f4,KEEvFR826Bwr4qsXpC6Oj58qeDA=] */
