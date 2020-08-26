package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

/**
 * Runs EXE/DLL or a script (batch file; VBScript; PowerShell) that returns XML or
 * JSON
 */
public interface IExexml extends ch.actifsource.core.javamodel.INamedResource, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel.ISensor {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("db43f2f0-c1eb-11ea-820f-9931558a898c");
  
  // attributes
  
  public java.lang.String selectExeFile();
  
  public java.lang.String selectExeParams();
  
  public java.lang.Boolean selectUseWindowsAuthentication();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,db43f2f0-c1eb-11ea-820f-9931558a898c,ScpUSksBYVfelahbbFCmEeJBLyY=] */
