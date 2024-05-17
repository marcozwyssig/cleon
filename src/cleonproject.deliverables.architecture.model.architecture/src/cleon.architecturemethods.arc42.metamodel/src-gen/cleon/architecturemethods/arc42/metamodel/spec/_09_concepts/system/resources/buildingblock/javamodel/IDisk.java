package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDisk extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("2c32029e-2b00-11e9-9692-65766bc2daa5");
  
  // attributes
  
  public java.lang.Double selectCapacityGB();
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IDiskType selectDiskType();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IResourceBuildingBlockSystemConfigurationConcept> selectUsedIn();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,2c32029e-2b00-11e9-9692-65766bc2daa5,Png4D9dpE5aXbX9+nSHu9EURMHk=] */
