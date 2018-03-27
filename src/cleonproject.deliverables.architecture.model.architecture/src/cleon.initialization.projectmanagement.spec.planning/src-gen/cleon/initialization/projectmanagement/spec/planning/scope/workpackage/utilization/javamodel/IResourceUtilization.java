package cleon.initialization.projectmanagement.spec.planning.scope.workpackage.utilization.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IResourceUtilization extends cleon.common.doc.spec.doc.chapter.javamodel.IChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("8db4bffd-bbd5-11e6-997f-d73ea5a3671c");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.initialization.projectmanagement.spec.planning.scope.workpackage.utilization.javamodel.IModuleUtilization> selectUtilizateRoles();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,8db4bffd-bbd5-11e6-997f-d73ea5a3671c,pa8qeCzGLi7rlWuBg/iEH4a91hc=] */
