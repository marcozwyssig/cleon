package cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Location extends DynamicResource implements ILocation {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILocation> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILocation>() {
    
    @Override
    public ILocation create() {
      return new Location();
    }
    
    @Override
    public ILocation create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Location(resourceRepository, resource);
    }
  
  };

  public Location() {
    super(ILocation.TYPE_ID);
  }
  
  public Location(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ILocation.TYPE_ID);
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

  public Location setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    if (isA()) return visitor.visitA();
    if (isB()) return visitor.visitB();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isA()) {
      visitor.visitA();
      return;
    }
    if (isB()) {
      visitor.visitB();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isA() {
    return getResource().equals(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.TopologyPackage.Location_A);
  }
  
  @Override
  public boolean isB() {
    return getResource().equals(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.TopologyPackage.Location_B);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,865b3a4b-57c9-11ea-bd7a-4baf1bc87b3c,9qFUoDftZKy/dyamg1rENL9xhg4=] */
