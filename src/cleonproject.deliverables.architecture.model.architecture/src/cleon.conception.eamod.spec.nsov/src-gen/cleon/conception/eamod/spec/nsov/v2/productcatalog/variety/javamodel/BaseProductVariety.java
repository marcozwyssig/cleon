package cleon.conception.eamod.spec.nsov.v2.productcatalog.variety.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class BaseProductVariety extends DynamicResource implements IBaseProductVariety {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBaseProductVariety> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBaseProductVariety>() {
    
    @Override
    public IBaseProductVariety create() {
      return new BaseProductVariety();
    }
    
    @Override
    public IBaseProductVariety create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new BaseProductVariety(resourceRepository, resource);
    }
  
  };

  public BaseProductVariety() {
    super(IBaseProductVariety.TYPE_ID);
  }
  
  public BaseProductVariety(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IBaseProductVariety.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectKey() {
    return _getSingleAttribute(java.lang.String.class, cleon.conception.eamod.spec.nsov.v2.productcatalog.variety.VarietyPackage.Variety_key);
  }
    
  public void setKey(java.lang.String key) {
     _setSingleAttribute(cleon.conception.eamod.spec.nsov.v2.productcatalog.variety.VarietyPackage.Variety_key, key);
  }

  // relations
  
  @Override
  public cleon.conception.eamod.spec.nsov.v2.productcatalog.variety.javamodel.IInfrastractureProductVariety selectInfrastractureProductVariety() {
    return _getSingle(cleon.conception.eamod.spec.nsov.v2.productcatalog.variety.javamodel.IInfrastractureProductVariety.class, cleon.conception.eamod.spec.nsov.v2.productcatalog.variety.VarietyPackage.BaseProductVariety_infrastractureProductVariety);
  }

  public BaseProductVariety setInfrastractureProductVariety(cleon.conception.eamod.spec.nsov.v2.productcatalog.variety.javamodel.IInfrastractureProductVariety infrastractureProductVariety) {
    _setSingle(cleon.conception.eamod.spec.nsov.v2.productcatalog.variety.VarietyPackage.BaseProductVariety_infrastractureProductVariety, infrastractureProductVariety);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public BaseProductVariety setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public BaseProductVariety setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.conception.eamod.spec.nsov.v2.productcatalog.variety.VarietyPackage.Variety_key, visitor);
    // relations
    _acceptSingle(cleon.conception.eamod.spec.nsov.v2.productcatalog.variety.javamodel.IInfrastractureProductVariety.class, cleon.conception.eamod.spec.nsov.v2.productcatalog.variety.VarietyPackage.BaseProductVariety_infrastractureProductVariety, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.conception.eamod.spec.nsov.v2.productcatalog.variety.javamodel.IBaseProductVariety> selectToMeInfrastractureProductVariety(cleon.conception.eamod.spec.nsov.v2.productcatalog.variety.javamodel.IInfrastractureProductVariety object) {
    return _getToMeList(object.getRepository(), cleon.conception.eamod.spec.nsov.v2.productcatalog.variety.javamodel.IBaseProductVariety.class, cleon.conception.eamod.spec.nsov.v2.productcatalog.variety.VarietyPackage.BaseProductVariety_infrastractureProductVariety, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,26bbf5b0-67c5-11e7-afcc-6df3a81a4d17,QVdzMAmsDipJirwWGYK5xvsiyks=] */
