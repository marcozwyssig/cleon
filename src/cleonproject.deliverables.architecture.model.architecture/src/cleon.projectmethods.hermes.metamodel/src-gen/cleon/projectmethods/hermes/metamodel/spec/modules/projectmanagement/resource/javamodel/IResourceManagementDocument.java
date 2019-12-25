package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IResourceManagementDocument extends cleon.common.doc.metamodel.spec.document.javamodel.INamedDocument, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverableAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("a143e996-a7e5-11e5-82dd-3b995d9c840c");
  
  // relations
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.organisations.javamodel.IOrganisations selectOrganisations();
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IPersons selectPersons();
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.skills.javamodel.ISkills selectSkills();
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.roles.javamodel.IRoles selectRoles();
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.infrastructure.javamodel.IInfrastructure selectInfrastructure();
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.locations.javamodel.ILocations selectLocations();
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.teams.javamodel.ITeams selectTeams();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,a143e996-a7e5-11e5-82dd-3b995d9c840c,R2cwlC/SDetv1Gkp4UOcSLlxo+w=] */
