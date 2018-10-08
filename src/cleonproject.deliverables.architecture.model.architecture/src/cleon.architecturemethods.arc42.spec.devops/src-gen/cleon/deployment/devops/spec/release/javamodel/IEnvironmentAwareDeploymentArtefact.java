package cleon.deployment.devops.spec.release.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IEnvironmentAwareDeploymentArtefact extends ch.actifsource.core.javamodel.IDecorator, cleon.deployment.devops.spec.release.javamodel.IHasDeploymentArtefact {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("35611355-4507-11e5-84bb-b76bc2368798");
  
  // relations
  
  public cleon.deployment.devops.spec.deploy.javamodel.IEnvironment selectEnvironment();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,35611355-4507-11e5-84bb-b76bc2368798,JIzUwpIREJpqZVsk8xSdpKJ6LlI=] */
