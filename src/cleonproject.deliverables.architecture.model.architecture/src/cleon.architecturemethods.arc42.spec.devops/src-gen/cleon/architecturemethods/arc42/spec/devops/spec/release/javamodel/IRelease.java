package cleon.architecturemethods.arc42.spec.devops.spec.release.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRelease extends cleon.architecturemethods.arc42.spec.devops.spec.javamodel.IReleaseManagement, cleon.architecturemethods.arc42.spec.devops.spec.release.javamodel.IHasDeploymentArtefact {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("d7db465a-406e-11e5-b5f0-5b1ce9c3de3e");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.arc42.spec.devops.spec.release.javamodel.IPackageRepository> selectPackageRepositories();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.spec.devops.spec.release.javamodel.IEnvironmentAwareDeploymentArtefact> selectEnvironmentAwareDeploymentArtefact();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,d7db465a-406e-11e5-b5f0-5b1ce9c3de3e,Jx9w6hIJ1TF+g3gbCDREhFd+sAM=] */
