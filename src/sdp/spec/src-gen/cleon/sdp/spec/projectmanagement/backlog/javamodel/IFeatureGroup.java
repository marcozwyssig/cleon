package cleon.sdp.spec.projectmanagement.backlog.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IFeatureGroup extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("409913e6-369c-11e5-95d9-2b04d7ab02d9");
  
  // relations
  
  public java.util.List<? extends cleon.sdp.spec.projectmanagement.backlog.javamodel.IWorkItem> selectWorkItems();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,409913e6-369c-11e5-95d9-2b04d7ab02d9,eRNU6RRxIj9RlAETJwReo9yVv4M=] */
