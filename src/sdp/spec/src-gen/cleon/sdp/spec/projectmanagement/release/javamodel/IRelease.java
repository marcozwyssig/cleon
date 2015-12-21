package cleon.sdp.spec.projectmanagement.release.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRelease extends cleon.sdp.spec.projectmanagement.release.javamodel.ITimePlan, ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("2755120c-3761-11e5-95d9-2b04d7ab02d9");
  
  // relations
  
  public java.util.List<? extends cleon.sdp.spec.projectmanagement.release.javamodel.ITimePlan> selectRelease();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,2755120c-3761-11e5-95d9-2b04d7ab02d9,D6JIilVVg3bhl+N0LIqfpYxnxUs=] */
