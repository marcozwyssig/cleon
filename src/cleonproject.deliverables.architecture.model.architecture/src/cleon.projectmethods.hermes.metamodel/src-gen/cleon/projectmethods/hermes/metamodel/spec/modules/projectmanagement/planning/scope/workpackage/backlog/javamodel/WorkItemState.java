package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class WorkItemState extends DynamicResource implements IWorkItemState {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWorkItemState> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWorkItemState>() {
    
    @Override
    public IWorkItemState create() {
      return new WorkItemState();
    }
    
    @Override
    public IWorkItemState create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new WorkItemState(resourceRepository, resource);
    }
  
  };

  public WorkItemState() {
    super(IWorkItemState.TYPE_ID);
  }
  
  public WorkItemState(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IWorkItemState.TYPE_ID);
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

  public WorkItemState setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // accept enum value visitors

  @Override
  public <R> R accept(IValueVisitor<R> visitor) {
    if (isInput()) return visitor.visitInput();
    if (isUnderstanding()) return visitor.visitUnderstanding();
    if (isImplementing()) return visitor.visitImplementing();
    if (isConfirming()) return visitor.visitConfirming();
    if (isDone()) return visitor.visitDone();
    if (isReadyForImplement()) return visitor.visitReadyForImplement();
    if (isReadyForConfirm()) return visitor.visitReadyForConfirm();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isInput()) {
      visitor.visitInput();
      return;
    }
    if (isUnderstanding()) {
      visitor.visitUnderstanding();
      return;
    }
    if (isImplementing()) {
      visitor.visitImplementing();
      return;
    }
    if (isConfirming()) {
      visitor.visitConfirming();
      return;
    }
    if (isDone()) {
      visitor.visitDone();
      return;
    }
    if (isReadyForImplement()) {
      visitor.visitReadyForImplement();
      return;
    }
    if (isReadyForConfirm()) {
      visitor.visitReadyForConfirm();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isInput() {
    return getResource().equals(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.WorkItemState_Input);
  }
  
  @Override
  public boolean isUnderstanding() {
    return getResource().equals(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.WorkItemState_Understanding);
  }
  
  @Override
  public boolean isImplementing() {
    return getResource().equals(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.WorkItemState_Implementing);
  }
  
  @Override
  public boolean isConfirming() {
    return getResource().equals(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.WorkItemState_Confirming);
  }
  
  @Override
  public boolean isDone() {
    return getResource().equals(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.WorkItemState_Done);
  }
  
  @Override
  public boolean isReadyForImplement() {
    return getResource().equals(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.WorkItemState_ReadyForImplement);
  }
  
  @Override
  public boolean isReadyForConfirm() {
    return getResource().equals(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.WorkItemState_ReadyForConfirm);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b27abc8f-cb92-11e5-b911-69bd21f5af67,u4TMsKZyqrc5V11reiSBoHpbIyI=] */
