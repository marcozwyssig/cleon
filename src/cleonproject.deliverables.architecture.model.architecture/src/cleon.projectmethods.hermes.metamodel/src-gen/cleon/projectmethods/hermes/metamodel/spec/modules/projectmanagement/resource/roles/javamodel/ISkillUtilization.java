package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.roles.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISkillUtilization extends ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("d6b26118-b54a-11e5-bc0c-f35b68c3609a");
  
  // relations
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.skills.javamodel.ISkill selectSkill();
  
  public cleon.common.resources.metamodel.spec.importance.javamodel.IImportance selectImportance();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,d6b26118-b54a-11e5-bc0c-f35b68c3609a,fMZnQM7crFIZXiVlGgjDOYPXP9o=] */
