package cleon.sda.spec.projectmanagement.resourcemanagement.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IResourceManagement extends cleon.doc.spec.document.javamodel.IDocument, cleon.doc.spec.document.javamodel.INoSubDocuments, cleon.sda.spec.projectmanagement.javamodel.IProjectDocument {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("a143e996-a7e5-11e5-82dd-3b995d9c840c");
  
  // relations
  
  public cleon.sda.spec.projectmanagement.resourcemanagement.organisations.javamodel.IOrganisations selectOrganisations();
  
  public cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPersons selectPersons();
  
  public cleon.sda.spec.projectmanagement.resourcemanagement.skills.javamodel.ISkills selectSkills();
  
  public cleon.sda.spec.projectmanagement.resourcemanagement.tools.javamodel.ITools selectTools();
  
  public cleon.sda.spec.projectmanagement.resourcemanagement.locations.javamodel.ILocations selectLocations();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,a143e996-a7e5-11e5-82dd-3b995d9c840c,JbiT32T3kG7F9RCfEzYTSQ3atI4=] */
