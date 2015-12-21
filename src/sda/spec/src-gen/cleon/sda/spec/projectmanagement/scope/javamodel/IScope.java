package cleon.sda.spec.projectmanagement.scope.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IScope extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("fef60a9b-a7d8-11e5-82dd-3b995d9c840c");
  
  // relations
  
  public cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IBacklog selectBacklog();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,fef60a9b-a7d8-11e5-82dd-3b995d9c840c,ksjjgM1utGD/c9lHADmeqHOz/a4=] */
