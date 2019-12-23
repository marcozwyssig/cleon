package cleon.architecturemethods.togaf.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IArchitectureBuildingBlock extends cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.INamedComponentComposition, cleon.common.resources.spec.resources.id.javamodel.IIntegerBusinessObjectId {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("1a0f6f94-3a07-11e6-a354-253097f89a49");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.togaf.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.architecturesolutionbuildingblock.javamodel.IArchitectureSolutionBuildingBlock> selectArchitecturesolutionbuildingblocks();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,1a0f6f94-3a07-11e6-a354-253097f89a49,y5Q6PZ59t2ANcEJJ+C8DlJN6J78=] */
