package cleon.conception.architecture.spec.eamod.nsov.v1.nsov.usage.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ServiceUsage extends DynamicResource implements IServiceUsage {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IServiceUsage> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IServiceUsage>() {
    
    @Override
    public IServiceUsage create() {
      return new ServiceUsage();
    }
    
    @Override
    public IServiceUsage create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ServiceUsage(resourceRepository, resource);
    }
  
  };

  public ServiceUsage() {
    super(IServiceUsage.TYPE_ID);
  }
  
  public ServiceUsage(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IServiceUsage.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.id.IdPackage.IntegerBusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.common.resources.spec.resources.id.IdPackage.IntegerBusinessObjectId_identifier, identifier);
  }

  @Override
  public java.lang.String selectShortName() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.resources.spec.resources.naming.NamingPackage.ShortName_shortName);
  }
    
  public void setShortName(java.lang.String shortName) {
     _setSingleAttribute(cleon.common.resources.spec.resources.naming.NamingPackage.ShortName_shortName, shortName);
  }

  // relations
  
  @Override
  public cleon.common.resources.spec.resources.availability.javamodel.IAvailabilityClassification selectAvailabilityClassification() {
    return _getSingle(cleon.common.resources.spec.resources.availability.javamodel.IAvailabilityClassification.class, cleon.conception.architecture.spec.eamod.nsov.v1.nsov.usage.UsagePackage.ServiceUsage_availabilityClassification);
  }

  public ServiceUsage setAvailabilityClassification(cleon.common.resources.spec.resources.availability.javamodel.IAvailabilityClassification availabilityClassification) {
    _setSingle(cleon.conception.architecture.spec.eamod.nsov.v1.nsov.usage.UsagePackage.ServiceUsage_availabilityClassification, availabilityClassification);
    return this;
  }
    
  @Override
  public cleon.common.resources.spec.resources.confidentiality.javamodel.IConfidentialityClassification selectConfidentialityClassification() {
    return _getSingle(cleon.common.resources.spec.resources.confidentiality.javamodel.IConfidentialityClassification.class, cleon.conception.architecture.spec.eamod.nsov.v1.nsov.usage.UsagePackage.ServiceUsage_confidentialityClassification);
  }

  public ServiceUsage setConfidentialityClassification(cleon.common.resources.spec.resources.confidentiality.javamodel.IConfidentialityClassification confidentialityClassification) {
    _setSingle(cleon.conception.architecture.spec.eamod.nsov.v1.nsov.usage.UsagePackage.ServiceUsage_confidentialityClassification, confidentialityClassification);
    return this;
  }
    
  @Override
  public cleon.conception.architecture.spec.eamod.nsov.v1.nsov.javamodel.IService selectService() {
    return _getSingle(cleon.conception.architecture.spec.eamod.nsov.v1.nsov.javamodel.IService.class, cleon.conception.architecture.spec.eamod.nsov.v1.nsov.usage.UsagePackage.ServiceUsage_service);
  }

  public ServiceUsage setService(cleon.conception.architecture.spec.eamod.nsov.v1.nsov.javamodel.IService service) {
    _setSingle(cleon.conception.architecture.spec.eamod.nsov.v1.nsov.usage.UsagePackage.ServiceUsage_service, service);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public ServiceUsage setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ServiceUsage setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.id.IdPackage.IntegerBusinessObjectId_identifier, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.common.resources.spec.resources.naming.NamingPackage.ShortName_shortName, visitor);
    // relations
    _acceptSingle(cleon.common.resources.spec.resources.availability.javamodel.IAvailabilityClassification.class, cleon.conception.architecture.spec.eamod.nsov.v1.nsov.usage.UsagePackage.ServiceUsage_availabilityClassification, visitor);
    _acceptSingle(cleon.common.resources.spec.resources.confidentiality.javamodel.IConfidentialityClassification.class, cleon.conception.architecture.spec.eamod.nsov.v1.nsov.usage.UsagePackage.ServiceUsage_confidentialityClassification, visitor);
    _acceptSingle(cleon.conception.architecture.spec.eamod.nsov.v1.nsov.javamodel.IService.class, cleon.conception.architecture.spec.eamod.nsov.v1.nsov.usage.UsagePackage.ServiceUsage_service, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.conception.architecture.spec.eamod.nsov.v1.nsov.usage.javamodel.IServiceUsage> selectToMeService(cleon.conception.architecture.spec.eamod.nsov.v1.nsov.javamodel.IService object) {
    return _getToMeList(object.getRepository(), cleon.conception.architecture.spec.eamod.nsov.v1.nsov.usage.javamodel.IServiceUsage.class, cleon.conception.architecture.spec.eamod.nsov.v1.nsov.usage.UsagePackage.ServiceUsage_service, object.getResource());
  }
  
  public static java.util.List<cleon.conception.architecture.spec.eamod.nsov.v1.nsov.usage.javamodel.IServiceUsage> selectToMeAvailabilityClassification(cleon.common.resources.spec.resources.availability.javamodel.IAvailabilityClassification object) {
    return _getToMeList(object.getRepository(), cleon.conception.architecture.spec.eamod.nsov.v1.nsov.usage.javamodel.IServiceUsage.class, cleon.conception.architecture.spec.eamod.nsov.v1.nsov.usage.UsagePackage.ServiceUsage_availabilityClassification, object.getResource());
  }
  
  public static java.util.List<cleon.conception.architecture.spec.eamod.nsov.v1.nsov.usage.javamodel.IServiceUsage> selectToMeConfidentialityClassification(cleon.common.resources.spec.resources.confidentiality.javamodel.IConfidentialityClassification object) {
    return _getToMeList(object.getRepository(), cleon.conception.architecture.spec.eamod.nsov.v1.nsov.usage.javamodel.IServiceUsage.class, cleon.conception.architecture.spec.eamod.nsov.v1.nsov.usage.UsagePackage.ServiceUsage_confidentialityClassification, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,665c3da7-c690-11e6-8242-2f0ed6756d77,Y5W9Wk4F5JOh7SY7/TRAsR0qFNc=] */
