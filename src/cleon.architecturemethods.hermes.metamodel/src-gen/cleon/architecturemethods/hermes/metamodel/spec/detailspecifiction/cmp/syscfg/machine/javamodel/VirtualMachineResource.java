package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.machine.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class VirtualMachineResource extends DynamicResource implements IVirtualMachineResource {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IVirtualMachineResource> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IVirtualMachineResource>() {
    
    @Override
    public IVirtualMachineResource create() {
      return new VirtualMachineResource();
    }
    
    @Override
    public IVirtualMachineResource create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new VirtualMachineResource(resourceRepository, resource);
    }
  
  };

  public VirtualMachineResource() {
    super(IVirtualMachineResource.TYPE_ID);
  }
  
  public VirtualMachineResource(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IVirtualMachineResource.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.Integer selectDiskGB() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.machine.MachinePackage.MachineResource_diskGB);
  }
    
  public void setDiskGB(java.lang.Integer diskGB) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.machine.MachinePackage.MachineResource_diskGB, diskGB);
  }

  @Override
  public java.lang.Integer selectMemoryGB() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.machine.MachinePackage.MachineResource_memoryGB);
  }
    
  public void setMemoryGB(java.lang.Integer memoryGB) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.machine.MachinePackage.MachineResource_memoryGB, memoryGB);
  }

  @Override
  public java.lang.String selectTitle() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.SyscfgPackage.CfgResource_title);
  }
    
  public void setTitle(java.lang.String title) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.SyscfgPackage.CfgResource_title, title);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.machine.javamodel.ICPU selectCpu() {
    return _getSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.machine.javamodel.ICPU.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.machine.MachinePackage.MachineResource_cpu);
  }

  public VirtualMachineResource setCpu(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.machine.javamodel.ICPU cpu) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.machine.MachinePackage.MachineResource_cpu, cpu);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public VirtualMachineResource setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.machine.MachinePackage.MachineResource_diskGB, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.machine.MachinePackage.MachineResource_memoryGB, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.SyscfgPackage.CfgResource_title, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.machine.javamodel.ICPU.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.machine.MachinePackage.MachineResource_cpu, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3c6560f8-f173-11e8-b3e7-15e2dd8d9b05,aWdj7D+EgLV5GUuyN45QV8NrUXY=] */
