package cleon.conception.eamod.spec.nsov.v2.productcatalog.productgroup.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IBaseProductGroup extends cleon.conception.eamod.spec.nsov.v2.productcatalog.productgroup.javamodel.IProductGroup {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("e3dfe296-67c8-11e7-afcc-6df3a81a4d17");
  
  // relations
  
  public java.util.List<? extends cleon.conception.eamod.spec.nsov.v2.productcatalog.product.javamodel.IBaseProduct> selectBaseProducts();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,e3dfe296-67c8-11e7-afcc-6df3a81a4d17,YNPzDKxu27nJTT/1u4QkQTKAsf0=] */
