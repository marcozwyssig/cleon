package cleon.architecturemethods.itarc42.spec.itarc42.concepts.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IConcepts extends cleon.architecturemethods.arc42.spec.arc42._08_concepts.javamodel.IConcepts {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("6e1a6c6b-f190-11e8-b3e7-15e2dd8d9b05");
  
  // relations
  
  public cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.javamodel.ISegmentationConcept selectSegmentation();
  
  public cleon.architecturemethods.itarc42.spec.itarc42.concepts.qos.javamodel.IQoS_Concept selectQos();
  
  public cleon.architecturemethods.itarc42.spec.itarc42.concepts.network.javamodel.INetworkConcept selectNetwork();
  
  public cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.javamodel.ISecurityConcept selectSecurity();
  
  public cleon.architecturemethods.itarc42.spec.itarc42.concepts.businesscontinuity.javamodel.IBusinessContinuityConcept selectBusinessContinuity();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,6e1a6c6b-f190-11e8-b3e7-15e2dd8d9b05,3b7+Jw0hlZ65YdFg1zkhq757xcg=] */
