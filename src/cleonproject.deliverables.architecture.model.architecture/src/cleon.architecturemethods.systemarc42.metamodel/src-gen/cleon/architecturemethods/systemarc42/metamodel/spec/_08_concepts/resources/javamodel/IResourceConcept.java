package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IResourceConcept extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.javamodel.IConcept {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("76b15515-dfe5-11eb-9a61-ab419054c47d");
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.buildingblock.javamodel.IResourceBuildingBlockConcept selectResourceBuildingBlockConcept();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.planning.javamodel.IResourcePlanningConcept selectResourcePlanningConcept();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,76b15515-dfe5-11eb-9a61-ab419054c47d,tzAYtpsArZG9XOXfemL0RWUrOYw=] */
