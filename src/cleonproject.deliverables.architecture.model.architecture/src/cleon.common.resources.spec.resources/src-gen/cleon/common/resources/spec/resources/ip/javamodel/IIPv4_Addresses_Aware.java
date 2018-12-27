package cleon.common.resources.spec.resources.ip.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IIPv4_Addresses_Aware extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("fbcaa90e-09a4-11e9-8c40-11db3668c0c9");
  
  // relations
  
  public java.util.List<? extends cleon.common.resources.spec.resources.ip.javamodel.IIPv4> selectIPv4s();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,fbcaa90e-09a4-11e9-8c40-11db3668c0c9,lw4tOMj5l5nxrBk7rA1W1uGIbTY=] */
