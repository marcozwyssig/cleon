package cleon.modelinglanguages.network.spec.network.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbstractNetworks extends cleon.modelinglanguages.network.spec.network.javamodel.IGroupAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("66edbc85-092f-11e9-8c40-11db3668c0c9");
  
  // relations
  
  public java.util.List<? extends cleon.modelinglanguages.network.spec.network.javamodel.IAbstractNetwork> selectNetworks();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,66edbc85-092f-11e9-8c40-11db3668c0c9,iPfdGQvzXpTBJyVYnv1NhLta6HA=] */
