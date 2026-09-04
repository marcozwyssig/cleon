package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.packaging.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class PackageComponent extends DynamicResource implements IPackageComponent {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPackageComponent> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPackageComponent>() {
    
    @Override
    public IPackageComponent create() {
      return new PackageComponent();
    }
    
    @Override
    public IPackageComponent create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new PackageComponent(resourceRepository, resource);
    }
  
  };

  public PackageComponent() {
    super(IPackageComponent.TYPE_ID);
  }
  
  public PackageComponent(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPackageComponent.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IAbstractComponent selectComponent() {
    return _getSingle(cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IAbstractComponent.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.packaging.PackagingPackage.PackageComponent_component);
  }

  public PackageComponent setComponent(cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IAbstractComponent component) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.packaging.PackagingPackage.PackageComponent_component, component);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.packaging.javamodel.IPackageComponent> selectPackage() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.packaging.javamodel.IPackageComponent.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.packaging.PackagingPackage.PackageComponent_package);
  }

  public PackageComponent setPackage(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.packaging.javamodel.IPackageComponent> package_) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.packaging.PackagingPackage.PackageComponent_package, package_);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public PackageComponent setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public PackageComponent setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IAbstractComponent.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.packaging.PackagingPackage.PackageComponent_component, visitor);
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.packaging.javamodel.IPackageComponent.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.packaging.PackagingPackage.PackageComponent_package, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.packaging.javamodel.IPackageComponent> selectToMeComponent(cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IAbstractComponent object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.packaging.javamodel.IPackageComponent.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.packaging.PackagingPackage.PackageComponent_component, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.packaging.javamodel.IPackageComponent selectToMePackage(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.packaging.javamodel.IPackageComponent object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.packaging.javamodel.IPackageComponent.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.packaging.PackagingPackage.PackageComponent_package, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e96972fa-bed8-11ef-9199-8d2aaa4407a0,1IDR0Q9WAdzLduigbBFSZWsQe/4=] */
