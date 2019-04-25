package cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.systemconfiguration.machinesystemconfiguration.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IMachineSystemConfiguration extends cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.systemconfiguration.javamodel.IAbstractSystemConfiguration {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("57606bcf-2afd-11e9-9692-65766bc2daa5");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.systemconfiguration.machinesystemconfiguration.javamodel.ICPU> selectCPUs();
  
  public java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.systemconfiguration.machinesystemconfiguration.javamodel.IDisk> selectDisks();
  
  public java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.systemconfiguration.machinesystemconfiguration.javamodel.IMemory> selectMemory();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,57606bcf-2afd-11e9-9692-65766bc2daa5,ZPo1XfMMbgPE0q760a5BfJ7mu0s=] */
