package cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class VirtualMachineSystemConfiguration extends DynamicResource implements IVirtualMachineSystemConfiguration {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IVirtualMachineSystemConfiguration> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IVirtualMachineSystemConfiguration>() {
    
    @Override
    public IVirtualMachineSystemConfiguration create() {
      return new VirtualMachineSystemConfiguration();
    }
    
    @Override
    public IVirtualMachineSystemConfiguration create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new VirtualMachineSystemConfiguration(resourceRepository, resource);
    }
  
  };

  public VirtualMachineSystemConfiguration() {
    super(IVirtualMachineSystemConfiguration.TYPE_ID);
  }
  
  public VirtualMachineSystemConfiguration(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IVirtualMachineSystemConfiguration.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, identifier);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.machine.javamodel.ICPU> selectCPUs() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.machine.javamodel.ICPU.class, cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.machine.MachinePackage.MachineSystemConfiguration_cPUs);
  }

  public VirtualMachineSystemConfiguration setCPUs(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.machine.javamodel.ICPU> cPUs) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.machine.MachinePackage.MachineSystemConfiguration_cPUs, cPUs);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> selectDecompose() {
    return _getList(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock.class, cleon.common.modularity.metamodel.spec.SpecPackage.DecompositionBuildingBlock_decompose);
  }

  public VirtualMachineSystemConfiguration setDecompose(java.util.List<? extends cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> decompose) {
    _setList(cleon.common.modularity.metamodel.spec.SpecPackage.DecompositionBuildingBlock_decompose, decompose);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.packages.javamodel.IPackage> selectDecomposePackages() {
    return _getList(cleon.modelinglanguages.uml.metamodel.spec.structural.packages.javamodel.IPackage.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.ComponentWithPackage_decomposePackages);
  }

  public VirtualMachineSystemConfiguration setDecomposePackages(java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.packages.javamodel.IPackage> decomposePackages) {
    _setList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.ComponentWithPackage_decomposePackages, decomposePackages);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.machine.javamodel.IDisk> selectDisks() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.machine.javamodel.IDisk.class, cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.machine.MachinePackage.MachineSystemConfiguration_disks);
  }

  public VirtualMachineSystemConfiguration setDisks(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.machine.javamodel.IDisk> disks) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.machine.MachinePackage.MachineSystemConfiguration_disks, disks);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.javamodel.ISystemConfigurationDependency> selectHasDependency() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.javamodel.ISystemConfigurationDependency.class, cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.Buildingblock_viewPackage.SystemConfiguration_hasDependency);
  }

  public VirtualMachineSystemConfiguration setHasDependency(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.javamodel.ISystemConfigurationDependency> hasDependency) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.Buildingblock_viewPackage.SystemConfiguration_hasDependency, hasDependency);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> selectInSubZone() {
    return _getList(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone.class, cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.Buildingblock_viewPackage.SystemConfiguration_inSubZone);
  }

  public VirtualMachineSystemConfiguration setInSubZone(java.util.List<? extends cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> inSubZone) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.Buildingblock_viewPackage.SystemConfiguration_inSubZone, inSubZone);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.modularity.metamodel.spec.javamodel.IInteraction> selectInteracts() {
    return _getList(cleon.common.modularity.metamodel.spec.javamodel.IInteraction.class, cleon.common.modularity.metamodel.spec.SpecPackage.InteractiveBuildingBlock_interacts);
  }

  public VirtualMachineSystemConfiguration setInteracts(java.util.List<? extends cleon.common.modularity.metamodel.spec.javamodel.IInteraction> interacts) {
    _setList(cleon.common.modularity.metamodel.spec.SpecPackage.InteractiveBuildingBlock_interacts, interacts);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.machine.javamodel.IMemory> selectMemory() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.machine.javamodel.IMemory.class, cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.machine.MachinePackage.MachineSystemConfiguration_memory);
  }

  public VirtualMachineSystemConfiguration setMemory(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.machine.javamodel.IMemory> memory) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.machine.MachinePackage.MachineSystemConfiguration_memory, memory);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.uml.metamodel.spec.structural.packages.javamodel.IPackage selectNoPackages() {
    return _getSingle(cleon.modelinglanguages.uml.metamodel.spec.structural.packages.javamodel.IPackage.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.Component_noPackages);
  }

  public VirtualMachineSystemConfiguration setNoPackages(cleon.modelinglanguages.uml.metamodel.spec.structural.packages.javamodel.IPackage noPackages) {
    _setSingle(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.Component_noPackages, noPackages);
    return this;
  }
    
  @Override
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Required> selectPorts_In() {
    return _getMultiMap(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Required.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_In);
  }

  public VirtualMachineSystemConfiguration setPorts_In(IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Required> ports_In) {
    _setMultiMap(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_In, ports_In);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Provider> selectPorts_Out() {
    return _getList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Provider.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_Out);
  }

  public VirtualMachineSystemConfiguration setPorts_Out(java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Provider> ports_Out) {
    _setList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_Out, ports_Out);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public VirtualMachineSystemConfiguration setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProduct> selectUsingProducts() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProduct.class, cleon.architecturemethods.arc42.metamodel.spec._13_product_view._13_product_viewPackage.ProductAware_usingProducts);
  }

  public VirtualMachineSystemConfiguration setUsingProducts(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProduct> usingProducts) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._13_product_view._13_product_viewPackage.ProductAware_usingProducts, usingProducts);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, visitor);
    // relations
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.machine.javamodel.ICPU.class, cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.machine.MachinePackage.MachineSystemConfiguration_cPUs, visitor);
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.machine.javamodel.IDisk.class, cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.machine.MachinePackage.MachineSystemConfiguration_disks, visitor);
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.javamodel.ISystemConfigurationDependency.class, cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.Buildingblock_viewPackage.SystemConfiguration_hasDependency, visitor);
    _acceptList(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone.class, cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.Buildingblock_viewPackage.SystemConfiguration_inSubZone, visitor);
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.machine.javamodel.IMemory.class, cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.machine.MachinePackage.MachineSystemConfiguration_memory, visitor);
    _acceptMultiMap(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Required.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_In, visitor);
    _acceptList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Provider.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_Out, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProduct.class, cleon.architecturemethods.arc42.metamodel.spec._13_product_view._13_product_viewPackage.ProductAware_usingProducts, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2b7d739c-02c7-11e9-9e58-33d596257b14,qbD7I4+klMLfs6xgJgyNp4zxWb8=] */
