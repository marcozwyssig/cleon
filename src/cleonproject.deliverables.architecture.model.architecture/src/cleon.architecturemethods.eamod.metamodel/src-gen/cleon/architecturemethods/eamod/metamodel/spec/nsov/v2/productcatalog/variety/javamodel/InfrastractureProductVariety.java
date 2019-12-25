package cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.variety.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class InfrastractureProductVariety extends DynamicResource implements IInfrastractureProductVariety {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInfrastractureProductVariety> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInfrastractureProductVariety>() {
    
    @Override
    public IInfrastractureProductVariety create() {
      return new InfrastractureProductVariety();
    }
    
    @Override
    public IInfrastractureProductVariety create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new InfrastractureProductVariety(resourceRepository, resource);
    }
  
  };

  public InfrastractureProductVariety() {
    super(IInfrastractureProductVariety.TYPE_ID);
  }
  
  public InfrastractureProductVariety(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IInfrastractureProductVariety.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectAvailability() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.variety.VarietyPackage.InfrastractureProductVariety_availability);
  }
    
  public void setAvailability(java.lang.String availability) {
     _setSingleAttribute(cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.variety.VarietyPackage.InfrastractureProductVariety_availability, availability);
  }

  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.util.List<java.lang.String> selectConfidentiality() {
    return _getListAttribute(java.lang.String.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.variety.VarietyPackage.InfrastractureProductVariety_confidentiality);
  }
    
  public void setConfidentiality(java.util.List<java.lang.String> confidentiality) {
     _setListAttribute(cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.variety.VarietyPackage.InfrastractureProductVariety_confidentiality, confidentiality);
  }

  @Override
  public java.lang.String selectCostmanager() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.variety.VarietyPackage.InfrastractureProductVariety_costmanager);
  }
    
  public void setCostmanager(java.lang.String costmanager) {
     _setSingleAttribute(cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.variety.VarietyPackage.InfrastractureProductVariety_costmanager, costmanager);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.String selectKey() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.variety.VarietyPackage.Variety_key);
  }
    
  public void setKey(java.lang.String key) {
     _setSingleAttribute(cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.variety.VarietyPackage.Variety_key, key);
  }

  @Override
  public java.lang.String selectLifecycle() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.variety.VarietyPackage.InfrastractureProductVariety_lifecycle);
  }
    
  public void setLifecycle(java.lang.String lifecycle) {
     _setSingleAttribute(cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.variety.VarietyPackage.InfrastractureProductVariety_lifecycle, lifecycle);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectProductmanager() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.variety.VarietyPackage.InfrastractureProductVariety_productmanager);
  }
    
  public void setProductmanager(java.lang.String productmanager) {
     _setSingleAttribute(cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.variety.VarietyPackage.InfrastractureProductVariety_productmanager, productmanager);
  }

  @Override
  public java.lang.String selectServicemanager() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.variety.VarietyPackage.InfrastractureProductVariety_servicemanager);
  }
    
  public void setServicemanager(java.lang.String servicemanager) {
     _setSingleAttribute(cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.variety.VarietyPackage.InfrastractureProductVariety_servicemanager, servicemanager);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.variety.javamodel.IInfrastractureProductVariety> selectDependsOn() {
    return _getList(cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.variety.javamodel.IInfrastractureProductVariety.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.variety.VarietyPackage.InfrastractureProductVariety_dependsOn);
  }

  public InfrastractureProductVariety setDependsOn(java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.variety.javamodel.IInfrastractureProductVariety> dependsOn) {
    _setList(cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.variety.VarietyPackage.InfrastractureProductVariety_dependsOn, dependsOn);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.variety.javamodel.IInfrastractureProductVariety> selectPotentialReusage() {
    return _getList(cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.variety.javamodel.IInfrastractureProductVariety.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.variety.VarietyPackage.InfrastractureProductVariety_potentialReusage);
  }

  public InfrastractureProductVariety setPotentialReusage(java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.variety.javamodel.IInfrastractureProductVariety> potentialReusage) {
    _setList(cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.variety.VarietyPackage.InfrastractureProductVariety_potentialReusage, potentialReusage);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public InfrastractureProductVariety setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.variety.VarietyPackage.InfrastractureProductVariety_availability, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.variety.VarietyPackage.InfrastractureProductVariety_confidentiality, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.variety.VarietyPackage.InfrastractureProductVariety_costmanager, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.variety.VarietyPackage.Variety_key, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.variety.VarietyPackage.InfrastractureProductVariety_lifecycle, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.variety.VarietyPackage.InfrastractureProductVariety_productmanager, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.variety.VarietyPackage.InfrastractureProductVariety_servicemanager, visitor);
    // relations
    _acceptList(cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.variety.javamodel.IInfrastractureProductVariety.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.variety.VarietyPackage.InfrastractureProductVariety_dependsOn, visitor);
    _acceptList(cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.variety.javamodel.IInfrastractureProductVariety.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.variety.VarietyPackage.InfrastractureProductVariety_potentialReusage, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.variety.javamodel.IInfrastractureProductVariety> selectToMeDependsOn(cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.variety.javamodel.IInfrastractureProductVariety object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.variety.javamodel.IInfrastractureProductVariety.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.variety.VarietyPackage.InfrastractureProductVariety_dependsOn, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.variety.javamodel.IInfrastractureProductVariety> selectToMePotentialReusage(cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.variety.javamodel.IInfrastractureProductVariety object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.variety.javamodel.IInfrastractureProductVariety.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v2.productcatalog.variety.VarietyPackage.InfrastractureProductVariety_potentialReusage, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2b07341a-67c5-11e7-afcc-6df3a81a4d17,J0mfAGjVHRaQNIJlh3mOPPwXV1M=] */
