package cleon.architecturemethods.togaf.metamodel.spec.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IArchitectureBuildingBlock extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.INamedComponentComposition, cleon.common.resources.metamodel.spec.id.javamodel.IIntegerBusinessObjectId {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("1a0f6f94-3a07-11e6-a354-253097f89a49");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.togaf.metamodel.spec.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.architecturesolutionbuildingblock.javamodel.IArchitectureSolutionBuildingBlock> selectArchitecturesolutionbuildingblocks();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,1a0f6f94-3a07-11e6-a354-253097f89a49,yHzK2NeaBhsX/u0SlVeadZTaZNo=] */
