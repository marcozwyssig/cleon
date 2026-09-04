package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ICleanUpTask extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("93803197-2759-11f0-b32f-851840d4a5f4");
  
  // attributes
  
  public java.lang.String selectCleanuptarget();
  
  public java.lang.Integer selectFileage();
  
  public java.lang.Boolean selectRecursive();
  
  public java.lang.String selectStarttime();
  
  public java.util.List<java.lang.String> selectExclude();
  
  public java.util.List<java.lang.String> selectExcluderootfolder();
  
  public java.lang.String selectLogonAs();
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.javamodel.IServiceAccount selectServiceAccount();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,93803197-2759-11f0-b32f-851840d4a5f4,mFzUoOARwbD2iWz4F7FOHdnln/Y=] */
