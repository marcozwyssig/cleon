package cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.productgroup.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class BaseProductGroup extends DynamicResource implements IBaseProductGroup {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBaseProductGroup> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBaseProductGroup>() {
    
    @Override
    public IBaseProductGroup create() {
      return new BaseProductGroup();
    }
    
    @Override
    public IBaseProductGroup create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new BaseProductGroup(resourceRepository, resource);
    }
  
  };

  public BaseProductGroup() {
    super(IBaseProductGroup.TYPE_ID);
  }
  
  public BaseProductGroup(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IBaseProductGroup.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.template.xmi.javamodel.IXmiClass> selectAggregates() {
    return _getList(cleon.modelinglanguages.uml.template.xmi.javamodel.IXmiClass.class, cleon.modelinglanguages.uml.template.xmi.XmiPackage.XmiAggregation_aggregates);
  }

  public BaseProductGroup setAggregates(java.util.List<? extends cleon.modelinglanguages.uml.template.xmi.javamodel.IXmiClass> aggregates) {
    _setList(cleon.modelinglanguages.uml.template.xmi.XmiPackage.XmiAggregation_aggregates, aggregates);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.product.javamodel.IBaseProduct> selectBaseProducts() {
    return _getList(cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.product.javamodel.IBaseProduct.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.productgroup.ProductgroupPackage.BaseProductGroup_baseProducts);
  }

  public BaseProductGroup setBaseProducts(java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.product.javamodel.IBaseProduct> baseProducts) {
    _setList(cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.productgroup.ProductgroupPackage.BaseProductGroup_baseProducts, baseProducts);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.product.javamodel.IProduct> selectProducts() {
    return _getList(cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.product.javamodel.IProduct.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.productgroup.ProductgroupPackage.ProductGroup_products);
  }

  public BaseProductGroup setProducts(java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.product.javamodel.IProduct> products) {
    _setList(cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.productgroup.ProductgroupPackage.ProductGroup_products, products);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public BaseProductGroup setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.product.javamodel.IBaseProduct.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.productgroup.ProductgroupPackage.BaseProductGroup_baseProducts, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.productgroup.javamodel.IBaseProductGroup selectToMeBaseProducts(cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.product.javamodel.IBaseProduct object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.productgroup.javamodel.IBaseProductGroup.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.productgroup.ProductgroupPackage.BaseProductGroup_baseProducts, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e3dfe296-67c8-11e7-afcc-6df3a81a4d17,GY/vrK7eYYefvqlqVJQQFT5gn9U=] */
