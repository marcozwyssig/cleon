package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.featuregroup.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IWorkItemGroup extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItem {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("409913e6-369c-11e5-95d9-2b04d7ab02d9");
  
  public java.lang.Integer selectPlannedEstimate();
  
  // relations
  
  public java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItem> selectItems();
  
  public java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.featuregroup.javamodel.IWorkItemGroup> selectPreconditions();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,409913e6-369c-11e5-95d9-2b04d7ab02d9,4MZ0i0h6XSoP3P+wJzO8q6KcXB4=] */
