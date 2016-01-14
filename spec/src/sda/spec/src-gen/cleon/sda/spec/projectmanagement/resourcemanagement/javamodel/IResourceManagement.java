package cleon.sda.spec.projectmanagement.resourcemanagement.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IResourceManagement extends cleon.doc.spec.document.javamodel.ISubDocument, cleon.doc.spec.document.javamodel.INoSubDocuments, cleon.sda.spec.projectmanagement.javamodel.IProjectDocument {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("a143e996-a7e5-11e5-82dd-3b995d9c840c");
  
  // relations
  
  public cleon.sda.spec.projectmanagement.resourcemanagement.skills.javamodel.ISkills selectSkills();
  
  public cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPersons selectPersons();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,a143e996-a7e5-11e5-82dd-3b995d9c840c,nKlB6ATZZ9ZXN5q27NP/rS4RElI=] */
