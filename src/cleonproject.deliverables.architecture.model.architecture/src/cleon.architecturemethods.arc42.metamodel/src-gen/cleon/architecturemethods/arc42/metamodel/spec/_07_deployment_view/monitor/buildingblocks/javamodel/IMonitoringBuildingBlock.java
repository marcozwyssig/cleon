package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IMonitoringBuildingBlock extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, ch.actifsource.core.javamodel.IDecorator, cleon.common.doc.metamodel.spec.chapter.javamodel.INoChapters {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("9fb78914-8fdd-11e8-85d9-314ddfdf57eb");
  
  // relations
  
  public cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock selectBuildingblockToMonitor();
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.ISingleMonitoringBuildingBlock selectSingle();
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IClusterMonitoringBuildingBlock selectCluster();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,9fb78914-8fdd-11e8-85d9-314ddfdf57eb,WNapMngFPK8NNdOgXyHCzZkfVGs=] */
