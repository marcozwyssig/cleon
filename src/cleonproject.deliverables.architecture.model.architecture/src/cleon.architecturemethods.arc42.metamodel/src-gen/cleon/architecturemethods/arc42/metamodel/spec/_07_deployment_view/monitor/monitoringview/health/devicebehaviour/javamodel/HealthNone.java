package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.devicebehaviour.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class HealthNone extends DynamicResource implements IHealthNone {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IHealthNone> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IHealthNone>() {
    
    @Override
    public IHealthNone create() {
      return new HealthNone();
    }
    
    @Override
    public IHealthNone create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new HealthNone(resourceRepository, resource);
    }
  
  };

  public HealthNone() {
    super(IHealthNone.TYPE_ID);
  }
  
  public HealthNone(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IHealthNone.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IComponent selectComponent() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IComponent.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.devicebehaviour.DevicebehaviourPackage.HealthComponentBehaviour_component);
  }

  public HealthNone setComponent(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IComponent component) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.devicebehaviour.DevicebehaviourPackage.HealthComponentBehaviour_component, component);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public HealthNone setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public HealthNone setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IComponent.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.devicebehaviour.DevicebehaviourPackage.HealthComponentBehaviour_component, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,67827388-b7eb-11e8-b27b-312e5be91ffb,IFSPzEzdQ0WPOg9PfVbcUpsO8KU=] */
