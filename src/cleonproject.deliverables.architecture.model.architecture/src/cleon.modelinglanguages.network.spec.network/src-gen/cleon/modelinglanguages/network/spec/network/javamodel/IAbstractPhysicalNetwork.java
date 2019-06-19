package cleon.modelinglanguages.network.spec.network.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbstractPhysicalNetwork extends cleon.modelinglanguages.network.spec.network.javamodel.IGroupAware, cleon.modelinglanguages.network.spec.network.javamodel.IAbstractNetwork, cleon.modelinglanguages.network.spec.network.ipv4.javamodel.IIPv4_Mask_Aware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("679da3a6-7ac9-11e9-a70f-4dc03941a024");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.network.spec.network.javamodel.IAbstractNetworkNode> selectNode();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,679da3a6-7ac9-11e9-a70f-4dc03941a024,GiGPTKUXZDWao0rTNqliyuuEST0=] */
