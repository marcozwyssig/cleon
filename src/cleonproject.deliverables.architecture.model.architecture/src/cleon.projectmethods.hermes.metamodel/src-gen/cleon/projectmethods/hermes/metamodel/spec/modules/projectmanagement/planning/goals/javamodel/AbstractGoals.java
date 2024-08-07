package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.goals.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractGoals extends DynamicResource implements IAbstractGoals {

  // abstract implementation, only used for static method calls
  private AbstractGoals() {
    super(IAbstractGoals.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.goals.javamodel.IAbstractGoals selectToMeGoals(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.goals.javamodel.IGoal object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.goals.javamodel.IAbstractGoals.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.goals.GoalsPackage.AbstractGoals_goals, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8d4d4ef7-210f-11e8-9bf6-d910b575bad9,2Vm7azCz0o9308b/olxupzQShUA=] */
