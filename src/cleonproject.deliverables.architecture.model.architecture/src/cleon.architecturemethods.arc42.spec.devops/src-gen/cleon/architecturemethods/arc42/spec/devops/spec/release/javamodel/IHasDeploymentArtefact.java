package cleon.architecturemethods.arc42.spec.devops.spec.release.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IHasDeploymentArtefact extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c4cc02f2-4507-11e5-84bb-b76bc2368798");
  
  // relations
  
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.spec.devops.spec.release.javamodel.IDeploymentArtefact> selectDeploymentArtefacts();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c4cc02f2-4507-11e5-84bb-b76bc2368798,Nhf55g1JVrn3rUZhGeXf5OLKAcU=] */
