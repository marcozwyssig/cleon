package cleon.sda.spec.projectmanagement.scope.backlog.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IEffortAware extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("f4dd5881-e6d4-11e5-8f76-57ed79766a74");
  
  // relations
  
  public cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IEffort selectEstimate();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,f4dd5881-e6d4-11e5-8f76-57ed79766a74,Nh+m2U9ziRXDjgpOe7zVIMkr8Tg=] */
