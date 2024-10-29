package cleon.projectmethods.hermes.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IHermes extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("fceba8cc-31c9-11e8-8a84-6f139e67278b");
  
  // relations
  
  public cleon.projectmethods.hermes.metamodel.spec.javamodel.IPhases selectPhases();
  
  public cleon.projectmethods.hermes.metamodel.spec.javamodel.IRoles selectRoles();
  
  public cleon.projectmethods.hermes.metamodel.spec.javamodel.IModules selectModules();
  
  public cleon.projectmethods.hermes.metamodel.spec.javamodel.IScenarios selectScenarios();
  
  public cleon.projectmethods.hermes.metamodel.spec.javamodel.ITasks selectTasks();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,fceba8cc-31c9-11e8-8a84-6f139e67278b,UO2r7c4TjqM1S4CtO/1SxWiKKok=] */
