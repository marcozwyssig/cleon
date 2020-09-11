package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

/**
 * Monitors JSON and XML REST APIs
 */
public interface IRestcustom extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel.INamedSensor {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("db488780-c1eb-11ea-820f-9931558a898c");
  
  public java.lang.String selectQuery();
  
  public java.lang.String selectJsonfile();
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel.IRequestMethod selectRequesttype();
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel.IRequestProtocol selectProtocol();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,db488780-c1eb-11ea-820f-9931558a898c,9YUXGmMWsNHUpKvXn9UV3B3AarA=] */
