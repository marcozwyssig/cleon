package cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISystemLayer extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.INamedComponentComposition, cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.javamodel.ISystemComponentAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("b894901a-d0b2-11e8-b005-f7630e4c29c0");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.javamodel.ISystemLayerDependency> selectHasDependency();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,b894901a-d0b2-11e8-b005-f7630e4c29c0,cZrfkRpBSE7RzfR+oAGIm/9gRJ0=] */
