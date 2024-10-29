package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class AccessConfiguration extends DynamicResource implements IAccessConfiguration {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAccessConfiguration> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAccessConfiguration>() {
    
    @Override
    public IAccessConfiguration create() {
      return new AccessConfiguration();
    }
    
    @Override
    public IAccessConfiguration create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new AccessConfiguration(resourceRepository, resource);
    }
  
  };

  public AccessConfiguration() {
    super(IAccessConfiguration.TYPE_ID);
  }
  
  public AccessConfiguration(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAccessConfiguration.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessConfigurationService> selectAccessByService() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessConfigurationService.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.AccessConfiguration_accessByService);
  }

  public AccessConfiguration setAccessByService(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessConfigurationService> accessByService) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.AccessConfiguration_accessByService, accessByService);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessCommunicationType selectAccessCommunicationType() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessCommunicationType.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.AccessConfiguration_accessCommunicationType);
  }

  public AccessConfiguration setAccessCommunicationType(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessCommunicationType accessCommunicationType) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.AccessConfiguration_accessCommunicationType, accessCommunicationType);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IPurpose selectPurpose() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IPurpose.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.AccessConfiguration_purpose);
  }

  public AccessConfiguration setPurpose(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IPurpose purpose) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.AccessConfiguration_purpose, purpose);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public AccessConfiguration setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public AccessConfiguration setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessConfigurationService.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.AccessConfiguration_accessByService, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessCommunicationType.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.AccessConfiguration_accessCommunicationType, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IPurpose.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.AccessConfiguration_purpose, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessConfiguration> selectToMeAccessCommunicationType(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessCommunicationType object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.AccessConfiguration_accessCommunicationType, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessConfiguration selectToMeAccessByService(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessConfigurationService object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.AccessConfiguration_accessByService, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessConfiguration> selectToMePurpose(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IPurpose object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.AccessConfiguration_purpose, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,db632dc0-1ea1-11eb-9eef-0dadb2b460da,fDqnE6JA0JwhH+ekQECKkahjvY8=] */
