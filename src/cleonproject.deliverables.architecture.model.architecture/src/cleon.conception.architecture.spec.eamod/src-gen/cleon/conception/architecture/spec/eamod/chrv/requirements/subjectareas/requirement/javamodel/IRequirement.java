package cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRequirement extends cleon.common.doc.spec.doc.chapter.javamodel.INamedChapter, cleon.common.resources.spec.resources.descriptions.javamodel.IMandatoryDescription, cleon.common.doc.spec.doc.document.properties.member.javamodel.IAuthors, cleon.conception.architecture.spec.eamod.chrv.javamodel.INotes, cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IAbstractRequirement, cleon.conception.architecture.spec.eamod.chrv.issues.javamodel.IIssueAware, ch.actifsource.core.javamodel.ICommentable, cleon.conception.architecture.spec.eamod.chrv.motivation.sources.javamodel.ISourceAware, cleon.conception.architecture.spec.eamod.chrv.motivation.goals.javamodel.IGoalAware, cleon.common.resources.spec.resources.priority.javamodel.IPriorityAware, cleon.conception.architecture.spec.eamod.chrv.motivation.stakeholder.javamodel.IStakeholderAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("54365cab-ff9b-11e4-ac0a-959b440f987f");
  
  public java.lang.String selectRejectReason();
  
  public java.lang.String selectReasonBenefitRationale();
  
  public java.lang.String selectRestrictionRisks();
  
  // relations
  
  public cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.abstraction_level.javamodel.IAbstractionLevel selectAbstractionLevel();
  
  public cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirementState selectState();
  
  public java.util.List<? extends cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> selectAggregates();
  
  public java.util.List<? extends cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> selectConcretizes();
  
  public java.util.List<? extends cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> selectConflicts();
  
  public java.util.List<? extends cleon.conception.architecture.spec.eamod.chrv.motivation.goals.javamodel.IGoal> selectAchieves();
  
  public java.util.List<? extends cleon.conception.architecture.spec.eamod.chrv.motivation.stakeholder.javamodel.IStakeholder> selectOwners();
  
  public java.util.List<? extends cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> selectAspectAffectedRequirements();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirementAspect> selectAspects();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,54365cab-ff9b-11e4-ac0a-959b440f987f,6r0qEcbJUQe2XG5GjU2s5/DUvPQ=] */
