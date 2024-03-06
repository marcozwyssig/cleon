package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.buildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAuthZBuildingBlockConcept extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("4b83a3b8-032a-11eb-af88-136a9a3b3817");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.buildingblock.actor.javamodel.IAuthZBuildingBlockActor selectAuthZBuildingBlockActor();
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.buildingblock.activity.javamodel.IAuthZBuildingBlockActivity selectAuthZBuildingBlockActivity();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,4b83a3b8-032a-11eb-af88-136a9a3b3817,rlaSSuEb+fmUAIB/5APFgb0DslA=] */
