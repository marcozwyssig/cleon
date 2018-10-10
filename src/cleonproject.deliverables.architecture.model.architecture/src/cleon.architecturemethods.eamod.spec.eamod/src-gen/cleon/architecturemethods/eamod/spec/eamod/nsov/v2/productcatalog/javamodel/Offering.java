package cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Offering extends DynamicResource implements IOffering {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOffering> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOffering>() {
    
    @Override
    public IOffering create() {
      return new Offering();
    }
    
    @Override
    public IOffering create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Offering(resourceRepository, resource);
    }
  
  };

  public Offering() {
    super(IOffering.TYPE_ID);
  }
  
  public Offering(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IOffering.TYPE_ID);
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
  public java.util.List<? extends cleon.common.xml.spec.xmi.javamodel.IXmiClass> selectAggregates() {
    return _getList(cleon.common.xml.spec.xmi.javamodel.IXmiClass.class, cleon.common.xml.spec.xmi.XmiPackage.XmiAggregation_aggregates);
  }

  public Offering setAggregates(java.util.List<? extends cleon.common.xml.spec.xmi.javamodel.IXmiClass> aggregates) {
    _setList(cleon.common.xml.spec.xmi.XmiPackage.XmiAggregation_aggregates, aggregates);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.javamodel.IBaseProductCatalog selectBaseProductCatalog() {
    return _getSingle(cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.javamodel.IBaseProductCatalog.class, cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.ProductcatalogPackage.Offering_baseProductCatalog);
  }

  public Offering setBaseProductCatalog(cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.javamodel.IBaseProductCatalog baseProductCatalog) {
    _setSingle(cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.ProductcatalogPackage.Offering_baseProductCatalog, baseProductCatalog);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.javamodel.ICluster> selectClusters() {
    return _getList(cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.javamodel.ICluster.class, cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.ProductcatalogPackage.Offering_clusters);
  }

  public Offering setClusters(java.util.List<? extends cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.javamodel.ICluster> clusters) {
    _setList(cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.ProductcatalogPackage.Offering_clusters, clusters);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.javamodel.IInfrastructureProductCatalog selectInfrastructureProductCatalog() {
    return _getSingle(cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.javamodel.IInfrastructureProductCatalog.class, cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.ProductcatalogPackage.Offering_infrastructureProductCatalog);
  }

  public Offering setInfrastructureProductCatalog(cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.javamodel.IInfrastructureProductCatalog infrastructureProductCatalog) {
    _setSingle(cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.ProductcatalogPackage.Offering_infrastructureProductCatalog, infrastructureProductCatalog);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.javamodel.IOffering> selectReusage() {
    return _getList(cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.javamodel.IOffering.class, cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.ProductcatalogPackage.Offering_reusage);
  }

  public Offering setReusage(java.util.List<? extends cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.javamodel.IOffering> reusage) {
    _setList(cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.ProductcatalogPackage.Offering_reusage, reusage);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Offering setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.common.xml.spec.xmi.javamodel.IXmiClass.class, cleon.common.xml.spec.xmi.XmiPackage.XmiAggregation_aggregates, visitor);
    _acceptSingle(cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.javamodel.IBaseProductCatalog.class, cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.ProductcatalogPackage.Offering_baseProductCatalog, visitor);
    _acceptList(cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.javamodel.ICluster.class, cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.ProductcatalogPackage.Offering_clusters, visitor);
    _acceptSingle(cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.javamodel.IInfrastructureProductCatalog.class, cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.ProductcatalogPackage.Offering_infrastructureProductCatalog, visitor);
    _acceptList(cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.javamodel.IOffering.class, cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.ProductcatalogPackage.Offering_reusage, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.javamodel.IOffering selectToMeBaseProductCatalog(cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.javamodel.IBaseProductCatalog object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.javamodel.IOffering.class, cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.ProductcatalogPackage.Offering_baseProductCatalog, object.getResource());
  }
  
  public static cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.javamodel.IOffering selectToMeInfrastructureProductCatalog(cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.javamodel.IInfrastructureProductCatalog object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.javamodel.IOffering.class, cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.ProductcatalogPackage.Offering_infrastructureProductCatalog, object.getResource());
  }
  
  public static cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.javamodel.IOffering selectToMeClusters(cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.javamodel.ICluster object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.javamodel.IOffering.class, cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.ProductcatalogPackage.Offering_clusters, object.getResource());
  }
  
  public static cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.javamodel.IOffering selectToMeReusage(cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.javamodel.IOffering object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.javamodel.IOffering.class, cleon.architecturemethods.eamod.spec.eamod.nsov.v2.productcatalog.ProductcatalogPackage.Offering_reusage, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a1a10c17-67bf-11e7-afcc-6df3a81a4d17,Nh/pMz6DmoLnpnM79yhMED/nu9o=] */
