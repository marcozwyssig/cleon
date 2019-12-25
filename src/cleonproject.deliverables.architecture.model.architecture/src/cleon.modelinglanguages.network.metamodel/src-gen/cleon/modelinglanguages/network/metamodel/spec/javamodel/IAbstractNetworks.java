package cleon.modelinglanguages.network.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbstractNetworks extends cleon.modelinglanguages.network.metamodel.spec.javamodel.IGroupAware, cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetworkAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("66edbc85-092f-11e9-8c40-11db3668c0c9");
  
  // relations
  
  public cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPRange selectRange();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,66edbc85-092f-11e9-8c40-11db3668c0c9,uWBOMe6aOHOdxZhNMIX1qsFS2Qo=] */
