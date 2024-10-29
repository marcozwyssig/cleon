package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IQoSCommunicationOnNetwork extends ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("e97fa7d3-fe9d-11eb-bbec-6b945b7259b1");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.ITransportNetwork selectTransportNetwork();
  
  public cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.ISourceInSubSecurityZone selectSourceInSubSecurityZone();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,e97fa7d3-fe9d-11eb-bbec-6b945b7259b1,td/sEKurl4geEwJ/4uPR+1w7trQ=] */
