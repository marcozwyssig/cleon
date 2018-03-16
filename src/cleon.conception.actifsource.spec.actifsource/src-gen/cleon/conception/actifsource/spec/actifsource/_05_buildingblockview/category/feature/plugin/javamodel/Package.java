package cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Package extends DynamicResource implements IPackage {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPackage> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPackage>() {
    
    @Override
    public IPackage create() {
      return new Package();
    }
    
    @Override
    public IPackage create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Package(resourceRepository, resource);
    }
  
  };

  public Package() {
    super(IPackage.TYPE_ID);
  }
  
  public Package(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPackage.TYPE_ID);
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
  public java.util.List<? extends cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.IPackage> selectSubPackage() {
    return _getList(cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.IPackage.class, cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.PluginPackage.Package_subPackage);
  }

  public Package setSubPackage(java.util.List<? extends cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.IPackage> subPackage) {
    _setList(cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.PluginPackage.Package_subPackage, subPackage);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Package setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.IPackage.class, cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.PluginPackage.Package_subPackage, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.IPackage selectToMeSubPackage(cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.IPackage object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.IPackage.class, cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.PluginPackage.Package_subPackage, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,437b1d5a-b87e-11e5-a463-ff45aa361315,2XhW98LandljatlgciwkIfS2+l0=] */
