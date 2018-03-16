package cleon.conception.eamod.spec.nsov.v2.productcatalog.variety.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IInfrastractureProductVariety extends ch.actifsource.core.javamodel.INamedResource, cleon.conception.eamod.spec.nsov.v2.productcatalog.variety.javamodel.IVariety, cleon.common.resources.spec.resources.descriptions.javamodel.ISimpleDescription, cleon.common.xml.spec.xmi.javamodel.IXmiClass {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("2b07341a-67c5-11e7-afcc-6df3a81a4d17");
  
  public java.lang.String selectCostmanager();
  
  public java.lang.String selectProductmanager();
  
  public java.lang.String selectServicemanager();
  
  public java.lang.String selectLifecycle();
  
  public java.lang.String selectAvailability();
  
  public java.util.List<java.lang.String> selectConfidentiality();
  
  // relations
  
  public java.util.List<? extends cleon.conception.eamod.spec.nsov.v2.productcatalog.variety.javamodel.IInfrastractureProductVariety> selectDependsOn();
  
  public java.util.List<? extends cleon.conception.eamod.spec.nsov.v2.productcatalog.variety.javamodel.IInfrastractureProductVariety> selectPotentialReusage();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,2b07341a-67c5-11e7-afcc-6df3a81a4d17,tbb4AMB9BPFb8ngl0B7DbWabo88=] */
