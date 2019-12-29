package cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISegmentationSystemComponentConcept extends cleon.architecturemethods.systemarc42.metamodel.spec.concepts.javamodel.ISystemComponentConcept {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("19f5852a-4b23-11e9-8338-41c203971ecb");
  
  // relations
  
  public java.util.List<? extends cleon.modelinglanguages.network.metamodel.spec.javamodel.ISecurityZone> selectSecurityZones();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,19f5852a-4b23-11e9-8338-41c203971ecb,gZV+3hTDSclcS8tIaT71pj8RzME=] */
