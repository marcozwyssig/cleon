package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbstractSensorMonitoringBuildingBlock extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("8ef70288-e066-11ea-bb83-59933a3fa779");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IMonitoringBuildingBlock selectBasedOn();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel.ISensor> selectExcludeSensorFromBasedn();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel.ISensor> selectSensors();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,8ef70288-e066-11ea-bb83-59933a3fa779,fCwrPZje2XeKoDnku2I1UZ4N4nA=] */
