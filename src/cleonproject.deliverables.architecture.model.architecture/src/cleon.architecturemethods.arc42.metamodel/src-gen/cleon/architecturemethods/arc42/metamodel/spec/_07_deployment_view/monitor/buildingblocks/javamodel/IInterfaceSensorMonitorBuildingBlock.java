package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IInterfaceSensorMonitorBuildingBlock extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.INodeSensorMonitoringBuildingBlock, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("3e634cd5-e2e4-11ee-8945-4df0f2e1f411");
  
  public java.lang.String selectShortName();
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.IInterface selectInterface();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,3e634cd5-e2e4-11ee-8945-4df0f2e1f411,CO5rIv6x3fCUrI7XqSHTlau8y1s=] */
