package cleon.conception.architecture.spec.eamod.chrv.motivation.goals.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class GoalAware extends DynamicResource implements IGoalAware {

  // abstract implementation, only used for static method calls
  private GoalAware() {
    super(IGoalAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.conception.architecture.spec.eamod.chrv.motivation.goals.javamodel.IGoalAware> selectToMeAchieves(cleon.conception.architecture.spec.eamod.chrv.motivation.goals.javamodel.IGoal object) {
    return _getToMeList(object.getRepository(), cleon.conception.architecture.spec.eamod.chrv.motivation.goals.javamodel.IGoalAware.class, cleon.conception.architecture.spec.eamod.chrv.motivation.goals.GoalsPackage.GoalAware_achieves, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,5b7e3e20-0abf-11e6-85a2-61e22bb4d1e3,TFBpAe2Au4P+GClU3l+Kv7E6kH4=] */
