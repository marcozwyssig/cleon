package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_sqlserver.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IInstallSQLServer extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.javamodel.IPuppetConfigurationPermissions {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("1b1329f2-114d-11f0-a4f9-b5f995a9e0fe");
  
  // attributes
  
  public java.lang.String selectServerInstance();
  
  public java.lang.String selectSourcePath();
  
  public java.lang.String selectSetupUser();
  
  public java.lang.String selectSaPassword();
  
  public java.lang.String selectInstallPath();
  
  public java.util.List<java.lang.String> selectFeatures();
  
  public java.lang.String selectPipeName();
  
  public java.lang.String selectEdition();
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.javamodel.IServiceAccount selectSetupAccount();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,1b1329f2-114d-11f0-a4f9-b5f995a9e0fe,N2QIC5+kIiXn5Us5CoCHjZg6qps=] */
