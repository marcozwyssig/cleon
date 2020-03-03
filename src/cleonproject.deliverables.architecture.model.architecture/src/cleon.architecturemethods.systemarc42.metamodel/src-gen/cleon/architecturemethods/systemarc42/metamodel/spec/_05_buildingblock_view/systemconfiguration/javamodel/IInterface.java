package cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IInterface extends ch.actifsource.core.javamodel.IResource, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("eb46c268-b371-11e9-91da-d1f3b9a7fba4");
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.javamodel.IInterfaceType selectInterfaceType();
  
  public cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone selectInterfaceInSecuritySubZone();
  
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService> selectProvidesService();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,eb46c268-b371-11e9-91da-d1f3b9a7fba4,iqC/jB29wMu0akFSGqGftfzsTAs=] */
