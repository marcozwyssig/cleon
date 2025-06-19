package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_adjoin.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAdJoin extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetConfigurationPermissions {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("1293bc7b-211f-11f0-b52a-cbda5a5cd45e");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.javamodel.IBuildNode selectDc();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.javamodel.IBuildNode> selectAdServers();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,1293bc7b-211f-11f0-b52a-cbda5a5cd45e,JKgMZFfwDPKWYMr2/ecj/8k4cY4=] */
