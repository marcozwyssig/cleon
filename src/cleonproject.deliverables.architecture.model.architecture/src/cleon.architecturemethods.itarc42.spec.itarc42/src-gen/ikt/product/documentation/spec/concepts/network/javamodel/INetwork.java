package ikt.product.documentation.spec.concepts.network.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface INetwork extends cleon.modelinglanguages.network.spec.network.javamodel.IAbstractNetwork, ch.actifsource.core.javamodel.IDecorator, cleon.common.resources.spec.resources.ip.javamodel.IIPv4_Addresses_Aware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("1f0c1a61-4b29-11e9-8338-41c203971ecb");
  
  public java.lang.Integer selectVLAN();
  
  // relations
  
  public ikt.product.documentation.spec.concepts.segmentation.javamodel.ISecuritySubZone selectSecuritySubZone();
  
  public cleon.common.resources.spec.resources.ip.javamodel.IIPv4 selectNetwork();
  
  public cleon.common.resources.spec.resources.ip.javamodel.IIPv4 selectGateway();
  
  public java.util.List<? extends ikt.product.documentation.spec.concepts.network.javamodel.INetworkNode> selectNetworkNodes();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,1f0c1a61-4b29-11e9-8338-41c203971ecb,8NJH8BsEcjMmQftiSrRdD2CHyGg=] */
