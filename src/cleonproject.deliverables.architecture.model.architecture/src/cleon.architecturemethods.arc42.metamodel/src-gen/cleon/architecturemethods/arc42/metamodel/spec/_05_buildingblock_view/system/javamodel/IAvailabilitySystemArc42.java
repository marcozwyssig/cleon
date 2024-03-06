package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAvailabilitySystemArc42 extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAvailability, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("abd0d2ce-fe66-11ea-abcb-bfad67a56d79");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.availability.javamodel.IAvailabilityBuildingBlock selectUsedAvailability();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,abd0d2ce-fe66-11ea-abcb-bfad67a56d79,4Pj3qwxwHL9fmHKyNqlQ+v5s3Og=] */
