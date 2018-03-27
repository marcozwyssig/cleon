package cleon.initialization.projectmanagement.spec.planning.scope.workpackage.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IWorkpackage extends cleon.common.resources.spec.resources.id.javamodel.IBusinessObjectId, cleon.common.doc.spec.doc.document.javamodel.INamedDocument {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("ca090201-bbc8-11e6-997f-d73ea5a3671c");
  
  // relations
  
  public cleon.initialization.projectmanagement.spec.planning.scope.workpackage.goals.javamodel.IWorkspaceGoals selectGoals();
  
  public java.util.List<? extends cleon.initialization.projectmanagement.spec.planning.scope.workpackage.javamodel.IWorkpackageDependency> selectDependsOn();
  
  public cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IBacklogs selectBacklogs();
  
  public cleon.initialization.projectmanagement.spec.planning.scope.workpackage.utilization.javamodel.IResourceUtilization selectUtilization();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,ca090201-bbc8-11e6-997f-d73ea5a3671c,mTkcrDj3bKTplGfiXVtdR8FjcW8=] */
