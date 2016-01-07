package cleon.sda.spec.projectmanagement.scope.outcome.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRequiredSkills extends ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("d6b26118-b54a-11e5-bc0c-f35b68c3609a");
  
  // relations
  
  public cleon.sda.spec.projectmanagement.resourcemanagement.skills.javamodel.ISkill selectSkill();
  
  public cleon.sda.spec.analysis.solution.drivers.javamodel.IGoalImportance selectImportance();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,d6b26118-b54a-11e5-bc0c-f35b68c3609a,Quig/mG+bxjvj2jaorOuI9Byn8U=] */
