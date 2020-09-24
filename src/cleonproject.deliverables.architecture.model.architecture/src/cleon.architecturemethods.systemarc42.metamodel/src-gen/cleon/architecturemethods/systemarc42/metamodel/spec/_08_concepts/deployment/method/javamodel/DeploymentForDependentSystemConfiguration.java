package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DeploymentForDependentSystemConfiguration extends DynamicResource implements IDeploymentForDependentSystemConfiguration {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeploymentForDependentSystemConfiguration> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeploymentForDependentSystemConfiguration>() {
    
    @Override
    public IDeploymentForDependentSystemConfiguration create() {
      return new DeploymentForDependentSystemConfiguration();
    }
    
    @Override
    public IDeploymentForDependentSystemConfiguration create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DeploymentForDependentSystemConfiguration(resourceRepository, resource);
    }
  
  };

  public DeploymentForDependentSystemConfiguration() {
    super(IDeploymentForDependentSystemConfiguration.TYPE_ID);
  }
  
  public DeploymentForDependentSystemConfiguration(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDeploymentForDependentSystemConfiguration.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration selectDeploymentForDependentSystemConfiguration() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.MethodPackage.DeploymentForDependentSystemConfiguration_deploymentForDependentSystemConfiguration);
  }

  public DeploymentForDependentSystemConfiguration setDeploymentForDependentSystemConfiguration(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration deploymentForDependentSystemConfiguration) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.MethodPackage.DeploymentForDependentSystemConfiguration_deploymentForDependentSystemConfiguration, deploymentForDependentSystemConfiguration);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public DeploymentForDependentSystemConfiguration setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DeploymentForDependentSystemConfiguration setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.javamodel.IDeploymentConfiguration selectUsedDeploymentConfiguration() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.javamodel.IDeploymentConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.MethodPackage.DeploymentForDependentSystemConfiguration_usedDeploymentConfiguration);
  }

  public DeploymentForDependentSystemConfiguration setUsedDeploymentConfiguration(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.javamodel.IDeploymentConfiguration usedDeploymentConfiguration) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.MethodPackage.DeploymentForDependentSystemConfiguration_usedDeploymentConfiguration, usedDeploymentConfiguration);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.MethodPackage.DeploymentForDependentSystemConfiguration_deploymentForDependentSystemConfiguration, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.javamodel.IDeploymentConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.MethodPackage.DeploymentForDependentSystemConfiguration_usedDeploymentConfiguration, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.javamodel.IDeploymentForDependentSystemConfiguration> selectToMeDeploymentForDependentSystemConfiguration(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.javamodel.IDeploymentForDependentSystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.MethodPackage.DeploymentForDependentSystemConfiguration_deploymentForDependentSystemConfiguration, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.javamodel.IDeploymentForDependentSystemConfiguration> selectToMeUsedDeploymentConfiguration(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.javamodel.IDeploymentConfiguration object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.javamodel.IDeploymentForDependentSystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.MethodPackage.DeploymentForDependentSystemConfiguration_usedDeploymentConfiguration, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8f187230-fe3f-11ea-892b-df291bae18c5,eCfTC/j1SP0kndB8K4a/o5IfNfs=] */
