package cleon.conception.eamod.spec.nsov.v2.productcatalog.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IOffering extends ch.actifsource.core.javamodel.INamedResource, cleon.common.xml.spec.xmi.javamodel.IXmiAggregation {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("a1a10c17-67bf-11e7-afcc-6df3a81a4d17");
  
  // relations
  
  public cleon.conception.eamod.spec.nsov.v2.productcatalog.javamodel.IBaseProductCatalog selectBaseProductCatalog();
  
  public cleon.conception.eamod.spec.nsov.v2.productcatalog.javamodel.IInfrastructureProductCatalog selectInfrastructureProductCatalog();
  
  public java.util.List<? extends cleon.conception.eamod.spec.nsov.v2.productcatalog.javamodel.ICluster> selectClusters();
  
  public java.util.List<? extends cleon.conception.eamod.spec.nsov.v2.productcatalog.javamodel.IOffering> selectReusage();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,a1a10c17-67bf-11e7-afcc-6df3a81a4d17,t8xkPt+QpSSk5zJaJejoEkKGRqc=] */
