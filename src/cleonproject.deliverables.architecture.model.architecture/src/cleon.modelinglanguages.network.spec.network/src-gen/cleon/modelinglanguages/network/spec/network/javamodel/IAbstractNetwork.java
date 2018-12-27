package cleon.modelinglanguages.network.spec.network.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbstractNetwork extends cleon.modelinglanguages.network.spec.network.javamodel.IGroupAware, cleon.common.resources.spec.resources.ip.javamodel.IIPv4_Mask_Aware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("74d72409-092f-11e9-8c40-11db3668c0c9");
  
  // relations
  
  public java.util.List<? extends cleon.modelinglanguages.network.spec.network.javamodel.IAbtractNetworkNode> selectNetworkNodes();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,74d72409-092f-11e9-8c40-11db3668c0c9,U8UV2ueCKsGpDkx2cGSOf+jqzAY=] */
