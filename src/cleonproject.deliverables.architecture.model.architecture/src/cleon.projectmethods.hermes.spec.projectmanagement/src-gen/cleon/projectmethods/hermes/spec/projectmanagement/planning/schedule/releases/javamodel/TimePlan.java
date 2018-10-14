package cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class TimePlan extends DynamicResource implements ITimePlan {

  // abstract implementation, only used for static method calls
  private TimePlan() {
    super(ITimePlan.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.javamodel.ITimePlan> selectToMeStart(cleon.common.resources.spec.calendar.javamodel.IDay object) {
    return _getToMeList(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.javamodel.ITimePlan.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.ReleasesPackage.TimePlan_start, object.getResource());
  }
  
  public static java.util.List<cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.javamodel.ITimePlan> selectToMeEnd(cleon.common.resources.spec.calendar.javamodel.IDay object) {
    return _getToMeList(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.javamodel.ITimePlan.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.ReleasesPackage.TimePlan_end, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3c633cfe-3761-11e5-95d9-2b04d7ab02d9,JzZCJHSU8isXvPGvsJW6REjw+xc=] */
