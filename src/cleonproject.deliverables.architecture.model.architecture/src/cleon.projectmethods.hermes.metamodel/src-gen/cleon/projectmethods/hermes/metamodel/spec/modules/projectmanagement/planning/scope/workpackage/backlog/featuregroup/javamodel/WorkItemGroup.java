package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.featuregroup.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class WorkItemGroup extends DynamicResource implements IWorkItemGroup {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWorkItemGroup> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWorkItemGroup>() {
    
    @Override
    public IWorkItemGroup create() {
      return new WorkItemGroup();
    }
    
    @Override
    public IWorkItemGroup create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new WorkItemGroup(resourceRepository, resource);
    }
  
  };

  public WorkItemGroup() {
    super(IWorkItemGroup.TYPE_ID);
  }
  
  public WorkItemGroup(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IWorkItemGroup.TYPE_ID);
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
  public java.lang.Integer selectPlannedEstimate() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.featuregroup.FeaturegroupPackage.WorkItemGroup_plannedEstimate);
  }
    
  public void setPlannedEstimate(java.lang.Integer plannedEstimate) {
     _setSingleAttribute(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.featuregroup.FeaturegroupPackage.WorkItemGroup_plannedEstimate, plannedEstimate);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItem> selectItems() {
    return _getList(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItem.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.featuregroup.FeaturegroupPackage.WorkItemGroup_items);
  }

  public WorkItemGroup setItems(java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItem> items) {
    _setList(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.featuregroup.FeaturegroupPackage.WorkItemGroup_items, items);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IPerson> selectOwners() {
    return _getList(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IPerson.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.WorkItem_owners);
  }

  public WorkItemGroup setOwners(java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IPerson> owners) {
    _setList(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.WorkItem_owners, owners);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.featuregroup.javamodel.IWorkItemGroup> selectPreconditions() {
    return _getList(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.featuregroup.javamodel.IWorkItemGroup.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.featuregroup.FeaturegroupPackage.WorkItemGroup_preconditions);
  }

  public WorkItemGroup setPreconditions(java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.featuregroup.javamodel.IWorkItemGroup> preconditions) {
    _setList(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.featuregroup.FeaturegroupPackage.WorkItemGroup_preconditions, preconditions);
    return this;
  }
    
  @Override
  public cleon.common.resources.metamodel.spec.priority.javamodel.IPriority selectPriority() {
    return _getSingle(cleon.common.resources.metamodel.spec.priority.javamodel.IPriority.class, cleon.common.resources.metamodel.spec.priority.PriorityPackage.PriorityAware_priority);
  }

  public WorkItemGroup setPriority(cleon.common.resources.metamodel.spec.priority.javamodel.IPriority priority) {
    _setSingle(cleon.common.resources.metamodel.spec.priority.PriorityPackage.PriorityAware_priority, priority);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItemState selectState() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItemState.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.WorkItem_state);
  }

  public WorkItemGroup setState(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItemState state) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.WorkItem_state, state);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public WorkItemGroup setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingleAttribute(java.lang.Integer.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.featuregroup.FeaturegroupPackage.WorkItemGroup_plannedEstimate, visitor);
    // relations
    _acceptList(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItem.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.featuregroup.FeaturegroupPackage.WorkItemGroup_items, visitor);
    _acceptList(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IPerson.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.WorkItem_owners, visitor);
    _acceptList(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.featuregroup.javamodel.IWorkItemGroup.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.featuregroup.FeaturegroupPackage.WorkItemGroup_preconditions, visitor);
    _acceptSingle(cleon.common.resources.metamodel.spec.priority.javamodel.IPriority.class, cleon.common.resources.metamodel.spec.priority.PriorityPackage.PriorityAware_priority, visitor);
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItemState.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.WorkItem_state, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.featuregroup.javamodel.IWorkItemGroup selectToMeItems(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItem object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.featuregroup.javamodel.IWorkItemGroup.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.featuregroup.FeaturegroupPackage.WorkItemGroup_items, object.getResource());
  }
  
  public static java.util.List<cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.featuregroup.javamodel.IWorkItemGroup> selectToMePreconditions(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.featuregroup.javamodel.IWorkItemGroup object) {
    return _getToMeList(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.featuregroup.javamodel.IWorkItemGroup.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.featuregroup.FeaturegroupPackage.WorkItemGroup_preconditions, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,409913e6-369c-11e5-95d9-2b04d7ab02d9,FpyaSa1lfTJuQpSO88n/8ayrtjs=] */
