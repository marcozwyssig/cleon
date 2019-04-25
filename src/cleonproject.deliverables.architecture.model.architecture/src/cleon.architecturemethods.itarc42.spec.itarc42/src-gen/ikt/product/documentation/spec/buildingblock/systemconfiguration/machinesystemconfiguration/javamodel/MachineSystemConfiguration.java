package ikt.product.documentation.spec.buildingblock.systemconfiguration.machinesystemconfiguration.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class MachineSystemConfiguration extends DynamicResource implements IMachineSystemConfiguration {

  // abstract implementation, only used for static method calls
  private MachineSystemConfiguration() {
    super(IMachineSystemConfiguration.TYPE_ID);
  }
  
  // toMeRelations
  
  public static ikt.product.documentation.spec.buildingblock.systemconfiguration.machinesystemconfiguration.javamodel.IMachineSystemConfiguration selectToMeCPUs(ikt.product.documentation.spec.buildingblock.systemconfiguration.machinesystemconfiguration.javamodel.ICPU object) {
    return _getToMeSingle(object.getRepository(), ikt.product.documentation.spec.buildingblock.systemconfiguration.machinesystemconfiguration.javamodel.IMachineSystemConfiguration.class, ikt.product.documentation.spec.buildingblock.systemconfiguration.machinesystemconfiguration.MachinesystemconfigurationPackage.MachineSystemConfiguration_cPUs, object.getResource());
  }
  
  public static ikt.product.documentation.spec.buildingblock.systemconfiguration.machinesystemconfiguration.javamodel.IMachineSystemConfiguration selectToMeDisks(ikt.product.documentation.spec.buildingblock.systemconfiguration.machinesystemconfiguration.javamodel.IDisk object) {
    return _getToMeSingle(object.getRepository(), ikt.product.documentation.spec.buildingblock.systemconfiguration.machinesystemconfiguration.javamodel.IMachineSystemConfiguration.class, ikt.product.documentation.spec.buildingblock.systemconfiguration.machinesystemconfiguration.MachinesystemconfigurationPackage.MachineSystemConfiguration_disks, object.getResource());
  }
  
  public static ikt.product.documentation.spec.buildingblock.systemconfiguration.machinesystemconfiguration.javamodel.IMachineSystemConfiguration selectToMeMemory(ikt.product.documentation.spec.buildingblock.systemconfiguration.machinesystemconfiguration.javamodel.IMemory object) {
    return _getToMeSingle(object.getRepository(), ikt.product.documentation.spec.buildingblock.systemconfiguration.machinesystemconfiguration.javamodel.IMachineSystemConfiguration.class, ikt.product.documentation.spec.buildingblock.systemconfiguration.machinesystemconfiguration.MachinesystemconfigurationPackage.MachineSystemConfiguration_memory, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,57606bcf-2afd-11e9-9692-65766bc2daa5,9bedCL+HbzEMTgJGofCsNNU9wBg=] */
