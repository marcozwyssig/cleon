package cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.product.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class BaseProduct extends DynamicResource implements IBaseProduct {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBaseProduct> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBaseProduct>() {
    
    @Override
    public IBaseProduct create() {
      return new BaseProduct();
    }
    
    @Override
    public IBaseProduct create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new BaseProduct(resourceRepository, resource);
    }
  
  };

  public BaseProduct() {
    super(IBaseProduct.TYPE_ID);
  }
  
  public BaseProduct(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IBaseProduct.TYPE_ID);
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
  public java.util.List<? extends cleon.modelinglanguages.uml.template.xmi.javamodel.IXmiClass> selectComposites() {
    return _getList(cleon.modelinglanguages.uml.template.xmi.javamodel.IXmiClass.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.product.ProductPackage.BaseProduct_composites);
  }

  public BaseProduct setComposites(java.util.List<? extends cleon.modelinglanguages.uml.template.xmi.javamodel.IXmiClass> composites) {
    _setList(cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.product.ProductPackage.BaseProduct_composites, composites);
    return this;
  }
    
  @Override
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.product.javamodel.IInfrastructureProductUsage> selectInfrastructureProductUsage() {
    return _getMultiMap(cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.product.javamodel.IInfrastructureProductUsage.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.product.ProductPackage.BaseProduct_infrastructureProductUsage);
  }

  public BaseProduct setInfrastructureProductUsage(IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.product.javamodel.IInfrastructureProductUsage> infrastructureProductUsage) {
    _setMultiMap(cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.product.ProductPackage.BaseProduct_infrastructureProductUsage, infrastructureProductUsage);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.product.javamodel.IProduct> selectOptions() {
    return _getList(cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.product.javamodel.IProduct.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.product.ProductPackage.BaseProduct_options);
  }

  public BaseProduct setOptions(java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.product.javamodel.IProduct> options) {
    _setList(cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.product.ProductPackage.BaseProduct_options, options);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public BaseProduct setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptMultiMap(cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.product.javamodel.IInfrastructureProductUsage.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.product.ProductPackage.BaseProduct_infrastructureProductUsage, visitor);
    _acceptList(cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.product.javamodel.IProduct.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.product.ProductPackage.BaseProduct_options, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.product.javamodel.IBaseProduct selectToMeOptions(cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.product.javamodel.IProduct object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.product.javamodel.IBaseProduct.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.product.ProductPackage.BaseProduct_options, object.getResource());
  }
  
  public static cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.product.javamodel.IBaseProduct selectToMeInfrastructureProductUsage(cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.product.javamodel.IInfrastructureProductUsage object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.product.javamodel.IBaseProduct.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.product.ProductPackage.BaseProduct_infrastructureProductUsage, object.getResource());
  }
  
  public static cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.product.javamodel.IBaseProduct selectToMeComposites(cleon.modelinglanguages.uml.template.xmi.javamodel.IXmiClass object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.product.javamodel.IBaseProduct.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.product.ProductPackage.BaseProduct_composites, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,bf1a3670-67bf-11e7-afcc-6df3a81a4d17,H4hr7MDU+t11Td/j0Y2bpYTIgHQ=] */
