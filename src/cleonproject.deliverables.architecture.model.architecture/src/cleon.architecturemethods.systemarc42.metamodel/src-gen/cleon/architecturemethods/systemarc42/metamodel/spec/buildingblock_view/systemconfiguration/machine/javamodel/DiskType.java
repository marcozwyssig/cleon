package cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.machine.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DiskType extends DynamicResource implements IDiskType {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDiskType> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDiskType>() {
    
    @Override
    public IDiskType create() {
      return new DiskType();
    }
    
    @Override
    public IDiskType create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DiskType(resourceRepository, resource);
    }
  
  };

  public DiskType() {
    super(IDiskType.TYPE_ID);
  }
  
  public DiskType(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDiskType.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DiskType setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // accept enum value visitors

  @Override
  public <R> R accept(IValueVisitor<R> visitor) {
    if (isSDD()) return visitor.visitSDD();
    if (isHDD()) return visitor.visitHDD();
    if (isVMDK__F___S___F_Thin__F_Provisioning()) return visitor.visitVMDK__F___S___F_Thin__F_Provisioning();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isSDD()) {
      visitor.visitSDD();
      return;
    }
    if (isHDD()) {
      visitor.visitHDD();
      return;
    }
    if (isVMDK__F___S___F_Thin__F_Provisioning()) {
      visitor.visitVMDK__F___S___F_Thin__F_Provisioning();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isSDD() {
    return getResource().equals(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.machine.MachinePackage.DiskType_SDD);
  }
  
  @Override
  public boolean isHDD() {
    return getResource().equals(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.machine.MachinePackage.DiskType_HDD);
  }
  
  @Override
  public boolean isVMDK__F___S___F_Thin__F_Provisioning() {
    return getResource().equals(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.machine.MachinePackage.DiskType_VMDK__F___S___F_Thin__F_Provisioning);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,00c36073-2b6b-11e9-90eb-451204ee9d3c,YcYs1YK64zcewTaFwuOQJYzKtXA=] */
