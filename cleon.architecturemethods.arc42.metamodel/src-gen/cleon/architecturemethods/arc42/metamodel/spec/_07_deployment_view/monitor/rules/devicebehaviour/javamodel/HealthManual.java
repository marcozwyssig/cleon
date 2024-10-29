package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class HealthManual extends DynamicResource implements IHealthManual {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IHealthManual> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IHealthManual>() {
    
    @Override
    public IHealthManual create() {
      return new HealthManual();
    }
    
    @Override
    public IHealthManual create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new HealthManual(resourceRepository, resource);
    }
  
  };

  public HealthManual() {
    super(IHealthManual.TYPE_ID);
  }
  
  public HealthManual(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IHealthManual.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock selectComponent() {
    return _getSingle(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.DevicebehaviourPackage.HealthComponentBehaviour_component);
  }

  public HealthManual setComponent(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock component) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.DevicebehaviourPackage.HealthComponentBehaviour_component, component);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.operators.javamodel.IOperator selectOperator() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.operators.javamodel.IOperator.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.DevicebehaviourPackage.HealthManual_operator);
  }

  public HealthManual setOperator(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.operators.javamodel.IOperator operator) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.DevicebehaviourPackage.HealthManual_operator, operator);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public HealthManual setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public HealthManual setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.DevicebehaviourPackage.HealthComponentBehaviour_component, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.operators.javamodel.IOperator.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.DevicebehaviourPackage.HealthManual_operator, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.javamodel.IHealthManual> selectToMeOperator(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.operators.javamodel.IOperator object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.javamodel.IHealthManual.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.DevicebehaviourPackage.HealthManual_operator, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,94a32ea6-8993-11e8-8250-d9b67f7d5f7f,yqQFzpWMfKh7Aqc8FAho6cVpxhw=] */
