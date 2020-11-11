package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel;

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

  // attributes
  
  @Override
  public java.lang.String selectUrl() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessConfigurationWeb_url);
  }
    
  public void setUrl(java.lang.String url) {
     _setSingleAttribute(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessConfigurationWeb_url, url);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessCommunicationType selectAccessCommunicationType() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessCommunicationType.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessConfiguration_accessCommunicationType);
  }

  public AccessConfigurationWeb setAccessCommunicationType(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessCommunicationType accessCommunicationType) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessConfiguration_accessCommunicationType, accessCommunicationType);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IHostAccessMode selectHostAccessMode() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IHostAccessMode.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessConfiguration_hostAccessMode);
  }

  public AccessConfigurationWeb setHostAccessMode(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IHostAccessMode hostAccessMode) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessConfiguration_hostAccessMode, hostAccessMode);
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
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessConfigurationWeb_url, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessCommunicationType.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessConfiguration_accessCommunicationType, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IHostAccessMode.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.AccessPackage.AccessConfiguration_hostAccessMode, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2f2144a1-2438-11eb-83b1-3d2a97975978,Mv8RQOw4Ri4iMoGc9PX2OXazQm0=] */
