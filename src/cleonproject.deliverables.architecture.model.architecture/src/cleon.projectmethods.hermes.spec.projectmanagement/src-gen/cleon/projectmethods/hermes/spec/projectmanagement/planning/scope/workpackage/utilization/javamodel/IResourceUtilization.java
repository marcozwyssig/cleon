package cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.utilization.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IResourceUtilization extends cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("8db4bffd-bbd5-11e6-997f-d73ea5a3671c");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.utilization.javamodel.IRoleUtilization> selectUtilizateRoles();
  
  public java.util.List<? extends cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.utilization.javamodel.IPersonUtilization> selectPersonUtilization();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,8db4bffd-bbd5-11e6-997f-d73ea5a3671c,9WX15Yp2Ya/8HgONmXCJcCB+kIY=] */
