package cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.restrict.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class OverrideSiteOnHostGroupForDestination extends DynamicResource implements IOverrideSiteOnHostGroupForDestination {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOverrideSiteOnHostGroupForDestination> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOverrideSiteOnHostGroupForDestination>() {
    
    @Override
    public IOverrideSiteOnHostGroupForDestination create() {
      return new OverrideSiteOnHostGroupForDestination();
    }
    
    @Override
    public IOverrideSiteOnHostGroupForDestination create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new OverrideSiteOnHostGroupForDestination(resourceRepository, resource);
    }
  
  };

  public OverrideSiteOnHostGroupForDestination() {
    super(IOverrideSiteOnHostGroupForDestination.TYPE_ID);
  }
  
  public OverrideSiteOnHostGroupForDestination(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IOverrideSiteOnHostGroupForDestination.TYPE_ID);
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
  public java.lang.String selectValue() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.restrict.RestrictPackage.AbstractOverrideHostGroupForDestination_value);
  }
    
  public void setValue(java.lang.String value) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.restrict.RestrictPackage.AbstractOverrideHostGroupForDestination_value, value);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public OverrideSiteOnHostGroupForDestination setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.restrict.RestrictPackage.AbstractOverrideHostGroupForDestination_value, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2f461c99-724f-11ed-8c7b-bf13a6bd0e0e,I/WR4s2yQyKzcf0lHhBhI1ZYXUk=] */
