package cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.monitor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISystemMonitoringBuildingBlocks extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IMonitoringBuildingBlocks {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("6037c44c-08a7-11eb-a18e-c7dfa3f96804");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.monitor.javamodel.IMonitoringCompositeBuildingBlocksForSystem> selectForSystems();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,6037c44c-08a7-11eb-a18e-c7dfa3f96804,NDcSdNdql5t7fF/rn77PanziMSs=] */
