package cleon.conception.architecture.spec.eamod.nsov.v2.productcatalog.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IInfrastructureProductCatalog extends cleon.conception.architecture.spec.eamod.nsov.v2.productcatalog.javamodel.ICatalog {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("7a7e912c-67c6-11e7-afcc-6df3a81a4d17");
  
  // relations
  
  public java.util.List<? extends cleon.conception.architecture.spec.eamod.nsov.v2.productcatalog.productgroup.javamodel.IInfrastructureProductGroup> selectInfrastructureProductGroups();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,7a7e912c-67c6-11e7-afcc-6df3a81a4d17,1beqvO44JCW69VI41NG3Y2b2tBA=] */
