package cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Requirement extends DynamicResource implements IRequirement {

  // abstract implementation, only used for static method calls
  private Requirement() {
    super(IRequirement.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> selectToMeAbstractionLevel(cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.abstraction_level.javamodel.IAbstractionLevel object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement.class, cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_abstractionLevel, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> selectToMeState(cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirementState object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement.class, cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_state, object.getResource());
  }
  
  public static cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement selectToMeAggregates(cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement.class, cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_aggregates, object.getResource());
  }
  
  public static cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement selectToMeConcretizes(cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement.class, cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_concretizes, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> selectToMeConflicts(cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement.class, cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_conflicts, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> selectToMeAchieves(cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.goals.javamodel.IGoal object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement.class, cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_achieves, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> selectToMeOwners(cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.stakeholder.javamodel.IStakeholder object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement.class, cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_owners, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> selectToMeAspectAffectedRequirements(cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement.class, cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_aspectAffectedRequirements, object.getResource());
  }
  
  public static cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement selectToMeAspects(cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirementAspect object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement.class, cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_aspects, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,54365cab-ff9b-11e4-ac0a-959b440f987f,Dgt6PQSPQm4WYemVyPknpZJLU70=] */
