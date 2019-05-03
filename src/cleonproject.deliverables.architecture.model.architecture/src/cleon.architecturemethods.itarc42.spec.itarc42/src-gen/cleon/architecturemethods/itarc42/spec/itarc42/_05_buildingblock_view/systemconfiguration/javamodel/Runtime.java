package cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock_view.systemconfiguration.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Runtime extends DynamicResource implements IRuntime {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRuntime> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRuntime>() {
    
    @Override
    public IRuntime create() {
      return new Runtime();
    }
    
    @Override
    public IRuntime create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Runtime(resourceRepository, resource);
    }
  
  };

  public Runtime() {
    super(IRuntime.TYPE_ID);
  }
  
  public Runtime(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRuntime.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectShortName() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.resources.spec.resources.naming.NamingPackage.ShortName_shortName);
  }
    
  public void setShortName(java.lang.String shortName) {
     _setSingleAttribute(cleon.common.resources.spec.resources.naming.NamingPackage.ShortName_shortName, shortName);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Runtime setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.common.resources.spec.resources.naming.NamingPackage.ShortName_shortName, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // accept enum value visitors

  @Override
  public <R> R accept(IValueVisitor<R> visitor) {
    if (isPhysical()) return visitor.visitPhysical();
    if (isVirtual()) return visitor.visitVirtual();
    if (isContainer()) return visitor.visitContainer();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isPhysical()) {
      visitor.visitPhysical();
      return;
    }
    if (isVirtual()) {
      visitor.visitVirtual();
      return;
    }
    if (isContainer()) {
      visitor.visitContainer();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isPhysical() {
    return getResource().equals(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock_view.systemconfiguration.SystemconfigurationPackage.Runtime_Physical);
  }
  
  @Override
  public boolean isVirtual() {
    return getResource().equals(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock_view.systemconfiguration.SystemconfigurationPackage.Runtime_Virtual);
  }
  
  @Override
  public boolean isContainer() {
    return getResource().equals(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock_view.systemconfiguration.SystemconfigurationPackage.Runtime_Container);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8a0ef5c9-1bfe-11e9-9896-651e5faa32a4,07K2hfarg14H8m+uxF/1IrnGyZo=] */
