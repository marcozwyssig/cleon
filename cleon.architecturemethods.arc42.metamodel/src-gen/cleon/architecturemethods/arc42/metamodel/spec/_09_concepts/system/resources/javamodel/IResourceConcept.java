package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IResourceConcept extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.javamodel.IAbstractConcept {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("76b15515-dfe5-11eb-9a61-ab419054c47d");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IResourceBuildingBlockConcept selectResourceBuildingBlockConcept();
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.javamodel.IResourcePlanningConcept selectResourcePlanningConcept();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,76b15515-dfe5-11eb-9a61-ab419054c47d,yabWk4Y9mb4sq7gk3NpajswnE1o=] */
