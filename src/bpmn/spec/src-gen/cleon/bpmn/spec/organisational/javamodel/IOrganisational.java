package cleon.bpmn.spec.organisational.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IOrganisational extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("d3a168b2-daa0-11e3-aefe-17a44e29631e");
  
  // relations
  
  public java.util.List<? extends cleon.bpmn.spec.organisational.role.javamodel.IRole> selectRoles();
  
  public cleon.bpmn.spec.organisational.unit.javamodel.IOrganisationUnit selectOrganisation();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,d3a168b2-daa0-11e3-aefe-17a44e29631e,9m4/wunNrxvN5jWXsp/xVu7XNwQ=] */
