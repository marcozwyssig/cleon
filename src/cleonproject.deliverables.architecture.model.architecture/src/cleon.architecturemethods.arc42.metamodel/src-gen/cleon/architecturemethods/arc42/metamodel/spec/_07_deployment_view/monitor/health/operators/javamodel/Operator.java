package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.health.operators.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Operator extends DynamicResource implements IOperator {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOperator> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOperator>() {
    
    @Override
    public IOperator create() {
      return new Operator();
    }
    
    @Override
    public IOperator create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Operator(resourceRepository, resource);
    }
  
  };

  public Operator() {
    super(IOperator.TYPE_ID);
  }
  
  public Operator(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IOperator.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IActor selectActor() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IActor.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.health.operators.OperatorsPackage.Operator_actor);
  }

  public Operator setActor(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IActor actor) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.health.operators.OperatorsPackage.Operator_actor, actor);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensors.javamodel.IMonitoringBuildingBlock> selectMonitoringTool() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensors.javamodel.IMonitoringBuildingBlock.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.health.operators.OperatorsPackage.Operator_monitoringTool);
  }

  public Operator setMonitoringTool(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensors.javamodel.IMonitoringBuildingBlock> monitoringTool) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.health.operators.OperatorsPackage.Operator_monitoringTool, monitoringTool);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public Operator setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Operator setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IActor.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.health.operators.OperatorsPackage.Operator_actor, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensors.javamodel.IMonitoringBuildingBlock.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.health.operators.OperatorsPackage.Operator_monitoringTool, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.health.operators.javamodel.IOperator> selectToMeMonitoringTool(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensors.javamodel.IMonitoringBuildingBlock object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.health.operators.javamodel.IOperator.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.health.operators.OperatorsPackage.Operator_monitoringTool, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.health.operators.javamodel.IOperator> selectToMeActor(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IActor object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.health.operators.javamodel.IOperator.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.health.operators.OperatorsPackage.Operator_actor, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f8726473-8fe1-11e8-85d9-314ddfdf57eb,o5xlJvhEowDM+hW4CfXqAM2/FVE=] */
