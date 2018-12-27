package cleon.common.resources.spec.resources.ip.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IIPv4_Address_Aware extends cleon.common.resources.spec.resources.ip.javamodel.IIPv4_Addresses_Aware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("ba6724bd-0931-11e9-8c40-11db3668c0c9");
  
  // relations
  
  public cleon.common.resources.spec.resources.ip.javamodel.IIPv4 selectIPv4();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,ba6724bd-0931-11e9-8c40-11db3668c0c9,EY/0HTWKGcG0MbLuSG8VPOxACtQ=] */
