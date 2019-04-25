package cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.businesscontinuity.availability.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class AvailabilitySystemConfiguration extends DynamicResource implements IAvailabilitySystemConfiguration {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAvailabilitySystemConfiguration> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAvailabilitySystemConfiguration>() {
    
    @Override
    public IAvailabilitySystemConfiguration create() {
      return new AvailabilitySystemConfiguration();
    }
    
    @Override
    public IAvailabilitySystemConfiguration create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new AvailabilitySystemConfiguration(resourceRepository, resource);
    }
  
  };

  public AvailabilitySystemConfiguration() {
    super(IAvailabilitySystemConfiguration.TYPE_ID);
  }
  
  public AvailabilitySystemConfiguration(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAvailabilitySystemConfiguration.TYPE_ID);
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

  // relations
  
  @Override
  public cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.businesscontinuity.availability.javamodel.IAvailabilityConfiguration selectAvailability() {
    return _getSingle(cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.businesscontinuity.availability.javamodel.IAvailabilityConfiguration.class, cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.businesscontinuity.availability.AvailabilityPackage.AvailabilitySystemConfiguration_availability);
  }

  public AvailabilitySystemConfiguration setAvailability(cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.businesscontinuity.availability.javamodel.IAvailabilityConfiguration availability) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.businesscontinuity.availability.AvailabilityPackage.AvailabilitySystemConfiguration_availability, availability);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemConfiguration selectSystemConfiguration() {
    return _getSingle(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemConfiguration.class, cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.businesscontinuity.availability.AvailabilityPackage.AvailabilitySystemConfiguration_systemConfiguration);
  }

  public AvailabilitySystemConfiguration setSystemConfiguration(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemConfiguration systemConfiguration) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.businesscontinuity.availability.AvailabilityPackage.AvailabilitySystemConfiguration_systemConfiguration, systemConfiguration);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public AvailabilitySystemConfiguration setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public AvailabilitySystemConfiguration setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.businesscontinuity.availability.javamodel.IAvailabilityConfiguration.class, cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.businesscontinuity.availability.AvailabilityPackage.AvailabilitySystemConfiguration_availability, visitor);
    _acceptSingle(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemConfiguration.class, cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.businesscontinuity.availability.AvailabilityPackage.AvailabilitySystemConfiguration_systemConfiguration, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.businesscontinuity.availability.javamodel.IAvailabilitySystemConfiguration> selectToMeSystemConfiguration(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemConfiguration object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.businesscontinuity.availability.javamodel.IAvailabilitySystemConfiguration.class, cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.businesscontinuity.availability.AvailabilityPackage.AvailabilitySystemConfiguration_systemConfiguration, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.businesscontinuity.availability.javamodel.IAvailabilitySystemConfiguration> selectToMeAvailability(cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.businesscontinuity.availability.javamodel.IAvailabilityConfiguration object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.businesscontinuity.availability.javamodel.IAvailabilitySystemConfiguration.class, cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.businesscontinuity.availability.AvailabilityPackage.AvailabilitySystemConfiguration_availability, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,68803d0a-1e37-11e9-865e-41ef48a95f70,YE/H5NdVp9u8jdXjeF8dItkjn/E=] */
