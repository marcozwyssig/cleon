package cleon.support.projectmanagement.spec.planning.organisation.roles.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISkillUtilization extends ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("d6b26118-b54a-11e5-bc0c-f35b68c3609a");
  
  // relations
  
  public cleon.support.projectmanagement.spec.resource.skills.javamodel.ISkill selectSkill();
  
  public cleon.common.resources.spec.resources.importance.javamodel.IImportance selectImportance();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,d6b26118-b54a-11e5-bc0c-f35b68c3609a,LOLCBKpJ9Y6Kvu6hEqxz0Hhlgs8=] */
