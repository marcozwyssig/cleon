package cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IPerson extends cleon.projectmethods.hermes.spec.projectmanagement.resource.javamodel.IResource, cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember, cleon.common.doc.spec.doc.chapter.javamodel.IChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("9bfc0d2c-ff9e-11e4-ac0a-959b440f987f");
  
  // attributes
  
  public java.lang.String selectFirstname();
  
  public java.lang.String selectSurname();
  
  public java.lang.String selectShortname();
  
  public cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.absence.javamodel.IAbsences selectAbsences();
  
  public cleon.projectmethods.hermes.spec.projectmanagement.resource.organisations.javamodel.IOrganisation selectOrganisation();
  
  public cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.experience.javamodel.IExperiences selectExperiences();
  
  public cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.roles.javamodel.IRoles selectRoles();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,9bfc0d2c-ff9e-11e4-ac0a-959b440f987f,4lpB2GM7LYD0gt7ZUQCXVuiLUgM=] */
