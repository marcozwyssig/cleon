package cleon.support.projectmanagement.spec.planning.scope.workpackage.goals.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IWorkspaceGoal extends ch.actifsource.core.javamodel.IResource, ch.actifsource.core.javamodel.IDecorator, cleon.common.resources.spec.resources.descriptions.javamodel.ISimpleDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("538b2189-bc93-11e6-904c-8bf6f8927ff0");
  
  // relations
  
  public cleon.support.projectmanagement.spec.planning.goals.javamodel.IProjectGoal selectGoal();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,538b2189-bc93-11e6-904c-8bf6f8927ff0,NxdHugZAFIaq22I8zfX8saZujrs=] */
