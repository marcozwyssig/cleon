package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.package_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class PackageSet extends DynamicResource implements IPackageSet {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPackageSet> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPackageSet>() {
    
    @Override
    public IPackageSet create() {
      return new PackageSet();
    }
    
    @Override
    public IPackageSet create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new PackageSet(resourceRepository, resource);
    }
  
  };

  public PackageSet() {
    super(IPackageSet.TYPE_ID);
  }
  
  public PackageSet(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPackageSet.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.package_view.javamodel.IPackageComponent> selectPackage() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.package_view.javamodel.IPackageComponent.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.package_view.Package_viewPackage.PackageSet_package);
  }

  public PackageSet setPackage(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.package_view.javamodel.IPackageComponent> package_) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.package_view.Package_viewPackage.PackageSet_package, package_);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IAbstractComponent selectRootComponent() {
    return _getSingle(cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IAbstractComponent.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.package_view.Package_viewPackage.PackageSet_rootComponent);
  }

  public PackageSet setRootComponent(cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IAbstractComponent rootComponent) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.package_view.Package_viewPackage.PackageSet_rootComponent, rootComponent);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public PackageSet setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.package_view.javamodel.IPackageComponent.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.package_view.Package_viewPackage.PackageSet_package, visitor);
    _acceptSingle(cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IAbstractComponent.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.package_view.Package_viewPackage.PackageSet_rootComponent, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.package_view.javamodel.IPackageSet> selectToMeRootComponent(cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IAbstractComponent object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.package_view.javamodel.IPackageSet.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.package_view.Package_viewPackage.PackageSet_rootComponent, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.package_view.javamodel.IPackageSet selectToMePackage(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.package_view.javamodel.IPackageComponent object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.package_view.javamodel.IPackageSet.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.package_view.Package_viewPackage.PackageSet_package, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,184f3428-bed5-11ef-b625-9d1578892e52,/c//7R/2psIUx0EfAgP26IW+Gmk=] */
