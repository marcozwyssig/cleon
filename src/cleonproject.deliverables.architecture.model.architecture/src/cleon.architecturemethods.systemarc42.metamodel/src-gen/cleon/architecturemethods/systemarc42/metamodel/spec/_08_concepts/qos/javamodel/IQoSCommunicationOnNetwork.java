package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IQoSCommunicationOnNetwork extends ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("e97fa7d3-fe9d-11eb-bbec-6b945b7259b1");
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.ITransportNetwork selectTransportNetwork();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISourceInSubSecurityZone selectSourceInSubSecurityZone();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,e97fa7d3-fe9d-11eb-bbec-6b945b7259b1,MNJQXnWF2Upivo/onjKiN5A8pGo=] */
