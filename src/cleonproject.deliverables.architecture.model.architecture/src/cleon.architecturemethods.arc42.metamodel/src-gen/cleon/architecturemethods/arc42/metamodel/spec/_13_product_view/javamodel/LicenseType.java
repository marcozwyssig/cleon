package cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class LicenseType extends DynamicResource implements ILicenseType {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILicenseType> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILicenseType>() {
    
    @Override
    public ILicenseType create() {
      return new LicenseType();
    }
    
    @Override
    public ILicenseType create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new LicenseType(resourceRepository, resource);
    }
  
  };

  public LicenseType() {
    super(ILicenseType.TYPE_ID);
  }
  
  public LicenseType(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ILicenseType.TYPE_ID);
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

  public LicenseType setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    if (isFree__F_Software__F_and__F_Open__F_Source()) return visitor.visitFree__F_Software__F_and__F_Open__F_Source();
    if (isCore__S_Based()) return visitor.visitCore__S_Based();
    if (isSocket__S_based()) return visitor.visitSocket__S_based();
    if (isMachine__S_based()) return visitor.visitMachine__S_based();
    if (isConcurrent__S_User()) return visitor.visitConcurrent__S_User();
    if (isNamed__S_User()) return visitor.visitNamed__S_User();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isFree__F_Software__F_and__F_Open__F_Source()) {
      visitor.visitFree__F_Software__F_and__F_Open__F_Source();
      return;
    }
    if (isCore__S_Based()) {
      visitor.visitCore__S_Based();
      return;
    }
    if (isSocket__S_based()) {
      visitor.visitSocket__S_based();
      return;
    }
    if (isMachine__S_based()) {
      visitor.visitMachine__S_based();
      return;
    }
    if (isConcurrent__S_User()) {
      visitor.visitConcurrent__S_User();
      return;
    }
    if (isNamed__S_User()) {
      visitor.visitNamed__S_User();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isFree__F_Software__F_and__F_Open__F_Source() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._13_product_view._13_product_viewPackage.LicenseType_Free__F_Software__F_and__F_Open__F_Source);
  }
  
  @Override
  public boolean isCore__S_Based() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._13_product_view._13_product_viewPackage.LicenseType_Core__S_Based);
  }
  
  @Override
  public boolean isSocket__S_based() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._13_product_view._13_product_viewPackage.LicenseType_Socket__S_based);
  }
  
  @Override
  public boolean isMachine__S_based() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._13_product_view._13_product_viewPackage.LicenseType_Machine__S_based);
  }
  
  @Override
  public boolean isConcurrent__S_User() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._13_product_view._13_product_viewPackage.LicenseType_Concurrent__S_User);
  }
  
  @Override
  public boolean isNamed__S_User() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._13_product_view._13_product_viewPackage.LicenseType_Named__S_User);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3ed0e011-29a9-11eb-8baa-95d9107006e8,VMh+XrGzXZaacWPU+c5kWo6C/xo=] */
