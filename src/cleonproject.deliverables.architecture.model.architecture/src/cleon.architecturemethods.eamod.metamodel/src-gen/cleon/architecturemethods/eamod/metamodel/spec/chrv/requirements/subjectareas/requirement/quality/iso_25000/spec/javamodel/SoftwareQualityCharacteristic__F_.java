package cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.quality.iso_25000.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SoftwareQualityCharacteristic__F_ extends DynamicResource implements ISoftwareQualityCharacteristic__F_ {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISoftwareQualityCharacteristic__F_> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISoftwareQualityCharacteristic__F_>() {
    
    @Override
    public ISoftwareQualityCharacteristic__F_ create() {
      return new SoftwareQualityCharacteristic__F_();
    }
    
    @Override
    public ISoftwareQualityCharacteristic__F_ create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SoftwareQualityCharacteristic__F_(resourceRepository, resource);
    }
  
  };

  public SoftwareQualityCharacteristic__F_() {
    super(ISoftwareQualityCharacteristic__F_.TYPE_ID);
  }
  
  public SoftwareQualityCharacteristic__F_(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISoftwareQualityCharacteristic__F_.TYPE_ID);
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
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.quality.iso_25000.spec.javamodel.ISoftwareQuality> selectQualities() {
    return _getList(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.quality.iso_25000.spec.javamodel.ISoftwareQuality.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.quality.iso_25000.spec.SpecPackage.SoftwareQualityCharacteristic__F__qualities);
  }

  public SoftwareQualityCharacteristic__F_ setQualities(java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.quality.iso_25000.spec.javamodel.ISoftwareQuality> qualities) {
    _setList(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.quality.iso_25000.spec.SpecPackage.SoftwareQualityCharacteristic__F__qualities, qualities);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SoftwareQualityCharacteristic__F_ setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.quality.iso_25000.spec.javamodel.ISoftwareQuality.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.quality.iso_25000.spec.SpecPackage.SoftwareQualityCharacteristic__F__qualities, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.quality.iso_25000.spec.javamodel.ISoftwareQualityCharacteristic__F_ selectToMeQualities(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.quality.iso_25000.spec.javamodel.ISoftwareQuality object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.quality.iso_25000.spec.javamodel.ISoftwareQualityCharacteristic__F_.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.quality.iso_25000.spec.SpecPackage.SoftwareQualityCharacteristic__F__qualities, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,5147d97b-0e04-11e6-ae01-ef640c578b9b,/gyA3EVcbD1axvcBp9em43Kpfl8=] */
