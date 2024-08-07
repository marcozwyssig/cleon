package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IMonitoringBuildingBlocks extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel.IIntervalAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("0e8b550a-8993-11e8-8250-d9b67f7d5f7f");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IAbstractMonitoringBuildingBlock> selectMonitoringBuildingBlocks();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,0e8b550a-8993-11e8-8250-d9b67f7d5f7f,R6LWhVWxSCcyQ1qyukOgEdyDhtA=] */
