package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class WindowsCISProfileType extends DynamicResource implements IWindowsCISProfileType {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWindowsCISProfileType> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWindowsCISProfileType>() {
    
    @Override
    public IWindowsCISProfileType create() {
      return new WindowsCISProfileType();
    }
    
    @Override
    public IWindowsCISProfileType create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new WindowsCISProfileType(resourceRepository, resource);
    }
  
  };

  public WindowsCISProfileType() {
    super(IWindowsCISProfileType.TYPE_ID);
  }
  
  public WindowsCISProfileType(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IWindowsCISProfileType.TYPE_ID);
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

  public WindowsCISProfileType setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    if (isDomain()) return visitor.visitDomain();
    if (isStandalone()) return visitor.visitStandalone();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isDomain()) {
      visitor.visitDomain();
      return;
    }
    if (isStandalone()) {
      visitor.visitStandalone();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isDomain() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.WindowsCISProfileType_domain);
  }
  
  @Override
  public boolean isStandalone() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.Win_polycom_windows_hardeningPackage.WindowsCISProfileType_standalone);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,49daa1b0-5e43-11f0-a5db-972145eef50c,VDKmx6tO7ATI+ZxCRDx/pZMAMZU=] */
