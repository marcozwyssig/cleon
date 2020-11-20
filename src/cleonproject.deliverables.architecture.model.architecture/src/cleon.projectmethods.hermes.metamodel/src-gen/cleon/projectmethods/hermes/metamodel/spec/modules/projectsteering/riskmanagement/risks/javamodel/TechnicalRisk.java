package cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TechnicalRisk extends DynamicResource implements ITechnicalRisk {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITechnicalRisk> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITechnicalRisk>() {
    
    @Override
    public ITechnicalRisk create() {
      return new TechnicalRisk();
    }
    
    @Override
    public ITechnicalRisk create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TechnicalRisk(resourceRepository, resource);
    }
  
  };

  public TechnicalRisk() {
    super(ITechnicalRisk.TYPE_ID);
  }
  
  public TechnicalRisk(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITechnicalRisk.TYPE_ID);
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
  public cleon.common.calendar.metamodel.spec.javamodel.IDay selectEntryDate() {
    return _getSingle(cleon.common.calendar.metamodel.spec.javamodel.IDay.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.RisksPackage.Risk_entryDate);
  }

  public TechnicalRisk setEntryDate(cleon.common.calendar.metamodel.spec.javamodel.IDay entryDate) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.RisksPackage.Risk_entryDate, entryDate);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.impactarea.javamodel.IImpactType selectImpactType() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.impactarea.javamodel.IImpactType.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.RisksPackage.Risk_impactType);
  }

  public TechnicalRisk setImpactType(cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.impactarea.javamodel.IImpactType impactType) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.RisksPackage.Risk_impactType, impactType);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IPerson selectOwner() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IPerson.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.PersonsPackage.OwnerAware_owner);
  }

  public TechnicalRisk setOwner(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IPerson owner) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.PersonsPackage.OwnerAware_owner, owner);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.javamodel.IRiskState selectRiskState() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.javamodel.IRiskState.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.RisksPackage.Risk_riskState);
  }

  public TechnicalRisk setRiskState(cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.javamodel.IRiskState riskState) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.RisksPackage.Risk_riskState, riskState);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.javamodel.IRiskType selectType() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.javamodel.IRiskType.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.RisksPackage.Risk_type);
  }

  public TechnicalRisk setType(cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.javamodel.IRiskType type) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.RisksPackage.Risk_type, type);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TechnicalRisk setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.MandatoryDescription_mandatoryDescriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(cleon.common.calendar.metamodel.spec.javamodel.IDay.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.RisksPackage.Risk_entryDate, visitor);
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.impactarea.javamodel.IImpactType.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.RisksPackage.Risk_impactType, visitor);
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IPerson.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.PersonsPackage.OwnerAware_owner, visitor);
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.javamodel.IRiskState.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.RisksPackage.Risk_riskState, visitor);
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.javamodel.IRiskType.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.RisksPackage.Risk_type, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,98a67217-2b38-11eb-8b7a-fdc2e024fc47,FlJ4Xe5neK5uCE5yPcZnhj1sqmQ=] */
