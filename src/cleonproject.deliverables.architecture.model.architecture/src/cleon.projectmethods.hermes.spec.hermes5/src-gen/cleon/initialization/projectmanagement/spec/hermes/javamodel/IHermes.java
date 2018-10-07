package cleon.initialization.projectmanagement.spec.hermes.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IHermes extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("fceba8cc-31c9-11e8-8a84-6f139e67278b");
  
  // relations
  
  public cleon.initialization.projectmanagement.spec.hermes.javamodel.IPhases selectPhases();
  
  public cleon.initialization.projectmanagement.spec.hermes.javamodel.IRoles selectRoles();
  
  public cleon.initialization.projectmanagement.spec.hermes.javamodel.IModules selectModules();
  
  public cleon.initialization.projectmanagement.spec.hermes.javamodel.IScenarios selectScenarios();
  
  public cleon.initialization.projectmanagement.spec.hermes.javamodel.ITasks selectTasks();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,fceba8cc-31c9-11e8-8a84-6f139e67278b,3IWG/mR4JnE8WhfngtAag2fOygM=] */
