package cleon.applications.actifsource.metamodel.spec.system.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IPackage extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("5ebf28c6-46d0-11eb-b318-ab9601344039");
  
  // relations
  
  public java.util.List<? extends cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IExportPackage> selectUsedIn();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,5ebf28c6-46d0-11eb-b318-ab9601344039,LArQJAour5/hQUSImE5Ifmq0xL4=] */
