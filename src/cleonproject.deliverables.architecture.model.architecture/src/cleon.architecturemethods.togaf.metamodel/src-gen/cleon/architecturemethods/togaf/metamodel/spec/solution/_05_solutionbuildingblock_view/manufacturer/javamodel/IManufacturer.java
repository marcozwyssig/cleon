package cleon.architecturemethods.togaf.metamodel.spec.solution._05_solutionbuildingblock_view.manufacturer.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IManufacturer extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.INamedComponentComposition {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("01fe9fef-2d70-11e6-959f-d1cef44ff5fd");
  
  // relations
  
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IComponentCompositionDependency> selectHasDependency();
  
  public java.util.List<? extends cleon.architecturemethods.togaf.metamodel.spec.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.javamodel.ISolutionBuildingBlock> selectDecomposeSolutions();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,01fe9fef-2d70-11e6-959f-d1cef44ff5fd,FopI5nWzDKpVirBlLdAPNBxi6FA=] */
