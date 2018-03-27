package cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ICategory extends cleon.conception.architecture.spec.uml.structural.components.javamodel.INamedComponentComposition {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("27c04263-3c6a-11e6-aafa-bd565efc0ead");
  
  // relations
  
  public java.util.List<? extends cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.javamodel.ICategoryDependency> selectHasDependency();
  
  public java.util.List<? extends cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.javamodel.IFeatureAggregateDecomposite> selectFeatures();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,27c04263-3c6a-11e6-aafa-bd565efc0ead,WSx9RXHAPosAPoJy9AXc4dnEzaM=] */
