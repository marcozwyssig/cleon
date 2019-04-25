package cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.machineconfiguration.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class CPU_Configuration extends DynamicResource implements ICPU_Configuration {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICPU_Configuration> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICPU_Configuration>() {
    
    @Override
    public ICPU_Configuration create() {
      return new CPU_Configuration();
    }
    
    @Override
    public ICPU_Configuration create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new CPU_Configuration(resourceRepository, resource);
    }
  
  };

  public CPU_Configuration() {
    super(ICPU_Configuration.TYPE_ID);
  }
  
  public CPU_Configuration(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICPU_Configuration.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.systemconfiguration.machinesystemconfiguration.javamodel.ICore selectCore() {
    return _getSingle(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.systemconfiguration.machinesystemconfiguration.javamodel.ICore.class, cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.machineconfiguration.MachineconfigurationPackage.CPU_aE_Configuration_core);
  }

  public CPU_Configuration setCore(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.systemconfiguration.machinesystemconfiguration.javamodel.ICore core) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.machineconfiguration.MachineconfigurationPackage.CPU_aE_Configuration_core, core);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.systemconfiguration.machinesystemconfiguration.javamodel.ICPU selectCpu() {
    return _getSingle(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.systemconfiguration.machinesystemconfiguration.javamodel.ICPU.class, cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.machineconfiguration.MachineconfigurationPackage.CPU_aE_Configuration_cpu);
  }

  public CPU_Configuration setCpu(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.systemconfiguration.machinesystemconfiguration.javamodel.ICPU cpu) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.machineconfiguration.MachineconfigurationPackage.CPU_aE_Configuration_cpu, cpu);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.systemconfiguration.machinesystemconfiguration.javamodel.IMachineSystemConfiguration selectMachineConfiguration() {
    return _getSingle(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.systemconfiguration.machinesystemconfiguration.javamodel.IMachineSystemConfiguration.class, cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.machineconfiguration.MachineconfigurationPackage.CPU_aE_Configuration_machineConfiguration);
  }

  public CPU_Configuration setMachineConfiguration(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.systemconfiguration.machinesystemconfiguration.javamodel.IMachineSystemConfiguration machineConfiguration) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.machineconfiguration.MachineconfigurationPackage.CPU_aE_Configuration_machineConfiguration, machineConfiguration);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public CPU_Configuration setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public CPU_Configuration setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.systemconfiguration.machinesystemconfiguration.javamodel.ICore.class, cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.machineconfiguration.MachineconfigurationPackage.CPU_aE_Configuration_core, visitor);
    _acceptSingle(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.systemconfiguration.machinesystemconfiguration.javamodel.ICPU.class, cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.machineconfiguration.MachineconfigurationPackage.CPU_aE_Configuration_cpu, visitor);
    _acceptSingle(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.systemconfiguration.machinesystemconfiguration.javamodel.IMachineSystemConfiguration.class, cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.machineconfiguration.MachineconfigurationPackage.CPU_aE_Configuration_machineConfiguration, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.machineconfiguration.javamodel.ICPU_Configuration> selectToMeMachineConfiguration(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.systemconfiguration.machinesystemconfiguration.javamodel.IMachineSystemConfiguration object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.machineconfiguration.javamodel.ICPU_Configuration.class, cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.machineconfiguration.MachineconfigurationPackage.CPU_aE_Configuration_machineConfiguration, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.machineconfiguration.javamodel.ICPU_Configuration> selectToMeCpu(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.systemconfiguration.machinesystemconfiguration.javamodel.ICPU object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.machineconfiguration.javamodel.ICPU_Configuration.class, cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.machineconfiguration.MachineconfigurationPackage.CPU_aE_Configuration_cpu, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.machineconfiguration.javamodel.ICPU_Configuration> selectToMeCore(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.systemconfiguration.machinesystemconfiguration.javamodel.ICore object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.machineconfiguration.javamodel.ICPU_Configuration.class, cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.buildnode.machineconfiguration.MachineconfigurationPackage.CPU_aE_Configuration_core, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8afbac91-2afe-11e9-9692-65766bc2daa5,S4E8vYzPgERxZ7Pl3J/pjBKEKZI=] */
