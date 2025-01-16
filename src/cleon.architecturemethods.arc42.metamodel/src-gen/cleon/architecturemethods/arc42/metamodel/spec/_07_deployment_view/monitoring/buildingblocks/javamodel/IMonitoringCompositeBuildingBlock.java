package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitoring.buildingblocks.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IMonitoringCompositeBuildingBlock extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitoring.buildingblocks.javamodel.IAbstractMonitoringBuildingBlock {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("ccef247f-088c-11eb-a7cb-ffd76bc14ff3");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitoring.buildingblocks.javamodel.IAbstractMonitoringBuildingBlock> selectAggregates();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,ccef247f-088c-11eb-a7cb-ffd76bc14ff3,VnfXP9VbVAWJxIc9KbuMlSZfJy8=] */
