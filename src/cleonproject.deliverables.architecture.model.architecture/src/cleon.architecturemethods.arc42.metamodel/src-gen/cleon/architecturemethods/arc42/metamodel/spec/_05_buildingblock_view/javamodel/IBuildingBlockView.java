package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

/**
 * Contents.
 * Static decomposition of the system into building blocks (modules, components,
 * subsystems, subsidiary systems, classes, interfaces, packages, libraries,
 * frameworks, layers, partitions, tiers, functions, macros, operations, data
 * structures, …) and the relationships thereof.
 * 
 * Motivation.
 * This is the most important view, that must be part of each architecture
 * documentation. In building construction this would be the floor plan.
 */
public interface IBuildingBlockView extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("37b55799-ffcc-11e4-ac0a-959b440f987f");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAbstractRootSystem selectRootSystem();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox> selectWhitebox();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,37b55799-ffcc-11e4-ac0a-959b440f987f,9BsHcOuU+GzhYSV2kGB3HWMc090=] */
