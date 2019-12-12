package cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel;

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
public interface IBuildingBlockView extends cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("37b55799-ffcc-11e4-ac0a-959b440f987f");
  
  // relations
  
  public cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ISystem selectSystem();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel> selectLevel_1();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel> selectLevel_2();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel> selectLevel_3();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel> selectLevel_4();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel> selectLevel_5();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,37b55799-ffcc-11e4-ac0a-959b440f987f,Xgb9J5nGVzhRFylh01G0BEK/pQY=] */
