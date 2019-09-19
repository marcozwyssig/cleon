package cleon.architecturemethods.arc42.spec.arc42._13_product_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ProductVariantOptions extends DynamicResource implements IProductVariantOptions {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProductVariantOptions> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProductVariantOptions>() {
    
    @Override
    public IProductVariantOptions create() {
      return new ProductVariantOptions();
    }
    
    @Override
    public IProductVariantOptions create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ProductVariantOptions(resourceRepository, resource);
    }
  
  };

  public ProductVariantOptions() {
    super(IProductVariantOptions.TYPE_ID);
  }
  
  public ProductVariantOptions(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IProductVariantOptions.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectAmount() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.spec.arc42._13_product_view._13_product_viewPackage.ProductVariantOptions_amount);
  }
    
  public void setAmount(java.lang.Integer amount) {
     _setSingleAttribute(cleon.architecturemethods.arc42.spec.arc42._13_product_view._13_product_viewPackage.ProductVariantOptions_amount, amount);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._13_product_view.javamodel.IProductOptions selectProductOptions() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._13_product_view.javamodel.IProductOptions.class, cleon.architecturemethods.arc42.spec.arc42._13_product_view._13_product_viewPackage.ProductVariantOptions_productOptions);
  }

  public ProductVariantOptions setProductOptions(cleon.architecturemethods.arc42.spec.arc42._13_product_view.javamodel.IProductOptions productOptions) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42._13_product_view._13_product_viewPackage.ProductVariantOptions_productOptions, productOptions);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public ProductVariantOptions setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ProductVariantOptions setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.spec.arc42._13_product_view._13_product_viewPackage.ProductVariantOptions_amount, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._13_product_view.javamodel.IProductOptions.class, cleon.architecturemethods.arc42.spec.arc42._13_product_view._13_product_viewPackage.ProductVariantOptions_productOptions, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.spec.arc42._13_product_view.javamodel.IProductVariantOptions> selectToMeProductOptions(cleon.architecturemethods.arc42.spec.arc42._13_product_view.javamodel.IProductOptions object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.spec.arc42._13_product_view.javamodel.IProductVariantOptions.class, cleon.architecturemethods.arc42.spec.arc42._13_product_view._13_product_viewPackage.ProductVariantOptions_productOptions, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,400c0491-2ad9-11e9-b83f-8be423c00623,U8GgHFzWPpF9C7Zpa6EMv6wmhMU=] */
