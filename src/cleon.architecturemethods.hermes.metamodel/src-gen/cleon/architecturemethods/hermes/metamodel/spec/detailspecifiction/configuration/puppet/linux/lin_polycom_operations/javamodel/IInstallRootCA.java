package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IInstallRootCA extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetConfiguration {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("6c067b1f-ba41-11f0-9349-73cfbb54b949");
  
  public java.lang.String selectSmb_path();
  
  public java.lang.String selectSmb_share();
  
  public java.lang.String selectSmb_full_share();
  
  public java.lang.String selectDomain_name();
  
  public java.lang.String selectCert_filename();
  
  public java.lang.String selectAnchors_dir();
  
  public java.lang.String selectPki_mountpoint();
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost selectSmb_server_host();
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.javamodel.IServiceAccount selectSmb_username();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,6c067b1f-ba41-11f0-9349-73cfbb54b949,E9Zb4kI3s++VPkH8P6MaUPtHbeg=] */
