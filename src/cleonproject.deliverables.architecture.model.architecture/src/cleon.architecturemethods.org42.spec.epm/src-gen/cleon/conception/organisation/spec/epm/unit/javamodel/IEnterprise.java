package cleon.conception.organisation.spec.epm.unit.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IEnterprise extends cleon.initialization.processlanguage.spec.bpmn.organisational.unit.javamodel.IOrganisationGroup {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("fb007daf-ba75-11e3-9206-f19b78f4aff0");
  
  // relations
  
  public cleon.conception.organisation.spec.epm.unit.management.javamodel.IManagement selectManagement();
  
  public cleon.conception.organisation.spec.epm.unit.keyprocess.javamodel.IKeyProcess selectRealisation();
  
  public cleon.conception.organisation.spec.epm.unit.resource.javamodel.IResource selectSupport();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,fb007daf-ba75-11e3-9206-f19b78f4aff0,w8a2dP5NRtuN3UtyJ8eK9NAkZRo=] */
