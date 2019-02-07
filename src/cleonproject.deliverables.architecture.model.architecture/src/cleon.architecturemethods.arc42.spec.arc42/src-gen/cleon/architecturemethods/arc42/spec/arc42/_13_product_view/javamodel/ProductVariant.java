package cleon.architecturemethods.arc42.spec.arc42._13_product_view.javamodel;

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
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectNo() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.spec.arc42._13_product_view._13_product_viewPackage.ProductVariant_no);
  }
    
  public void setNo(java.lang.String no) {
     _setSingleAttribute(cleon.architecturemethods.arc42.spec.arc42._13_product_view._13_product_viewPackage.ProductVariant_no, no);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.spec.arc42._13_product_view.javamodel.IProductOptions> selectProductOptions() {
    return _getList(cleon.architecturemethods.arc42.spec.arc42._13_product_view.javamodel.IProductOptions.class, cleon.architecturemethods.arc42.spec.arc42._13_product_view._13_product_viewPackage.ProductVariant_productOptions);
  }

  public ProductVariant setProductOptions(java.util.List<? extends cleon.architecturemethods.arc42.spec.arc42._13_product_view.javamodel.IProductOptions> productOptions) {
    _setList(cleon.architecturemethods.arc42.spec.arc42._13_product_view._13_product_viewPackage.ProductVariant_productOptions, productOptions);
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
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.spec.arc42._13_product_view._13_product_viewPackage.ProductVariant_no, visitor);
    // relations
    _acceptList(cleon.architecturemethods.arc42.spec.arc42._13_product_view.javamodel.IProductOptions.class, cleon.architecturemethods.arc42.spec.arc42._13_product_view._13_product_viewPackage.ProductVariant_productOptions, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.spec.arc42._13_product_view.javamodel.IProductVariant> selectToMeProductOptions(cleon.architecturemethods.arc42.spec.arc42._13_product_view.javamodel.IProductOptions object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.spec.arc42._13_product_view.javamodel.IProductVariant.class, cleon.architecturemethods.arc42.spec.arc42._13_product_view._13_product_viewPackage.ProductVariant_productOptions, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4026c4e3-2acf-11e9-b83f-8be423c00623,Q7siyTQMIxWrSR5qKlVhDfRfxAI=] */