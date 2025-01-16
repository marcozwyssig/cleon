package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.packaging.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class PackagetSet extends DynamicResource implements IPackagetSet {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPackagetSet> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPackagetSet>() {
    
    @Override
    public IPackagetSet create() {
      return new PackagetSet();
    }
    
    @Override
    public IPackagetSet create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new PackagetSet(resourceRepository, resource);
    }
  
  };

  public PackagetSet() {
    super(IPackagetSet.TYPE_ID);
  }
  
  public PackagetSet(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPackagetSet.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.packaging.javamodel.IPackageComponent> selectPackage() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.packaging.javamodel.IPackageComponent.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.packaging.PackagingPackage.PackagetSet_package);
  }

  public PackagetSet setPackage(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.packaging.javamodel.IPackageComponent> package_) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.packaging.PackagingPackage.PackagetSet_package, package_);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IAbstractComponent selectServiceComponent() {
    return _getSingle(cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IAbstractComponent.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.packaging.PackagingPackage.PackagetSet_serviceComponent);
  }

  public PackagetSet setServiceComponent(cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IAbstractComponent serviceComponent) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.packaging.PackagingPackage.PackagetSet_serviceComponent, serviceComponent);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public PackagetSet setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public PackagetSet setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.packaging.javamodel.IPackageComponent.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.packaging.PackagingPackage.PackagetSet_package, visitor);
    _acceptSingle(cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IAbstractComponent.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.packaging.PackagingPackage.PackagetSet_serviceComponent, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.packaging.javamodel.IPackagetSet> selectToMeServiceComponent(cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IAbstractComponent object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.packaging.javamodel.IPackagetSet.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.packaging.PackagingPackage.PackagetSet_serviceComponent, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.packaging.javamodel.IPackagetSet selectToMePackage(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.packaging.javamodel.IPackageComponent object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.packaging.javamodel.IPackagetSet.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.packaging.PackagingPackage.PackagetSet_package, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,fa35ca8a-cf5a-11ef-a3e8-99fb4b8645f8,NbL9Ud3WqElcGdHpy69A6/3ME+A=] */
