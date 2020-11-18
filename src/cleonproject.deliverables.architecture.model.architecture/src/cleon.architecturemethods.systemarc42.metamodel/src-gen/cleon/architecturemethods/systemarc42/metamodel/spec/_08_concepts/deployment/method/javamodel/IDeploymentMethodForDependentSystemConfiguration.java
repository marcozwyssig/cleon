package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDeploymentMethodForDependentSystemConfiguration extends cleon.common.resources.metamodel.spec.descriptions.javamodel.ISimpleDescription, cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfigurationAwareDecorater {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("8f187230-fe3f-11ea-892b-df291bae18c5");
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration selectDeploymentForDependentSystemConfiguration();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.javamodel.IDeploymentMethod selectUsedDeploymentMethod();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,8f187230-fe3f-11ea-892b-df291bae18c5,vrsadFLyRNioNLcEQS+XDm0uDTI=] */
