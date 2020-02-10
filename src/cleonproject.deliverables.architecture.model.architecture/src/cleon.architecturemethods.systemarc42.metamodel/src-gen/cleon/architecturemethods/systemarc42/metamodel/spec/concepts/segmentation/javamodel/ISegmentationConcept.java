package cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISegmentationConcept extends cleon.architecturemethods.systemarc42.metamodel.spec.concepts.javamodel.IConcept {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("d56c10bc-04ed-11e9-8ff2-6313785a338c");
  
  // relations
  
  public cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISegmentation selectSegmentation();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.javamodel.ISubZonePolicies selectSubzonePolicies();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,d56c10bc-04ed-11e9-8ff2-6313785a338c,7uF5wZhSWgeZyfXULF8+Z65OaV0=] */
