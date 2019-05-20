package cleon.modelinglanguages.network.spec.network.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbstractNetworkNode extends cleon.common.resources.spec.resources.descriptions.javamodel.ISimpleDescription, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("d8caf2bc-0930-11e9-8c40-11db3668c0c9");
  
  // relations
  
  public cleon.modelinglanguages.network.spec.network.ipv4.javamodel.IIPv4_D selectIPv4_D();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,d8caf2bc-0930-11e9-8c40-11db3668c0c9,oJzfx/epdXHdVPhpOoSNh1Hw2eE=] */
