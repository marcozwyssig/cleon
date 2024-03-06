package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDeploymentMethodForDependentSystemConfiguration extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfigurationAwareDecorater {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("8f187230-fe3f-11ea-892b-df291bae18c5");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration selectDeploymentForDependentSystemConfiguration();
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.javamodel.IDeploymentMethod selectUsedDeploymentMethod();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.javamodel.IDeploymentMethodForDependentSystemConfigurationOption> selectOption();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,8f187230-fe3f-11ea-892b-df291bae18c5,oaPA9xm4pCSr6DibF0GojJan3so=] */
