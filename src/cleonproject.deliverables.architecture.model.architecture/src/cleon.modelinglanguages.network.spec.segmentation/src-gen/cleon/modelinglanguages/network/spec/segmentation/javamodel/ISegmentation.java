package cleon.modelinglanguages.network.spec.segmentation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISegmentation extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractNamedChapter, cleon.common.doc.spec.doc.chapter.javamodel.INoChapters {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("ccaeef49-0d1d-11e9-be4f-03130cc057ef");
  
  // relations
  
  public java.util.List<? extends cleon.modelinglanguages.network.spec.segmentation.javamodel.INetDomainZone> selectNetdomains();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,ccaeef49-0d1d-11e9-be4f-03130cc057ef,q9xBIPj2PYQKjL1tbAg1+SfVHzc=] */
