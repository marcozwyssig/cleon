package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class WindowsCISEnforcementLevel extends DynamicResource implements IWindowsCISEnforcementLevel {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWindowsCISEnforcementLevel> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWindowsCISEnforcementLevel>() {
    
    @Override
    public IWindowsCISEnforcementLevel create() {
      return new WindowsCISEnforcementLevel();
    }
    
    @Override
    public IWindowsCISEnforcementLevel create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new WindowsCISEnforcementLevel(resourceRepository, resource);
    }
  
  };

  public WindowsCISEnforcementLevel() {
    super(IWindowsCISEnforcementLevel.TYPE_ID);
  }
  
  public WindowsCISEnforcementLevel(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IWindowsCISEnforcementLevel.TYPE_ID);
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

  public WindowsCISEnforcementLevel setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    if (is__W_()) return visitor.visit__W_();
    if (is__X_()) return visitor.visit__X_();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (is__W_()) {
      visitor.visit__W_();
      return;
    }
    if (is__X_()) {
      visitor.visit__X_();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean is__W_() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.WindowsCISEnforcementLevel___W_);
  }
  
  @Override
  public boolean is__X_() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.WindowsCISEnforcementLevel___X_);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6e548dad-5e43-11f0-a5db-972145eef50c,c06dY8hLRuwx5qH588UZijGxpQw=] */
