package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IVeeamBackupVM extends ch.actifsource.core.javamodel.IResource, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("3bd87a93-4a74-11f0-8aad-e18ef03c09ec");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.javamodel.IBuildNode selectBuildNode();
  
  public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel.IVeeamBkpJobHostProfile selectBkpJobHostProfile();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,3bd87a93-4a74-11f0-8aad-e18ef03c09ec,LDPcaoA9W2ojs3YQq6phWaJNiaY=] */
