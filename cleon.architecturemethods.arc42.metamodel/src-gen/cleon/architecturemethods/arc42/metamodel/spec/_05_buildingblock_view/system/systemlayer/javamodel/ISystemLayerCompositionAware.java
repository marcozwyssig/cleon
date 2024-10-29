package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemlayer.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISystemLayerCompositionAware extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.INamedComponentComposition {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("710765f1-d28b-11ec-90fa-eddb29a5483c");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemlayer.javamodel.ISystemLayer> selectLayers();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,710765f1-d28b-11ec-90fa-eddb29a5483c,H7wF6dWk2gq8fA9ZOkRvz6UeAXU=] */
