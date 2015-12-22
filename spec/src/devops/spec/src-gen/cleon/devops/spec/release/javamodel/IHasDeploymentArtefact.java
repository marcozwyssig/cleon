package cleon.devops.spec.release.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IHasDeploymentArtefact extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c4cc02f2-4507-11e5-84bb-b76bc2368798");
  
  // relations
  
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.devops.spec.release.javamodel.IDeploymentArtefact> selectDeploymentArtefacts();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c4cc02f2-4507-11e5-84bb-b76bc2368798,cTKcGNWx84hgMDq5KUZ7kMOL6hk=] */
