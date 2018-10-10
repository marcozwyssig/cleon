package cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.product.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IBaseProduct extends cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.product.javamodel.IProduct {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("bf1a3670-67bf-11e7-afcc-6df3a81a4d17");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.product.javamodel.IProduct> selectOptions();
  
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.product.javamodel.IInfrastructureProductUsage> selectInfrastructureProductUsage();
  
  public java.util.List<? extends cleon.common.xml.spec.xmi.javamodel.IXmiClass> selectComposites();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,bf1a3670-67bf-11e7-afcc-6df3a81a4d17,pettgWOFCgmxYmCpsTjsjHuGG4Y=] */
