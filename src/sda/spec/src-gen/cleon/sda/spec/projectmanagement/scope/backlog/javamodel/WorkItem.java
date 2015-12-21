package cleon.sda.spec.projectmanagement.scope.backlog.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class WorkItem extends DynamicResource implements IWorkItem {

  // abstract implementation, only used for static method calls
  private WorkItem() {
    super(IWorkItem.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IWorkItem> selectToMeOwner(cleon.sda.spec.projectmanagement.ressources.javamodel.IPerson object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IWorkItem.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_owner, object.getResource());
  }
  
  public static cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IWorkItem selectToMeDescription(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IText object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IWorkItem.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_description, object.getResource());
  }
  
  public static java.util.List<cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IWorkItem> selectToMeSprint(cleon.sda.spec.projectmanagement.planning.release.javamodel.ISprint object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IWorkItem.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_sprint, object.getResource());
  }
  
  public static cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IWorkItem selectToMeAnalysis(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IText object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IWorkItem.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.WorkItem_analysis, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4330cc63-ff9c-11e4-ac0a-959b440f987f,TlHMZJ+y2SVFrw7yR+ZNiAtuKrc=] */
