package cleon.architecturemethods.eamod.metamodel.spec.chrv.goals.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class GoalAware extends DynamicResource implements IGoalAware {

  // abstract implementation, only used for static method calls
  private GoalAware() {
    super(IGoalAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.eamod.metamodel.spec.chrv.goals.javamodel.IGoalAware> selectToMeAchieves(cleon.architecturemethods.eamod.metamodel.spec.chrv.goals.javamodel.IGoal object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.chrv.goals.javamodel.IGoalAware.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.goals.GoalsPackage.GoalAware_achieves, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,5b7e3e20-0abf-11e6-85a2-61e22bb4d1e3,nPd8DnJxJM1wBlUmoK9raC6NBKY=] */
