package cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class WorkItemBase extends DynamicResource implements IWorkItemBase {

  // abstract implementation, only used for static method calls
  private WorkItemBase() {
    super(IWorkItemBase.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IWorkItemBase selectToMeAnalysis(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IText object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IWorkItemBase.class, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.WorkItemBase_analysis, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d52dddaa-28af-11e7-b0c5-5d730025d0c2,6fi6GYJcmY7aREOqudrHEtFb/6k=] */
