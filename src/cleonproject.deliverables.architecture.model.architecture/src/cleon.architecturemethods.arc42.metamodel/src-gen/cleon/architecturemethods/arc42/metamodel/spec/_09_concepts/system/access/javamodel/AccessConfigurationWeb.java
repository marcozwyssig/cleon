package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class AccessConfigurationWeb extends DynamicResource implements IAccessConfigurationWeb {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAccessConfigurationWeb> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAccessConfigurationWeb>() {
    
    @Override
    public IAccessConfigurationWeb create() {
      return new AccessConfigurationWeb();
    }
    
    @Override
    public IAccessConfigurationWeb create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new AccessConfigurationWeb(resourceRepository, resource);
    }
  
  };

  public AccessConfigurationWeb() {
    super(IAccessConfigurationWeb.TYPE_ID);
  }
  
  public AccessConfigurationWeb(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAccessConfigurationWeb.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessConfigurationWebService> selectAccessByService() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessConfigurationWebService.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.AccessConfigurationWeb_accessByService);
  }

  public AccessConfigurationWeb setAccessByService(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessConfigurationWebService> accessByService) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.AccessConfigurationWeb_accessByService, accessByService);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessCommunicationType selectAccessCommunicationType() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessCommunicationType.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.AccessConfiguration_accessCommunicationType);
  }

  public AccessConfigurationWeb setAccessCommunicationType(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessCommunicationType accessCommunicationType) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.AccessConfiguration_accessCommunicationType, accessCommunicationType);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IPurpose selectPurpose() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IPurpose.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.AccessConfiguration_purpose);
  }

  public AccessConfigurationWeb setPurpose(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IPurpose purpose) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.AccessConfiguration_purpose, purpose);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public AccessConfigurationWeb setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public AccessConfigurationWeb setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessConfigurationWebService.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.AccessConfigurationWeb_accessByService, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessCommunicationType.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.AccessConfiguration_accessCommunicationType, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IPurpose.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.AccessConfiguration_purpose, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessConfigurationWeb selectToMeAccessByService(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessConfigurationWebService object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessConfigurationWeb.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.AccessConfigurationWeb_accessByService, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2f2144a1-2438-11eb-83b1-3d2a97975978,eWOmc2sXpKR8l5tBXLOjryHfkh0=] */
