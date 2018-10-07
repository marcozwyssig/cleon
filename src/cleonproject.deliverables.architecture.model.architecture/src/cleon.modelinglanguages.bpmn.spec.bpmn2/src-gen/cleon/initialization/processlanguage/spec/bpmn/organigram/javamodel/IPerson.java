package cleon.initialization.processlanguage.spec.bpmn.organigram.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IPerson extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("6e4ce5b3-daac-11e3-ae07-89aa80d5ec3d");
  
  // relations
  
  public java.util.List<? extends cleon.initialization.processlanguage.spec.bpmn.organisational.role.javamodel.IRole> selectRoles();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,6e4ce5b3-daac-11e3-ae07-89aa80d5ec3d,IY51geii/0uyNlF3WR/lUXYqLVM=] */
