package cleon.initialization.processlanguage.spec.bpmn.organisational.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IOrganisational extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("d3a168b2-daa0-11e3-aefe-17a44e29631e");
  
  // relations
  
  public java.util.List<? extends cleon.initialization.processlanguage.spec.bpmn.organisational.role.javamodel.IRole> selectRoles();
  
  public cleon.initialization.processlanguage.spec.bpmn.organisational.unit.javamodel.IOrganisationUnit selectOrganisation();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,d3a168b2-daa0-11e3-aefe-17a44e29631e,gNlLKswZCw7EJOuQdznKcX/8fQo=] */
