package cleon.conception.architecture.spec.eamod.nsov.v2.productcatalog.variety.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IBaseProductVariety extends cleon.conception.architecture.spec.eamod.nsov.v2.productcatalog.variety.javamodel.IVariety, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("26bbf5b0-67c5-11e7-afcc-6df3a81a4d17");
  
  // relations
  
  public cleon.conception.architecture.spec.eamod.nsov.v2.productcatalog.variety.javamodel.IInfrastractureProductVariety selectInfrastractureProductVariety();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,26bbf5b0-67c5-11e7-afcc-6df3a81a4d17,4VXwllXafqj1l81R4rKQcPzQXfM=] */
