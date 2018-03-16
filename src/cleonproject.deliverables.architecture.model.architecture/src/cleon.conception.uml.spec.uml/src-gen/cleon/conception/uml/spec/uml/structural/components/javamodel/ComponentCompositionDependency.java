package cleon.conception.uml.spec.uml.structural.components.javamodel;

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

  // relations
  
  @Override
  public java.util.List<? extends cleon.conception.uml.spec.uml.structural.components.javamodel.IComponentComposition> selectTo() {
    return _getList(cleon.conception.uml.spec.uml.structural.components.javamodel.IComponentComposition.class, cleon.conception.uml.spec.uml.structural.components.ComponentsPackage.ComponentCompositionDependency_to);
  }

  public ComponentCompositionDependency setTo(java.util.List<? extends cleon.conception.uml.spec.uml.structural.components.javamodel.IComponentComposition> to) {
    _setList(cleon.conception.uml.spec.uml.structural.components.ComponentsPackage.ComponentCompositionDependency_to, to);
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
    // relations
    _acceptList(cleon.conception.uml.spec.uml.structural.components.javamodel.IComponentComposition.class, cleon.conception.uml.spec.uml.structural.components.ComponentsPackage.ComponentCompositionDependency_to, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.conception.uml.spec.uml.structural.components.javamodel.IComponentCompositionDependency> selectToMeTo(cleon.conception.uml.spec.uml.structural.components.javamodel.IComponentComposition object) {
    return _getToMeList(object.getRepository(), cleon.conception.uml.spec.uml.structural.components.javamodel.IComponentCompositionDependency.class, cleon.conception.uml.spec.uml.structural.components.ComponentsPackage.ComponentCompositionDependency_to, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,72e79576-ffc4-11e4-ac0a-959b440f987f,kXXpm0BRmvB191cNzk0tX2eZ5pk=] */
