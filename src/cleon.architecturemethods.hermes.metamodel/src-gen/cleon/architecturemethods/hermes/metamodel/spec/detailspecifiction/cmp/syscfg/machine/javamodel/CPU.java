package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.machine.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class CPU extends DynamicResource implements ICPU {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICPU> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICPU>() {
    
    @Override
    public ICPU create() {
      return new CPU();
    }
    
    @Override
    public ICPU create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new CPU(resourceRepository, resource);
    }
  
  };

  public CPU() {
    super(ICPU.TYPE_ID);
  }
  
  public CPU(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICPU.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectCore() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.machine.MachinePackage.CPU_core);
  }
    
  public void setCore(java.lang.Integer core) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.machine.MachinePackage.CPU_core, core);
  }

  @Override
  public java.lang.Integer selectSocket() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.machine.MachinePackage.CPU_socket);
  }
    
  public void setSocket(java.lang.Integer socket) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.machine.MachinePackage.CPU_socket, socket);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public CPU setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.machine.MachinePackage.CPU_core, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.machine.MachinePackage.CPU_socket, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,aa609a6d-f177-11e8-b3e7-15e2dd8d9b05,abRbs1zJ65cbnSZmFuG7qTTF140=] */
