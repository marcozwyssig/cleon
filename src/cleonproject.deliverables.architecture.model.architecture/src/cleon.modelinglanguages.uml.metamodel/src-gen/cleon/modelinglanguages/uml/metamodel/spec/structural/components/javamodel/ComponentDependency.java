package cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ComponentDependency extends DynamicResource implements IComponentDependency {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IComponentDependency> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IComponentDependency>() {
    
    @Override
    public IComponentDependency create() {
      return new ComponentDependency();
    }
    
    @Override
    public IComponentDependency create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ComponentDependency(resourceRepository, resource);
    }
  
  };

  public ComponentDependency() {
    super(IComponentDependency.TYPE_ID);
  }
  
  public ComponentDependency(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IComponentDependency.TYPE_ID);
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
  public cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IComponentWithPackage selectTo() {
    return _getSingle(cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IComponentWithPackage.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.ComponentDependency_to);
  }

  public ComponentDependency setTo(cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IComponentWithPackage to) {
    _setSingle(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.ComponentDependency_to, to);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ComponentDependency setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IComponentWithPackage.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.ComponentDependency_to, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IComponentDependency> selectToMeTo(cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IComponentWithPackage object) {
    return _getToMeList(object.getRepository(), cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IComponentDependency.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.ComponentDependency_to, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6cacbca2-ffc4-11e4-ac0a-959b440f987f,9AIWEyHkhT7Ma1i4LqVnKHJmI6s=] */
