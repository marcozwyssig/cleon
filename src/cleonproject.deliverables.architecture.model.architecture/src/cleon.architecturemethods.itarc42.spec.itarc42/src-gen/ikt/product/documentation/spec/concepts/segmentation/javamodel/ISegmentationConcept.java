package ikt.product.documentation.spec.concepts.segmentation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISegmentationConcept extends ikt.product.documentation.spec.concepts.javamodel.IConceptForSystemComponent, ikt.product.documentation.spec.concepts.javamodel.IConceptForSystemConfigurationComponent {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("d56c10bc-04ed-11e9-8ff2-6313785a338c");
  
  // relations
  
  public java.util.List<? extends ikt.product.documentation.spec.concepts.segmentation.javamodel.ISegmentationZone> selectSegmentationZone();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends ikt.product.documentation.spec.concepts.segmentation.javamodel.ISegmentationSystemComponentConcept> selectSegmentationSystemComponentConcepts();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends ikt.product.documentation.spec.concepts.segmentation.javamodel.ISegmentationSystemConfigurationComponentConcept> selectSegmentationSystemConfigurationConcepts();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,d56c10bc-04ed-11e9-8ff2-6313785a338c,2OcCEuizbeXdb6pSCHc3Uyc8cqs=] */
