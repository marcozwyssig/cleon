package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.health.scripts.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class AlarmBehaviour extends DynamicResource implements IAlarmBehaviour {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAlarmBehaviour> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAlarmBehaviour>() {
    
    @Override
    public IAlarmBehaviour create() {
      return new AlarmBehaviour();
    }
    
    @Override
    public IAlarmBehaviour create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new AlarmBehaviour(resourceRepository, resource);
    }
  
  };

  public AlarmBehaviour() {
    super(IAlarmBehaviour.TYPE_ID);
  }
  
  public AlarmBehaviour(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAlarmBehaviour.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectVerificationTime() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.health.scripts.ScriptsPackage.AlarmBehaviour_verificationTime);
  }
    
  public void setVerificationTime(java.lang.Integer verificationTime) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.health.scripts.ScriptsPackage.AlarmBehaviour_verificationTime, verificationTime);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensors.javamodel.ISensor> selectAlarmHandler() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensors.javamodel.ISensor.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.health.scripts.ScriptsPackage.AlarmBehaviour_alarmHandler);
  }

  public AlarmBehaviour setAlarmHandler(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensors.javamodel.ISensor> alarmHandler) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.health.scripts.ScriptsPackage.AlarmBehaviour_alarmHandler, alarmHandler);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public AlarmBehaviour setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.health.scripts.ScriptsPackage.AlarmBehaviour_verificationTime, visitor);
    // relations
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensors.javamodel.ISensor.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.health.scripts.ScriptsPackage.AlarmBehaviour_alarmHandler, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.health.scripts.javamodel.IAlarmBehaviour> selectToMeAlarmHandler(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensors.javamodel.ISensor object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.health.scripts.javamodel.IAlarmBehaviour.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.health.scripts.ScriptsPackage.AlarmBehaviour_alarmHandler, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,08732ce2-9a5a-11e8-ab8b-639e9e9b044b,dGhEqmbgTJvLzrT2ozcffDMiBBg=] */
