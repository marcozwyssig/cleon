package cleon.modelinglanguages.network.spec.network.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IGroup extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("b8a9dce5-09ae-11e9-8c40-11db3668c0c9");
  
  // relations
  
  public java.util.List<? extends cleon.modelinglanguages.network.spec.network.javamodel.IAbstractNetworkNode> selectNodes();
  
  public ch.actifsource.core.javamodel.IColor selectColor();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,b8a9dce5-09ae-11e9-8c40-11db3668c0c9,QI6dAghiLfMHt6JH1uSbaNL08G8=] */
