package cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRequirement extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractNamedChapter, cleon.common.resources.metamodel.spec.descriptions.javamodel.ISimpleDescription, cleon.common.doc.metamodel.spec.document.properties.member.javamodel.IAuthors, cleon.architecturemethods.eamod.metamodel.spec.chrv.javamodel.INotes, cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IAbstractRequirement, cleon.architecturemethods.eamod.metamodel.spec.chrv.issues.javamodel.IIssueAware, ch.actifsource.core.javamodel.ICommentable, cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.sources.javamodel.ISourceAware, cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.goals.javamodel.IGoalAware, cleon.common.resources.metamodel.spec.priority.javamodel.IPriorityAware, cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.stakeholder.javamodel.IStakeholderAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("54365cab-ff9b-11e4-ac0a-959b440f987f");
  
  public java.lang.String selectRejectReason();
  
  public java.lang.String selectReasonBenefitRationale();
  
  public java.lang.String selectRestrictionRisks();
  
  // relations
  
  public cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.abstraction_level.javamodel.IAbstractionLevel selectAbstractionLevel();
  
  public cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirementState selectState();
  
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> selectConcretizes();
  
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> selectConflicts();
  
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> selectSupplement();
  
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.goals.javamodel.IGoal> selectAchieves();
  
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.stakeholder.javamodel.IStakeholder> selectOwners();
  
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> selectAspectAffectedRequirements();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirementAspect> selectAspects();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,54365cab-ff9b-11e4-ac0a-959b440f987f,x1i79Co7HfU729tdyamj+jJ1Pjg=] */
