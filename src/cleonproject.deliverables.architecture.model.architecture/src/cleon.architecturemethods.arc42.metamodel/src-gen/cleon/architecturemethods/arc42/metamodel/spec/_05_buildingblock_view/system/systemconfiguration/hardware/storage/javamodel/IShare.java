package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.hardware.storage.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IShare extends ch.actifsource.core.javamodel.INamedResource, cleon.common.resources.metamodel.spec.descriptions.javamodel.IMandatoryDescription, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfigurationProperty {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("cd115808-8630-11eb-9869-4317e18e6c88");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.hardware.storage.javamodel.ICapacity selectCapacity();
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.hardware.storage.javamodel.IProtocol selectProtocol();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,cd115808-8630-11eb-9869-4317e18e6c88,AY6dRkmStJ/xw02OTGWEFdlliwk=] */
