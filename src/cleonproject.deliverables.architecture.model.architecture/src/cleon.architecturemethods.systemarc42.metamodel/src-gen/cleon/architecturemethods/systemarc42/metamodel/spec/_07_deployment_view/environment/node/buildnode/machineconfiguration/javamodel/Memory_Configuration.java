package cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.machineconfiguration.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Memory_Configuration extends DynamicResource implements IMemory_Configuration {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMemory_Configuration> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMemory_Configuration>() {
    
    @Override
    public IMemory_Configuration create() {
      return new Memory_Configuration();
    }
    
    @Override
    public IMemory_Configuration create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Memory_Configuration(resourceRepository, resource);
    }
  
  };

  public Memory_Configuration() {
    super(IMemory_Configuration.TYPE_ID);
  }
  
  public Memory_Configuration(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IMemory_Configuration.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.machine.javamodel.IMachineSystemConfiguration selectMachineConfiguration() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.machine.javamodel.IMachineSystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.machineconfiguration.MachineconfigurationPackage.Memory_aE_Configuration_machineConfiguration);
  }

  public Memory_Configuration setMachineConfiguration(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.machine.javamodel.IMachineSystemConfiguration machineConfiguration) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.machineconfiguration.MachineconfigurationPackage.Memory_aE_Configuration_machineConfiguration, machineConfiguration);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.buildingblock.javamodel.IMemory selectMemory() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.buildingblock.javamodel.IMemory.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.machineconfiguration.MachineconfigurationPackage.Memory_aE_Configuration_memory);
  }

  public Memory_Configuration setMemory(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.buildingblock.javamodel.IMemory memory) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.machineconfiguration.MachineconfigurationPackage.Memory_aE_Configuration_memory, memory);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public Memory_Configuration setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Memory_Configuration setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.machine.javamodel.IMachineSystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.machineconfiguration.MachineconfigurationPackage.Memory_aE_Configuration_machineConfiguration, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.buildingblock.javamodel.IMemory.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.machineconfiguration.MachineconfigurationPackage.Memory_aE_Configuration_memory, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.machineconfiguration.javamodel.IMemory_Configuration> selectToMeMachineConfiguration(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.machine.javamodel.IMachineSystemConfiguration object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.machineconfiguration.javamodel.IMemory_Configuration.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.machineconfiguration.MachineconfigurationPackage.Memory_aE_Configuration_machineConfiguration, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.machineconfiguration.javamodel.IMemory_Configuration> selectToMeMemory(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.resources.buildingblock.javamodel.IMemory object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.machineconfiguration.javamodel.IMemory_Configuration.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.machineconfiguration.MachineconfigurationPackage.Memory_aE_Configuration_memory, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7b0d2a12-2b02-11e9-9692-65766bc2daa5,bDV/+D8MPkGlPgR2KXSC77j8gG4=] */
