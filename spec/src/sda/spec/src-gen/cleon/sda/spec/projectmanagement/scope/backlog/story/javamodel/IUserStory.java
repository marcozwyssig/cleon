package cleon.sda.spec.projectmanagement.scope.backlog.story.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IUserStory extends ch.actifsource.core.javamodel.IDecorator, cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IWorkItem {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("693cc9f9-ff9c-11e4-ac0a-959b440f987f");
  
  // relations
  
  public cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement selectRequirement();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,693cc9f9-ff9c-11e4-ac0a-959b440f987f,3PhRguCCB7uTI+P+3qTm/vpclyI=] */
