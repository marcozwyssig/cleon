package cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.node.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ICustomerAware extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("0d8d6d96-02d6-11e9-9e58-33d596257b14");
  
  // relations
  
  public cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.javamodel.ICustomer selectCustomer();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,0d8d6d96-02d6-11e9-9e58-33d596257b14,5BqpyGOoZVxp6b0phGch17w5S8M=] */