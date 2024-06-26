package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Outcome extends DynamicResource implements IOutcome {

  // abstract implementation, only used for static method calls
  private Outcome() {
    super(IOutcome.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.javamodel.IOutcome selectToMeDependsOn(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.javamodel.IOutcomeDependency object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.javamodel.IOutcome.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.OutcomesPackage.Outcome_dependsOn, object.getResource());
  }
  
  public static java.util.List<cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.javamodel.IOutcome> selectToMeDeadlines(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.targetdates.javamodel.IDeadline object) {
    return _getToMeList(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.javamodel.IOutcome.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.OutcomesPackage.Outcome_deadlines, object.getResource());
  }
  
  public static java.util.List<cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.javamodel.IOutcome> selectToMeDeliverable(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable object) {
    return _getToMeList(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.javamodel.IOutcome.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.OutcomesPackage.Outcome_deliverable, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ffbb7b2a-b53c-11e5-bc0c-f35b68c3609a,0V9uxrBgmgs7sVCCmwnjYBMazUs=] */
