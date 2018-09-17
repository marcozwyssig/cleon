package cleon.initialization.projectmanagement.spec.planning.scope.workpackage.utilization.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IModuleUtilization extends ch.actifsource.core.javamodel.IDecorator, cleon.common.doc.spec.doc.chapter.javamodel.IChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("27e45355-c291-11e6-ba8e-05f5391bcda8");
  
  // relations
  
  public cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel.IOutcome selectModule();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.initialization.projectmanagement.spec.planning.scope.workpackage.utilization.javamodel.IRoleUtilization> selectRoleUtilizations();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,27e45355-c291-11e6-ba8e-05f5391bcda8,JHIpxL34NwYp7xYJvTudZpBKVZs=] */
