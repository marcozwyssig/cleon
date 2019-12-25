package cleon.architecturemethods.itarc42.metamodel.spec.buildingblock_view.systemconfiguration.machine.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IMachineSystemConfiguration extends cleon.architecturemethods.itarc42.metamodel.spec.buildingblock_view.javamodel.ISystemConfiguration {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("57606bcf-2afd-11e9-9692-65766bc2daa5");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.itarc42.metamodel.spec.buildingblock_view.systemconfiguration.machine.javamodel.ICPU> selectCPUs();
  
  public java.util.List<? extends cleon.architecturemethods.itarc42.metamodel.spec.buildingblock_view.systemconfiguration.machine.javamodel.IDisk> selectDisks();
  
  public java.util.List<? extends cleon.architecturemethods.itarc42.metamodel.spec.buildingblock_view.systemconfiguration.machine.javamodel.IMemory> selectMemory();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,57606bcf-2afd-11e9-9692-65766bc2daa5,P23Y/6Vpin0lQmrnD0qF7Z4lGkw=] */
