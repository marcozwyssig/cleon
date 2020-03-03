package cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDestinationSubSecurityZone extends ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("2c509b70-b218-11e9-b89e-1728aee30149");
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.javamodel.IInterface selectUsedInterface();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> selectHasCommunicationFrom();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,2c509b70-b218-11e9-b89e-1728aee30149,cX/CEVJjT5X4XCmyxBVGVYohAsQ=] */
