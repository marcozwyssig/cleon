package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.operators.javamodel;

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

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectSchedule() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.operators.OperatorsPackage.Operator_schedule);
  }
    
  public void setSchedule(java.lang.String schedule) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.operators.OperatorsPackage.Operator_schedule, schedule);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.javamodel.IMonitoringComponent> selectMonitoringDisplay() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.javamodel.IMonitoringComponent.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.operators.OperatorsPackage.Operator_monitoringDisplay);
  }

  public Operator setMonitoringDisplay(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.javamodel.IMonitoringComponent> monitoringDisplay) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.operators.OperatorsPackage.Operator_monitoringDisplay, monitoringDisplay);
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
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.operators.OperatorsPackage.Operator_schedule, visitor);
    // relations
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.javamodel.IMonitoringComponent.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.operators.OperatorsPackage.Operator_monitoringDisplay, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.operators.javamodel.IOperator> selectToMeMonitoringDisplay(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.javamodel.IMonitoringComponent object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.operators.javamodel.IOperator.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.operators.OperatorsPackage.Operator_monitoringDisplay, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f8726473-8fe1-11e8-85d9-314ddfdf57eb,F3+ioUmOHpGwY+twa+9DbGmSIW0=] */
