package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISecurityConcept extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.javamodel.IAbstractConcept {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("9515e875-0eae-11e9-9f19-6d15636f4ecc");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.javamodel.IIdentityConcept selectIdentifyConcept();
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.network_segmentation.javamodel.ISegmentationConcept selectSegmentationConcept();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,9515e875-0eae-11e9-9f19-6d15636f4ecc,ai0wR2bmFJ+LLc+FXrIs31IbqD4=] */
