package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IMonitorView extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("0e2fd28c-9992-11e8-b347-dd2314b02086");
  
  // relations
  
  public cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock selectMonitoringBuildingBlock();
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IMonitoringBuildingBlocks selectMonitoringbuildingblocks();
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.javamodel.IRules selectRules();
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.events.javamodel.IEvents selectEventing();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,0e2fd28c-9992-11e8-b347-dd2314b02086,ITTB3NnB+IxLyATfcxSt2YPrYIs=] */
