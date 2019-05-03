package cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.machineconfiguration.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDisk_Configuration extends ch.actifsource.core.javamodel.IResource, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("2399830e-2b03-11e9-9692-65766bc2daa5");
  
  // relations
  
  public cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock_view.systemconfiguration.machinesystemconfiguration.javamodel.IMachineSystemConfiguration selectMachineConfiguration();
  
  public cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock_view.systemconfiguration.machinesystemconfiguration.javamodel.IDisk selectDisk();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,2399830e-2b03-11e9-9692-65766bc2daa5,kcY+jNS+wZ6iH8IPELkJAIF6cwc=] */
