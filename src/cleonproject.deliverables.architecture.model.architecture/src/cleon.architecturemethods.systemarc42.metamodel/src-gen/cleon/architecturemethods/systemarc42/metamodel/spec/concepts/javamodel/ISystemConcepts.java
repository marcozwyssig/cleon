package cleon.architecturemethods.systemarc42.metamodel.spec.concepts.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISystemConcepts extends cleon.architecturemethods.arc42.metamodel.spec._08_concepts.javamodel.IConcepts {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("6e1a6c6b-f190-11e8-b3e7-15e2dd8d9b05");
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.javamodel.ISegmentationConcept selectSegmentation();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec.concepts.qos.javamodel.IQoS_Concept selectQos();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.javamodel.INetworkConcept selectNetwork();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.javamodel.ISecurityConcept selectSecurity();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec.concepts.businesscontinuity.javamodel.IBusinessContinuityConcept selectBusinessContinuity();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.ITopology selectTopology();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec.concepts.services.javamodel.IServices selectServices();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,6e1a6c6b-f190-11e8-b3e7-15e2dd8d9b05,i8vWn1Pfih3H+WoOaL4lKv9x6rg=] */
