package cleon.conception.architecture.spec.eamod.nsov.v2.productcatalog.productgroup.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IInfrastructureProductGroup extends cleon.conception.architecture.spec.eamod.nsov.v2.productcatalog.productgroup.javamodel.IProductGroup {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("761e31cd-6897-11e7-9be5-6dfce969ae4e");
  
  // relations
  
  public java.util.List<? extends cleon.conception.architecture.spec.eamod.nsov.v2.productcatalog.product.javamodel.IInfrastructureProduct> selectInfrastructureProducts();
  
  public java.util.List<? extends cleon.conception.architecture.spec.eamod.nsov.v2.productcatalog.productgroup.javamodel.IInfrastructureProductGroup> selectDependsOn();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,761e31cd-6897-11e7-9be5-6dfce969ae4e,KCoJM1bOfraL5jpFhJ62W+Q5J34=] */
