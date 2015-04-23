package Cleon.EBP.Spec.Organisational.Unit.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IOrganisationGroup extends Cleon.EBP.Spec.Organisational.Unit.javamodel.IOrganisationUnit {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("a7b9016a-ba7b-11e3-9206-f19b78f4aff0");
  
  // relations
  
  public java.util.List<? extends Cleon.EBP.Spec.Organisational.Unit.javamodel.IOrganisationUnit> selectSubOrganisations();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,a7b9016a-ba7b-11e3-9206-f19b78f4aff0,yel3h3OJXuYQKb4WBnPcCdrc+c4=] */
