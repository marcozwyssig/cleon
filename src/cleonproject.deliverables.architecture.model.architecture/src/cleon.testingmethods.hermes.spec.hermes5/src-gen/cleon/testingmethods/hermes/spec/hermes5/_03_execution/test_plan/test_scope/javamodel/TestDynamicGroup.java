package cleon.testingmethods.hermes.spec.hermes5._03_execution.test_plan.test_scope.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestDynamicGroup extends DynamicResource implements ITestDynamicGroup {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestDynamicGroup> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestDynamicGroup>() {
    
    @Override
    public ITestDynamicGroup create() {
      return new TestDynamicGroup();
    }
    
    @Override
    public ITestDynamicGroup create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestDynamicGroup(resourceRepository, resource);
    }
  
  };

  public TestDynamicGroup() {
    super(ITestDynamicGroup.TYPE_ID);
  }
  
  public TestDynamicGroup(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestDynamicGroup.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.javamodel.IDynamicTestGroup selectDynamicTestGroup() {
    return _getSingle(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.javamodel.IDynamicTestGroup.class, cleon.testingmethods.hermes.spec.hermes5._03_execution.test_plan.test_scope.Test_scopePackage.TestDynamicGroup_dynamicTestGroup);
  }

  public TestDynamicGroup setDynamicTestGroup(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.javamodel.IDynamicTestGroup dynamicTestGroup) {
    _setSingle(cleon.testingmethods.hermes.spec.hermes5._03_execution.test_plan.test_scope.Test_scopePackage.TestDynamicGroup_dynamicTestGroup, dynamicTestGroup);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public TestDynamicGroup setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.javamodel.IAbstractDynamicTest> selectTestDynamicTestScope() {
    return _getList(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.javamodel.IAbstractDynamicTest.class, cleon.testingmethods.hermes.spec.hermes5._03_execution.test_plan.test_scope.Test_scopePackage.TestDynamicGroup_testDynamicTestScope);
  }

  public TestDynamicGroup setTestDynamicTestScope(java.util.List<? extends cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.javamodel.IAbstractDynamicTest> testDynamicTestScope) {
    _setList(cleon.testingmethods.hermes.spec.hermes5._03_execution.test_plan.test_scope.Test_scopePackage.TestDynamicGroup_testDynamicTestScope, testDynamicTestScope);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestDynamicGroup setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.javamodel.IDynamicTestGroup.class, cleon.testingmethods.hermes.spec.hermes5._03_execution.test_plan.test_scope.Test_scopePackage.TestDynamicGroup_dynamicTestGroup, visitor);
    _acceptList(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.javamodel.IAbstractDynamicTest.class, cleon.testingmethods.hermes.spec.hermes5._03_execution.test_plan.test_scope.Test_scopePackage.TestDynamicGroup_testDynamicTestScope, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.testingmethods.hermes.spec.hermes5._03_execution.test_plan.test_scope.javamodel.ITestDynamicGroup> selectToMeDynamicTestGroup(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.javamodel.IDynamicTestGroup object) {
    return _getToMeList(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._03_execution.test_plan.test_scope.javamodel.ITestDynamicGroup.class, cleon.testingmethods.hermes.spec.hermes5._03_execution.test_plan.test_scope.Test_scopePackage.TestDynamicGroup_dynamicTestGroup, object.getResource());
  }
  
  public static java.util.List<cleon.testingmethods.hermes.spec.hermes5._03_execution.test_plan.test_scope.javamodel.ITestDynamicGroup> selectToMeTestDynamicTestScope(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.javamodel.IAbstractDynamicTest object) {
    return _getToMeList(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._03_execution.test_plan.test_scope.javamodel.ITestDynamicGroup.class, cleon.testingmethods.hermes.spec.hermes5._03_execution.test_plan.test_scope.Test_scopePackage.TestDynamicGroup_testDynamicTestScope, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2529ae0a-918f-11e9-85e6-a377d9035ee3,XAQxPcP8r4A6BzyYhbMX74H+e5k=] */
