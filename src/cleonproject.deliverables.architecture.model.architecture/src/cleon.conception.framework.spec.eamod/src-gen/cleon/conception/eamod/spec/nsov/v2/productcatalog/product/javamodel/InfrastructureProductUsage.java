package cleon.conception.eamod.spec.nsov.v2.productcatalog.product.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class InfrastructureProductUsage extends DynamicResource implements IInfrastructureProductUsage {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInfrastructureProductUsage> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInfrastructureProductUsage>() {
    
    @Override
    public IInfrastructureProductUsage create() {
      return new InfrastructureProductUsage();
    }
    
    @Override
    public IInfrastructureProductUsage create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new InfrastructureProductUsage(resourceRepository, resource);
    }
  
  };

  public InfrastructureProductUsage() {
    super(IInfrastructureProductUsage.TYPE_ID);
  }
  
  public InfrastructureProductUsage(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IInfrastructureProductUsage.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.conception.eamod.spec.nsov.v2.productcatalog.product.javamodel.IInfrastructureProduct selectInfrastructureProduct() {
    return _getSingle(cleon.conception.eamod.spec.nsov.v2.productcatalog.product.javamodel.IInfrastructureProduct.class, cleon.conception.eamod.spec.nsov.v2.productcatalog.product.ProductPackage.InfrastructureProductUsage_infrastructureProduct);
  }

  public InfrastructureProductUsage setInfrastructureProduct(cleon.conception.eamod.spec.nsov.v2.productcatalog.product.javamodel.IInfrastructureProduct infrastructureProduct) {
    _setSingle(cleon.conception.eamod.spec.nsov.v2.productcatalog.product.ProductPackage.InfrastructureProductUsage_infrastructureProduct, infrastructureProduct);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public InfrastructureProductUsage setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public InfrastructureProductUsage setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.conception.eamod.spec.nsov.v2.productcatalog.variety.javamodel.IBaseProductVariety> selectVarieties() {
    return _getMap(cleon.conception.eamod.spec.nsov.v2.productcatalog.variety.javamodel.IBaseProductVariety.class, cleon.conception.eamod.spec.nsov.v2.productcatalog.product.ProductPackage.InfrastructureProductUsage_varieties);
  }

  public InfrastructureProductUsage setVarieties(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.conception.eamod.spec.nsov.v2.productcatalog.variety.javamodel.IBaseProductVariety> varieties) {
    _setMap(cleon.conception.eamod.spec.nsov.v2.productcatalog.product.ProductPackage.InfrastructureProductUsage_varieties, varieties);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.conception.eamod.spec.nsov.v2.productcatalog.product.javamodel.IInfrastructureProduct.class, cleon.conception.eamod.spec.nsov.v2.productcatalog.product.ProductPackage.InfrastructureProductUsage_infrastructureProduct, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptMap(cleon.conception.eamod.spec.nsov.v2.productcatalog.variety.javamodel.IBaseProductVariety.class, cleon.conception.eamod.spec.nsov.v2.productcatalog.product.ProductPackage.InfrastructureProductUsage_varieties, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.conception.eamod.spec.nsov.v2.productcatalog.product.javamodel.IInfrastructureProductUsage> selectToMeInfrastructureProduct(cleon.conception.eamod.spec.nsov.v2.productcatalog.product.javamodel.IInfrastructureProduct object) {
    return _getToMeList(object.getRepository(), cleon.conception.eamod.spec.nsov.v2.productcatalog.product.javamodel.IInfrastructureProductUsage.class, cleon.conception.eamod.spec.nsov.v2.productcatalog.product.ProductPackage.InfrastructureProductUsage_infrastructureProduct, object.getResource());
  }
  
  public static cleon.conception.eamod.spec.nsov.v2.productcatalog.product.javamodel.IInfrastructureProductUsage selectToMeVarieties(cleon.conception.eamod.spec.nsov.v2.productcatalog.variety.javamodel.IBaseProductVariety object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.eamod.spec.nsov.v2.productcatalog.product.javamodel.IInfrastructureProductUsage.class, cleon.conception.eamod.spec.nsov.v2.productcatalog.product.ProductPackage.InfrastructureProductUsage_varieties, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,bd36f21c-67d1-11e7-afcc-6df3a81a4d17,JOMTE8g/dMUkFQE+A9kLhKxtkKo=] */
