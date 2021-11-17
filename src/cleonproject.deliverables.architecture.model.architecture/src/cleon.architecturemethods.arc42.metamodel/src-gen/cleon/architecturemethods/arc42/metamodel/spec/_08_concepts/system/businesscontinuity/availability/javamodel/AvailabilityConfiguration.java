package cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.availability.javamodel;

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

  @Override
  public java.util.List<java.lang.String> selectStandardDescription() {
    return _getListAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.availability.AvailabilityPackage.AvailabilityConfiguration_standardDescription);
  }
    
  public void setStandardDescription(java.util.List<java.lang.String> standardDescription) {
     _setListAttribute(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.availability.AvailabilityPackage.AvailabilityConfiguration_standardDescription, standardDescription);
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
    _acceptListAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.availability.AvailabilityPackage.AvailabilityConfiguration_standardDescription, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // accept enum value visitors

  @Override
  public <R> R accept(IValueVisitor<R> visitor) {
    if (isNone()) return visitor.visitNone();
    if (isActive__S_Active()) return visitor.visitActive__S_Active();
    if (isActive__F___U___F_Active__F_ohne__F_Synchronisation__F___N_Client__S_Based__O_()) return visitor.visitActive__F___U___F_Active__F_ohne__F_Synchronisation__F___N_Client__S_Based__O_();
    if (isActive__S_Passive__F___N_Failover__O_()) return visitor.visitActive__S_Passive__F___N_Failover__O_();
    if (isSicherung__F_und__F_Wiederherstellung()) return visitor.visitSicherung__F_und__F_Wiederherstellung();
    if (isReplikation()) return visitor.visitReplikation();
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
    if (isActive__F___U___F_Active__F_ohne__F_Synchronisation__F___N_Client__S_Based__O_()) {
      visitor.visitActive__F___U___F_Active__F_ohne__F_Synchronisation__F___N_Client__S_Based__O_();
      return;
    }
    if (isActive__S_Passive__F___N_Failover__O_()) {
      visitor.visitActive__S_Passive__F___N_Failover__O_();
      return;
    }
    if (isSicherung__F_und__F_Wiederherstellung()) {
      visitor.visitSicherung__F_und__F_Wiederherstellung();
      return;
    }
    if (isReplikation()) {
      visitor.visitReplikation();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isNone() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.availability.AvailabilityPackage.AvailabilityConfiguration_None);
  }
  
  @Override
  public boolean isActive__S_Active() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.availability.AvailabilityPackage.AvailabilityConfiguration_Active__S_Active);
  }
  
  @Override
  public boolean isActive__F___U___F_Active__F_ohne__F_Synchronisation__F___N_Client__S_Based__O_() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.availability.AvailabilityPackage.AvailabilityConfiguration_Active__F___U___F_Active__F_ohne__F_Synchronisation__F___N_Client__S_Based__O_);
  }
  
  @Override
  public boolean isActive__S_Passive__F___N_Failover__O_() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.availability.AvailabilityPackage.AvailabilityConfiguration_Active__S_Passive__F___N_Failover__O_);
  }
  
  @Override
  public boolean isSicherung__F_und__F_Wiederherstellung() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.availability.AvailabilityPackage.AvailabilityConfiguration_Sicherung__F_und__F_Wiederherstellung);
  }
  
  @Override
  public boolean isReplikation() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.availability.AvailabilityPackage.AvailabilityConfiguration_Replikation);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,21408953-1e38-11e9-865e-41ef48a95f70,5Bdg4tNr1KJ4D0BzPH0I5tfDVME=] */
