package cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IExperience extends ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("2ba27c0a-b509-11e5-aa95-235930e9af3d");
  
  // relations
  
  public cleon.sda.spec.projectmanagement.resourcemanagement.skills.javamodel.ISkill selectSkill();
  
  public cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IMaturity selectMaturity();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,2ba27c0a-b509-11e5-aa95-235930e9af3d,hIczRK0mzyn/wotO43LdSlNmXvk=] */
