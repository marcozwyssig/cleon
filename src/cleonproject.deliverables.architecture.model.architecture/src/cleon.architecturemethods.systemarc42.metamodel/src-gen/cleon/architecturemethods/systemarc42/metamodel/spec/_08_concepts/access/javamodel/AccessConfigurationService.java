package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class AccessConfigurationService extends DynamicResource implements IAccessConfigurationService {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAccessConfigurationService> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAccessConfigurationService>() {
    
    @Override
    public IAccessConfigurationService create() {
      return new AccessConfigurationService();
    }
    
    @Override
    public IAccessConfigurationService create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new AccessConfigurationService(resourceRepository, resource);
    }
  
  };

  public AccessConfigurationService() {
    super(IAccessConfigurationService.TYPE_ID);
  }
  
  public AccessConfigurationService(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAccessConfigurationService.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Boolean selectSkipDomainPrefix() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessConfigurationService_skipDomainPrefix);
  }
    
  public void setSkipDomainPrefix(java.lang.Boolean skipDomainPrefix) {
     _setSingleAttribute(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessConfigurationService_skipDomainPrefix, skipDomainPrefix);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IHostAccessMode selectHostAccessMode() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IHostAccessMode.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessConfigurationService_hostAccessMode);
  }

  public AccessConfigurationService setHostAccessMode(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IHostAccessMode hostAccessMode) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessConfigurationService_hostAccessMode, hostAccessMode);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IPortService selectService() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IPortService.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessConfigurationService_service);
  }

  public AccessConfigurationService setService(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IPortService service) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessConfigurationService_service, service);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public AccessConfigurationService setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public AccessConfigurationService setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessConfigurationService_skipDomainPrefix, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IHostAccessMode.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessConfigurationService_hostAccessMode, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IPortService.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessConfigurationService_service, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfigurationService> selectToMeHostAccessMode(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IHostAccessMode object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfigurationService.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessConfigurationService_hostAccessMode, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfigurationService> selectToMeService(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IPortService object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfigurationService.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessConfigurationService_service, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,962adc32-c1d8-11eb-8c09-03c14294ecfb,V8ZX/6wardo4qSY7E0mXcFbpZkk=] */
