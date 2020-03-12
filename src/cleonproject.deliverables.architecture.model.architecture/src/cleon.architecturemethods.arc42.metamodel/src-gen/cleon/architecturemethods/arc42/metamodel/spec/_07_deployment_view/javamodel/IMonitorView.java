package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IMonitorView extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("0e2fd28c-9992-11e8-b347-dd2314b02086");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensors.javamodel.IMonitoringBuildingBlocks selectMonitoringscomponents();
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.javamodel.IAlarmingView selectAlarmingView();
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.health.javamodel.IHealth selectHealth();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,0e2fd28c-9992-11e8-b347-dd2314b02086,2DqBvXfe/ZzubSXc6g136Gmuvd0=] */
