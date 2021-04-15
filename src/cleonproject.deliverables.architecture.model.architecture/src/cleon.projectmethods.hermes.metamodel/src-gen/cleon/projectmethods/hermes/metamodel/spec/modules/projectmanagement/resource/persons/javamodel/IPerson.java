package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IPerson extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.javamodel.IResource, cleon.common.doc.metamodel.spec.document.properties.member.javamodel.IMember, cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("9bfc0d2c-ff9e-11e4-ac0a-959b440f987f");
  
  // attributes
  
  public java.lang.String selectId();
  
  public java.lang.String selectFirstname();
  
  public java.lang.String selectSurname();
  
  public java.lang.String selectShortname();
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.absence.javamodel.IAbsences selectAbsences();
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.organisations.javamodel.IOrganisation selectOrganisation();
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.experience.javamodel.IExperiences selectExperiences();
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.roles.javamodel.IRoles selectRoles();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,9bfc0d2c-ff9e-11e4-ac0a-959b440f987f,q7locIVK9Cw3+HkmboBcyPOSat8=] */
