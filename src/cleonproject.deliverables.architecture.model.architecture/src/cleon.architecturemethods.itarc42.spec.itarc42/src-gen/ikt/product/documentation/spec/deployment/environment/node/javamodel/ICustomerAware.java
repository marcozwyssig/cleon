package ikt.product.documentation.spec.deployment.environment.node.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ICustomerAware extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("0d8d6d96-02d6-11e9-9e58-33d596257b14");
  
  // relations
  
  public ikt.product.documentation.spec.deployment.environment.javamodel.ICustomer selectCustomer();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,0d8d6d96-02d6-11e9-9e58-33d596257b14,Xmv/cBcvn0X5Amv9vdXh5z5C0z8=] */
