package cleon.sda.spec.projectmanagement.scope.backlog.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class EffortAware extends DynamicResource implements IEffortAware {

  // abstract implementation, only used for static method calls
  private EffortAware() {
    super(IEffortAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IEffortAware> selectToMeEstimate(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IEffort object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IEffortAware.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.EffortAware_estimate, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f4dd5881-e6d4-11e5-8f76-57ed79766a74,1ojop80doHriI+ZYWyrW/9kPomE=] */
