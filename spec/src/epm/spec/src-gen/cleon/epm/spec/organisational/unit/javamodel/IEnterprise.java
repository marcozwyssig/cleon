package cleon.epm.spec.organisational.unit.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IEnterprise extends cleon.bpmn.spec.organisational.unit.javamodel.IOrganisationGroup {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("fb007daf-ba75-11e3-9206-f19b78f4aff0");
  
  // relations
  
  public cleon.epm.spec.organisational.unit.management.javamodel.IManagement selectManagement();
  
  public cleon.epm.spec.organisational.unit.keyprocess.javamodel.IKeyProcess selectRealisation();
  
  public cleon.epm.spec.organisational.unit.resource.javamodel.IResource selectSupport();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,fb007daf-ba75-11e3-9206-f19b78f4aff0,DRp9Lpex99bdlft9Ahfy09C0Trk=] */
