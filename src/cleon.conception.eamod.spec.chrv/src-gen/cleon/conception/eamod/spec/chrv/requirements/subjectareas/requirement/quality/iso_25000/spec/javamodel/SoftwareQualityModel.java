package cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.quality.iso_25000.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SoftwareQualityModel extends DynamicResource implements ISoftwareQualityModel {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISoftwareQualityModel> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISoftwareQualityModel>() {
    
    @Override
    public ISoftwareQualityModel create() {
      return new SoftwareQualityModel();
    }
    
    @Override
    public ISoftwareQualityModel create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SoftwareQualityModel(resourceRepository, resource);
    }
  
  };

  public SoftwareQualityModel() {
    super(ISoftwareQualityModel.TYPE_ID);
  }
  
  public SoftwareQualityModel(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISoftwareQualityModel.TYPE_ID);
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
  public java.util.List<? extends cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.quality.iso_25000.spec.javamodel.ISoftwareQualityCharacteristic__F_> selectCharacteristics() {
    return _getList(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.quality.iso_25000.spec.javamodel.ISoftwareQualityCharacteristic__F_.class, cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.quality.iso_25000.spec.SpecPackage.SoftwareQualityModel_characteristics);
  }

  public SoftwareQualityModel setCharacteristics(java.util.List<? extends cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.quality.iso_25000.spec.javamodel.ISoftwareQualityCharacteristic__F_> characteristics) {
    _setList(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.quality.iso_25000.spec.SpecPackage.SoftwareQualityModel_characteristics, characteristics);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SoftwareQualityModel setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.quality.iso_25000.spec.javamodel.ISoftwareQualityCharacteristic__F_.class, cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.quality.iso_25000.spec.SpecPackage.SoftwareQualityModel_characteristics, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.quality.iso_25000.spec.javamodel.ISoftwareQualityModel selectToMeCharacteristics(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.quality.iso_25000.spec.javamodel.ISoftwareQualityCharacteristic__F_ object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.quality.iso_25000.spec.javamodel.ISoftwareQualityModel.class, cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.quality.iso_25000.spec.SpecPackage.SoftwareQualityModel_characteristics, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a54b1cd8-0e04-11e6-ae01-ef640c578b9b,o9wPjiCNxplcASwJkA6UbTqQVZY=] */
