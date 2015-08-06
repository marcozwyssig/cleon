package cleon.sdp.spec.project.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IProject extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("be3d7626-ff9b-11e4-ac0a-959b440f987f");
  
  // relations
  
  public cleon.sdp.spec.project.backlog.javamodel.IBacklog selectProductPlanning();
  
  public cleon.sdp.spec.project.javamodel.IResources selectResources();
  
  public java.util.List<? extends cleon.sdp.spec.project.release.javamodel.IRelease> selectReleasePlanning();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,be3d7626-ff9b-11e4-ac0a-959b440f987f,Wn6KVkfC9zY9BHu6EQPhR4JCC0E=] */
