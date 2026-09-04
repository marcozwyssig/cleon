package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_change_service_config.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class WindowsService extends DynamicResource implements IWindowsService {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWindowsService> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWindowsService>() {
    
    @Override
    public IWindowsService create() {
      return new WindowsService();
    }
    
    @Override
    public IWindowsService create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new WindowsService(resourceRepository, resource);
    }
  
  };

  public WindowsService() {
    super(IWindowsService.TYPE_ID);
  }
  
  public WindowsService(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IWindowsService.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Boolean selectEnabled() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_change_service_config.Win_polycom_change_service_configPackage.WindowsService_enabled);
  }
    
  public void setEnabled(java.lang.Boolean enabled) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_change_service_config.Win_polycom_change_service_configPackage.WindowsService_enabled, enabled);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public WindowsService setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_change_service_config.Win_polycom_change_service_configPackage.WindowsService_enabled, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3ce2f19e-1071-11f0-b378-11a495632127,mu01BhYqwRI4F+Xzt4WbCddfW4k=] */
