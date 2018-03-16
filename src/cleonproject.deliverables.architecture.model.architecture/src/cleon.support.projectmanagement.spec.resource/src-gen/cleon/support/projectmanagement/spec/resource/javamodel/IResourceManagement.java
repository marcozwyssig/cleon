package cleon.support.projectmanagement.spec.resource.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IResourceManagement extends cleon.common.doc.spec.doc.document.javamodel.INamedDocument {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("a143e996-a7e5-11e5-82dd-3b995d9c840c");
  
  // relations
  
  public cleon.support.projectmanagement.spec.resource.organisations.javamodel.IOrganisations selectOrganisations();
  
  public cleon.support.projectmanagement.spec.resource.persons.javamodel.IPersons selectPersons();
  
  public cleon.support.projectmanagement.spec.resource.skills.javamodel.ISkills selectSkills();
  
  public cleon.support.projectmanagement.spec.resource.infrastructure.javamodel.IInfrastructure selectInfrastructure();
  
  public cleon.support.projectmanagement.spec.resource.locations.javamodel.ILocations selectLocations();
  
  public cleon.support.projectmanagement.spec.resource.teams.javamodel.ITeams selectTeams();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,a143e996-a7e5-11e5-82dd-3b995d9c840c,Ka+Co1Myv+ruHSDRIhyS8D/W2K4=] */
