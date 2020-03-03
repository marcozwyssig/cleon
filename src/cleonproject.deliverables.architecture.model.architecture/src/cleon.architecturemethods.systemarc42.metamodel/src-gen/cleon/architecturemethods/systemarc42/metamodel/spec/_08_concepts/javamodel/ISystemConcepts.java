package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISystemConcepts extends cleon.architecturemethods.arc42.metamodel.spec._08_concepts.javamodel.IConcepts {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("6e1a6c6b-f190-11e8-b3e7-15e2dd8d9b05");
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ITopology selectTopologyConcept();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.segmentation.javamodel.ISegmentationConcept selectSegmentationConcept();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoS_Concept selectQosConcept();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.javamodel.ISecurityConcept selectSecurityConcept();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.businesscontinuity.javamodel.IBusinessContinuityConcept selectBusinessContinuityConcept();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IServices selectServiceConcept();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkConcept selectNetworkConcept();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,6e1a6c6b-f190-11e8-b3e7-15e2dd8d9b05,a5NAyNiZVsrZ17zrFI+QTwRD51U=] */
