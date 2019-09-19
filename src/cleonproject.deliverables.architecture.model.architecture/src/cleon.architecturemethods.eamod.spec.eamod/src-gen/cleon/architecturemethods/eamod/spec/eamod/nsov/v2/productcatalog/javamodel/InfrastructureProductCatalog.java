package cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class InfrastructureProductCatalog extends DynamicResource implements IInfrastructureProductCatalog {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInfrastructureProductCatalog> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInfrastructureProductCatalog>() {
    
    @Override
    public IInfrastructureProductCatalog create() {
      return new InfrastructureProductCatalog();
    }
    
    @Override
    public IInfrastructureProductCatalog create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new InfrastructureProductCatalog(resourceRepository, resource);
    }
  
  };

  public InfrastructureProductCatalog() {
    super(IInfrastructureProductCatalog.TYPE_ID);
  }
  
  public InfrastructureProductCatalog(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IInfrastructureProductCatalog.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.xml.spec.xmi.javamodel.IXmiClass> selectAggregates() {
    return _getList(cleon.common.xml.spec.xmi.javamodel.IXmiClass.class, cleon.common.xml.spec.xmi.XmiPackage.XmiAggregation_aggregates);
  }

  public InfrastructureProductCatalog setAggregates(java.util.List<? extends cleon.common.xml.spec.xmi.javamodel.IXmiClass> aggregates) {
    _setList(cleon.common.xml.spec.xmi.XmiPackage.XmiAggregation_aggregates, aggregates);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.productgroup.javamodel.IInfrastructureProductGroup> selectInfrastructureProductGroups() {
    return _getList(cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.productgroup.javamodel.IInfrastructureProductGroup.class, cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.ProductcatalogPackage.InfrastructureProductCatalog_infrastructureProductGroups);
  }

  public InfrastructureProductCatalog setInfrastructureProductGroups(java.util.List<? extends cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.productgroup.javamodel.IInfrastructureProductGroup> infrastructureProductGroups) {
    _setList(cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.ProductcatalogPackage.InfrastructureProductCatalog_infrastructureProductGroups, infrastructureProductGroups);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.productgroup.javamodel.IProductGroup> selectProductGroups() {
    return _getList(cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.productgroup.javamodel.IProductGroup.class, cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.ProductcatalogPackage.Catalog_productGroups);
  }

  public InfrastructureProductCatalog setProductGroups(java.util.List<? extends cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.productgroup.javamodel.IProductGroup> productGroups) {
    _setList(cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.ProductcatalogPackage.Catalog_productGroups, productGroups);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public InfrastructureProductCatalog setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.productgroup.javamodel.IInfrastructureProductGroup.class, cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.ProductcatalogPackage.InfrastructureProductCatalog_infrastructureProductGroups, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.javamodel.IInfrastructureProductCatalog selectToMeInfrastructureProductGroups(cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.productgroup.javamodel.IInfrastructureProductGroup object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.javamodel.IInfrastructureProductCatalog.class, cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.ProductcatalogPackage.InfrastructureProductCatalog_infrastructureProductGroups, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7a7e912c-67c6-11e7-afcc-6df3a81a4d17,mGpADBNz6rK2pRhVVQi9iSE5hRg=] */
