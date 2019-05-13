package cleon.modelinglanguages.network.spec.network.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbstractNetwork extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter, cleon.common.doc.spec.doc.chapter.javamodel.INoChapters, cleon.modelinglanguages.network.spec.network.javamodel.IGroupAware, cleon.modelinglanguages.network.spec.network.ipv4.javamodel.IIPv4_Mask_Aware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("74d72409-092f-11e9-8c40-11db3668c0c9");
  
  // attributes
  
  public java.lang.Integer selectVLAN();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.network.spec.network.javamodel.IAbstractNetworkNode> selectNode();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,74d72409-092f-11e9-8c40-11db3668c0c9,RrG8cg8NKqQnalhXL6n6p5Kod/w=] */
