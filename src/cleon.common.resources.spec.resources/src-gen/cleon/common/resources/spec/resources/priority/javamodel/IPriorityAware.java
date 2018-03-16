package cleon.common.resources.spec.resources.priority.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IPriorityAware extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("db7fa68a-06d7-11e6-8d3e-13e5be4bd43b");
  
  // relations
  
  public cleon.common.resources.spec.resources.priority.javamodel.IPriority selectPriority();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,db7fa68a-06d7-11e6-8d3e-13e5be4bd43b,rm58BAo4N3RbIzKS7v/wGdmsMA8=] */
