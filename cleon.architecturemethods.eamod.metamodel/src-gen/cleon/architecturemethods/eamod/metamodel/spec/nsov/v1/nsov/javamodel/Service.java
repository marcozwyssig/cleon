package cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Service extends DynamicResource implements IService {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IService> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IService>() {
    
    @Override
    public IService create() {
      return new Service();
    }
    
    @Override
    public IService create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Service(resourceRepository, resource);
    }
  
  };

  public Service() {
    super(IService.TYPE_ID);
  }
  
  public Service(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IService.TYPE_ID);
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
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, identifier);
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
  public java.util.List<? extends cleon.common.resources.metamodel.spec.availability.javamodel.IAvailabilityClassification> selectAvailabilityClassification() {
    return _getList(cleon.common.resources.metamodel.spec.availability.javamodel.IAvailabilityClassification.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.NsovPackage.Service_availabilityClassification);
  }

  public Service setAvailabilityClassification(java.util.List<? extends cleon.common.resources.metamodel.spec.availability.javamodel.IAvailabilityClassification> availabilityClassification) {
    _setList(cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.NsovPackage.Service_availabilityClassification, availabilityClassification);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.lifetime.javamodel.IAvailabilityLifetime> selectAvailabilityLifetime() {
    return _getMap(cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.lifetime.javamodel.IAvailabilityLifetime.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.NsovPackage.Service_availabilityLifetime);
  }

  public Service setAvailabilityLifetime(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.lifetime.javamodel.IAvailabilityLifetime> availabilityLifetime) {
    _setMap(cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.NsovPackage.Service_availabilityLifetime, availabilityLifetime);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.resources.metamodel.spec.confidentiality.javamodel.IConfidentialityClassification> selectConfidentialityClassification() {
    return _getList(cleon.common.resources.metamodel.spec.confidentiality.javamodel.IConfidentialityClassification.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.NsovPackage.Service_confidentialityClassification);
  }

  public Service setConfidentialityClassification(java.util.List<? extends cleon.common.resources.metamodel.spec.confidentiality.javamodel.IConfidentialityClassification> confidentialityClassification) {
    _setList(cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.NsovPackage.Service_confidentialityClassification, confidentialityClassification);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.ncv.javamodel.ICapability> selectServiceAimsToAchieve() {
    return _getList(cleon.architecturemethods.eamod.metamodel.spec.ncv.javamodel.ICapability.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.NsovPackage.Service_serviceAimsToAchieve);
  }

  public Service setServiceAimsToAchieve(java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.ncv.javamodel.ICapability> serviceAimsToAchieve) {
    _setList(cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.NsovPackage.Service_serviceAimsToAchieve, serviceAimsToAchieve);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.javamodel.IService> selectServiceComposition() {
    return _getList(cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.javamodel.IService.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.NsovPackage.Service_serviceComposition);
  }

  public Service setServiceComposition(java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.javamodel.IService> serviceComposition) {
    _setList(cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.NsovPackage.Service_serviceComposition, serviceComposition);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.javamodel.IService> selectServiceGeneralisation() {
    return _getList(cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.javamodel.IService.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.NsovPackage.Service_serviceGeneralisation);
  }

  public Service setServiceGeneralisation(java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.javamodel.IService> serviceGeneralisation) {
    _setList(cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.NsovPackage.Service_serviceGeneralisation, serviceGeneralisation);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Service setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.common.resources.metamodel.spec.availability.javamodel.IAvailabilityClassification.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.NsovPackage.Service_availabilityClassification, visitor);
    _acceptMap(cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.lifetime.javamodel.IAvailabilityLifetime.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.NsovPackage.Service_availabilityLifetime, visitor);
    _acceptList(cleon.common.resources.metamodel.spec.confidentiality.javamodel.IConfidentialityClassification.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.NsovPackage.Service_confidentialityClassification, visitor);
    _acceptList(cleon.architecturemethods.eamod.metamodel.spec.ncv.javamodel.ICapability.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.NsovPackage.Service_serviceAimsToAchieve, visitor);
    _acceptList(cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.javamodel.IService.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.NsovPackage.Service_serviceComposition, visitor);
    _acceptList(cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.javamodel.IService.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.NsovPackage.Service_serviceGeneralisation, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.javamodel.IService> selectToMeServiceAimsToAchieve(cleon.architecturemethods.eamod.metamodel.spec.ncv.javamodel.ICapability object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.javamodel.IService.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.NsovPackage.Service_serviceAimsToAchieve, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.javamodel.IService> selectToMeAvailabilityClassification(cleon.common.resources.metamodel.spec.availability.javamodel.IAvailabilityClassification object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.javamodel.IService.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.NsovPackage.Service_availabilityClassification, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.javamodel.IService> selectToMeConfidentialityClassification(cleon.common.resources.metamodel.spec.confidentiality.javamodel.IConfidentialityClassification object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.javamodel.IService.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.NsovPackage.Service_confidentialityClassification, object.getResource());
  }
  
  public static cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.javamodel.IService selectToMeServiceGeneralisation(cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.javamodel.IService object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.javamodel.IService.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.NsovPackage.Service_serviceGeneralisation, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.javamodel.IService> selectToMeServiceComposition(cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.javamodel.IService object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.javamodel.IService.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.NsovPackage.Service_serviceComposition, object.getResource());
  }
  
  public static cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.javamodel.IService selectToMeAvailabilityLifetime(cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.lifetime.javamodel.IAvailabilityLifetime object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.javamodel.IService.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.NsovPackage.Service_availabilityLifetime, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,df40cec4-bc84-11e6-b169-a12bde5a1c7c,6o7jSo32+u+43xTSRnkWI2SaUCk=] */
