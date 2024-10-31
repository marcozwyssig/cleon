package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ManualDeploymentMethodConfiguration extends DynamicResource implements IManualDeploymentMethodConfiguration {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IManualDeploymentMethodConfiguration> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IManualDeploymentMethodConfiguration>() {
    
    @Override
    public IManualDeploymentMethodConfiguration create() {
      return new ManualDeploymentMethodConfiguration();
    }
    
    @Override
    public IManualDeploymentMethodConfiguration create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ManualDeploymentMethodConfiguration(resourceRepository, resource);
    }
  
  };

  public ManualDeploymentMethodConfiguration() {
    super(IManualDeploymentMethodConfiguration.TYPE_ID);
  }
  
  public ManualDeploymentMethodConfiguration(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IManualDeploymentMethodConfiguration.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.util.List<java.lang.String> selectMandatoryDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.MandatoryDescription_mandatoryDescriptions);
  }
    
  public void setMandatoryDescriptions(java.util.List<java.lang.String> mandatoryDescriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.MandatoryDescription_mandatoryDescriptions, mandatoryDescriptions);
  }

  @Override
  public java.util.List<java.lang.String> selectStandardDescription() {
    return _getListAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.MethodPackage.DeploymentMethod_standardDescription);
  }
    
  public void setStandardDescription(java.util.List<java.lang.String> standardDescription) {
     _setListAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.MethodPackage.DeploymentMethod_standardDescription, standardDescription);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.javamodel.IDeploymentMethodOption> selectDeploymentMethodOptions() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.javamodel.IDeploymentMethodOption.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.MethodPackage.DeploymentMethod_deploymentMethodOptions);
  }

  public ManualDeploymentMethodConfiguration setDeploymentMethodOptions(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.javamodel.IDeploymentMethodOption> deploymentMethodOptions) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.MethodPackage.DeploymentMethod_deploymentMethodOptions, deploymentMethodOptions);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ManualDeploymentMethodConfiguration setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.MandatoryDescription_mandatoryDescriptions, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.MethodPackage.DeploymentMethod_standardDescription, visitor);
    // relations
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.javamodel.IDeploymentMethodOption.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.MethodPackage.DeploymentMethod_deploymentMethodOptions, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8f18724b-fe3f-11ea-892b-df291bae18c5,a0P/xYRBiNP9rBEKX7vVCMr6QLU=] */
