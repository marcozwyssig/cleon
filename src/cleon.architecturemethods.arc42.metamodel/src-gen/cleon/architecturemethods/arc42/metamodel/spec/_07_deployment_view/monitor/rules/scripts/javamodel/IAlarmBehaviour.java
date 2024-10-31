package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAlarmBehaviour extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("08732ce2-9a5a-11e8-ab8b-639e9e9b044b");
  
  // attributes
  
  public java.lang.Integer selectVerificationTime();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel.IMonitoringBuildingBlock> selectAlarmHandler();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,08732ce2-9a5a-11e8-ab8b-639e9e9b044b,tzi6FEx2QK7i/zO5RMU2Ae2lLPo=] */
