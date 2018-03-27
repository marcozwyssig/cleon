package cleon.support.projectmanagement.spec.steering.impediments.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Impediment extends DynamicResource implements IImpediment {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IImpediment> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IImpediment>() {
    
    @Override
    public IImpediment create() {
      return new Impediment();
    }
    
    @Override
    public IImpediment create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Impediment(resourceRepository, resource);
    }
  
  };

  public Impediment() {
    super(IImpediment.TYPE_ID);
  }
  
  public Impediment(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IImpediment.TYPE_ID);
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
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.id.IdPackage.BusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.common.resources.spec.resources.id.IdPackage.BusinessObjectId_identifier, identifier);
  }

  @Override
  public java.util.List<java.lang.String> selectMandatoryDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.MandatoryDescription_mandatoryDescriptions);
  }
    
  public void setMandatoryDescriptions(java.util.List<java.lang.String> mandatoryDescriptions) {
     _setListAttribute(cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.MandatoryDescription_mandatoryDescriptions, mandatoryDescriptions);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.util.List<java.lang.String> selectResolutionsDetails() {
    return _getListAttribute(java.lang.String.class, cleon.support.projectmanagement.spec.steering.impediments.ImpedimentsPackage.Impediment_resolutionsDetails);
  }
    
  public void setResolutionsDetails(java.util.List<java.lang.String> resolutionsDetails) {
     _setListAttribute(cleon.support.projectmanagement.spec.steering.impediments.ImpedimentsPackage.Impediment_resolutionsDetails, resolutionsDetails);
  }

  // relations
  
  @Override
  public cleon.common.resources.spec.calendar.javamodel.IDay selectEntryDate() {
    return _getSingle(cleon.common.resources.spec.calendar.javamodel.IDay.class, cleon.support.projectmanagement.spec.steering.impediments.ImpedimentsPackage.Impediment_entryDate);
  }

  public Impediment setEntryDate(cleon.common.resources.spec.calendar.javamodel.IDay entryDate) {
    _setSingle(cleon.support.projectmanagement.spec.steering.impediments.ImpedimentsPackage.Impediment_entryDate, entryDate);
    return this;
  }
    
  @Override
  public cleon.initialization.projectmanagement.spec.resource.persons.javamodel.IPerson selectOwner() {
    return _getSingle(cleon.initialization.projectmanagement.spec.resource.persons.javamodel.IPerson.class, cleon.initialization.projectmanagement.spec.resource.persons.PersonsPackage.OwnerAware_owner);
  }

  public Impediment setOwner(cleon.initialization.projectmanagement.spec.resource.persons.javamodel.IPerson owner) {
    _setSingle(cleon.initialization.projectmanagement.spec.resource.persons.PersonsPackage.OwnerAware_owner, owner);
    return this;
  }
    
  @Override
  public cleon.common.resources.spec.resources.workstate.javamodel.IWorkState selectState() {
    return _getSingle(cleon.common.resources.spec.resources.workstate.javamodel.IWorkState.class, cleon.common.resources.spec.resources.workstate.WorkstatePackage.WorkStateAware_state);
  }

  public Impediment setState(cleon.common.resources.spec.resources.workstate.javamodel.IWorkState state) {
    _setSingle(cleon.common.resources.spec.resources.workstate.WorkstatePackage.WorkStateAware_state, state);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Impediment setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.id.IdPackage.BusinessObjectId_identifier, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.MandatoryDescription_mandatoryDescriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.support.projectmanagement.spec.steering.impediments.ImpedimentsPackage.Impediment_resolutionsDetails, visitor);
    // relations
    _acceptSingle(cleon.common.resources.spec.calendar.javamodel.IDay.class, cleon.support.projectmanagement.spec.steering.impediments.ImpedimentsPackage.Impediment_entryDate, visitor);
    _acceptSingle(cleon.initialization.projectmanagement.spec.resource.persons.javamodel.IPerson.class, cleon.initialization.projectmanagement.spec.resource.persons.PersonsPackage.OwnerAware_owner, visitor);
    _acceptSingle(cleon.common.resources.spec.resources.workstate.javamodel.IWorkState.class, cleon.common.resources.spec.resources.workstate.WorkstatePackage.WorkStateAware_state, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.support.projectmanagement.spec.steering.impediments.javamodel.IImpediment> selectToMeEntryDate(cleon.common.resources.spec.calendar.javamodel.IDay object) {
    return _getToMeList(object.getRepository(), cleon.support.projectmanagement.spec.steering.impediments.javamodel.IImpediment.class, cleon.support.projectmanagement.spec.steering.impediments.ImpedimentsPackage.Impediment_entryDate, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b33bed18-3383-11e6-b251-57783f5929b3,dxlS+H8JilCHy4cfOd6ie9ETEVo=] */
