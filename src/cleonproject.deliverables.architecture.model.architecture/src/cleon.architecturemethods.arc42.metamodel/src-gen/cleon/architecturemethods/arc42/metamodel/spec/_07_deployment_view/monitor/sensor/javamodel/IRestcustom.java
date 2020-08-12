package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

/**
 * Monitors JSON and XML REST APIs
 */
public interface IRestcustom extends ch.actifsource.core.javamodel.INamedResource, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel.ISensor {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("db488780-c1eb-11ea-820f-9931558a898c");
  
  public java.lang.String selectQuery();
  
  public java.lang.String selectJsonfile();
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel.IRequestMethod selectRequesttype();
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel.IRequestProtocol selectProtocol();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,db488780-c1eb-11ea-820f-9931558a898c,QRh2A0qDCIqpdE7M0GqRu4Dtyr0=] */
