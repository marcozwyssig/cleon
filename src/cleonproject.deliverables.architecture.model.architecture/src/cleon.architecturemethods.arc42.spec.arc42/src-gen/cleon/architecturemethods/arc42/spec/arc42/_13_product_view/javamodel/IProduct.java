package cleon.architecturemethods.arc42.spec.arc42._13_product_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IProduct extends ch.actifsource.core.javamodel.INamedResource, cleon.common.resources.spec.resources.versions.javamodel.IVersion, cleon.common.resources.spec.resources.descriptions.javamodel.ISimpleDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("352e36c6-d0b1-11e8-b005-f7630e4c29c0");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.arc42.spec.arc42._13_product_view.javamodel.IProductVariant> selectProductVariants();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.spec.arc42._13_product_view.javamodel.IProductOptions> selectProductOptions();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,352e36c6-d0b1-11e8-b005-f7630e4c29c0,5eMTx9ymlxjYIbPs32q/BY9Nf4M=] */
