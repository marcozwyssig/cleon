package cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface INetworkSubZone extends cleon.modelinglanguages.network.spec.network.javamodel.IAbstractPhysicalNetwork, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("1f0c1a61-4b29-11e9-8338-41c203971ecb");
  
  // attributes
  
  public java.lang.String selectFunctionId();
  
  public java.lang.Integer selectVLAN_No();
  
  public cleon.modelinglanguages.network.spec.segmentation.javamodel.ISecuritySubZone selectSecuritySubZone();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,1f0c1a61-4b29-11e9-8338-41c203971ecb,68fTb9sq2JhYTI6FZz92S9UfwoY=] */
