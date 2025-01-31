package cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class UserLicenseType extends DynamicResource implements IUserLicenseType {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IUserLicenseType> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IUserLicenseType>() {
    
    @Override
    public IUserLicenseType create() {
      return new UserLicenseType();
    }
    
    @Override
    public IUserLicenseType create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new UserLicenseType(resourceRepository, resource);
    }
  
  };

  public UserLicenseType() {
    super(IUserLicenseType.TYPE_ID);
  }
  
  public UserLicenseType(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IUserLicenseType.TYPE_ID);
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

  public UserLicenseType setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    if (isFloating__F___N_Concurrent__O___F_License()) return visitor.visitFloating__F___N_Concurrent__O___F_License();
    if (isPer__F_User__F_License()) return visitor.visitPer__F_User__F_License();
    if (isNamed__F_User__F_License()) return visitor.visitNamed__F_User__F_License();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isFloating__F___N_Concurrent__O___F_License()) {
      visitor.visitFloating__F___N_Concurrent__O___F_License();
      return;
    }
    if (isPer__F_User__F_License()) {
      visitor.visitPer__F_User__F_License();
      return;
    }
    if (isNamed__F_User__F_License()) {
      visitor.visitNamed__F_User__F_License();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isFloating__F___N_Concurrent__O___F_License() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.licensing.LicensingPackage.UserLicenseType_Floating__F___N_Concurrent__O___F_License);
  }
  
  @Override
  public boolean isPer__F_User__F_License() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.licensing.LicensingPackage.UserLicenseType_Per__F_User__F_License);
  }
  
  @Override
  public boolean isNamed__F_User__F_License() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.licensing.LicensingPackage.UserLicenseType_Named__F_User__F_License);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,953f4627-dfd3-11ef-b0be-9b4cac321140,iBDV5g5JUR8eW7eRd7zz47vrOOs=] */
