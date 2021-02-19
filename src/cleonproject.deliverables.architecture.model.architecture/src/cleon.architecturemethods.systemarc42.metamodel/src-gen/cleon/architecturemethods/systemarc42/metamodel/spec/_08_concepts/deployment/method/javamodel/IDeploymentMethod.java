package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDeploymentMethod extends ch.actifsource.core.javamodel.IResource, cleon.common.resources.metamodel.spec.descriptions.javamodel.IMandatoryDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("8f187258-fe3f-11ea-892b-df291bae18c5");
  
  // attributes
  
  public java.util.List<java.lang.String> selectStandardDescription();
  
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.javamodel.IDeploymentMethodOption> selectDeploymentMethodOptions();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,8f187258-fe3f-11ea-892b-df291bae18c5,zYwamcnA8knDAXSCzkm+Rc7wRyw=] */
