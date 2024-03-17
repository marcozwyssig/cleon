package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IInterface extends ch.actifsource.core.javamodel.IResource, ch.actifsource.core.javamodel.IDecorator, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IGenericShortNameAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("eb46c268-b371-11e9-91da-d1f3b9a7fba4");
  
  public java.lang.Integer selectVlan();
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.IInterfaceType selectInterfaceType();
  
  public cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone selectInterfaceInSecuritySubZone();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IAbstractService> selectProvidesService();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,eb46c268-b371-11e9-91da-d1f3b9a7fba4,fNmfHaykepLP4ObTmFCpoCukCnM=] */
