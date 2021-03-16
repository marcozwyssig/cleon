package cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.hardware.storage.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class StorageSystemConfiguration extends DynamicResource implements IStorageSystemConfiguration {

  // abstract implementation, only used for static method calls
  private StorageSystemConfiguration() {
    super(IStorageSystemConfiguration.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.hardware.storage.javamodel.IStorageSystemConfiguration selectToMeShares(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.hardware.storage.javamodel.IShare object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.hardware.storage.javamodel.IStorageSystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.hardware.storage.StoragePackage.StorageSystemConfiguration_shares, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7fef8e33-8630-11eb-9869-4317e18e6c88,sDMncyV/v82OyXc7Jatj82rYPok=] */
