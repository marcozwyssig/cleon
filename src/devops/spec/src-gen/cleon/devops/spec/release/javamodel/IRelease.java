package cleon.devops.spec.release.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRelease extends cleon.devops.spec.javamodel.IReleaseManagement {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("d7db465a-406e-11e5-b5f0-5b1ce9c3de3e");
  
  // relations
  
  public java.util.List<? extends cleon.devops.spec.release.javamodel.IPackage> selectDeploymentArtefacts();
  
  public java.util.List<? extends cleon.devops.spec.release.javamodel.IPackageRepository> selectPackageRepositories();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,d7db465a-406e-11e5-b5f0-5b1ce9c3de3e,SmAe4kyUx1SkdQWTiFppiCZCxrk=] */
