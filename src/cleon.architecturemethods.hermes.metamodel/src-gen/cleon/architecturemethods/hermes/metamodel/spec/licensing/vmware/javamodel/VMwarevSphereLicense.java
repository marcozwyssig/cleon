package cleon.architecturemethods.hermes.metamodel.spec.licensing.vmware.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class VMwarevSphereLicense extends DynamicResource implements IVMwarevSphereLicense {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IVMwarevSphereLicense> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IVMwarevSphereLicense>() {
    
    @Override
    public IVMwarevSphereLicense create() {
      return new VMwarevSphereLicense();
    }
    
    @Override
    public IVMwarevSphereLicense create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new VMwarevSphereLicense(resourceRepository, resource);
    }
  
  };

  public VMwarevSphereLicense() {
    super(IVMwarevSphereLicense.TYPE_ID);
  }
  
  public VMwarevSphereLicense(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IVMwarevSphereLicense.TYPE_ID);
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

  public VMwarevSphereLicense setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // accept enum value visitors

  @Override
  public <R> R accept(IValueVisitor<R> visitor) {
    if (isFree()) return visitor.visitFree();
    if (isEssentials()) return visitor.visitEssentials();
    if (isStandard()) return visitor.visitStandard();
    if (isEssentials__F_Plus()) return visitor.visitEssentials__F_Plus();
    if (isEnterprise__F_Plus()) return visitor.visitEnterprise__F_Plus();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isFree()) {
      visitor.visitFree();
      return;
    }
    if (isEssentials()) {
      visitor.visitEssentials();
      return;
    }
    if (isStandard()) {
      visitor.visitStandard();
      return;
    }
    if (isEssentials__F_Plus()) {
      visitor.visitEssentials__F_Plus();
      return;
    }
    if (isEnterprise__F_Plus()) {
      visitor.visitEnterprise__F_Plus();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isFree() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.licensing.vmware.VmwarePackage.VMwarevSphereLicense_Free);
  }
  
  @Override
  public boolean isEssentials() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.licensing.vmware.VmwarePackage.VMwarevSphereLicense_Essentials);
  }
  
  @Override
  public boolean isStandard() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.licensing.vmware.VmwarePackage.VMwarevSphereLicense_Standard);
  }
  
  @Override
  public boolean isEssentials__F_Plus() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.licensing.vmware.VmwarePackage.VMwarevSphereLicense_Essentials__F_Plus);
  }
  
  @Override
  public boolean isEnterprise__F_Plus() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.licensing.vmware.VmwarePackage.VMwarevSphereLicense_Enterprise__F_Plus);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4257c37f-e4a1-11ef-a6bd-497168f25adc,VUDyU5dp2v/20qYnnLXWLd5k4vk=] */
