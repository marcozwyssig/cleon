package cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISystemLayer extends cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.INamedComponentComposition {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("b894901a-d0b2-11e8-b005-f7630e4c29c0");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel.ISystemComponent> selectSystemComponents();
  
  public java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel.ISystemLayerDependency> selectHasDependency();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,b894901a-d0b2-11e8-b005-f7630e4c29c0,C1M4qFoP7mEBShT3e6CUPlcEsXc=] */
