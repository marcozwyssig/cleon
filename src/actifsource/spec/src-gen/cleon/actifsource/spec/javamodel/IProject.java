package cleon.actifsource.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IProject extends ch.actifsource.core.javamodel.ICommentable, cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("04a544de-11e9-11e5-b568-55f5f05bd6f6");
  
  public java.lang.String selectVersion();
  
  // relations
  
  public java.util.List<? extends cleon.actifsource.spec.javamodel.IProject> selectDependsOn();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,04a544de-11e9-11e5-b568-55f5f05bd6f6,12Ik9xkm6NrUbNGOVTahmaEqFy8=] */
