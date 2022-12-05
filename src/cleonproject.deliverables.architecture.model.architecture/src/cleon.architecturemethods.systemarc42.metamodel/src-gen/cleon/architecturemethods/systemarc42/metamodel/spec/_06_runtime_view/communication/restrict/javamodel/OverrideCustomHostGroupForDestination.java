package cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.restrict.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class OverrideCustomHostGroupForDestination extends DynamicResource implements IOverrideCustomHostGroupForDestination {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOverrideCustomHostGroupForDestination> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOverrideCustomHostGroupForDestination>() {
    
    @Override
    public IOverrideCustomHostGroupForDestination create() {
      return new OverrideCustomHostGroupForDestination();
    }
    
    @Override
    public IOverrideCustomHostGroupForDestination create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new OverrideCustomHostGroupForDestination(resourceRepository, resource);
    }
  
  };

  public OverrideCustomHostGroupForDestination() {
    super(IOverrideCustomHostGroupForDestination.TYPE_ID);
  }
  
  public OverrideCustomHostGroupForDestination(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IOverrideCustomHostGroupForDestination.TYPE_ID);
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
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.restrict.RestrictPackage.AbstractOverrideHostGroupForDestination_value);
  }
    
  public void setValue(java.lang.String value) {
     _setSingleAttribute(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.restrict.RestrictPackage.AbstractOverrideHostGroupForDestination_value, value);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public OverrideCustomHostGroupForDestination setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.restrict.RestrictPackage.AbstractOverrideHostGroupForDestination_value, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,763c9d85-724f-11ed-8c7b-bf13a6bd0e0e,Cfo7DrM189zvqsW47E4CkQQbRTE=] */
