package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitoring.buildingblocks.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractSensorMonitoringBuildingBlock extends DynamicResource implements IAbstractSensorMonitoringBuildingBlock {

  // abstract implementation, only used for static method calls
  private AbstractSensorMonitoringBuildingBlock() {
    super(IAbstractSensorMonitoringBuildingBlock.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitoring.buildingblocks.javamodel.IAbstractSensorMonitoringBuildingBlock> selectToMeBasedOn(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitoring.buildingblocks.javamodel.IMonitoringBuildingBlock object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitoring.buildingblocks.javamodel.IAbstractSensorMonitoringBuildingBlock.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitoring.buildingblocks.BuildingblocksPackage.AbstractSensorMonitoringBuildingBlock_basedOn, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitoring.buildingblocks.javamodel.IAbstractSensorMonitoringBuildingBlock> selectToMeExcludeSensorFromBasedn(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitoring.sensor.javamodel.ISensor object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitoring.buildingblocks.javamodel.IAbstractSensorMonitoringBuildingBlock.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitoring.buildingblocks.BuildingblocksPackage.AbstractSensorMonitoringBuildingBlock_excludeSensorFromBasedn, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitoring.buildingblocks.javamodel.IAbstractSensorMonitoringBuildingBlock selectToMeSensors(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitoring.sensor.javamodel.ISensor object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitoring.buildingblocks.javamodel.IAbstractSensorMonitoringBuildingBlock.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitoring.buildingblocks.BuildingblocksPackage.AbstractSensorMonitoringBuildingBlock_sensors, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8ef70288-e066-11ea-bb83-59933a3fa779,5HAjLbf4HuF3rokZMsxxc+LO1bY=] */
