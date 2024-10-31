package cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class License extends DynamicResource implements ILicense {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILicense> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILicense>() {
    
    @Override
    public ILicense create() {
      return new License();
    }
    
    @Override
    public ILicense create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new License(resourceRepository, resource);
    }
  
  };

  public License() {
    super(ILicense.TYPE_ID);
  }
  
  public License(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ILicense.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.ILicenseType selectLicenseType() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.ILicenseType.class, cleon.architecturemethods.arc42.metamodel.spec._13_product_view._13_product_viewPackage.License_licenseType);
  }

  public License setLicenseType(cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.ILicenseType licenseType) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._13_product_view._13_product_viewPackage.License_licenseType, licenseType);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public License setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.ILicenseType.class, cleon.architecturemethods.arc42.metamodel.spec._13_product_view._13_product_viewPackage.License_licenseType, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.ILicense> selectToMeLicenseType(cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.ILicenseType object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.ILicense.class, cleon.architecturemethods.arc42.metamodel.spec._13_product_view._13_product_viewPackage.License_licenseType, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2e78c313-29a9-11eb-8baa-95d9107006e8,rbRwDQUiS7eIDDcalo4+jSoFYyM=] */
