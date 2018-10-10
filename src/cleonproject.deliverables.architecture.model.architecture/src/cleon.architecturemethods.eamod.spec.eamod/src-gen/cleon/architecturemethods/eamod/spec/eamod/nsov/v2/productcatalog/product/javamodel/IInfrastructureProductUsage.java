package cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.product.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IInfrastructureProductUsage extends ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("bd36f21c-67d1-11e7-afcc-6df3a81a4d17");
  
  // relations
  
  public cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.product.javamodel.IInfrastructureProduct selectInfrastructureProduct();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.variety.javamodel.IBaseProductVariety> selectVarieties();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,bd36f21c-67d1-11e7-afcc-6df3a81a4d17,rSBak69E0JppC+N35UQGgmTyWII=] */
