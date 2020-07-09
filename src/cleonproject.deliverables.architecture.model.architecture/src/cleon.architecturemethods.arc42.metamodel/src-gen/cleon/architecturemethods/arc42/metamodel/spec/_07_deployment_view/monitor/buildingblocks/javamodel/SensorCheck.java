package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SensorCheck extends DynamicResource implements ISensorCheck {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISensorCheck> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISensorCheck>() {
    
    @Override
    public ISensorCheck create() {
      return new SensorCheck();
    }
    
    @Override
    public ISensorCheck create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SensorCheck(resourceRepository, resource);
    }
  
  };

  public SensorCheck() {
    super(ISensorCheck.TYPE_ID);
  }
  
  public SensorCheck(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISensorCheck.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel.ISensorType selectSensorType() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel.ISensorType.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.BuildingblocksPackage.Sensor_sensorType);
  }

  public SensorCheck setSensorType(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel.ISensorType sensorType) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.BuildingblocksPackage.Sensor_sensorType, sensorType);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SensorCheck setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel.ISensorType.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.BuildingblocksPackage.Sensor_sensorType, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7f613e91-c1fc-11ea-820f-9931558a898c,8D6yaldlLcICo6z+a8TQU7viTjs=] */
