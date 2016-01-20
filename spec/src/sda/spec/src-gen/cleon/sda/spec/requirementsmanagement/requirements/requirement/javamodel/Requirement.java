package cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Requirement extends DynamicResource implements IRequirement {

  // abstract implementation, only used for static method calls
  private Requirement() {
    super(IRequirement.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement> selectToMeState(cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IState object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.Requirement_state, object.getResource());
  }
  
  public static cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement selectToMeConcretizes(cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.Requirement_concretizes, object.getResource());
  }
  
  public static cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement selectToMeAggregates(cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.Requirement_aggregates, object.getResource());
  }
  
  public static java.util.List<cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement> selectToMeOriginatesFrom(cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISource object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.Requirement_originatesFrom, object.getResource());
  }
  
  public static java.util.List<cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement> selectToMeAchieves(cleon.sda.spec.requirementsmanagement.motivation.goals.javamodel.IGoal object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.Requirement_achieves, object.getResource());
  }
  
  public static java.util.List<cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement> selectToMeConflicts(cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.Requirement_conflicts, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,54365cab-ff9b-11e4-ac0a-959b440f987f,8OE7tqBXGlL+5kgQ3Lp4GNF/gps=] */
