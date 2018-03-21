package cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRequirement extends cleon.common.doc.spec.doc.chapter.javamodel.INamedChapter, cleon.common.resources.spec.resources.id.javamodel.IBusinessObjectId, cleon.common.resources.spec.resources.descriptions.javamodel.IMandatoryDescription, cleon.conception.eamod.spec.chrv.javamodel.INotes, cleon.conception.eamod.spec.chrv.javamodel.IRequirementDocument, cleon.common.doc.spec.doc.document.properties.member.javamodel.IAuthors, cleon.conception.eamod.spec.chrv.issues.javamodel.IIssueAware, ch.actifsource.core.javamodel.ICommentable, cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IEffortAware, cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISourceAware, cleon.conception.eamod.spec.chrv.motivation.goals.javamodel.IGoalAware, cleon.common.resources.spec.resources.priority.javamodel.IPriorityAware, cleon.conception.eamod.spec.chrv.motivation.stakeholder.javamodel.IStakeholderAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("54365cab-ff9b-11e4-ac0a-959b440f987f");
  
  public java.lang.String selectRejectReason();
  
  public java.lang.String selectReasonBenefitRationale();
  
  public java.lang.String selectRestrictionRisks();
  
  // relations
  
  public cleon.conception.eamod.spec.chrv.requirements.subjectareas.abstraction_level.javamodel.IAbstractionLevel selectAbstractionLevel();
  
  public cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirementState selectState();
  
  public java.util.List<? extends cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> selectConcretizes();
  
  public java.util.List<? extends cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> selectAggregates();
  
  public java.util.List<? extends cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> selectConflicts();
  
  public java.util.List<? extends cleon.conception.eamod.spec.chrv.motivation.goals.javamodel.IGoal> selectAchieves();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,54365cab-ff9b-11e4-ac0a-959b440f987f,9Ya5TEEpLSHq+7AioUByG/scdK0=] */