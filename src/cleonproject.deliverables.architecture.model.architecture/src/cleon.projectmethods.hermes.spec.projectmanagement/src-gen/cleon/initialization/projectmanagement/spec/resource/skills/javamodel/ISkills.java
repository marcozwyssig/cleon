package cleon.initialization.projectmanagement.spec.resource.skills.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISkills extends cleon.initialization.projectmanagement.spec.resource.javamodel.IResources {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("301e91fc-a7e4-11e5-82dd-3b995d9c840c");
  
  // relations
  
  public java.util.List<? extends cleon.initialization.projectmanagement.spec.resource.skills.javamodel.ISkill> selectSkills();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,301e91fc-a7e4-11e5-82dd-3b995d9c840c,+jHd8j2nS1QFAOAa3q613C6oLsE=] */
