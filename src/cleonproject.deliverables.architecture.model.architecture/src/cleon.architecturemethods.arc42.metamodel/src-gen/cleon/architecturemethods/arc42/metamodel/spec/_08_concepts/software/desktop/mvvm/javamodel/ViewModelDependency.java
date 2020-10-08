package cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.desktop.mvvm.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ViewModelDependency extends DynamicResource implements IViewModelDependency {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IViewModelDependency> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IViewModelDependency>() {
    
    @Override
    public IViewModelDependency create() {
      return new ViewModelDependency();
    }
    
    @Override
    public IViewModelDependency create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ViewModelDependency(resourceRepository, resource);
    }
  
  };

  public ViewModelDependency() {
    super(IViewModelDependency.TYPE_ID);
  }
  
  public ViewModelDependency(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IViewModelDependency.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Boolean selectAllowRecursiveDependency() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.modularity.metamodel.spec.SpecPackage.Dependency_allowRecursiveDependency);
  }
    
  public void setAllowRecursiveDependency(java.lang.Boolean allowRecursiveDependency) {
     _setSingleAttribute(cleon.common.modularity.metamodel.spec.SpecPackage.Dependency_allowRecursiveDependency, allowRecursiveDependency);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.desktop.mvvm.javamodel.IViewModel selectTo() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.desktop.mvvm.javamodel.IViewModel.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.desktop.mvvm.MvvmPackage.ViewModelDependency_to);
  }

  public ViewModelDependency setTo(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.desktop.mvvm.javamodel.IViewModel to) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.desktop.mvvm.MvvmPackage.ViewModelDependency_to, to);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ViewModelDependency setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.modularity.metamodel.spec.SpecPackage.Dependency_allowRecursiveDependency, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.desktop.mvvm.javamodel.IViewModel.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.desktop.mvvm.MvvmPackage.ViewModelDependency_to, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.desktop.mvvm.javamodel.IViewModelDependency> selectToMeTo(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.desktop.mvvm.javamodel.IViewModel object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.desktop.mvvm.javamodel.IViewModelDependency.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.desktop.mvvm.MvvmPackage.ViewModelDependency_to, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e5f87cbd-3b5e-11e5-86bc-73aedc28563d,spURfzzFKiunDR1S9CejK8/wfHA=] */
