package cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.product.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class InfrastructureProduct extends DynamicResource implements IInfrastructureProduct {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInfrastructureProduct> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInfrastructureProduct>() {
    
    @Override
    public IInfrastructureProduct create() {
      return new InfrastructureProduct();
    }
    
    @Override
    public IInfrastructureProduct create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new InfrastructureProduct(resourceRepository, resource);
    }
  
  };

  public InfrastructureProduct() {
    super(IInfrastructureProduct.TYPE_ID);
  }
  
  public InfrastructureProduct(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IInfrastructureProduct.TYPE_ID);
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

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.xml.spec.xmi.javamodel.IXmiClass> selectAssociations() {
    return _getList(cleon.common.xml.spec.xmi.javamodel.IXmiClass.class, cleon.common.xml.spec.xmi.XmiPackage.XmiAssociation_associations);
  }

  public InfrastructureProduct setAssociations(java.util.List<? extends cleon.common.xml.spec.xmi.javamodel.IXmiClass> associations) {
    _setList(cleon.common.xml.spec.xmi.XmiPackage.XmiAssociation_associations, associations);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.javamodel.ICluster selectCluster() {
    return _getSingle(cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.javamodel.ICluster.class, cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.product.ProductPackage.InfrastructureProduct_cluster);
  }

  public InfrastructureProduct setCluster(cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.javamodel.ICluster cluster) {
    _setSingle(cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.product.ProductPackage.InfrastructureProduct_cluster, cluster);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.xml.spec.xmi.javamodel.IXmiClass> selectComposites() {
    return _getList(cleon.common.xml.spec.xmi.javamodel.IXmiClass.class, cleon.common.xml.spec.xmi.XmiPackage.XmiComposite_composites);
  }

  public InfrastructureProduct setComposites(java.util.List<? extends cleon.common.xml.spec.xmi.javamodel.IXmiClass> composites) {
    _setList(cleon.common.xml.spec.xmi.XmiPackage.XmiComposite_composites, composites);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.product.javamodel.IInfrastructureProduct> selectDependsOn() {
    return _getList(cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.product.javamodel.IInfrastructureProduct.class, cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.product.ProductPackage.InfrastructureProduct_dependsOn);
  }

  public InfrastructureProduct setDependsOn(java.util.List<? extends cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.product.javamodel.IInfrastructureProduct> dependsOn) {
    _setList(cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.product.ProductPackage.InfrastructureProduct_dependsOn, dependsOn);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public InfrastructureProduct setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.variety.javamodel.IInfrastractureProductVariety> selectVarieties() {
    return _getList(cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.variety.javamodel.IInfrastractureProductVariety.class, cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.product.ProductPackage.InfrastructureProduct_varieties);
  }

  public InfrastructureProduct setVarieties(java.util.List<? extends cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.variety.javamodel.IInfrastractureProductVariety> varieties) {
    _setList(cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.product.ProductPackage.InfrastructureProduct_varieties, varieties);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.javamodel.ICluster.class, cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.product.ProductPackage.InfrastructureProduct_cluster, visitor);
    _acceptList(cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.product.javamodel.IInfrastructureProduct.class, cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.product.ProductPackage.InfrastructureProduct_dependsOn, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.variety.javamodel.IInfrastractureProductVariety.class, cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.product.ProductPackage.InfrastructureProduct_varieties, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.product.javamodel.IInfrastructureProduct selectToMeVarieties(cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.variety.javamodel.IInfrastractureProductVariety object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.product.javamodel.IInfrastructureProduct.class, cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.product.ProductPackage.InfrastructureProduct_varieties, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.product.javamodel.IInfrastructureProduct> selectToMeDependsOn(cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.product.javamodel.IInfrastructureProduct object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.product.javamodel.IInfrastructureProduct.class, cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.product.ProductPackage.InfrastructureProduct_dependsOn, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.product.javamodel.IInfrastructureProduct> selectToMeCluster(cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.javamodel.ICluster object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.product.javamodel.IInfrastructureProduct.class, cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.product.ProductPackage.InfrastructureProduct_cluster, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c2b426c5-67bf-11e7-afcc-6df3a81a4d17,FljjMnN5F/W6xt0l3oybH3MQGWA=] */
