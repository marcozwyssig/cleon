package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.availability.businesscontinuity.availability.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAvailabilityConcept extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.availability.businesscontinuity.javamodel.IAbstractBusinessContinuityConcept, cleon.common.doc.metamodel.spec.chapter.javamodel.INoChapters {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("8d626023-c93b-11eb-adc4-d18d1353eb6e");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.availability.businesscontinuity.availability.javamodel.IAvailabilityBuildingBlock> selectAvailabilityBuildingBlocks();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,8d626023-c93b-11eb-adc4-d18d1353eb6e,oYbaB+3pg/6bOGuKHHn9fu6d8lU=] */
