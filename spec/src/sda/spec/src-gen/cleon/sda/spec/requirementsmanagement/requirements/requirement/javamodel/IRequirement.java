package cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRequirement extends cleon.sda.spec.javamodel.IBusinessObjectId, cleon.doc.spec.document.javamodel.INamedSubDocument, cleon.sda.spec.requirementsmanagement.javamodel.INotes, cleon.sda.spec.requirementsmanagement.javamodel.IRequirementDocument, cleon.doc.spec.autor.javamodel.IAutors, cleon.doc.spec.paragraph.javamodel.INoParagraph, cleon.sda.spec.requirementsmanagement.issues.javamodel.IIssueAware, ch.actifsource.core.javamodel.ICommentable {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("54365cab-ff9b-11e4-ac0a-959b440f987f");
  
  // attributes
  
  public java.util.List<java.lang.String> selectDescriptions();
  
  public java.lang.String selectRejectReason();
  
  public cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IState selectState();
  
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement> selectConcretizes();
  
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement> selectAggregates();
  
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISource> selectOriginatesFrom();
  
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.goals.javamodel.IGoal> selectAchieves();
  
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement> selectConflicts();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,54365cab-ff9b-11e4-ac0a-959b440f987f,/Y8OZom7hfAf0akVk8Qbv7FrYjE=] */
