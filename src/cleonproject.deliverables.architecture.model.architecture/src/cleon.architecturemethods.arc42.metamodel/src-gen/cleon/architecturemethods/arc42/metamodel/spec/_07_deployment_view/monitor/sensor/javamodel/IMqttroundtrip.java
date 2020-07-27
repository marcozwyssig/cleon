package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

/**
 * Monitors the availability of the MQTT broker (server); the connection time; and
 * the round trip time of packets. PRTG connects to the broker as a publishing and
 * subscribing client and sends the data packets using a predefined topic.
 */
public interface IMqttroundtrip extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel.ISensor {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("db47001a-c1eb-11ea-820f-9931558a898c");
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,db47001a-c1eb-11ea-820f-9931558a898c,5G0McCioQZVsIIWlIOWwAEFS05Q=] */
