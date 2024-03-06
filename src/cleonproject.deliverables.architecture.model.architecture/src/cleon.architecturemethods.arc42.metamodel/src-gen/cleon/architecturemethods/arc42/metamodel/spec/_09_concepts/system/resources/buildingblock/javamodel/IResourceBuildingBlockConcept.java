package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IResourceBuildingBlockConcept extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.javamodel.IConceptForSystem {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("0a49b292-c93a-11eb-adc4-d18d1353eb6e");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IResourceBuildingBlockSystemConcept> selectResourceBuildingBlockSystemConcept();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.ICPU> selectCPUs();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IDisk> selectDisks();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IMemory> selectMemory();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,0a49b292-c93a-11eb-adc4-d18d1353eb6e,LejnO66VyZAt90HzbL3YHLxude4=] */
