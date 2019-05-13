package cleon.modelinglanguages.network.spec.network.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface INetwork extends cleon.modelinglanguages.network.spec.network.javamodel.IAbstractNetwork, ch.actifsource.core.javamodel.IDecorator, cleon.modelinglanguages.network.spec.network.ipv4.javamodel.IIPv4_Addresses_Aware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("1f0c1a61-4b29-11e9-8338-41c203971ecb");
  
  // relations
  
  public cleon.modelinglanguages.network.spec.segmentation.javamodel.ISecuritySubZone selectSecuritySubZone();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,1f0c1a61-4b29-11e9-8338-41c203971ecb,4rTjr5n+VaFkSbWiWSfqguECNLU=] */
