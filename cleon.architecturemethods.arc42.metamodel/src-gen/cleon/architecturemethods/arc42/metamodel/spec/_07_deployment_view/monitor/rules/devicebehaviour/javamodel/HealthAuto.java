package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class HealthAuto extends DynamicResource implements IHealthAuto {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IHealthAuto> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IHealthAuto>() {
    
    @Override
    public IHealthAuto create() {
      return new HealthAuto();
    }
    
    @Override
    public IHealthAuto create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new HealthAuto(resourceRepository, resource);
    }
  
  };

  public HealthAuto() {
    super(IHealthAuto.TYPE_ID);
  }
  
  public HealthAuto(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IHealthAuto.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock selectComponent() {
    return _getSingle(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.DevicebehaviourPackage.HealthComponentBehaviour_component);
  }

  public HealthAuto setComponent(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock component) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.DevicebehaviourPackage.HealthComponentBehaviour_component, component);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.javamodel.IHealthParameter> selectParameters() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.javamodel.IHealthParameter.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.DevicebehaviourPackage.HealthAuto_parameters);
  }

  public HealthAuto setParameters(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.javamodel.IHealthParameter> parameters) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.DevicebehaviourPackage.HealthAuto_parameters, parameters);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.javamodel.IScript selectScript() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.javamodel.IScript.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.DevicebehaviourPackage.HealthAuto_script);
  }

  public HealthAuto setScript(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.javamodel.IScript script) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.DevicebehaviourPackage.HealthAuto_script, script);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public HealthAuto setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public HealthAuto setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.DevicebehaviourPackage.HealthComponentBehaviour_component, visitor);
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.javamodel.IHealthParameter.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.DevicebehaviourPackage.HealthAuto_parameters, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.javamodel.IScript.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.DevicebehaviourPackage.HealthAuto_script, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.javamodel.IHealthAuto> selectToMeScript(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.javamodel.IScript object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.javamodel.IHealthAuto.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.DevicebehaviourPackage.HealthAuto_script, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.javamodel.IHealthAuto selectToMeParameters(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.javamodel.IHealthParameter object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.javamodel.IHealthAuto.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.DevicebehaviourPackage.HealthAuto_parameters, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8f6838d4-8993-11e8-8250-d9b67f7d5f7f,jz5GYI7NMvp71xT4xGWGeZn6iNU=] */
