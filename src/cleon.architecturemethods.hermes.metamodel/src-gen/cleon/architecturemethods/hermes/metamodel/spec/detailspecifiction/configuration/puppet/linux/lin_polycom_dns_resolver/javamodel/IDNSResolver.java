package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_dns_resolver.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDNSResolver extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetConfiguration {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("f88d0c56-21ac-11f0-83ae-df5418a109a4");
  
  // attributes
  
  public java.lang.String selectZone_name();
  
  public java.util.List<java.lang.String> selectFwd_dns_addresses();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.javamodel.IServiceBuildNode> selectAd_dns_addresses();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> selectAllowedSystemConfigurationToResolveDNS();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.javamodel.IServiceBuildNode> selectDns_access_control();
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.javamodel.IServiceBuildNode selectFwd_dns_peer();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,f88d0c56-21ac-11f0-83ae-df5418a109a4,ZG2Qmh7PMwtd+5QdqvUQC4pDU44=] */
