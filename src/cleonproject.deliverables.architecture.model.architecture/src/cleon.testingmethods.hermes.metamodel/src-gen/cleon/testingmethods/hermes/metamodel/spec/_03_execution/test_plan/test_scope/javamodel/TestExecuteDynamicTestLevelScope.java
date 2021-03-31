package cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestExecuteDynamicTestLevelScope extends DynamicResource implements ITestExecuteDynamicTestLevelScope {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestExecuteDynamicTestLevelScope> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestExecuteDynamicTestLevelScope>() {
    
    @Override
    public ITestExecuteDynamicTestLevelScope create() {
      return new TestExecuteDynamicTestLevelScope();
    }
    
    @Override
    public ITestExecuteDynamicTestLevelScope create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestExecuteDynamicTestLevelScope(resourceRepository, resource);
    }
  
  };

  public TestExecuteDynamicTestLevelScope() {
    super(ITestExecuteDynamicTestLevelScope.TYPE_ID);
  }
  
  public TestExecuteDynamicTestLevelScope(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestExecuteDynamicTestLevelScope.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.ITestDynamicTestLevelSpecificationDocument selectDynamicTestLevels() {
    return _getSingle(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.ITestDynamicTestLevelSpecificationDocument.class, cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.Test_scopePackage.TestExecuteDynamicTestLevelScope_dynamicTestLevels);
  }

  public TestExecuteDynamicTestLevelScope setDynamicTestLevels(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.ITestDynamicTestLevelSpecificationDocument dynamicTestLevels) {
    _setSingle(cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.Test_scopePackage.TestExecuteDynamicTestLevelScope_dynamicTestLevels, dynamicTestLevels);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public TestExecuteDynamicTestLevelScope setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.javamodel.ITestExecuteDynamicGroup> selectTestDynamicGroup() {
    return _getMap(cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.javamodel.ITestExecuteDynamicGroup.class, cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.Test_scopePackage.TestExecuteDynamicTestLevelScope_testDynamicGroup);
  }

  public TestExecuteDynamicTestLevelScope setTestDynamicGroup(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.javamodel.ITestExecuteDynamicGroup> testDynamicGroup) {
    _setMap(cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.Test_scopePackage.TestExecuteDynamicTestLevelScope_testDynamicGroup, testDynamicGroup);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestExecuteDynamicTestLevelScope setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.ITestDynamicTestLevelSpecificationDocument.class, cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.Test_scopePackage.TestExecuteDynamicTestLevelScope_dynamicTestLevels, visitor);
    _acceptMap(cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.javamodel.ITestExecuteDynamicGroup.class, cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.Test_scopePackage.TestExecuteDynamicTestLevelScope_testDynamicGroup, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.javamodel.ITestExecuteDynamicTestLevelScope> selectToMeDynamicTestLevels(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.ITestDynamicTestLevelSpecificationDocument object) {
    return _getToMeList(object.getRepository(), cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.javamodel.ITestExecuteDynamicTestLevelScope.class, cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.Test_scopePackage.TestExecuteDynamicTestLevelScope_dynamicTestLevels, object.getResource());
  }
  
  public static cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.javamodel.ITestExecuteDynamicTestLevelScope selectToMeTestDynamicGroup(cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.javamodel.ITestExecuteDynamicGroup object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.javamodel.ITestExecuteDynamicTestLevelScope.class, cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.Test_scopePackage.TestExecuteDynamicTestLevelScope_testDynamicGroup, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b35d2498-918e-11e9-85e6-a377d9035ee3,OU4277sg9qmSTrYwai0Abk59018=] */
