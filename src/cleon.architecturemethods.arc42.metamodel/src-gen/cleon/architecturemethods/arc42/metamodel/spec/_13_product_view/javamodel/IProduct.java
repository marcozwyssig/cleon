package cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IProduct extends ch.actifsource.core.javamodel.INamedResource, cleon.common.resources.metamodel.spec.descriptions.javamodel.ISimpleDescription, cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlockAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("352e36c6-d0b1-11e8-b005-f7630e4c29c0");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant> selectProductVariants();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductOptions> selectProductOptions();
  
  public java.util.List<? extends cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> selectUsedIn();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IUsedProduct> selectUsedInProduct();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,352e36c6-d0b1-11e8-b005-f7630e4c29c0,0lDT7FEt1NZ6TVzPS4jRpJoKbj8=] */
