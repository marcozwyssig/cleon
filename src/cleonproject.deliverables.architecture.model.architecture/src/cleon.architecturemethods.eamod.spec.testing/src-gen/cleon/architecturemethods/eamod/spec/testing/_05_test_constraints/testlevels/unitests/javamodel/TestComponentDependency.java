package cleon.architecturemethods.eamod.spec.testing._05_test_constraints.testlevels.unitests.javamodel;

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
  public cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IComponentWithPackage selectTo() {
    return _getSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IComponentWithPackage.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentDependency_to);
  }

  public TestComponentDependency setTo(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IComponentWithPackage to) {
    _setSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentDependency_to, to);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IComponentWithPackage selectToCmp() {
    return _getSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IComponentWithPackage.class, cleon.architecturemethods.eamod.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestComponentDependency_toCmp);
  }

  public TestComponentDependency setToCmp(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IComponentWithPackage toCmp) {
    _setSingle(cleon.architecturemethods.eamod.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestComponentDependency_toCmp, toCmp);
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
    _acceptSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IComponentWithPackage.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentDependency_to, visitor);
    _acceptSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IComponentWithPackage.class, cleon.architecturemethods.eamod.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestComponentDependency_toCmp, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.eamod.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestComponentDependency> selectToMeToCmp(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IComponentWithPackage object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.eamod.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestComponentDependency.class, cleon.architecturemethods.eamod.spec.testing._05_test_constraints.testlevels.unitests.UnitestsPackage.TestComponentDependency_toCmp, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8f19b836-12a1-11e5-a69e-755a9ac7f617,ElhLaOYgRTPqc2MzHtbFCDK/jJE=] */
