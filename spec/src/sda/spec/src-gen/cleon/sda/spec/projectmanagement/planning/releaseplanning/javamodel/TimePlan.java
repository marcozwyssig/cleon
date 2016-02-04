package cleon.sda.spec.projectmanagement.planning.releaseplanning.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class TimePlan extends DynamicResource implements ITimePlan {

  // abstract implementation, only used for static method calls
  private TimePlan() {
    super(ITimePlan.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.sda.spec.projectmanagement.planning.releaseplanning.javamodel.ITimePlan> selectToMeStart(cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.projectmanagement.planning.releaseplanning.javamodel.ITimePlan.class, cleon.sda.spec.projectmanagement.planning.releaseplanning.ReleaseplanningPackage.TimePlan_start, object.getResource());
  }
  
  public static cleon.sda.spec.projectmanagement.planning.releaseplanning.javamodel.ITimePlan selectToMeEnd(cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.projectmanagement.planning.releaseplanning.javamodel.ITimePlan.class, cleon.sda.spec.projectmanagement.planning.releaseplanning.ReleaseplanningPackage.TimePlan_end, object.getResource());
  }
  
  public static java.util.List<cleon.sda.spec.projectmanagement.planning.releaseplanning.javamodel.ITimePlan> selectToMeState(cleon.sda.spec.javamodel.IWorkState object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.projectmanagement.planning.releaseplanning.javamodel.ITimePlan.class, cleon.sda.spec.projectmanagement.planning.releaseplanning.ReleaseplanningPackage.TimePlan_state, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3c633cfe-3761-11e5-95d9-2b04d7ab02d9,fXHT+VFTqAZ5Cu9hGPWDXfNP64E=] */
