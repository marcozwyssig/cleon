package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel;

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
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.AccountsPackage.ServiceAccount_export);
  }
    
  public void setExport(java.lang.Boolean export) {
     _setSingleAttribute(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.AccountsPackage.ServiceAccount_export, export);
  }

  @Override
  public java.lang.Boolean selectIsEnabled() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled);
  }
    
  public void setIsEnabled(java.lang.Boolean isEnabled) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, isEnabled);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityPermission> selectActivitiesForAccount() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityPermission.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.AccountsPackage.ServiceAccount_activitiesForAccount);
  }

  public GMSA_ServiceAccount setActivitiesForAccount(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityPermission> activitiesForAccount) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.AccountsPackage.ServiceAccount_activitiesForAccount, activitiesForAccount);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IBuiltinRole> selectBuiltinRoles() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IBuiltinRole.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.AccountsPackage.ServiceAccount_builtinRoles);
  }

  public GMSA_ServiceAccount setBuiltinRoles(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IBuiltinRole> builtinRoles) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.AccountsPackage.ServiceAccount_builtinRoles, builtinRoles);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IServiceAccountTemplate selectServiceAccountTemplate() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IServiceAccountTemplate.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.AccountsPackage.ServiceAccount_serviceAccountTemplate);
  }

  public GMSA_ServiceAccount setServiceAccountTemplate(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IServiceAccountTemplate serviceAccountTemplate) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.AccountsPackage.ServiceAccount_serviceAccountTemplate, serviceAccountTemplate);
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
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.AccountsPackage.ServiceAccount_export, visitor);
    // relations
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityPermission.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.AccountsPackage.ServiceAccount_activitiesForAccount, visitor);
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IBuiltinRole.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.AccountsPackage.ServiceAccount_builtinRoles, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IServiceAccountTemplate.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.AccountsPackage.ServiceAccount_serviceAccountTemplate, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,06ea6eda-f333-11ea-9268-b5c52a12d7f9,BBiD3MrEJf+rUZAXpiKNnKsjyIA=] */
