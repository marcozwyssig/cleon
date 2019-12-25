package cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbstractGroups extends cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.javamodel.IAbstractGroup {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("cc875e00-7f08-11e9-98a3-b1bd805f0a31");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.javamodel.IAbstractGroup> selectGroups();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,cc875e00-7f08-11e9-98a3-b1bd805f0a31,T5RA/YGw8effETI67QZy3qW/rck=] */
