package cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class UserLicenseValidity extends DynamicResource implements IUserLicenseValidity {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IUserLicenseValidity> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IUserLicenseValidity>() {
    
    @Override
    public IUserLicenseValidity create() {
      return new UserLicenseValidity();
    }
    
    @Override
    public IUserLicenseValidity create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new UserLicenseValidity(resourceRepository, resource);
    }
  
  };

  public UserLicenseValidity() {
    super(IUserLicenseValidity.TYPE_ID);
  }
  
  public UserLicenseValidity(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IUserLicenseValidity.TYPE_ID);
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

  public UserLicenseValidity setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    if (isPerpetual()) return visitor.visitPerpetual();
    if (isSubscription__S_Based()) return visitor.visitSubscription__S_Based();
    if (isTime__S_Limited__F___N_Trial__U_Demo__O_()) return visitor.visitTime__S_Limited__F___N_Trial__U_Demo__O_();
    if (isPay__S_Per__S_Use()) return visitor.visitPay__S_Per__S_Use();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isPerpetual()) {
      visitor.visitPerpetual();
      return;
    }
    if (isSubscription__S_Based()) {
      visitor.visitSubscription__S_Based();
      return;
    }
    if (isTime__S_Limited__F___N_Trial__U_Demo__O_()) {
      visitor.visitTime__S_Limited__F___N_Trial__U_Demo__O_();
      return;
    }
    if (isPay__S_Per__S_Use()) {
      visitor.visitPay__S_Per__S_Use();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isPerpetual() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.licensing.LicensingPackage.UserLicenseValidity_Perpetual);
  }
  
  @Override
  public boolean isSubscription__S_Based() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.licensing.LicensingPackage.UserLicenseValidity_Subscription__S_Based);
  }
  
  @Override
  public boolean isTime__S_Limited__F___N_Trial__U_Demo__O_() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.licensing.LicensingPackage.UserLicenseValidity_Time__S_Limited__F___N_Trial__U_Demo__O_);
  }
  
  @Override
  public boolean isPay__S_Per__S_Use() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.licensing.LicensingPackage.UserLicenseValidity_Pay__S_Per__S_Use);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,de4f3129-dfd3-11ef-b0be-9b4cac321140,mM+ui5nkEIgQPONkv32aaWcD2zs=] */
