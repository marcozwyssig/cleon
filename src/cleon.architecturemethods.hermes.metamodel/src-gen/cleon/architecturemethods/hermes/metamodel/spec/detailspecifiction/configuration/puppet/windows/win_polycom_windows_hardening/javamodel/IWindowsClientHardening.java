package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IWindowsClientHardening extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.javamodel.IAbstractWindowsHardening {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("f8fdf221-5e42-11f0-a5db-972145eef50c");
  
  // attributes
  
  public java.lang.Boolean selectInclude_bitlocker();
  
  public java.lang.Boolean selectInclude_nextgen();
  
  public java.lang.Boolean selectInclude_hkcu();
  
  public java.lang.Boolean selectPurge_unmanaged_users();
  
  public java.lang.Boolean selectEnable_administrator();
  
  public java.lang.Boolean selectEnable_remote_desktop();
  
  public java.lang.Boolean selectRemote_local_accounts();
  
  public java.lang.Boolean selectPerformance_powerscheme();
  
  public java.lang.Boolean selectClear_temp_files();
  
  public java.lang.Boolean selectAuto_restart();
  
  public java.lang.Boolean selectCatalog_no_cache();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,f8fdf221-5e42-11f0-a5db-972145eef50c,U/WvTNLiprUwq7q9dzNNH3bzDzg=] */
