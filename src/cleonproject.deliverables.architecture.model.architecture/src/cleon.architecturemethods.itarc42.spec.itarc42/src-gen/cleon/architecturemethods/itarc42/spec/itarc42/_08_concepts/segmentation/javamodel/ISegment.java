package cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.segmentation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISegment extends cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.segmentation.javamodel.INamedZone {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("e820f880-0b73-11e9-a136-69d076e48ed1");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.segmentation.javamodel.ISecurityZone> selectSecurityZones();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,e820f880-0b73-11e9-a136-69d076e48ed1,egKlVI60a5K2acOz9n0m8wsaJoA=] */
