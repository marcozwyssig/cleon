package cleon.common.resources.spec.resources.workstate.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IWorkStateAware extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("4ae61945-0d05-11e6-be97-7d1235599779");
  
  // relations
  
  public cleon.common.resources.spec.resources.workstate.javamodel.IWorkState selectState();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,4ae61945-0d05-11e6-be97-7d1235599779,AusLOXBY1RfPcG9Tp+2DBwnW8ro=] */
