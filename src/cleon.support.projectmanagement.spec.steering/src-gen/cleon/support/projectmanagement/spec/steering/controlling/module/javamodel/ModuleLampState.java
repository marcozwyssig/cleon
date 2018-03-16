package cleon.support.projectmanagement.spec.steering.controlling.module.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ModuleLampState extends DynamicResource implements IModuleLampState {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IModuleLampState> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IModuleLampState>() {
    
    @Override
    public IModuleLampState create() {
      return new ModuleLampState();
    }
    
    @Override
    public IModuleLampState create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ModuleLampState(resourceRepository, resource);
    }
  
  };

  public ModuleLampState() {
    super(IModuleLampState.TYPE_ID);
  }
  
  public ModuleLampState(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IModuleLampState.TYPE_ID);
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

  public ModuleLampState setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    if (isRed()) return visitor.visitRed();
    if (isYellow()) return visitor.visitYellow();
    if (isGreen()) return visitor.visitGreen();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isRed()) {
      visitor.visitRed();
      return;
    }
    if (isYellow()) {
      visitor.visitYellow();
      return;
    }
    if (isGreen()) {
      visitor.visitGreen();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isRed() {
    return getResource().equals(cleon.support.projectmanagement.spec.steering.controlling.module.ModulePackage.ModuleLampState_Red);
  }
  
  @Override
  public boolean isYellow() {
    return getResource().equals(cleon.support.projectmanagement.spec.steering.controlling.module.ModulePackage.ModuleLampState_Yellow);
  }
  
  @Override
  public boolean isGreen() {
    return getResource().equals(cleon.support.projectmanagement.spec.steering.controlling.module.ModulePackage.ModuleLampState_Green);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,60427122-3386-11e6-b251-57783f5929b3,xLwRMRIenZ4vDEaUGlfkMpSwjJg=] */
