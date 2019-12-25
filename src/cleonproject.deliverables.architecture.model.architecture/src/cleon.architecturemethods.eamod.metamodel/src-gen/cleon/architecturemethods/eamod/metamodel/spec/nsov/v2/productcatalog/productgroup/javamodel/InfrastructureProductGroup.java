package cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.productgroup.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class InfrastructureProductGroup extends DynamicResource implements IInfrastructureProductGroup {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInfrastructureProductGroup> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInfrastructureProductGroup>() {
    
    @Override
    public IInfrastructureProductGroup create() {
      return new InfrastructureProductGroup();
    }
    
    @Override
    public IInfrastructureProductGroup create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new InfrastructureProductGroup(resourceRepository, resource);
    }
  
  };

  public InfrastructureProductGroup() {
    super(IInfrastructureProductGroup.TYPE_ID);
  }
  
  public InfrastructureProductGroup(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IInfrastructureProductGroup.TYPE_ID);
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

  public InfrastructureProductGroup setAggregates(java.util.List<? extends cleon.modelinglanguages.uml.template.xmi.javamodel.IXmiClass> aggregates) {
    _setList(cleon.modelinglanguages.uml.template.xmi.XmiPackage.XmiAggregation_aggregates, aggregates);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.productgroup.javamodel.IInfrastructureProductGroup> selectDependsOn() {
    return _getList(cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.productgroup.javamodel.IInfrastructureProductGroup.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.productgroup.ProductgroupPackage.InfrastructureProductGroup_dependsOn);
  }

  public InfrastructureProductGroup setDependsOn(java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.productgroup.javamodel.IInfrastructureProductGroup> dependsOn) {
    _setList(cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.productgroup.ProductgroupPackage.InfrastructureProductGroup_dependsOn, dependsOn);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.product.javamodel.IInfrastructureProduct> selectInfrastructureProducts() {
    return _getList(cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.product.javamodel.IInfrastructureProduct.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.productgroup.ProductgroupPackage.InfrastructureProductGroup_infrastructureProducts);
  }

  public InfrastructureProductGroup setInfrastructureProducts(java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.product.javamodel.IInfrastructureProduct> infrastructureProducts) {
    _setList(cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.productgroup.ProductgroupPackage.InfrastructureProductGroup_infrastructureProducts, infrastructureProducts);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.product.javamodel.IProduct> selectProducts() {
    return _getList(cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.product.javamodel.IProduct.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.productgroup.ProductgroupPackage.ProductGroup_products);
  }

  public InfrastructureProductGroup setProducts(java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.product.javamodel.IProduct> products) {
    _setList(cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.productgroup.ProductgroupPackage.ProductGroup_products, products);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public InfrastructureProductGroup setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.productgroup.javamodel.IInfrastructureProductGroup.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.productgroup.ProductgroupPackage.InfrastructureProductGroup_dependsOn, visitor);
    _acceptList(cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.product.javamodel.IInfrastructureProduct.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.productgroup.ProductgroupPackage.InfrastructureProductGroup_infrastructureProducts, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.productgroup.javamodel.IInfrastructureProductGroup selectToMeInfrastructureProducts(cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.product.javamodel.IInfrastructureProduct object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.productgroup.javamodel.IInfrastructureProductGroup.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.productgroup.ProductgroupPackage.InfrastructureProductGroup_infrastructureProducts, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.productgroup.javamodel.IInfrastructureProductGroup> selectToMeDependsOn(cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.productgroup.javamodel.IInfrastructureProductGroup object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.productgroup.javamodel.IInfrastructureProductGroup.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.productgroup.ProductgroupPackage.InfrastructureProductGroup_dependsOn, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,761e31cd-6897-11e7-9be5-6dfce969ae4e,/ajjzDAHsHXjJPhRgSeP65M/mMA=] */
