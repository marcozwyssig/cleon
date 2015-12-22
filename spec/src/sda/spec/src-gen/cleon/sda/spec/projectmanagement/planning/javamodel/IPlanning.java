package cleon.sda.spec.projectmanagement.planning.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IPlanning extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("5f541a84-a7d8-11e5-82dd-3b995d9c840c");
  
  // relations
  
  public java.util.List<? extends cleon.sda.spec.projectmanagement.planning.release.javamodel.IRelease> selectReleasePlanning();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,5f541a84-a7d8-11e5-82dd-3b995d9c840c,/yzKzDJEtjk8oCigL4zKN15z9oc=] */
