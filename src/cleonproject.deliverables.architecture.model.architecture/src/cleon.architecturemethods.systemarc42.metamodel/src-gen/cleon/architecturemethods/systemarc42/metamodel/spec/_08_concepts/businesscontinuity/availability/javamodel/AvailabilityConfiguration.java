package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.businesscontinuity.availability.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class AvailabilityConfiguration extends DynamicResource implements IAvailabilityConfiguration {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAvailabilityConfiguration> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAvailabilityConfiguration>() {
    
    @Override
    public IAvailabilityConfiguration create() {
      return new AvailabilityConfiguration();
    }
    
    @Override
    public IAvailabilityConfiguration create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new AvailabilityConfiguration(resourceRepository, resource);
    }
  
  };

  public AvailabilityConfiguration() {
    super(IAvailabilityConfiguration.TYPE_ID);
  }
  
  public AvailabilityConfiguration(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAvailabilityConfiguration.TYPE_ID);
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
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.util.List<java.lang.String> selectMandatoryDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.MandatoryDescription_mandatoryDescriptions);
  }
    
  public void setMandatoryDescriptions(java.util.List<java.lang.String> mandatoryDescriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.MandatoryDescription_mandatoryDescriptions, mandatoryDescriptions);
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
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public AvailabilityConfiguration setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.MandatoryDescription_mandatoryDescriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // accept enum value visitors

  @Override
  public <R> R accept(IValueVisitor<R> visitor) {
    if (isNone()) return visitor.visitNone();
    if (isActive__S_Active()) return visitor.visitActive__S_Active();
    if (isActive__S_Passive__F___N_Failover__O_()) return visitor.visitActive__S_Passive__F___N_Failover__O_();
    if (isN__Q_1()) return visitor.visitN__Q_1();
    if (isN__Q_M()) return visitor.visitN__Q_M();
    if (isN__S_to__S_1()) return visitor.visitN__S_to__S_1();
    if (isFallback()) return visitor.visitFallback();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isNone()) {
      visitor.visitNone();
      return;
    }
    if (isActive__S_Active()) {
      visitor.visitActive__S_Active();
      return;
    }
    if (isActive__S_Passive__F___N_Failover__O_()) {
      visitor.visitActive__S_Passive__F___N_Failover__O_();
      return;
    }
    if (isN__Q_1()) {
      visitor.visitN__Q_1();
      return;
    }
    if (isN__Q_M()) {
      visitor.visitN__Q_M();
      return;
    }
    if (isN__S_to__S_1()) {
      visitor.visitN__S_to__S_1();
      return;
    }
    if (isFallback()) {
      visitor.visitFallback();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isNone() {
    return getResource().equals(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.businesscontinuity.availability.AvailabilityPackage.AvailabilityConfiguration_None);
  }
  
  @Override
  public boolean isActive__S_Active() {
    return getResource().equals(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.businesscontinuity.availability.AvailabilityPackage.AvailabilityConfiguration_Active__S_Active);
  }
  
  @Override
  public boolean isActive__S_Passive__F___N_Failover__O_() {
    return getResource().equals(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.businesscontinuity.availability.AvailabilityPackage.AvailabilityConfiguration_Active__S_Passive__F___N_Failover__O_);
  }
  
  @Override
  public boolean isN__Q_1() {
    return getResource().equals(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.businesscontinuity.availability.AvailabilityPackage.AvailabilityConfiguration_N__Q_1);
  }
  
  @Override
  public boolean isN__Q_M() {
    return getResource().equals(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.businesscontinuity.availability.AvailabilityPackage.AvailabilityConfiguration_N__Q_M);
  }
  
  @Override
  public boolean isN__S_to__S_1() {
    return getResource().equals(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.businesscontinuity.availability.AvailabilityPackage.AvailabilityConfiguration_N__S_to__S_1);
  }
  
  @Override
  public boolean isFallback() {
    return getResource().equals(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.businesscontinuity.availability.AvailabilityPackage.AvailabilityConfiguration_Fallback);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,21408953-1e38-11e9-865e-41ef48a95f70,jhlmoF/skp16Anhm7frFe8NT++I=] */
