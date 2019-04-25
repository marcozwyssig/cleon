package ikt.product.documentation.spec.concepts.security.rbac.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISubnetGroup extends ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("b1b09ea6-1e06-11e9-834d-77c41fccc6bf");
  
  // relations
  
  public ikt.product.documentation.spec.deployment.environment.node.supplynode.javamodel.ISupplyNetDomainNode selectSupplySubnetNode();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,b1b09ea6-1e06-11e9-834d-77c41fccc6bf,eTyKvRWhx78wbGEP9ZPDt4/bbQI=] */
