package cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ProductVariant extends DynamicResource implements IProductVariant {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProductVariant> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProductVariant>() {
    
    @Override
    public IProductVariant create() {
      return new ProductVariant();
    }
    
    @Override
    public IProductVariant create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ProductVariant(resourceRepository, resource);
    }
  
  };

  public ProductVariant() {
    super(IProductVariant.TYPE_ID);
  }
  
  public ProductVariant(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IProductVariant.TYPE_ID);
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
  public java.lang.String selectItemNumber() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._13_product_view._13_product_viewPackage.ProductVariant_itemNumber);
  }
    
  public void setItemNumber(java.lang.String itemNumber) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._13_product_view._13_product_viewPackage.ProductVariant_itemNumber, itemNumber);
  }

  @Override
  public java.util.List<java.lang.String> selectMandatoryDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.MandatoryDescription_mandatoryDescriptions);
  }
    
  public void setMandatoryDescriptions(java.util.List<java.lang.String> mandatoryDescriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.MandatoryDescription_mandatoryDescriptions, mandatoryDescriptions);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectVersion() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.versions.VersionsPackage.Version_version);
  }
    
  public void setVersion(java.lang.String version) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.versions.VersionsPackage.Version_version, version);
  }

  // relations
  
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariantOptions> selectProductVariantOptions() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariantOptions.class, cleon.architecturemethods.arc42.metamodel.spec._13_product_view._13_product_viewPackage.ProductVariant_productVariantOptions);
  }

  public ProductVariant setProductVariantOptions(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariantOptions> productVariantOptions) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._13_product_view._13_product_viewPackage.ProductVariant_productVariantOptions, productVariantOptions);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ProductVariant setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._13_product_view._13_product_viewPackage.ProductVariant_itemNumber, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.MandatoryDescription_mandatoryDescriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.versions.VersionsPackage.Version_version, visitor);
    // relations
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariantOptions.class, cleon.architecturemethods.arc42.metamodel.spec._13_product_view._13_product_viewPackage.ProductVariant_productVariantOptions, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  public static cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant selectToMeProductVariantOptions(cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariantOptions object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant.class, cleon.architecturemethods.arc42.metamodel.spec._13_product_view._13_product_viewPackage.ProductVariant_productVariantOptions, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4026c4e3-2acf-11e9-b83f-8be423c00623,zMe0OO3fu88u6KOq2CUNJUDISoY=] */
