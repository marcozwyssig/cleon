package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.availability.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAvailabilityConcept extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.javamodel.IAbstractBusinessContinuityConcept, cleon.common.doc.metamodel.spec.chapter.javamodel.INoChapters {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("ccb76508-0eae-11e9-9f19-6d15636f4ecc");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.availability.javamodel.IAvailabilityBuildingBlock> selectAvailabilityBuildingBlocks();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,ccb76508-0eae-11e9-9f19-6d15636f4ecc,uVDe9WlGAz+bWycT5qOgGFWO9OY=] */
