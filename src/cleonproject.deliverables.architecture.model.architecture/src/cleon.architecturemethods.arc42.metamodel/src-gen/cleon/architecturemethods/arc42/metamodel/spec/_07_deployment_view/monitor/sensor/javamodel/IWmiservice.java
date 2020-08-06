package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

/**
 * Monitors a Windows service using WMI
 */
public interface IWmiservice extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel.ISensor, ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("db51ae82-c1eb-11ea-820f-9931558a898c");
  
  // attributes
  
  public java.lang.String selectServiceDisplayName();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,db51ae82-c1eb-11ea-820f-9931558a898c,7BN2X4QbVZ7Ll6wUuaMKQnNu1Bc=] */