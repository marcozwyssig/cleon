package cleon.architecturemethods.togaf.metamodel.spec.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

/**
 * SolutionBlock (SBB), Produkt, Technologie
 */
public interface ISolutionBuildingBlock extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.INamedComponentComposition, cleon.common.resources.metamodel.spec.versions.javamodel.IVersion, cleon.common.resources.metamodel.spec.naming.javamodel.IMandatoryShortName, cleon.common.resources.metamodel.spec.id.javamodel.IIntegerBusinessObjectId {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("280ce792-2d70-11e6-959f-d1cef44ff5fd");
  
  // relations
  
  public cleon.architecturemethods.togaf.metamodel.spec.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.javamodel.ICpuArchitecture selectCpu();
  
  public cleon.architecturemethods.togaf.metamodel.spec.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.javamodel.IDeploymentArtefact selectDeploymentArtefact();
  
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IComponentCompositionDependency> selectHasDependency();
  
  public java.util.List<? extends cleon.architecturemethods.togaf.metamodel.spec.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.solutionbuildingblockcomponent.javamodel.ISolutionBuildingBlockComponent> selectDecompose();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,280ce792-2d70-11e6-959f-d1cef44ff5fd,+0lbhmK/SkhHdcg//P4ltgB16UM=] */
