package ikt.product.documentation.spec.concepts.segmentation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISecurityZone extends ikt.product.documentation.spec.concepts.segmentation.javamodel.INamedZone {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("32beba1e-0b75-11e9-a136-69d076e48ed1");
  
  // relations
  
  public java.util.List<? extends ikt.product.documentation.spec.concepts.segmentation.javamodel.ISecuritySubZone> selectSecuritySubZones();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,32beba1e-0b75-11e9-a136-69d076e48ed1,2pcOntFA8cVKbHwCRPleqaDIkH4=] */
