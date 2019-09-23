package cleon.modelinglanguages.network.spec.segmentation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface INetDomainZone extends cleon.modelinglanguages.network.spec.segmentation.javamodel.INamedZone {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("da24cca3-0b73-11e9-a136-69d076e48ed1");
  
  // relations
  
  public java.util.List<? extends cleon.modelinglanguages.network.spec.segmentation.javamodel.ISegmentZone> selectSegments();
  
  public java.util.List<? extends cleon.modelinglanguages.network.spec.segmentation.javamodel.INetDomainZone> selectAllowed();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,da24cca3-0b73-11e9-a136-69d076e48ed1,/wbwGACkzeuhScLifd6y7DlO5aQ=] */