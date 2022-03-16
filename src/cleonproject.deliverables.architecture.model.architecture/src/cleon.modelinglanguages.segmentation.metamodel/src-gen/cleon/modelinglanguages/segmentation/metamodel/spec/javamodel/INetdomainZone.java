package cleon.modelinglanguages.segmentation.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface INetdomainZone extends cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.INamedZone {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("da24cca3-0b73-11e9-a136-69d076e48ed1");
  
  // relations
  
  public java.util.List<? extends cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISegmentZone> selectSegments();
  
  public java.util.List<? extends cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.INetdomainZone> selectAllowed();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,da24cca3-0b73-11e9-a136-69d076e48ed1,7nxnFcQC/GCxKrVihCJWtwGLq6k=] */
