package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.hardware.storage.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IStorageSystemConfiguration extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("7fef8e33-8630-11eb-9869-4317e18e6c88");
  
  // attributes
  
  public java.lang.Integer selectBrutto_aE_capacity_aE__aA_GB_aC_();
  
  public java.lang.Integer selectNetto_aE_capacity_aE__aA_GB_aC_();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.hardware.storage.javamodel.IShare> selectShares();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,7fef8e33-8630-11eb-9869-4317e18e6c88,8y5PfzDj0g6S/oObQySV1gCECn0=] */
