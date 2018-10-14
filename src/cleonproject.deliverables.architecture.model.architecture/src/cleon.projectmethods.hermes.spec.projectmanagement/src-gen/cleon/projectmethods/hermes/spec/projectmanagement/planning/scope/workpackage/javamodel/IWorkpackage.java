package cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IWorkpackage extends cleon.common.resources.spec.resources.id.javamodel.IIntegerBusinessObjectId, ch.actifsource.core.javamodel.IDecorator, cleon.common.doc.spec.doc.document.javamodel.IDocument {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("ca090201-bbc8-11e6-997f-d73ea5a3671c");
  
  // relations
  
  public cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.goals.javamodel.IWorkspaceGoals selectGoals();
  
  public cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IBacklog selectBacklog();
  
  public cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.utilization.javamodel.IResourceUtilization selectUtilization();
  
  public cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.javamodel.IOutcome selectOutcome();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,ca090201-bbc8-11e6-997f-d73ea5a3671c,ayPHqrwWkrnUBOw8j8VyaYlY0HQ=] */
