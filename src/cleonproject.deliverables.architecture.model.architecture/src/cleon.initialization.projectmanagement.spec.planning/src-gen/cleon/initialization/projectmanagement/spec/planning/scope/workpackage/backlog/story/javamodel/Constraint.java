package cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.story.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Constraint extends DynamicResource implements IConstraint {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IConstraint> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IConstraint>() {
    
    @Override
    public IConstraint create() {
      return new Constraint();
    }
    
    @Override
    public IConstraint create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Constraint(resourceRepository, resource);
    }
  
  };

  public Constraint() {
    super(IConstraint.TYPE_ID);
  }
  
  public Constraint(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IConstraint.TYPE_ID);
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
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectReference() {
    return _getSingleAttribute(java.lang.String.class, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.WorkItemBase_reference);
  }
    
  public void setReference(java.lang.String reference) {
     _setSingleAttribute(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.WorkItemBase_reference, reference);
  }

  // relations
  
  @Override
  public cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IText selectAnalysis() {
    return _getSingle(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IText.class, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.WorkItemBase_analysis);
  }

  public Constraint setAnalysis(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IText analysis) {
    _setSingle(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.WorkItemBase_analysis, analysis);
    return this;
  }
    
  @Override
  public cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IEffort selectEstimate() {
    return _getSingle(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IEffort.class, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.EffortAware_estimate);
  }

  public Constraint setEstimate(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IEffort estimate) {
    _setSingle(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.EffortAware_estimate, estimate);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.support.projectmanagement.spec.resource.persons.javamodel.IPerson> selectOwners() {
    return _getList(cleon.support.projectmanagement.spec.resource.persons.javamodel.IPerson.class, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.WorkItem_owners);
  }

  public Constraint setOwners(java.util.List<? extends cleon.support.projectmanagement.spec.resource.persons.javamodel.IPerson> owners) {
    _setList(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.WorkItem_owners, owners);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IWorkItem> selectPreconditions() {
    return _getList(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IWorkItem.class, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.WorkItem_preconditions);
  }

  public Constraint setPreconditions(java.util.List<? extends cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IWorkItem> preconditions) {
    _setList(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.WorkItem_preconditions, preconditions);
    return this;
  }
    
  @Override
  public cleon.common.resources.spec.resources.priority.javamodel.IPriority selectPriority() {
    return _getSingle(cleon.common.resources.spec.resources.priority.javamodel.IPriority.class, cleon.common.resources.spec.resources.priority.PriorityPackage.PriorityAware_priority);
  }

  public Constraint setPriority(cleon.common.resources.spec.resources.priority.javamodel.IPriority priority) {
    _setSingle(cleon.common.resources.spec.resources.priority.PriorityPackage.PriorityAware_priority, priority);
    return this;
  }
    
  @Override
  public cleon.support.projectmanagement.spec.resource.persons.javamodel.IPerson selectRequestedBy() {
    return _getSingle(cleon.support.projectmanagement.spec.resource.persons.javamodel.IPerson.class, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.story.StoryPackage.Story_requestedBy);
  }

  public Constraint setRequestedBy(cleon.support.projectmanagement.spec.resource.persons.javamodel.IPerson requestedBy) {
    _setSingle(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.story.StoryPackage.Story_requestedBy, requestedBy);
    return this;
  }
    
  @Override
  public cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IWorkItemState selectState() {
    return _getSingle(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IWorkItemState.class, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.WorkItem_state);
  }

  public Constraint setState(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IWorkItemState state) {
    _setSingle(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.WorkItem_state, state);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Constraint setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.WorkItemBase_reference, visitor);
    // relations
    _acceptSingle(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IText.class, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.WorkItemBase_analysis, visitor);
    _acceptSingle(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IEffort.class, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.EffortAware_estimate, visitor);
    _acceptList(cleon.support.projectmanagement.spec.resource.persons.javamodel.IPerson.class, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.WorkItem_owners, visitor);
    _acceptList(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IWorkItem.class, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.WorkItem_preconditions, visitor);
    _acceptSingle(cleon.common.resources.spec.resources.priority.javamodel.IPriority.class, cleon.common.resources.spec.resources.priority.PriorityPackage.PriorityAware_priority, visitor);
    _acceptSingle(cleon.support.projectmanagement.spec.resource.persons.javamodel.IPerson.class, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.story.StoryPackage.Story_requestedBy, visitor);
    _acceptSingle(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IWorkItemState.class, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.WorkItem_state, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d9e271ef-3777-11e5-95d9-2b04d7ab02d9,7qHjEVZeEAqQD7aJqHFWQ+KxWE4=] */
