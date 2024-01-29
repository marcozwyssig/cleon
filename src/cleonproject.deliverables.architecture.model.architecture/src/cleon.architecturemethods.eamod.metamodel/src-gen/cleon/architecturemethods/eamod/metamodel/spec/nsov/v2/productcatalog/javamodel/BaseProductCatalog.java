package cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class BaseProductCatalog extends DynamicResource implements IBaseProductCatalog {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBaseProductCatalog> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBaseProductCatalog>() {
    
    @Override
    public IBaseProductCatalog create() {
      return new BaseProductCatalog();
    }
    
    @Override
    public IBaseProductCatalog create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new BaseProductCatalog(resourceRepository, resource);
    }
  
  };

  public BaseProductCatalog() {
    super(IBaseProductCatalog.TYPE_ID);
  }
  
  public BaseProductCatalog(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IBaseProductCatalog.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.template.xmi.javamodel.IXmiClass> selectAggregates() {
    return _getList(cleon.modelinglanguages.uml.metamodel.template.xmi.javamodel.IXmiClass.class, cleon.modelinglanguages.uml.metamodel.template.xmi.XmiPackage.XmiAggregation_aggregates);
  }

  public BaseProductCatalog setAggregates(java.util.List<? extends cleon.modelinglanguages.uml.metamodel.template.xmi.javamodel.IXmiClass> aggregates) {
    _setList(cleon.modelinglanguages.uml.metamodel.template.xmi.XmiPackage.XmiAggregation_aggregates, aggregates);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.productgroup.javamodel.IBaseProductGroup> selectBaseProductGroups() {
    return _getList(cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.productgroup.javamodel.IBaseProductGroup.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.ProductcatalogPackage.BaseProductCatalog_baseProductGroups);
  }

  public BaseProductCatalog setBaseProductGroups(java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.productgroup.javamodel.IBaseProductGroup> baseProductGroups) {
    _setList(cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.ProductcatalogPackage.BaseProductCatalog_baseProductGroups, baseProductGroups);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.productgroup.javamodel.IProductGroup> selectProductGroups() {
    return _getList(cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.productgroup.javamodel.IProductGroup.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.ProductcatalogPackage.Catalog_productGroups);
  }

  public BaseProductCatalog setProductGroups(java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.productgroup.javamodel.IProductGroup> productGroups) {
    _setList(cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.ProductcatalogPackage.Catalog_productGroups, productGroups);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public BaseProductCatalog setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.productgroup.javamodel.IBaseProductGroup.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.ProductcatalogPackage.BaseProductCatalog_baseProductGroups, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.javamodel.IBaseProductCatalog selectToMeBaseProductGroups(cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.productgroup.javamodel.IBaseProductGroup object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.javamodel.IBaseProductCatalog.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.ProductcatalogPackage.BaseProductCatalog_baseProductGroups, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,84ac0122-67c6-11e7-afcc-6df3a81a4d17,/c54J6wUqIU90A/r9CZ+EugUFYo=] */
