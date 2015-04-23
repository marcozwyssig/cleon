package Cleon.EBP.Spec.Organisational.Unit.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IEnterprise extends Cleon.EBP.Spec.Organisational.Unit.javamodel.IOrganisationGroup {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("fb007daf-ba75-11e3-9206-f19b78f4aff0");
  
  // relations
  
  public Cleon.EBP.Spec.Organisational.Unit.Management.javamodel.IManagement selectManagement();
  
  public Cleon.EBP.Spec.Organisational.Unit.KeyProcess.javamodel.IKeyProcess selectRealisation();
  
  public Cleon.EBP.Spec.Organisational.Unit.Resource.javamodel.IResource selectSupport();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,fb007daf-ba75-11e3-9206-f19b78f4aff0,Q5WbsUmnqkwDdEq3IySWUSUU8/M=] */
