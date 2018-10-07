package cleon.projectmethods.hermes.spec.hermes5.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IHermes extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("fceba8cc-31c9-11e8-8a84-6f139e67278b");
  
  // relations
  
  public cleon.projectmethods.hermes.spec.hermes5.javamodel.IPhases selectPhases();
  
  public cleon.projectmethods.hermes.spec.hermes5.javamodel.IRoles selectRoles();
  
  public cleon.projectmethods.hermes.spec.hermes5.javamodel.IModules selectModules();
  
  public cleon.projectmethods.hermes.spec.hermes5.javamodel.IScenarios selectScenarios();
  
  public cleon.projectmethods.hermes.spec.hermes5.javamodel.ITasks selectTasks();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,fceba8cc-31c9-11e8-8a84-6f139e67278b,5wyPqpkUlz0Sy4WLM7HCxHPBo1o=] */
