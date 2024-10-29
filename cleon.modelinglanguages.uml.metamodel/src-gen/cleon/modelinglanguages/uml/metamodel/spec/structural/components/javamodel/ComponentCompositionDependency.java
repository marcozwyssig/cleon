package cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ComponentCompositionDependency extends DynamicResource implements IComponentCompositionDependency {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IComponentCompositionDependency> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IComponentCompositionDependency>() {
    
    @Override
    public IComponentCompositionDependency create() {
      return new ComponentCompositionDependency();
    }
    
    @Override
    public IComponentCompositionDependency create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ComponentCompositionDependency(resourceRepository, resource);
    }
  
  };

  public ComponentCompositionDependency() {
    super(IComponentCompositionDependency.TYPE_ID);
  }
  
  public ComponentCompositionDependency(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IComponentCompositionDependency.TYPE_ID);
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
  public cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IComponentComposition selectTo() {
    return _getSingle(cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IComponentComposition.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.ComponentCompositionDependency_to);
  }

  public ComponentCompositionDependency setTo(cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IComponentComposition to) {
    _setSingle(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.ComponentCompositionDependency_to, to);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ComponentCompositionDependency setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IComponentComposition.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.ComponentCompositionDependency_to, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IComponentCompositionDependency> selectToMeTo(cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IComponentComposition object) {
    return _getToMeList(object.getRepository(), cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IComponentCompositionDependency.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.ComponentCompositionDependency_to, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,72e79576-ffc4-11e4-ac0a-959b440f987f,QhARGP1SNEdOkYjBFYsCcFYRUbQ=] */
