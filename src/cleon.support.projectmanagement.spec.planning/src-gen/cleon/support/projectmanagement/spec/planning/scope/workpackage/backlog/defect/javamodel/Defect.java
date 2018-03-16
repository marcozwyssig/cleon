package cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Defect extends DynamicResource implements IDefect {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDefect> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDefect>() {
    
    @Override
    public IDefect create() {
      return new Defect();
    }
    
    @Override
    public IDefect create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Defect(resourceRepository, resource);
    }
  
  };

  public Defect() {
    super(IDefect.TYPE_ID);
  }
  
  public Defect(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDefect.TYPE_ID);
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
  public java.lang.String selectEnvironment() {
    return _getSingleAttribute(java.lang.String.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.DefectPackage.Defect_environment);
  }
    
  public void setEnvironment(java.lang.String environment) {
     _setSingleAttribute(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.DefectPackage.Defect_environment, environment);
  }

  @Override
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.id.IdPackage.BusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.common.resources.spec.resources.id.IdPackage.BusinessObjectId_identifier, identifier);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectReference() {
    return _getSingleAttribute(java.lang.String.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.WorkItemBase_reference);
  }
    
  public void setReference(java.lang.String reference) {
     _setSingleAttribute(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.WorkItemBase_reference, reference);
  }

  // relations
  
  @Override
  public cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IText selectAnalysis() {
    return _getSingle(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IText.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.WorkItemBase_analysis);
  }

  public Defect setAnalysis(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IText analysis) {
    _setSingle(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.WorkItemBase_analysis, analysis);
    return this;
  }
    
  @Override
  public cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.javamodel.IClassification selectClassification() {
    return _getSingle(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.javamodel.IClassification.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.DefectPackage.Defect_classification);
  }

  public Defect setClassification(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.javamodel.IClassification classification) {
    _setSingle(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.DefectPackage.Defect_classification, classification);
    return this;
  }
    
  @Override
  public cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IEffort selectEstimate() {
    return _getSingle(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IEffort.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.EffortAware_estimate);
  }

  public Defect setEstimate(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IEffort estimate) {
    _setSingle(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.EffortAware_estimate, estimate);
    return this;
  }
    
  @Override
  public cleon.support.projectmanagement.spec.resource.persons.javamodel.IPerson selectFoundBy() {
    return _getSingle(cleon.support.projectmanagement.spec.resource.persons.javamodel.IPerson.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.DefectPackage.Defect_foundBy);
  }

  public Defect setFoundBy(cleon.support.projectmanagement.spec.resource.persons.javamodel.IPerson foundBy) {
    _setSingle(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.DefectPackage.Defect_foundBy, foundBy);
    return this;
  }
    
  @Override
  public cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.javamodel.IObservation selectObservation() {
    return _getSingle(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.javamodel.IObservation.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.DefectPackage.Defect_observation);
  }

  public Defect setObservation(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.javamodel.IObservation observation) {
    _setSingle(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.DefectPackage.Defect_observation, observation);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.support.projectmanagement.spec.resource.persons.javamodel.IPerson> selectOwners() {
    return _getList(cleon.support.projectmanagement.spec.resource.persons.javamodel.IPerson.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.WorkItem_owners);
  }

  public Defect setOwners(java.util.List<? extends cleon.support.projectmanagement.spec.resource.persons.javamodel.IPerson> owners) {
    _setList(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.WorkItem_owners, owners);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IWorkItem> selectPreconditions() {
    return _getList(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IWorkItem.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.WorkItem_preconditions);
  }

  public Defect setPreconditions(java.util.List<? extends cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IWorkItem> preconditions) {
    _setList(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.WorkItem_preconditions, preconditions);
    return this;
  }
    
  @Override
  public cleon.common.resources.spec.resources.priority.javamodel.IPriority selectPriority() {
    return _getSingle(cleon.common.resources.spec.resources.priority.javamodel.IPriority.class, cleon.common.resources.spec.resources.priority.PriorityPackage.PriorityAware_priority);
  }

  public Defect setPriority(cleon.common.resources.spec.resources.priority.javamodel.IPriority priority) {
    _setSingle(cleon.common.resources.spec.resources.priority.PriorityPackage.PriorityAware_priority, priority);
    return this;
  }
    
  @Override
  public cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.javamodel.IReproducibility selectReproducibility() {
    return _getSingle(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.javamodel.IReproducibility.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.DefectPackage.Defect_reproducibility);
  }

  public Defect setReproducibility(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.javamodel.IReproducibility reproducibility) {
    _setSingle(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.DefectPackage.Defect_reproducibility, reproducibility);
    return this;
  }
    
  @Override
  public cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IText selectResolution() {
    return _getSingle(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IText.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.DefectPackage.Defect_resolution);
  }

  public Defect setResolution(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IText resolution) {
    _setSingle(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.DefectPackage.Defect_resolution, resolution);
    return this;
  }
    
  @Override
  public cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IWorkItemState selectState() {
    return _getSingle(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IWorkItemState.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.WorkItem_state);
  }

  public Defect setState(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IWorkItemState state) {
    _setSingle(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.WorkItem_state, state);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Defect setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.DefectPackage.Defect_environment, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.id.IdPackage.BusinessObjectId_identifier, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.WorkItemBase_reference, visitor);
    // relations
    _acceptSingle(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IText.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.WorkItemBase_analysis, visitor);
    _acceptSingle(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.javamodel.IClassification.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.DefectPackage.Defect_classification, visitor);
    _acceptSingle(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IEffort.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.EffortAware_estimate, visitor);
    _acceptSingle(cleon.support.projectmanagement.spec.resource.persons.javamodel.IPerson.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.DefectPackage.Defect_foundBy, visitor);
    _acceptSingle(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.javamodel.IObservation.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.DefectPackage.Defect_observation, visitor);
    _acceptList(cleon.support.projectmanagement.spec.resource.persons.javamodel.IPerson.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.WorkItem_owners, visitor);
    _acceptList(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IWorkItem.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.WorkItem_preconditions, visitor);
    _acceptSingle(cleon.common.resources.spec.resources.priority.javamodel.IPriority.class, cleon.common.resources.spec.resources.priority.PriorityPackage.PriorityAware_priority, visitor);
    _acceptSingle(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.javamodel.IReproducibility.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.DefectPackage.Defect_reproducibility, visitor);
    _acceptSingle(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IText.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.DefectPackage.Defect_resolution, visitor);
    _acceptSingle(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IWorkItemState.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.WorkItem_state, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.javamodel.IDefect selectToMeReproducibility(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.javamodel.IReproducibility object) {
    return _getToMeSingle(object.getRepository(), cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.javamodel.IDefect.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.DefectPackage.Defect_reproducibility, object.getResource());
  }
  
  public static cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.javamodel.IDefect selectToMeResolution(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IText object) {
    return _getToMeSingle(object.getRepository(), cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.javamodel.IDefect.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.DefectPackage.Defect_resolution, object.getResource());
  }
  
  public static java.util.List<cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.javamodel.IDefect> selectToMeFoundBy(cleon.support.projectmanagement.spec.resource.persons.javamodel.IPerson object) {
    return _getToMeList(object.getRepository(), cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.javamodel.IDefect.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.DefectPackage.Defect_foundBy, object.getResource());
  }
  
  public static java.util.List<cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.javamodel.IDefect> selectToMeClassification(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.javamodel.IClassification object) {
    return _getToMeList(object.getRepository(), cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.javamodel.IDefect.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.DefectPackage.Defect_classification, object.getResource());
  }
  
  public static java.util.List<cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.javamodel.IDefect> selectToMeObservation(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.javamodel.IObservation object) {
    return _getToMeList(object.getRepository(), cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.javamodel.IDefect.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.DefectPackage.Defect_observation, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,484dda11-ff9c-11e4-ac0a-959b440f987f,FjPFVHnHwew2TO5iJxuYCq25+18=] */
