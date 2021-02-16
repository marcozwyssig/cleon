package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ServiceAccountEnvironmentSite extends DynamicResource implements IServiceAccountEnvironmentSite {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IServiceAccountEnvironmentSite> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IServiceAccountEnvironmentSite>() {
    
    @Override
    public IServiceAccountEnvironmentSite create() {
      return new ServiceAccountEnvironmentSite();
    }
    
    @Override
    public IServiceAccountEnvironmentSite create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ServiceAccountEnvironmentSite(resourceRepository, resource);
    }
  
  };

  public ServiceAccountEnvironmentSite() {
    super(IServiceAccountEnvironmentSite.TYPE_ID);
  }
  
  public ServiceAccountEnvironmentSite(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IServiceAccountEnvironmentSite.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, identifier);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite> selectAllocateActivitiesFromSite() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.AccountsPackage.ServiceAccountEnvironmentSite_allocateActivitiesFromSite);
  }

  public ServiceAccountEnvironmentSite setAllocateActivitiesFromSite(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite> allocateActivitiesFromSite) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.AccountsPackage.ServiceAccountEnvironmentSite_allocateActivitiesFromSite, allocateActivitiesFromSite);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IServiceAccountEnvironmentSystem> selectServiceAccountSystem() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IServiceAccountEnvironmentSystem.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.AccountsPackage.ServiceAccountEnvironmentSite_serviceAccountSystem);
  }

  public ServiceAccountEnvironmentSite setServiceAccountSystem(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IServiceAccountEnvironmentSystem> serviceAccountSystem) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.AccountsPackage.ServiceAccountEnvironmentSite_serviceAccountSystem, serviceAccountSystem);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite selectSite() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.AccountsPackage.ServiceAccountEnvironmentSite_site);
  }

  public ServiceAccountEnvironmentSite setSite(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite site) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.AccountsPackage.ServiceAccountEnvironmentSite_site, site);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public ServiceAccountEnvironmentSite setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ServiceAccountEnvironmentSite setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, visitor);
    // relations
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.AccountsPackage.ServiceAccountEnvironmentSite_allocateActivitiesFromSite, visitor);
    _acceptMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IServiceAccountEnvironmentSystem.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.AccountsPackage.ServiceAccountEnvironmentSite_serviceAccountSystem, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.AccountsPackage.ServiceAccountEnvironmentSite_site, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IServiceAccountEnvironmentSite> selectToMeSite(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IServiceAccountEnvironmentSite.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.AccountsPackage.ServiceAccountEnvironmentSite_site, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IServiceAccountEnvironmentSite selectToMeServiceAccountSystem(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IServiceAccountEnvironmentSystem object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IServiceAccountEnvironmentSite.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.AccountsPackage.ServiceAccountEnvironmentSite_serviceAccountSystem, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IServiceAccountEnvironmentSite> selectToMeAllocateActivitiesFromSite(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IServiceAccountEnvironmentSite.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.AccountsPackage.ServiceAccountEnvironmentSite_allocateActivitiesFromSite, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,bde1151a-394a-11eb-93f1-c3f5ad8bb73f,R/onbHvgPncyj5qpa0CmF/aHt1Q=] */
