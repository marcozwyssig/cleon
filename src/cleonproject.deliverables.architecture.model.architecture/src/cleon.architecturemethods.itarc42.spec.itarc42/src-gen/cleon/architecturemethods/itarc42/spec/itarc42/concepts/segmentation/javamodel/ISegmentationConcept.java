package cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISegmentationConcept extends cleon.architecturemethods.itarc42.spec.itarc42.concepts.javamodel.IConceptForSystemComponent, cleon.architecturemethods.itarc42.spec.itarc42.concepts.javamodel.IConceptForSystemConfigurationComponent {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("d56c10bc-04ed-11e9-8ff2-6313785a338c");
  
  // relations
  
  public java.util.List<? extends cleon.modelinglanguages.network.spec.segmentation.javamodel.ISegmentationZone> selectSegmentationZone();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.javamodel.ISegmentationSystemComponentConcept> selectSegmentationSystemComponentConcepts();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.itarc42.spec.itarc42.concepts.segmentation.javamodel.ISegmentationSystemConfigurationComponentConcept> selectSegmentationSystemConfigurationConcepts();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,d56c10bc-04ed-11e9-8ff2-6313785a338c,ymooL6xZEsxltpKwJqQvPHRTx2o=] */
