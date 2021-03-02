package cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestExpectedResultEnvironment extends DynamicResource implements ITestExpectedResultEnvironment {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestExpectedResultEnvironment> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestExpectedResultEnvironment>() {
    
    @Override
    public ITestExpectedResultEnvironment create() {
      return new TestExpectedResultEnvironment();
    }
    
    @Override
    public ITestExpectedResultEnvironment create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestExpectedResultEnvironment(resourceRepository, resource);
    }
  
  };

  public TestExpectedResultEnvironment() {
    super(ITestExpectedResultEnvironment.TYPE_ID);
  }
  
  public TestExpectedResultEnvironment(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestExpectedResultEnvironment.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectExpectedResult() {
    return _getSingleAttribute(java.lang.String.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.Test_stepPackage.ExpectedResultAware_expectedResult);
  }
    
  public void setExpectedResult(java.lang.String expectedResult) {
     _setSingleAttribute(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.Test_stepPackage.ExpectedResultAware_expectedResult, expectedResult);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public TestExpectedResultEnvironment setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_environment.javamodel.ITestEnvironment selectTestEnvironment() {
    return _getSingle(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_environment.javamodel.ITestEnvironment.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.Test_stepPackage.TestExpectedResultEnvironment_testEnvironment);
  }

  public TestExpectedResultEnvironment setTestEnvironment(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_environment.javamodel.ITestEnvironment testEnvironment) {
    _setSingle(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.Test_stepPackage.TestExpectedResultEnvironment_testEnvironment, testEnvironment);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestExpectedResultEnvironment setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.Test_stepPackage.ExpectedResultAware_expectedResult, visitor);
    // relations
    _acceptSingle(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_environment.javamodel.ITestEnvironment.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.Test_stepPackage.TestExpectedResultEnvironment_testEnvironment, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.javamodel.ITestExpectedResultEnvironment> selectToMeTestEnvironment(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_environment.javamodel.ITestEnvironment object) {
    return _getToMeList(object.getRepository(), cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.javamodel.ITestExpectedResultEnvironment.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.Test_stepPackage.TestExpectedResultEnvironment_testEnvironment, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,46efffd5-7b6c-11eb-b8e5-2d821e359a02,oAQiD8y/nbQrrUrGeiZEHWTYqho=] */
