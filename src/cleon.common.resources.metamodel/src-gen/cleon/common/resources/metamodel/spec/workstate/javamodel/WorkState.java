package cleon.common.resources.metamodel.spec.workstate.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class WorkState extends DynamicResource implements IWorkState {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWorkState> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWorkState>() {
    
    @Override
    public IWorkState create() {
      return new WorkState();
    }
    
    @Override
    public IWorkState create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new WorkState(resourceRepository, resource);
    }
  
  };

  public WorkState() {
    super(IWorkState.TYPE_ID);
  }
  
  public WorkState(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IWorkState.TYPE_ID);
  }

  // attributes
  
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

  public WorkState setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // accept enum value visitors

  @Override
  public <R> R accept(IValueVisitor<R> visitor) {
    if (isOpen()) return visitor.visitOpen();
    if (isIn__F_Progress()) return visitor.visitIn__F_Progress();
    if (isDone()) return visitor.visitDone();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isOpen()) {
      visitor.visitOpen();
      return;
    }
    if (isIn__F_Progress()) {
      visitor.visitIn__F_Progress();
      return;
    }
    if (isDone()) {
      visitor.visitDone();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isOpen() {
    return getResource().equals(cleon.common.resources.metamodel.spec.workstate.WorkstatePackage.WorkState_Open);
  }
  
  @Override
  public boolean isIn__F_Progress() {
    return getResource().equals(cleon.common.resources.metamodel.spec.workstate.WorkstatePackage.WorkState_In__F_Progress);
  }
  
  @Override
  public boolean isDone() {
    return getResource().equals(cleon.common.resources.metamodel.spec.workstate.WorkstatePackage.WorkState_Done);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8f138d00-c58a-11e5-aeea-1db9268c0ee9,YnlgBXp1FSAsOek3P57tAfuI3sQ=] */
