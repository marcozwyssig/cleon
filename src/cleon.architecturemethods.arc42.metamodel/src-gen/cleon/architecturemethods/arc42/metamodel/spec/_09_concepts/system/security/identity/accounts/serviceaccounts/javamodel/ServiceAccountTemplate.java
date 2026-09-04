package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ServiceAccountTemplate extends DynamicResource implements IServiceAccountTemplate {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IServiceAccountTemplate> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IServiceAccountTemplate>() {
    
    @Override
    public IServiceAccountTemplate create() {
      return new ServiceAccountTemplate();
    }
    
    @Override
    public IServiceAccountTemplate create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ServiceAccountTemplate(resourceRepository, resource);
    }
  
  };

  public ServiceAccountTemplate() {
    super(IServiceAccountTemplate.TYPE_ID);
  }
  
  public ServiceAccountTemplate(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IServiceAccountTemplate.TYPE_ID);
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
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, identifier);
  }

  @Override
  public java.util.List<java.lang.String> selectMandatoryDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.MandatoryDescription_mandatoryDescriptions);
  }
    
  public void setMandatoryDescriptions(java.util.List<java.lang.String> mandatoryDescriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.MandatoryDescription_mandatoryDescriptions, mandatoryDescriptions);
  }

  @Override
  public java.lang.Integer selectOverrideId() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.ServiceaccountsPackage.ServiceAccountTemplate_overrideId);
  }
    
  public void setOverrideId(java.lang.Integer overrideId) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.ServiceaccountsPackage.ServiceAccountTemplate_overrideId, overrideId);
  }

  @Override
  public java.lang.Boolean selectPasswordNeverExpires() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.ServiceaccountsPackage.ServiceAccountTemplate_passwordNeverExpires);
  }
    
  public void setPasswordNeverExpires(java.lang.Boolean passwordNeverExpires) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.ServiceaccountsPackage.ServiceAccountTemplate_passwordNeverExpires, passwordNeverExpires);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel.IAbstractActivityTemplatePermission> selectActivityTemplatePermissionOnSites() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel.IAbstractActivityTemplatePermission.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.ActivityPackage.ActivityTemplateAware_activityTemplatePermissionOnSites);
  }

  public ServiceAccountTemplate setActivityTemplatePermissionOnSites(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel.IAbstractActivityTemplatePermission> activityTemplatePermissionOnSites) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.ActivityPackage.ActivityTemplateAware_activityTemplatePermissionOnSites, activityTemplatePermissionOnSites);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel.IAbstractActivityTemplatePermission> selectActivityTemplatePermissionsOnLocalSite() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel.IAbstractActivityTemplatePermission.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.ActivityPackage.ActivityTemplateAware_activityTemplatePermissionsOnLocalSite);
  }

  public ServiceAccountTemplate setActivityTemplatePermissionsOnLocalSite(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel.IAbstractActivityTemplatePermission> activityTemplatePermissionsOnLocalSite) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.ActivityPackage.ActivityTemplateAware_activityTemplatePermissionsOnLocalSite, activityTemplatePermissionsOnLocalSite);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> selectAvailablePermissionsOfSystemConfiguration() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.ServiceaccountsPackage.ServiceAccountTemplate_availablePermissionsOfSystemConfiguration);
  }

  public ServiceAccountTemplate setAvailablePermissionsOfSystemConfiguration(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> availablePermissionsOfSystemConfiguration) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.ServiceaccountsPackage.ServiceAccountTemplate_availablePermissionsOfSystemConfiguration, availablePermissionsOfSystemConfiguration);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.adgroups.javamodel.IADGroup> selectBuiltinADGroup() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.adgroups.javamodel.IADGroup.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.ServiceaccountsPackage.ServiceAccountTemplate_builtinADGroup);
  }

  public ServiceAccountTemplate setBuiltinADGroup(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.adgroups.javamodel.IADGroup> builtinADGroup) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.ServiceaccountsPackage.ServiceAccountTemplate_builtinADGroup, builtinADGroup);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration selectServiceConfigurationForServiceAccount() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.ServiceaccountsPackage.ServiceAccountTemplate_serviceConfigurationForServiceAccount);
  }

  public ServiceAccountTemplate setServiceConfigurationForServiceAccount(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration serviceConfigurationForServiceAccount) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.ServiceaccountsPackage.ServiceAccountTemplate_serviceConfigurationForServiceAccount, serviceConfigurationForServiceAccount);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public ServiceAccountTemplate setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ServiceAccountTemplate setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> selectUsePermissionsOfSystemConfiguration() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.ServiceaccountsPackage.ServiceAccountTemplate_usePermissionsOfSystemConfiguration);
  }

  public ServiceAccountTemplate setUsePermissionsOfSystemConfiguration(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> usePermissionsOfSystemConfiguration) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.ServiceaccountsPackage.ServiceAccountTemplate_usePermissionsOfSystemConfiguration, usePermissionsOfSystemConfiguration);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.MandatoryDescription_mandatoryDescriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.ServiceaccountsPackage.ServiceAccountTemplate_overrideId, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.ServiceaccountsPackage.ServiceAccountTemplate_passwordNeverExpires, visitor);
    // relations
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel.IAbstractActivityTemplatePermission.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.ActivityPackage.ActivityTemplateAware_activityTemplatePermissionOnSites, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel.IAbstractActivityTemplatePermission.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.ActivityPackage.ActivityTemplateAware_activityTemplatePermissionsOnLocalSite, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.ServiceaccountsPackage.ServiceAccountTemplate_availablePermissionsOfSystemConfiguration, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.adgroups.javamodel.IADGroup.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.ServiceaccountsPackage.ServiceAccountTemplate_builtinADGroup, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.ServiceaccountsPackage.ServiceAccountTemplate_serviceConfigurationForServiceAccount, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.ServiceaccountsPackage.ServiceAccountTemplate_usePermissionsOfSystemConfiguration, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.javamodel.IServiceAccountTemplate> selectToMeUsePermissionsOfSystemConfiguration(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.javamodel.IServiceAccountTemplate.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.ServiceaccountsPackage.ServiceAccountTemplate_usePermissionsOfSystemConfiguration, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.javamodel.IServiceAccountTemplate> selectToMeServiceConfigurationForServiceAccount(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.javamodel.IServiceAccountTemplate.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.ServiceaccountsPackage.ServiceAccountTemplate_serviceConfigurationForServiceAccount, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.javamodel.IServiceAccountTemplate> selectToMeBuiltinADGroup(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.adgroups.javamodel.IADGroup object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.javamodel.IServiceAccountTemplate.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.ServiceaccountsPackage.ServiceAccountTemplate_builtinADGroup, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.javamodel.IServiceAccountTemplate> selectToMeAvailablePermissionsOfSystemConfiguration(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.javamodel.IServiceAccountTemplate.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.ServiceaccountsPackage.ServiceAccountTemplate_availablePermissionsOfSystemConfiguration, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9eec10e6-395b-11eb-978d-47c0228773ba,8ixXapfQqthSoFtV3dkWDEaN53o=] */
