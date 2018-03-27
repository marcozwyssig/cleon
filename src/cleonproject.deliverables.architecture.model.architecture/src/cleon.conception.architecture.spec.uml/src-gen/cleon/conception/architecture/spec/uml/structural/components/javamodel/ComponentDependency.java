package cleon.conception.architecture.spec.uml.structural.components.javamodel;

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

  // relations
  
  @Override
  public cleon.conception.architecture.spec.uml.structural.components.javamodel.IComponentWithPackage selectTo() {
    return _getSingle(cleon.conception.architecture.spec.uml.structural.components.javamodel.IComponentWithPackage.class, cleon.conception.architecture.spec.uml.structural.components.ComponentsPackage.ComponentDependency_to);
  }

  public ComponentDependency setTo(cleon.conception.architecture.spec.uml.structural.components.javamodel.IComponentWithPackage to) {
    _setSingle(cleon.conception.architecture.spec.uml.structural.components.ComponentsPackage.ComponentDependency_to, to);
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
    // relations
    _acceptSingle(cleon.conception.architecture.spec.uml.structural.components.javamodel.IComponentWithPackage.class, cleon.conception.architecture.spec.uml.structural.components.ComponentsPackage.ComponentDependency_to, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.conception.architecture.spec.uml.structural.components.javamodel.IComponentDependency> selectToMeTo(cleon.conception.architecture.spec.uml.structural.components.javamodel.IComponentWithPackage object) {
    return _getToMeList(object.getRepository(), cleon.conception.architecture.spec.uml.structural.components.javamodel.IComponentDependency.class, cleon.conception.architecture.spec.uml.structural.components.ComponentsPackage.ComponentDependency_to, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6cacbca2-ffc4-11e4-ac0a-959b440f987f,ReZfEcWH0kxX8ecHLsaAH7Pf0Eo=] */
