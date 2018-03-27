package cleon.initialization.projectmanagement.spec.planning.scope.module.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ModuleState extends DynamicResource implements IModuleState {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IModuleState> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IModuleState>() {
    
    @Override
    public IModuleState create() {
      return new ModuleState();
    }
    
    @Override
    public IModuleState create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ModuleState(resourceRepository, resource);
    }
  
  };

  public ModuleState() {
    super(IModuleState.TYPE_ID);
  }
  
  public ModuleState(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IModuleState.TYPE_ID);
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

  public ModuleState setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    if (isOnHold()) return visitor.visitOnHold();
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
    if (isOnHold()) {
      visitor.visitOnHold();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isOpen() {
    return getResource().equals(cleon.initialization.projectmanagement.spec.planning.scope.module.ModulePackage.ModuleState_Open);
  }
  
  @Override
  public boolean isIn__F_Progress() {
    return getResource().equals(cleon.initialization.projectmanagement.spec.planning.scope.module.ModulePackage.ModuleState_In__F_Progress);
  }
  
  @Override
  public boolean isDone() {
    return getResource().equals(cleon.initialization.projectmanagement.spec.planning.scope.module.ModulePackage.ModuleState_Done);
  }
  
  @Override
  public boolean isOnHold() {
    return getResource().equals(cleon.initialization.projectmanagement.spec.planning.scope.module.ModulePackage.ModuleState_OnHold);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,5b3641a5-c767-11e6-9515-3d3c9e104ed6,TVhjInchUwnwtm34sd5RFcYLzTU=] */
