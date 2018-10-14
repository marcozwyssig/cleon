package cleon.projectmethods.hermes.spec.projectmanagement.resource.roles.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRole extends ch.actifsource.core.javamodel.INamedResource, cleon.projectmethods.hermes.spec.projectmanagement.resource.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("ee77c649-bc93-11e6-904c-8bf6f8927ff0");
  
  // relations
  
  public cleon.projectmethods.hermes.spec.projectmanagement.resource.organisations.javamodel.IOrganisation selectOrganisation();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.projectmethods.hermes.spec.projectmanagement.resource.roles.javamodel.ISkillUtilization> selectRequiredSkills();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,ee77c649-bc93-11e6-904c-8bf6f8927ff0,TqEad6gfpjp3iVHGI5gNQN8Wnqw=] */
