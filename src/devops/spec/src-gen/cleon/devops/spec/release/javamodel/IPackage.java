package cleon.devops.spec.release.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IPackage extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("15cb1207-4071-11e5-b5f0-5b1ce9c3de3e");
  
  // relations
  
  public java.util.List<? extends cleon.devops.spec.release.javamodel.IPackage> selectIncludes();
  
  public java.util.List<? extends cleon.devops.spec.release.javamodel.IPackage> selectReferences();
  
  public java.util.List<? extends cleon.devops.spec.release.javamodel.IPackageRepository> selectStores();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,15cb1207-4071-11e5-b5f0-5b1ce9c3de3e,tSuZEMGCW/LQ9NrS+4uxaBjKw/o=] */
