package cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Product extends DynamicResource implements IProduct {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProduct> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProduct>() {
    
    @Override
    public IProduct create() {
      return new Product();
    }
    
    @Override
    public IProduct create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Product(resourceRepository, resource);
    }
  
  };

  public Product() {
    super(IProduct.TYPE_ID);
  }
  
  public Product(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IProduct.TYPE_ID);
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
  public java.util.List<? extends cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> selectBuildingBlock() {
    return _getList(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock.class, cleon.common.modularity.metamodel.spec.SpecPackage.BuildingBlockAware_buildingBlock);
  }

  public Product setBuildingBlock(java.util.List<? extends cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> buildingBlock) {
    _setList(cleon.common.modularity.metamodel.spec.SpecPackage.BuildingBlockAware_buildingBlock, buildingBlock);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductOptions> selectProductOptions() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductOptions.class, cleon.architecturemethods.arc42.metamodel.spec._13_product_view._13_product_viewPackage.Product_productOptions);
  }

  public Product setProductOptions(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductOptions> productOptions) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._13_product_view._13_product_viewPackage.Product_productOptions, productOptions);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant> selectProductVariants() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant.class, cleon.architecturemethods.arc42.metamodel.spec._13_product_view._13_product_viewPackage.Product_productVariants);
  }

  public Product setProductVariants(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant> productVariants) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._13_product_view._13_product_viewPackage.Product_productVariants, productVariants);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Product setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> selectUsedIn() {
    return _getList(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock.class, cleon.architecturemethods.arc42.metamodel.spec._13_product_view._13_product_viewPackage.Product_usedIn);
  }

  public Product setUsedIn(java.util.List<? extends cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> usedIn) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._13_product_view._13_product_viewPackage.Product_usedIn, usedIn);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IUsedProduct> selectUsedInProduct() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IUsedProduct.class, cleon.architecturemethods.arc42.metamodel.spec._13_product_view._13_product_viewPackage.Product_usedInProduct);
  }

  public Product setUsedInProduct(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IUsedProduct> usedInProduct) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._13_product_view._13_product_viewPackage.Product_usedInProduct, usedInProduct);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductOptions.class, cleon.architecturemethods.arc42.metamodel.spec._13_product_view._13_product_viewPackage.Product_productOptions, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant.class, cleon.architecturemethods.arc42.metamodel.spec._13_product_view._13_product_viewPackage.Product_productVariants, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock.class, cleon.architecturemethods.arc42.metamodel.spec._13_product_view._13_product_viewPackage.Product_usedIn, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IUsedProduct.class, cleon.architecturemethods.arc42.metamodel.spec._13_product_view._13_product_viewPackage.Product_usedInProduct, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProduct selectToMeProductVariants(cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProduct.class, cleon.architecturemethods.arc42.metamodel.spec._13_product_view._13_product_viewPackage.Product_productVariants, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProduct selectToMeProductOptions(cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductOptions object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProduct.class, cleon.architecturemethods.arc42.metamodel.spec._13_product_view._13_product_viewPackage.Product_productOptions, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProduct> selectToMeUsedIn(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProduct.class, cleon.architecturemethods.arc42.metamodel.spec._13_product_view._13_product_viewPackage.Product_usedIn, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProduct> selectToMeUsedInProduct(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IUsedProduct object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProduct.class, cleon.architecturemethods.arc42.metamodel.spec._13_product_view._13_product_viewPackage.Product_usedInProduct, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,352e36c6-d0b1-11e8-b005-f7630e4c29c0,BvKFSG/5MQci8vRXj0gqUuRdpF8=] */
