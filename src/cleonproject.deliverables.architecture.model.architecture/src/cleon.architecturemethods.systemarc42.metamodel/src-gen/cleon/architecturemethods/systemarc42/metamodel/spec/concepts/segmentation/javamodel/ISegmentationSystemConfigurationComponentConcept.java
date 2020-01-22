package cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISegmentationSystemConfigurationComponentConcept extends cleon.architecturemethods.systemarc42.metamodel.spec.concepts.javamodel.ISystemConfigurationComponentConcept {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("be4cba9f-0c2a-11e9-83ba-4d57b06560a2");
  
  // relations
  
  public java.util.List<? extends cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> selectSecuritySubZones();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,be4cba9f-0c2a-11e9-83ba-4d57b06560a2,O5KzkcAdt+uFhmHPRVuzLJtRR1Q=] */
