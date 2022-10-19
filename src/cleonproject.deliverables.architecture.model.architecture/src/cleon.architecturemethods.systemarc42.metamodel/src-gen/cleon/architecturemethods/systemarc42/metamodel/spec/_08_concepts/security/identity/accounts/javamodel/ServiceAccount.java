package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ServiceAccount extends DynamicResource implements IServiceAccount {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IServiceAccount> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IServiceAccount>() {
    
    @Override
    public IServiceAccount create() {
      return new ServiceAccount();
    }
    
    @Override
    public IServiceAccount create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ServiceAccount(resourceRepository, resource);
    }
  
  };

  public ServiceAccount() {
    super(IServiceAccount.TYPE_ID);
  }
  
  public ServiceAccount(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IServiceAccount.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Boolean selectExport() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.AccountsPackage.ServiceAccount_export);
  }
    
  public void setExport(java.lang.Boolean export) {
     _setSingleAttribute(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.AccountsPackage.ServiceAccount_export, export);
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
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.AccountsPackage.ServiceAccount_overrideNumber);
  }
    
  public void setOverrideNumber(java.lang.Integer overrideNumber) {
     _setSingleAttribute(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.AccountsPackage.ServiceAccount_overrideNumber, overrideNumber);
  }

  @Override
  public java.lang.Integer selectUniqueId() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.AccountsPackage.ServiceAccount_uniqueId);
  }
    
  public void setUniqueId(java.lang.Integer uniqueId) {
     _setSingleAttribute(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.AccountsPackage.ServiceAccount_uniqueId, uniqueId);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite> selectAllocateActivitiesFromSite() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.AccountsPackage.ServiceAccount_allocateActivitiesFromSite);
  }

  public ServiceAccount setAllocateActivitiesFromSite(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite> allocateActivitiesFromSite) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.AccountsPackage.ServiceAccount_allocateActivitiesFromSite, allocateActivitiesFromSite);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.javamodel.IServiceAccountTemplate selectServiceAccountTemplate() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.javamodel.IServiceAccountTemplate.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.AccountsPackage.ServiceAccount_serviceAccountTemplate);
  }

  public ServiceAccount setServiceAccountTemplate(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.javamodel.IServiceAccountTemplate serviceAccountTemplate) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.AccountsPackage.ServiceAccount_serviceAccountTemplate, serviceAccountTemplate);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public ServiceAccount setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ServiceAccount setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.AccountsPackage.ServiceAccount_export, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.AccountsPackage.ServiceAccount_overrideNumber, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.AccountsPackage.ServiceAccount_uniqueId, visitor);
    // relations
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.AccountsPackage.ServiceAccount_allocateActivitiesFromSite, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.javamodel.IServiceAccountTemplate.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.AccountsPackage.ServiceAccount_serviceAccountTemplate, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.javamodel.IServiceAccount> selectToMeServiceAccountTemplate(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.javamodel.IServiceAccountTemplate object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.javamodel.IServiceAccount.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.AccountsPackage.ServiceAccount_serviceAccountTemplate, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.javamodel.IServiceAccount> selectToMeAllocateActivitiesFromSite(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.javamodel.IServiceAccount.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.AccountsPackage.ServiceAccount_allocateActivitiesFromSite, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6f9d993b-a1a0-11ea-886d-354b9ee6fb2d,qPNWq1m7zXNHnmnI2EMY0+nvkdU=] */
