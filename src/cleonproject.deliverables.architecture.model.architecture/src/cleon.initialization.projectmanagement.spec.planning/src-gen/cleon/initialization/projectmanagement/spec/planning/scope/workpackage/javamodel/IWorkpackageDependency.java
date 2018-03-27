package cleon.initialization.projectmanagement.spec.planning.scope.workpackage.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IWorkpackageDependency extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c4251482-d654-11e6-a65b-3d568b0606cc");
  
  public java.lang.String selectReason();
  
  // relations
  
  public cleon.initialization.projectmanagement.spec.planning.scope.workpackage.javamodel.IWorkpackage selectTo();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c4251482-d654-11e6-a65b-3d568b0606cc,Ku1Pu/kA414n96J4mPYbh0ckZrM=] */
