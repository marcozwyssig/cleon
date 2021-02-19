package cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.product.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IInfrastructureProduct extends cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.product.javamodel.IProduct, cleon.modelinglanguages.uml.template.xmi.javamodel.IXmiAssociation {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c2b426c5-67bf-11e7-afcc-6df3a81a4d17");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.variety.javamodel.IInfrastractureProductVariety> selectVarieties();
  
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.product.javamodel.IInfrastructureProduct> selectDependsOn();
  
  public cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.javamodel.ICluster selectCluster();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c2b426c5-67bf-11e7-afcc-6df3a81a4d17,33GRvSlm5QQ5Ph/yjEHGKHu/Ckk=] */
