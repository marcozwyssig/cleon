package cleon.sda.spec.projectmanagement.resourcemanagement.locations.javamodel;

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
  public java.util.List<? extends cleon.sda.spec.projectmanagement.resourcemanagement.locations.javamodel.ILocation> selectSublocation() {
    return _getList(cleon.sda.spec.projectmanagement.resourcemanagement.locations.javamodel.ILocation.class, cleon.sda.spec.projectmanagement.resourcemanagement.locations.LocationsPackage.Location_sublocation);
  }

  public Location setSublocation(java.util.List<? extends cleon.sda.spec.projectmanagement.resourcemanagement.locations.javamodel.ILocation> sublocation) {
    _setList(cleon.sda.spec.projectmanagement.resourcemanagement.locations.LocationsPackage.Location_sublocation, sublocation);
    return this;
  }
    
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
    _acceptList(cleon.sda.spec.projectmanagement.resourcemanagement.locations.javamodel.ILocation.class, cleon.sda.spec.projectmanagement.resourcemanagement.locations.LocationsPackage.Location_sublocation, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.sda.spec.projectmanagement.resourcemanagement.locations.javamodel.ILocation selectToMeSublocation(cleon.sda.spec.projectmanagement.resourcemanagement.locations.javamodel.ILocation object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.projectmanagement.resourcemanagement.locations.javamodel.ILocation.class, cleon.sda.spec.projectmanagement.resourcemanagement.locations.LocationsPackage.Location_sublocation, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,16fa59aa-c768-11e5-b3f9-43c5a0896ea1,n2uEPdZXZ8KRPGeUkkD+iY2sd4A=] */
