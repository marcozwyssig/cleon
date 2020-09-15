package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

/**
 * Runs EXE/DLL or a script (batch file; VBScript; PowerShell) that returns a
 * numerical value
 */
public interface IExe extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel.INamedSensor {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("db43f2ea-c1eb-11ea-820f-9931558a898c");
  
  // attributes
  
  public java.lang.String selectExeFile();
  
  public java.lang.String selectExeParams();
  
  public java.lang.Boolean selectUseWindowsAuthentication();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,db43f2ea-c1eb-11ea-820f-9931558a898c,goJCUccHx4W1/xIbZDibruO4lVc=] */
