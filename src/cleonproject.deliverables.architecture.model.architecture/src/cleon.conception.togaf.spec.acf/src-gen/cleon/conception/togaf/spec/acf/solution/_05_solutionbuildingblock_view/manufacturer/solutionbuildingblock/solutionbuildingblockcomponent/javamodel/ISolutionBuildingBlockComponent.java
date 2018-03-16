package cleon.conception.togaf.spec.acf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.solutionbuildingblockcomponent.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

/**
 * SolutionBlock (SBB), Produkt, Technologie
 */
public interface ISolutionBuildingBlockComponent extends cleon.conception.uml.spec.uml.structural.components.javamodel.INamedComponent, cleon.common.resources.spec.resources.id.javamodel.IBusinessObjectId {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("31890305-33a2-11e6-94cd-fbf6c8ccd08d");
  
  // relations
  
  public java.util.List<? extends cleon.conception.uml.spec.uml.structural.components.javamodel.IComponentDependency> selectHasDependency();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,31890305-33a2-11e6-94cd-fbf6c8ccd08d,b+TejDFwaaaTDSDI20F5XdyBE64=] */
