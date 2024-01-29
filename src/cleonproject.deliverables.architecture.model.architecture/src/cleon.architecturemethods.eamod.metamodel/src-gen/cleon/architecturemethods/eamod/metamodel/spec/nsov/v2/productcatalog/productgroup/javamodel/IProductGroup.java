package cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.productgroup.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IProductGroup extends ch.actifsource.core.javamodel.INamedResource, cleon.modelinglanguages.uml.metamodel.template.xmi.javamodel.IXmiAggregation {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c9c23f77-67c8-11e7-afcc-6df3a81a4d17");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.product.javamodel.IProduct> selectProducts();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c9c23f77-67c8-11e7-afcc-6df3a81a4d17,MERdmOtOXLCzMQrDUw8e7kgQhdI=] */
