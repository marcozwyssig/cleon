package cleon.sda.spec.projectmanagement.resourcemanagement.locations.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ILocations extends cleon.sda.spec.projectmanagement.resourcemanagement.javamodel.IResources, cleon.doc.spec.chapter.javamodel.INoChapters {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("0de22a0b-c768-11e5-b3f9-43c5a0896ea1");
  
  // relations
  
  public java.util.List<? extends cleon.sda.spec.projectmanagement.resourcemanagement.locations.javamodel.ILocation> selectLocations();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,0de22a0b-c768-11e5-b3f9-43c5a0896ea1,x8Ag7yLbyKCmXE8S7B61iRON3yU=] */
