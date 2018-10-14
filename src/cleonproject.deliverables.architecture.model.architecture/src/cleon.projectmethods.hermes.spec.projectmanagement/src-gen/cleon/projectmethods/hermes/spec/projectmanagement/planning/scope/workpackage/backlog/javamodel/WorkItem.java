package cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class WorkItem extends DynamicResource implements IWorkItem {

  // abstract implementation, only used for static method calls
  private WorkItem() {
    super(IWorkItem.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItem> selectToMeOwners(cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.javamodel.IPerson object) {
    return _getToMeList(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItem.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.WorkItem_owners, object.getResource());
  }
  
  public static java.util.List<cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItem> selectToMePreconditions(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItem object) {
    return _getToMeList(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItem.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.WorkItem_preconditions, object.getResource());
  }
  
  public static java.util.List<cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItem> selectToMeState(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItemState object) {
    return _getToMeList(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItem.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.WorkItem_state, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4330cc63-ff9c-11e4-ac0a-959b440f987f,CiiamBe+6XFSfQ0TxEuJmfr35yE=] */
