package cleon.sda.spec.projectmanagement.resourcemanagement.organisations.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IOrganisation extends ch.actifsource.core.javamodel.INamedResource, cleon.sda.spec.projectmanagement.resourcemanagement.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("cbb98f3c-c768-11e5-b3f9-43c5a0896ea1");
  
  // relations
  
  public java.util.List<? extends cleon.sda.spec.projectmanagement.resourcemanagement.organisations.javamodel.IOrganisation> selectSubOrganisation();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,cbb98f3c-c768-11e5-b3f9-43c5a0896ea1,sac23Db0VLvjyMkX4ODF5SlglPQ=] */
