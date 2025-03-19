package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.env.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IEnvironmentSpecifications extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IAbstractEnvironmentSpecification {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("cf29054f-d22c-11ee-b255-49ab47716ebd");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.env.javamodel.ISiteSpecifications> selectSiteSpecification();
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.javamodel.IDeploymentEnvironmentRootNode selectEnvironment();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,cf29054f-d22c-11ee-b255-49ab47716ebd,kx7vM7DG1JqF7nRfhstLfrlptQs=] */
