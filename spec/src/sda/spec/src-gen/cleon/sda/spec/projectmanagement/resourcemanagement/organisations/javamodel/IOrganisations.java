package cleon.sda.spec.projectmanagement.resourcemanagement.organisations.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IOrganisations extends cleon.sda.spec.projectmanagement.resourcemanagement.javamodel.IResources, cleon.doc.spec.chapter.javamodel.INoChapters {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("b766ec40-c768-11e5-b3f9-43c5a0896ea1");
  
  // relations
  
  public java.util.List<? extends cleon.sda.spec.projectmanagement.resourcemanagement.organisations.javamodel.IOrganisation> selectOrganisations();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,b766ec40-c768-11e5-b3f9-43c5a0896ea1,0t97Bz3EmZf9iAcGGsXrT5w8gHo=] */
