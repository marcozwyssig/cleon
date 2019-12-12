package cleon.projectmethods.hermes.spec.projectmanagement.resource.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IResourceManagementDocument extends cleon.common.doc.doc.spec.document.javamodel.INamedDocument, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.javamodel.IDeliverableAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("a143e996-a7e5-11e5-82dd-3b995d9c840c");
  
  // relations
  
  public cleon.projectmethods.hermes.spec.projectmanagement.resource.organisations.javamodel.IOrganisations selectOrganisations();
  
  public cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.javamodel.IPersons selectPersons();
  
  public cleon.projectmethods.hermes.spec.projectmanagement.resource.skills.javamodel.ISkills selectSkills();
  
  public cleon.projectmethods.hermes.spec.projectmanagement.resource.roles.javamodel.IRoles selectRoles();
  
  public cleon.projectmethods.hermes.spec.projectmanagement.resource.infrastructure.javamodel.IInfrastructure selectInfrastructure();
  
  public cleon.projectmethods.hermes.spec.projectmanagement.resource.locations.javamodel.ILocations selectLocations();
  
  public cleon.projectmethods.hermes.spec.projectmanagement.resource.teams.javamodel.ITeams selectTeams();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,a143e996-a7e5-11e5-82dd-3b995d9c840c,zS6txTdGP60A6YoFI+Ax0wvdVeg=] */
