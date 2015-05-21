package cleon.uml.spec.structural.components.javamodel;

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
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.uml.spec.structural.components.javamodel.IComponentComposition> selectOn() {
    return _getList(cleon.uml.spec.structural.components.javamodel.IComponentComposition.class, cleon.uml.spec.structural.components.ComponentsPackage.ComponentCompositionDependency_on);
  }

  public ComponentCompositionDependency setOn(java.util.List<? extends cleon.uml.spec.structural.components.javamodel.IComponentComposition> on) {
    _setList(cleon.uml.spec.structural.components.ComponentsPackage.ComponentCompositionDependency_on, on);
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
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.uml.spec.structural.components.javamodel.IComponentComposition.class, cleon.uml.spec.structural.components.ComponentsPackage.ComponentCompositionDependency_on, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.uml.spec.structural.components.javamodel.IComponentCompositionDependency> selectToMeOn(cleon.uml.spec.structural.components.javamodel.IComponentComposition object) {
    return _getToMeList(object.getRepository(), cleon.uml.spec.structural.components.javamodel.IComponentCompositionDependency.class, cleon.uml.spec.structural.components.ComponentsPackage.ComponentCompositionDependency_on, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,72e79576-ffc4-11e4-ac0a-959b440f987f,0KfxGKMIX2VUGZuzZ2/2CRM/nI8=] */
