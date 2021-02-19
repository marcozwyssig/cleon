package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbstractMonitoringBuildingBlock extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("857f546b-088c-11eb-a7cb-ffd76bc14ff3");
  
  // relations
  
  public cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock selectBuildingblockToMonitor();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,857f546b-088c-11eb-a7cb-ffd76bc14ff3,45v8vayu6kz1aUcJx39kagGpOjg=] */
