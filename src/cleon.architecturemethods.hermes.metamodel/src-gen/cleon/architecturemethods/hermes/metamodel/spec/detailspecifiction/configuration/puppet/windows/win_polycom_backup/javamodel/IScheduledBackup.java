package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_backup.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IScheduledBackup extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetConfiguration {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("8bd0ea43-6316-11f0-a7ee-fba3b99d3616");
  
  // attributes
  
  public java.util.List<java.lang.String> selectDataSources();
  
  public java.lang.String selectCertificateStore();
  
  public java.lang.String selectCertificateThumbprint();
  
  public java.lang.Integer selectDataChunkSize();
  
  public java.lang.Integer selectMaxFileSizeGB();
  
  public java.lang.String selectLogonAs();
  
  public java.lang.String selectFullShareName();
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.javamodel.IServiceAccount selectServiceAccount();
  
  public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.javamodel.INSShare selectShare();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,8bd0ea43-6316-11f0-a7ee-fba3b99d3616,fE3fpB8u7vy48kHl36vqGwLAuJ8=] */
