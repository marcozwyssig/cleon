package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class GMSA_ServiceAccount extends DynamicResource implements IGMSA_ServiceAccount {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IGMSA_ServiceAccount> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IGMSA_ServiceAccount>() {
    
    @Override
    public IGMSA_ServiceAccount create() {
      return new GMSA_ServiceAccount();
    }
    
    @Override
    public IGMSA_ServiceAccount create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new GMSA_ServiceAccount(resourceRepository, resource);
    }
  
  };

  public GMSA_ServiceAccount() {
    super(IGMSA_ServiceAccount.TYPE_ID);
  }
  
  public GMSA_ServiceAccount(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IGMSA_ServiceAccount.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Boolean selectExport() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.AccountsPackage.ServiceAccount_export);
  }
    
  public void setExport(java.lang.Boolean export) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.AccountsPackage.ServiceAccount_export, export);
  }

  @Override
  public java.lang.Boolean selectIsEnabled() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled);
  }
    
  public void setIsEnabled(java.lang.Boolean isEnabled) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, isEnabled);
  }

  @Override
  public java.lang.Integer selectOverrideNumber() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.AccountsPackage.ServiceAccount_overrideNumber);
  }
    
  public void setOverrideNumber(java.lang.Integer overrideNumber) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.AccountsPackage.ServiceAccount_overrideNumber, overrideNumber);
  }

  @Override
  public java.lang.Integer selectUniqueId() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.AccountsPackage.ServiceAccount_uniqueId);
  }
    
  public void setUniqueId(java.lang.Integer uniqueId) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.AccountsPackage.ServiceAccount_uniqueId, uniqueId);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSite> selectAllocateActivitiesFromSite() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSite.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.AccountsPackage.ServiceAccount_allocateActivitiesFromSite);
  }

  public GMSA_ServiceAccount setAllocateActivitiesFromSite(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSite> allocateActivitiesFromSite) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.AccountsPackage.ServiceAccount_allocateActivitiesFromSite, allocateActivitiesFromSite);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.javamodel.INode> selectAllowAdditionallyUsingOn() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.javamodel.INode.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.AccountsPackage.gMSA_aE_ServiceAccount_allowAdditionallyUsingOn);
  }

  public GMSA_ServiceAccount setAllowAdditionallyUsingOn(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.javamodel.INode> allowAdditionallyUsingOn) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.AccountsPackage.gMSA_aE_ServiceAccount_allowAdditionallyUsingOn, allowAdditionallyUsingOn);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.javamodel.IServiceAccountTemplate selectServiceAccountTemplate() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.javamodel.IServiceAccountTemplate.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.AccountsPackage.ServiceAccount_serviceAccountTemplate);
  }

  public GMSA_ServiceAccount setServiceAccountTemplate(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.javamodel.IServiceAccountTemplate serviceAccountTemplate) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.AccountsPackage.ServiceAccount_serviceAccountTemplate, serviceAccountTemplate);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public GMSA_ServiceAccount setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public GMSA_ServiceAccount setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.AccountsPackage.ServiceAccount_export, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.AccountsPackage.ServiceAccount_overrideNumber, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.AccountsPackage.ServiceAccount_uniqueId, visitor);
    // relations
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSite.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.AccountsPackage.ServiceAccount_allocateActivitiesFromSite, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.javamodel.INode.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.AccountsPackage.gMSA_aE_ServiceAccount_allowAdditionallyUsingOn, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.javamodel.IServiceAccountTemplate.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.AccountsPackage.ServiceAccount_serviceAccountTemplate, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.javamodel.IGMSA_ServiceAccount> selectToMeAllowAdditionallyUsingOn(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.javamodel.INode object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.javamodel.IGMSA_ServiceAccount.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.AccountsPackage.gMSA_aE_ServiceAccount_allowAdditionallyUsingOn, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,06ea6eda-f333-11ea-9268-b5c52a12d7f9,dGC0kEd44yysXeQ3mGnbmXXBIjI=] */
