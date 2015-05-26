package cleon.uml.spec.structural.components.javamodel;

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
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.uml.spec.structural.components.javamodel.IComponent> selectOn() {
    return _getList(cleon.uml.spec.structural.components.javamodel.IComponent.class, cleon.uml.spec.structural.components.ComponentsPackage.ComponentDependency_on);
  }

  public ComponentDependency setOn(java.util.List<? extends cleon.uml.spec.structural.components.javamodel.IComponent> on) {
    _setList(cleon.uml.spec.structural.components.ComponentsPackage.ComponentDependency_on, on);
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
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.uml.spec.structural.components.javamodel.IComponent.class, cleon.uml.spec.structural.components.ComponentsPackage.ComponentDependency_on, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.uml.spec.structural.components.javamodel.IComponentDependency> selectToMeOn(cleon.uml.spec.structural.components.javamodel.IComponent object) {
    return _getToMeList(object.getRepository(), cleon.uml.spec.structural.components.javamodel.IComponentDependency.class, cleon.uml.spec.structural.components.ComponentsPackage.ComponentDependency_on, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6cacbca2-ffc4-11e4-ac0a-959b440f987f,5P+CFSxbmZ8uWWLNNzG9GoazPGQ=] */
