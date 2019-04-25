package ikt.product.documentation.spec.deployment.environment.node.buildnode.machineconfiguration.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Disk_Configuration extends DynamicResource implements IDisk_Configuration {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDisk_Configuration> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDisk_Configuration>() {
    
    @Override
    public IDisk_Configuration create() {
      return new Disk_Configuration();
    }
    
    @Override
    public IDisk_Configuration create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Disk_Configuration(resourceRepository, resource);
    }
  
  };

  public Disk_Configuration() {
    super(IDisk_Configuration.TYPE_ID);
  }
  
  public Disk_Configuration(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDisk_Configuration.TYPE_ID);
  }

  // relations
  
  @Override
  public ikt.product.documentation.spec.buildingblock.systemconfiguration.machinesystemconfiguration.javamodel.IDisk selectDisk() {
    return _getSingle(ikt.product.documentation.spec.buildingblock.systemconfiguration.machinesystemconfiguration.javamodel.IDisk.class, ikt.product.documentation.spec.deployment.environment.node.buildnode.machineconfiguration.MachineconfigurationPackage.Disk_aE_Configuration_disk);
  }

  public Disk_Configuration setDisk(ikt.product.documentation.spec.buildingblock.systemconfiguration.machinesystemconfiguration.javamodel.IDisk disk) {
    _setSingle(ikt.product.documentation.spec.deployment.environment.node.buildnode.machineconfiguration.MachineconfigurationPackage.Disk_aE_Configuration_disk, disk);
    return this;
  }
    
  @Override
  public ikt.product.documentation.spec.buildingblock.systemconfiguration.machinesystemconfiguration.javamodel.IMachineSystemConfiguration selectMachineConfiguration() {
    return _getSingle(ikt.product.documentation.spec.buildingblock.systemconfiguration.machinesystemconfiguration.javamodel.IMachineSystemConfiguration.class, ikt.product.documentation.spec.deployment.environment.node.buildnode.machineconfiguration.MachineconfigurationPackage.Disk_aE_Configuration_machineConfiguration);
  }

  public Disk_Configuration setMachineConfiguration(ikt.product.documentation.spec.buildingblock.systemconfiguration.machinesystemconfiguration.javamodel.IMachineSystemConfiguration machineConfiguration) {
    _setSingle(ikt.product.documentation.spec.deployment.environment.node.buildnode.machineconfiguration.MachineconfigurationPackage.Disk_aE_Configuration_machineConfiguration, machineConfiguration);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public Disk_Configuration setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Disk_Configuration setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(ikt.product.documentation.spec.buildingblock.systemconfiguration.machinesystemconfiguration.javamodel.IDisk.class, ikt.product.documentation.spec.deployment.environment.node.buildnode.machineconfiguration.MachineconfigurationPackage.Disk_aE_Configuration_disk, visitor);
    _acceptSingle(ikt.product.documentation.spec.buildingblock.systemconfiguration.machinesystemconfiguration.javamodel.IMachineSystemConfiguration.class, ikt.product.documentation.spec.deployment.environment.node.buildnode.machineconfiguration.MachineconfigurationPackage.Disk_aE_Configuration_machineConfiguration, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<ikt.product.documentation.spec.deployment.environment.node.buildnode.machineconfiguration.javamodel.IDisk_Configuration> selectToMeMachineConfiguration(ikt.product.documentation.spec.buildingblock.systemconfiguration.machinesystemconfiguration.javamodel.IMachineSystemConfiguration object) {
    return _getToMeList(object.getRepository(), ikt.product.documentation.spec.deployment.environment.node.buildnode.machineconfiguration.javamodel.IDisk_Configuration.class, ikt.product.documentation.spec.deployment.environment.node.buildnode.machineconfiguration.MachineconfigurationPackage.Disk_aE_Configuration_machineConfiguration, object.getResource());
  }
  
  public static java.util.List<ikt.product.documentation.spec.deployment.environment.node.buildnode.machineconfiguration.javamodel.IDisk_Configuration> selectToMeDisk(ikt.product.documentation.spec.buildingblock.systemconfiguration.machinesystemconfiguration.javamodel.IDisk object) {
    return _getToMeList(object.getRepository(), ikt.product.documentation.spec.deployment.environment.node.buildnode.machineconfiguration.javamodel.IDisk_Configuration.class, ikt.product.documentation.spec.deployment.environment.node.buildnode.machineconfiguration.MachineconfigurationPackage.Disk_aE_Configuration_disk, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2399830e-2b03-11e9-9692-65766bc2daa5,wrsEKOWpVK1YigwWgA4u4Ajp+i8=] */
