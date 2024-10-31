package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DeploymentMethodForDependentSystemConfiguration extends DynamicResource implements IDeploymentMethodForDependentSystemConfiguration {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeploymentMethodForDependentSystemConfiguration> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeploymentMethodForDependentSystemConfiguration>() {
    
    @Override
    public IDeploymentMethodForDependentSystemConfiguration create() {
      return new DeploymentMethodForDependentSystemConfiguration();
    }
    
    @Override
    public IDeploymentMethodForDependentSystemConfiguration create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DeploymentMethodForDependentSystemConfiguration(resourceRepository, resource);
    }
  
  };

  public DeploymentMethodForDependentSystemConfiguration() {
    super(IDeploymentMethodForDependentSystemConfiguration.TYPE_ID);
  }
  
  public DeploymentMethodForDependentSystemConfiguration(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDeploymentMethodForDependentSystemConfiguration.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration selectDeploymentForDependentSystemConfiguration() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.MethodPackage.DeploymentMethodForDependentSystemConfiguration_deploymentForDependentSystemConfiguration);
  }

  public DeploymentMethodForDependentSystemConfiguration setDeploymentForDependentSystemConfiguration(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration deploymentForDependentSystemConfiguration) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.MethodPackage.DeploymentMethodForDependentSystemConfiguration_deploymentForDependentSystemConfiguration, deploymentForDependentSystemConfiguration);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.javamodel.IDeploymentMethodForDependentSystemConfigurationOption> selectOption() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.javamodel.IDeploymentMethodForDependentSystemConfigurationOption.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.MethodPackage.DeploymentMethodForDependentSystemConfiguration_option);
  }

  public DeploymentMethodForDependentSystemConfiguration setOption(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.javamodel.IDeploymentMethodForDependentSystemConfigurationOption> option) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.MethodPackage.DeploymentMethodForDependentSystemConfiguration_option, option);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public DeploymentMethodForDependentSystemConfiguration setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration selectTargetToSystemConfiguration() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.SystemconfigurationPackage.SystemConfigurationAwareDecorater_targetToSystemConfiguration);
  }

  public DeploymentMethodForDependentSystemConfiguration setTargetToSystemConfiguration(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration targetToSystemConfiguration) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.SystemconfigurationPackage.SystemConfigurationAwareDecorater_targetToSystemConfiguration, targetToSystemConfiguration);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DeploymentMethodForDependentSystemConfiguration setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.javamodel.IDeploymentMethod selectUsedDeploymentMethod() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.javamodel.IDeploymentMethod.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.MethodPackage.DeploymentMethodForDependentSystemConfiguration_usedDeploymentMethod);
  }

  public DeploymentMethodForDependentSystemConfiguration setUsedDeploymentMethod(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.javamodel.IDeploymentMethod usedDeploymentMethod) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.MethodPackage.DeploymentMethodForDependentSystemConfiguration_usedDeploymentMethod, usedDeploymentMethod);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.MethodPackage.DeploymentMethodForDependentSystemConfiguration_deploymentForDependentSystemConfiguration, visitor);
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.javamodel.IDeploymentMethodForDependentSystemConfigurationOption.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.MethodPackage.DeploymentMethodForDependentSystemConfiguration_option, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.javamodel.IDeploymentMethod.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.MethodPackage.DeploymentMethodForDependentSystemConfiguration_usedDeploymentMethod, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.javamodel.IDeploymentMethodForDependentSystemConfiguration> selectToMeDeploymentForDependentSystemConfiguration(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.javamodel.IDeploymentMethodForDependentSystemConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.MethodPackage.DeploymentMethodForDependentSystemConfiguration_deploymentForDependentSystemConfiguration, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.javamodel.IDeploymentMethodForDependentSystemConfiguration> selectToMeUsedDeploymentMethod(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.javamodel.IDeploymentMethod object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.javamodel.IDeploymentMethodForDependentSystemConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.MethodPackage.DeploymentMethodForDependentSystemConfiguration_usedDeploymentMethod, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.javamodel.IDeploymentMethodForDependentSystemConfiguration selectToMeOption(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.javamodel.IDeploymentMethodForDependentSystemConfigurationOption object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.javamodel.IDeploymentMethodForDependentSystemConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.MethodPackage.DeploymentMethodForDependentSystemConfiguration_option, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8f187230-fe3f-11ea-892b-df291bae18c5,vATC8Dqwy9N6lk6RV71ychQ9Npc=] */
