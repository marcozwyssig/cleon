package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.deploymentview.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Device extends DynamicResource implements IDevice {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDevice> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDevice>() {
    
    @Override
    public IDevice create() {
      return new Device();
    }
    
    @Override
    public IDevice create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Device(resourceRepository, resource);
    }
  
  };

  public Device() {
    super(IDevice.TYPE_ID);
  }
  
  public Device(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDevice.TYPE_ID);
  }

  // attributes
  
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

  public Device setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IComponent> selectUses() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IComponent.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.deploymentview.DeploymentviewPackage.Device_uses);
  }

  public Device setUses(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IComponent> uses) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.deploymentview.DeploymentviewPackage.Device_uses, uses);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IComponent.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.deploymentview.DeploymentviewPackage.Device_uses, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.deploymentview.javamodel.IDevice> selectToMeUses(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IComponent object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.deploymentview.javamodel.IDevice.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.deploymentview.DeploymentviewPackage.Device_uses, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d38f3151-8991-11e8-8250-d9b67f7d5f7f,3s8zEXzHyXI2EodPi6VNTVcF00A=] */
