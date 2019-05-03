package cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface INetworkNode extends cleon.modelinglanguages.network.spec.network.javamodel.IAbstractNetworkNode {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("91d106aa-4b2c-11e9-8338-41c203971ecb");
  
  // relations
  
  public cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.node.javamodel.INode selectNode();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,91d106aa-4b2c-11e9-8338-41c203971ecb,TvKyS5qfKk01bvOF5gsmdbNVAF0=] */
