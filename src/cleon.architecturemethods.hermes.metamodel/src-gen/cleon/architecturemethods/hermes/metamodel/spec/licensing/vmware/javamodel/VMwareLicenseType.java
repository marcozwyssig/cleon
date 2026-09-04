package cleon.architecturemethods.hermes.metamodel.spec.licensing.vmware.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class VMwareLicenseType extends DynamicResource implements IVMwareLicenseType {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IVMwareLicenseType> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IVMwareLicenseType>() {
    
    @Override
    public IVMwareLicenseType create() {
      return new VMwareLicenseType();
    }
    
    @Override
    public IVMwareLicenseType create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new VMwareLicenseType(resourceRepository, resource);
    }
  
  };

  public VMwareLicenseType() {
    super(IVMwareLicenseType.TYPE_ID);
  }
  
  public VMwareLicenseType(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IVMwareLicenseType.TYPE_ID);
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

  public VMwareLicenseType setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    if (isEnd__F_User__F_License__F_Agreement__F___N_EULA__O_()) return visitor.visitEnd__F_User__F_License__F_Agreement__F___N_EULA__O_();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isEnd__F_User__F_License__F_Agreement__F___N_EULA__O_()) {
      visitor.visitEnd__F_User__F_License__F_Agreement__F___N_EULA__O_();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isEnd__F_User__F_License__F_Agreement__F___N_EULA__O_() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.licensing.vmware.VmwarePackage.VMwareLicenseType_End__F_User__F_License__F_Agreement__F___N_EULA__O_);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ef399c70-dff0-11ef-8b41-bffcdee4ee9e,LZsBUl3k+kQ6zuIgvJZaU9xYdmQ=] */
