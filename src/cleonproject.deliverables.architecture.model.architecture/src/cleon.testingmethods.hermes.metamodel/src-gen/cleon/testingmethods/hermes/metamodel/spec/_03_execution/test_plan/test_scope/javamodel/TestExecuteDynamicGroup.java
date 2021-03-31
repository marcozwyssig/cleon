package cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestExecuteDynamicGroup extends DynamicResource implements ITestExecuteDynamicGroup {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestExecuteDynamicGroup> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestExecuteDynamicGroup>() {
    
    @Override
    public ITestExecuteDynamicGroup create() {
      return new TestExecuteDynamicGroup();
    }
    
    @Override
    public ITestExecuteDynamicGroup create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestExecuteDynamicGroup(resourceRepository, resource);
    }
  
  };

  public TestExecuteDynamicGroup() {
    super(ITestExecuteDynamicGroup.TYPE_ID);
  }
  
  public TestExecuteDynamicGroup(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestExecuteDynamicGroup.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IDynamicTestGroup selectDynamicTestGroup() {
    return _getSingle(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IDynamicTestGroup.class, cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.Test_scopePackage.TestExecuteDynamicGroup_dynamicTestGroup);
  }

  public TestExecuteDynamicGroup setDynamicTestGroup(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IDynamicTestGroup dynamicTestGroup) {
    _setSingle(cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.Test_scopePackage.TestExecuteDynamicGroup_dynamicTestGroup, dynamicTestGroup);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public TestExecuteDynamicGroup setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IAbstractDynamicTest> selectTestDynamicTestScope() {
    return _getList(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IAbstractDynamicTest.class, cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.Test_scopePackage.TestExecuteDynamicGroup_testDynamicTestScope);
  }

  public TestExecuteDynamicGroup setTestDynamicTestScope(java.util.List<? extends cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IAbstractDynamicTest> testDynamicTestScope) {
    _setList(cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.Test_scopePackage.TestExecuteDynamicGroup_testDynamicTestScope, testDynamicTestScope);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestExecuteDynamicGroup setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IDynamicTestGroup.class, cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.Test_scopePackage.TestExecuteDynamicGroup_dynamicTestGroup, visitor);
    _acceptList(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IAbstractDynamicTest.class, cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.Test_scopePackage.TestExecuteDynamicGroup_testDynamicTestScope, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.javamodel.ITestExecuteDynamicGroup> selectToMeDynamicTestGroup(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IDynamicTestGroup object) {
    return _getToMeList(object.getRepository(), cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.javamodel.ITestExecuteDynamicGroup.class, cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.Test_scopePackage.TestExecuteDynamicGroup_dynamicTestGroup, object.getResource());
  }
  
  public static java.util.List<cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.javamodel.ITestExecuteDynamicGroup> selectToMeTestDynamicTestScope(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IAbstractDynamicTest object) {
    return _getToMeList(object.getRepository(), cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.javamodel.ITestExecuteDynamicGroup.class, cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.Test_scopePackage.TestExecuteDynamicGroup_testDynamicTestScope, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2529ae0a-918f-11e9-85e6-a377d9035ee3,LdWMlK0WWwjKt4aBwNLlzsbNi/s=] */
