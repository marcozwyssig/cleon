package cleon.support.projectmanagement.spec.planning.scope.module.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IModuleDependency extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("12cf9b7d-07d6-11e6-a579-8304ec3aa032");
  
  public java.lang.String selectReason();
  
  // relations
  
  public cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModule selectTo();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,12cf9b7d-07d6-11e6-a579-8304ec3aa032,hQtgbhhoGrHe0xNGP16ETczGpY0=] */
