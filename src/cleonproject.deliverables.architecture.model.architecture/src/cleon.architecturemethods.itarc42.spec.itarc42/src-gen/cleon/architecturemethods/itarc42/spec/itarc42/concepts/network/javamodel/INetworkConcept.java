package cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface INetworkConcept extends cleon.architecturemethods.itarc42.spec.itarc42.concepts.javamodel.IConcept, cleon.modelinglanguages.network.spec.network.javamodel.IAbstractNetworks {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("b4d4ca85-4b28-11e9-8338-41c203971ecb");
  
  // relations
  
  public java.util.List<? extends cleon.modelinglanguages.network.spec.network.javamodel.INetwork> selectNetworks();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,b4d4ca85-4b28-11e9-8338-41c203971ecb,iWlkYZHLLMZMEftejZ/rgjNRQng=] */