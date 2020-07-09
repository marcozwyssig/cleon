package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.buildingblocks.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISensor extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("128669db-c1ed-11ea-820f-9931558a898c");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel.ISensorType selectSensorType();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,128669db-c1ed-11ea-820f-9931558a898c,OVRp6daPZDoYwii21HPInUq4BmU=] */
