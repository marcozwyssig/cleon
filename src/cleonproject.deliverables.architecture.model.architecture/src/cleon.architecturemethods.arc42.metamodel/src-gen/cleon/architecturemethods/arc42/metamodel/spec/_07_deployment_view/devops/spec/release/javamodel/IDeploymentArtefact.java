package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.release.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDeploymentArtefact extends ch.actifsource.core.javamodel.IResource, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("15cb1207-4071-11e5-b5f0-5b1ce9c3de3e");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.release.javamodel.IDeploymentArtefact> selectIncludes();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.release.javamodel.IDeploymentArtefact> selectReferences();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.release.javamodel.IPackageRepository> selectPublishTo();
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.release.type.javamodel.IDeploymentArtefactType selectDeploymentArtefactType();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,15cb1207-4071-11e5-b5f0-5b1ce9c3de3e,vZvvRQjZFoo4DKDqOE2BWLTGtqA=] */
