package cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.hardware.storage.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IStorageSystemConfiguration extends cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.hardware.javamodel.IDeviceSystemConfiguration {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("7fef8e33-8630-11eb-9869-4317e18e6c88");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.hardware.storage.javamodel.IShare> selectShares();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,7fef8e33-8630-11eb-9869-4317e18e6c88,xR9jOy4d6hVDyWgPqHb3w8Kzy7k=] */
