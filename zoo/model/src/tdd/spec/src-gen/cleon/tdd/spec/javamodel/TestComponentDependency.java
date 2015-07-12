package cleon.tdd.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestComponentDependency extends DynamicResource implements ITestComponentDependency {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestComponentDependency> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestComponentDependency>() {
    
    @Override
    public ITestComponentDependency create() {
      return new TestComponentDependency();
    }
    
    @Override
    public ITestComponentDependency create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestComponentDependency(resourceRepository, resource);
    }
  
  };

  public TestComponentDependency() {
    super(ITestComponentDependency.TYPE_ID);
  }
  
  public TestComponentDependency(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestComponentDependency.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.uml.spec.structural.components.javamodel.IComponent> selectTo() {
    return _getList(cleon.uml.spec.structural.components.javamodel.IComponent.class, cleon.uml.spec.structural.components.ComponentsPackage.ComponentDependency_to);
  }

  public TestComponentDependency setTo(java.util.List<? extends cleon.uml.spec.structural.components.javamodel.IComponent> to) {
    _setList(cleon.uml.spec.structural.components.ComponentsPackage.ComponentDependency_to, to);
    return this;
  }
    
  @Override
  public cleon.uml.spec.structural.components.javamodel.IComponent selectToCmp() {
    return _getSingle(cleon.uml.spec.structural.components.javamodel.IComponent.class, cleon.tdd.spec.SpecPackage.TestComponentDependency_toCmp);
  }

  public TestComponentDependency setToCmp(cleon.uml.spec.structural.components.javamodel.IComponent toCmp) {
    _setSingle(cleon.tdd.spec.SpecPackage.TestComponentDependency_toCmp, toCmp);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestComponentDependency setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.uml.spec.structural.components.javamodel.IComponent.class, cleon.uml.spec.structural.components.ComponentsPackage.ComponentDependency_to, visitor);
    _acceptSingle(cleon.uml.spec.structural.components.javamodel.IComponent.class, cleon.tdd.spec.SpecPackage.TestComponentDependency_toCmp, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.tdd.spec.javamodel.ITestComponentDependency> selectToMeToCmp(cleon.uml.spec.structural.components.javamodel.IComponent object) {
    return _getToMeList(object.getRepository(), cleon.tdd.spec.javamodel.ITestComponentDependency.class, cleon.tdd.spec.SpecPackage.TestComponentDependency_toCmp, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8f19b836-12a1-11e5-a69e-755a9ac7f617,rg7GvzyBAic6sFE60hcbR8EWz+Q=] */
