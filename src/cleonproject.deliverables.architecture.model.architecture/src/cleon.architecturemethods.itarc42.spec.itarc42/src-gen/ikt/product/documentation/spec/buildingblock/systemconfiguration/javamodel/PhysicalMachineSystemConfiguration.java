package ikt.product.documentation.spec.buildingblock.systemconfiguration.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class PhysicalMachineSystemConfiguration extends DynamicResource implements IPhysicalMachineSystemConfiguration {

  // abstract implementation, only used for static method calls
  private PhysicalMachineSystemConfiguration() {
    super(IPhysicalMachineSystemConfiguration.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,79488947-2afd-11e9-9692-65766bc2daa5,vEtfQV/dsv8SL4ZbKF1g+F3LDio=] */
