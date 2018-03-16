package cleon.support.projectmanagement.spec.planning.schedule.milestones.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class SprintPlanningAware extends DynamicResource implements ISprintPlanningAware {

  // abstract implementation, only used for static method calls
  private SprintPlanningAware() {
    super(ISprintPlanningAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.support.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprintPlanningAware> selectToMePlannedStartSprint(cleon.support.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprint object) {
    return _getToMeList(object.getRepository(), cleon.support.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprintPlanningAware.class, cleon.support.projectmanagement.spec.planning.schedule.milestones.MilestonesPackage.SprintPlanningAware_plannedStartSprint, object.getResource());
  }
  
  public static java.util.List<cleon.support.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprintPlanningAware> selectToMePlannedEndSprint(cleon.support.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprint object) {
    return _getToMeList(object.getRepository(), cleon.support.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprintPlanningAware.class, cleon.support.projectmanagement.spec.planning.schedule.milestones.MilestonesPackage.SprintPlanningAware_plannedEndSprint, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6578c5b7-c110-11e6-8f58-ad3c6ee7602f,1ZJq8GG+wd+ddTdH1zkvQU4f1X4=] */
