package cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class SprintPlanningAware extends DynamicResource implements ISprintPlanningAware {

  // abstract implementation, only used for static method calls
  private SprintPlanningAware() {
    super(ISprintPlanningAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.javamodel.ISprintPlanningAware> selectToMePlannedStartSprint(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.javamodel.ISprint object) {
    return _getToMeList(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.javamodel.ISprintPlanningAware.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.ReleasesPackage.SprintPlanningAware_plannedStartSprint, object.getResource());
  }
  
  public static java.util.List<cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.javamodel.ISprintPlanningAware> selectToMePlannedEndSprint(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.javamodel.ISprint object) {
    return _getToMeList(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.javamodel.ISprintPlanningAware.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.ReleasesPackage.SprintPlanningAware_plannedEndSprint, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6578c5b7-c110-11e6-8f58-ad3c6ee7602f,+I5/9Mhl6dMkdqwkzf291ERD1OI=] */
