package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Effort extends DynamicResource implements IEffort {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEffort> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEffort>() {
    
    @Override
    public IEffort create() {
      return new Effort();
    }
    
    @Override
    public IEffort create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Effort(resourceRepository, resource);
    }
  
  };

  public Effort() {
    super(IEffort.TYPE_ID);
  }
  
  public Effort(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IEffort.TYPE_ID);
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

  public Effort setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    if (is__V_()) return visitor.visit__V_();
    if (is__V___T_5()) return visitor.visit__V___T_5();
    if (is__W_()) return visitor.visit__W_();
    if (is__X_()) return visitor.visit__X_();
    if (is__Y_()) return visitor.visit__Y_();
    if (is__0_()) return visitor.visit__0_();
    if (is__3_()) return visitor.visit__3_();
    if (is__W_3()) return visitor.visit__W_3();
    if (is__X_0()) return visitor.visit__X_0();
    if (is__Z_0()) return visitor.visit__Z_0();
    if (is__W_00()) return visitor.visit__W_00();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (is__V_()) {
      visitor.visit__V_();
      return;
    }
    if (is__V___T_5()) {
      visitor.visit__V___T_5();
      return;
    }
    if (is__W_()) {
      visitor.visit__W_();
      return;
    }
    if (is__X_()) {
      visitor.visit__X_();
      return;
    }
    if (is__Y_()) {
      visitor.visit__Y_();
      return;
    }
    if (is__0_()) {
      visitor.visit__0_();
      return;
    }
    if (is__3_()) {
      visitor.visit__3_();
      return;
    }
    if (is__W_3()) {
      visitor.visit__W_3();
      return;
    }
    if (is__X_0()) {
      visitor.visit__X_0();
      return;
    }
    if (is__Z_0()) {
      visitor.visit__Z_0();
      return;
    }
    if (is__W_00()) {
      visitor.visit__W_00();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean is__V_() {
    return getResource().equals(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.Effort___V_);
  }
  
  @Override
  public boolean is__V___T_5() {
    return getResource().equals(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.Effort___V___T_5);
  }
  
  @Override
  public boolean is__W_() {
    return getResource().equals(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.Effort___W_);
  }
  
  @Override
  public boolean is__X_() {
    return getResource().equals(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.Effort___X_);
  }
  
  @Override
  public boolean is__Y_() {
    return getResource().equals(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.Effort___Y_);
  }
  
  @Override
  public boolean is__0_() {
    return getResource().equals(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.Effort___0_);
  }
  
  @Override
  public boolean is__3_() {
    return getResource().equals(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.Effort___3_);
  }
  
  @Override
  public boolean is__W_3() {
    return getResource().equals(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.Effort___W_3);
  }
  
  @Override
  public boolean is__X_0() {
    return getResource().equals(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.Effort___X_0);
  }
  
  @Override
  public boolean is__Z_0() {
    return getResource().equals(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.Effort___Z_0);
  }
  
  @Override
  public boolean is__W_00() {
    return getResource().equals(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.Effort___W_00);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,604db26f-c4d9-11e5-b41d-5d67443850a2,wYZqQYoqOppeDeON3Lto641znWY=] */
