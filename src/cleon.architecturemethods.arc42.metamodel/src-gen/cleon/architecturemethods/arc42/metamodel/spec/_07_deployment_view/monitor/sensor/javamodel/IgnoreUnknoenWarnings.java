package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class IgnoreUnknoenWarnings extends DynamicResource implements IIgnoreUnknoenWarnings {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IIgnoreUnknoenWarnings> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IIgnoreUnknoenWarnings>() {
    
    @Override
    public IIgnoreUnknoenWarnings create() {
      return new IgnoreUnknoenWarnings();
    }
    
    @Override
    public IIgnoreUnknoenWarnings create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new IgnoreUnknoenWarnings(resourceRepository, resource);
    }
  
  };

  public IgnoreUnknoenWarnings() {
    super(IIgnoreUnknoenWarnings.TYPE_ID);
  }
  
  public IgnoreUnknoenWarnings(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IIgnoreUnknoenWarnings.TYPE_ID);
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

  public IgnoreUnknoenWarnings setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    if (isWarn()) return visitor.visitWarn();
    if (isIgnore()) return visitor.visitIgnore();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isWarn()) {
      visitor.visitWarn();
      return;
    }
    if (isIgnore()) {
      visitor.visitIgnore();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isWarn() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.SensorPackage.IgnoreUnknoenWarnings_warn);
  }
  
  @Override
  public boolean isIgnore() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.SensorPackage.IgnoreUnknoenWarnings_ignore);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2335ec9c-e3ba-11ea-84e3-5dbec94345a4,U5QNl3agwR1iFlaqm1+cRpDEi2U=] */
