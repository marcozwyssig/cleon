package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IUsedProduct extends ch.actifsource.core.javamodel.IDecorator, cleon.common.resources.metamodel.spec.descriptions.javamodel.ISimpleDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("65f06b79-82f3-11ea-9ba4-35fe2a5b2ff9");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProduct selectProduct();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,65f06b79-82f3-11ea-9ba4-35fe2a5b2ff9,xMlppQcJqEJTjGq+45jP8m2u0os=] */
