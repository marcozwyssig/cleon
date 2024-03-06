package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITopologyEnvironment extends ch.actifsource.core.javamodel.IResource, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("ecf82cf6-053e-11ea-b1c2-9163c84d2612");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode selectEnvironmentForTopology();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSite> selectSites();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,ecf82cf6-053e-11ea-b1c2-9163c84d2612,UnwoztKsfWCXtphoK6BnSc7c8yU=] */
