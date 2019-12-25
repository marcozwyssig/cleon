package cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestDynamicTestLevelScope extends DynamicResource implements ITestDynamicTestLevelScope {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestDynamicTestLevelScope> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestDynamicTestLevelScope>() {
    
    @Override
    public ITestDynamicTestLevelScope create() {
      return new TestDynamicTestLevelScope();
    }
    
    @Override
    public ITestDynamicTestLevelScope create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestDynamicTestLevelScope(resourceRepository, resource);
    }
  
  };

  public TestDynamicTestLevelScope() {
    super(ITestDynamicTestLevelScope.TYPE_ID);
  }
  
  public TestDynamicTestLevelScope(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestDynamicTestLevelScope.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IDynamicTestLevels selectDynamicTestLevels() {
    return _getSingle(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IDynamicTestLevels.class, cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.Test_scopePackage.TestDynamicTestLevelScope_dynamicTestLevels);
  }

  public TestDynamicTestLevelScope setDynamicTestLevels(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IDynamicTestLevels dynamicTestLevels) {
    _setSingle(cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.Test_scopePackage.TestDynamicTestLevelScope_dynamicTestLevels, dynamicTestLevels);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public TestDynamicTestLevelScope setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.javamodel.ITestDynamicGroup> selectTestDynamicGroup() {
    return _getMap(cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.javamodel.ITestDynamicGroup.class, cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.Test_scopePackage.TestDynamicTestLevelScope_testDynamicGroup);
  }

  public TestDynamicTestLevelScope setTestDynamicGroup(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.javamodel.ITestDynamicGroup> testDynamicGroup) {
    _setMap(cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.Test_scopePackage.TestDynamicTestLevelScope_testDynamicGroup, testDynamicGroup);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestDynamicTestLevelScope setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IDynamicTestLevels.class, cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.Test_scopePackage.TestDynamicTestLevelScope_dynamicTestLevels, visitor);
    _acceptMap(cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.javamodel.ITestDynamicGroup.class, cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.Test_scopePackage.TestDynamicTestLevelScope_testDynamicGroup, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.javamodel.ITestDynamicTestLevelScope> selectToMeDynamicTestLevels(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IDynamicTestLevels object) {
    return _getToMeList(object.getRepository(), cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.javamodel.ITestDynamicTestLevelScope.class, cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.Test_scopePackage.TestDynamicTestLevelScope_dynamicTestLevels, object.getResource());
  }
  
  public static cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.javamodel.ITestDynamicTestLevelScope selectToMeTestDynamicGroup(cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.javamodel.ITestDynamicGroup object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.javamodel.ITestDynamicTestLevelScope.class, cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scope.Test_scopePackage.TestDynamicTestLevelScope_testDynamicGroup, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b35d2498-918e-11e9-85e6-a377d9035ee3,rUgjotwofi28te8Aeu/Ae5nE5eQ=] */
