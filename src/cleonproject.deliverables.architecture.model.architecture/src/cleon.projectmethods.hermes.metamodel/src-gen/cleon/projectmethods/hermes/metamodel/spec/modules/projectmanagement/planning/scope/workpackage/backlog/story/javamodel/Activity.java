package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.story.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Activity extends DynamicResource implements IActivity {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IActivity> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IActivity>() {
    
    @Override
    public IActivity create() {
      return new Activity();
    }
    
    @Override
    public IActivity create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Activity(resourceRepository, resource);
    }
  
  };

  public Activity() {
    super(IActivity.TYPE_ID);
  }
  
  public Activity(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IActivity.TYPE_ID);
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

  @Override
  public java.lang.String selectReference() {
    return _getSingleAttribute(java.lang.String.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.WorkItemBase_reference);
  }
    
  public void setReference(java.lang.String reference) {
     _setSingleAttribute(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.WorkItemBase_reference, reference);
  }

  // relations
  
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.javamodel.IText selectAnalysis() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.javamodel.IText.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.WorkItemBase_analysis);
  }

  public Activity setAnalysis(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.javamodel.IText analysis) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.WorkItemBase_analysis, analysis);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.javamodel.IEffort selectEstimate() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.javamodel.IEffort.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.EffortAware_estimate);
  }

  public Activity setEstimate(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.javamodel.IEffort estimate) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.EffortAware_estimate, estimate);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IPerson> selectOwners() {
    return _getList(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IPerson.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.WorkItem_owners);
  }

  public Activity setOwners(java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IPerson> owners) {
    _setList(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.WorkItem_owners, owners);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItem> selectPreconditions() {
    return _getList(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItem.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.WorkItem_preconditions);
  }

  public Activity setPreconditions(java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItem> preconditions) {
    _setList(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.WorkItem_preconditions, preconditions);
    return this;
  }
    
  @Override
  public cleon.common.resources.metamodel.spec.priority.javamodel.IPriority selectPriority() {
    return _getSingle(cleon.common.resources.metamodel.spec.priority.javamodel.IPriority.class, cleon.common.resources.metamodel.spec.priority.PriorityPackage.PriorityAware_priority);
  }

  public Activity setPriority(cleon.common.resources.metamodel.spec.priority.javamodel.IPriority priority) {
    _setSingle(cleon.common.resources.metamodel.spec.priority.PriorityPackage.PriorityAware_priority, priority);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IPerson selectRequestedBy() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IPerson.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.story.StoryPackage.Story_requestedBy);
  }

  public Activity setRequestedBy(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IPerson requestedBy) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.story.StoryPackage.Story_requestedBy, requestedBy);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItemState selectState() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItemState.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.WorkItem_state);
  }

  public Activity setState(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItemState state) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.WorkItem_state, state);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Activity setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingleAttribute(java.lang.String.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.WorkItemBase_reference, visitor);
    // relations
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.javamodel.IText.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.WorkItemBase_analysis, visitor);
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.javamodel.IEffort.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.EffortAware_estimate, visitor);
    _acceptList(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IPerson.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.WorkItem_owners, visitor);
    _acceptList(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItem.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.WorkItem_preconditions, visitor);
    _acceptSingle(cleon.common.resources.metamodel.spec.priority.javamodel.IPriority.class, cleon.common.resources.metamodel.spec.priority.PriorityPackage.PriorityAware_priority, visitor);
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IPerson.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.story.StoryPackage.Story_requestedBy, visitor);
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItemState.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.WorkItem_state, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e19c230e-3777-11e5-95d9-2b04d7ab02d9,KlOqv8nW/qMAtpnYFI3tt83HS+8=] */
