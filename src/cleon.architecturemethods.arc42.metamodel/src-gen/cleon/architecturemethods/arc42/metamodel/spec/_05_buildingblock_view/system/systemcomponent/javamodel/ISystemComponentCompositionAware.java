package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemcomponent.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISystemComponentCompositionAware extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.INamedComponentComposition {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("0acee12f-5ca9-11ea-9014-eb1fa518f623");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemcomponent.javamodel.ISystemComponent> selectSystemComponents();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,0acee12f-5ca9-11ea-9014-eb1fa518f623,Hs9YRNbmJpM3eed0SrewkRvX8FQ=] */
