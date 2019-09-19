package cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution._dynamic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DynamicTestStepExecution extends DynamicResource implements IDynamicTestStepExecution {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDynamicTestStepExecution> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDynamicTestStepExecution>() {
    
    @Override
    public IDynamicTestStepExecution create() {
      return new DynamicTestStepExecution();
    }
    
    @Override
    public IDynamicTestStepExecution create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DynamicTestStepExecution(resourceRepository, resource);
    }
  
  };

  public DynamicTestStepExecution() {
    super(IDynamicTestStepExecution.TYPE_ID);
  }
  
  public DynamicTestStepExecution(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDynamicTestStepExecution.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public DynamicTestStepExecution setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution.javamodel.ITestResult selectTestResult() {
    return _getSingle(cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution.javamodel.ITestResult.class, cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution._dynamic._dynamicPackage.DynamicTestStepExecution_testResult);
  }

  public DynamicTestStepExecution setTestResult(cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution.javamodel.ITestResult testResult) {
    _setSingle(cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution._dynamic._dynamicPackage.DynamicTestStepExecution_testResult, testResult);
    return this;
  }
    
  @Override
  public cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.javamodel.ITestStep selectTestStep() {
    return _getSingle(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.javamodel.ITestStep.class, cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution._dynamic._dynamicPackage.DynamicTestStepExecution_testStep);
  }

  public DynamicTestStepExecution setTestStep(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.javamodel.ITestStep testStep) {
    _setSingle(cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution._dynamic._dynamicPackage.DynamicTestStepExecution_testStep, testStep);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DynamicTestStepExecution setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution.javamodel.ITestResult.class, cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution._dynamic._dynamicPackage.DynamicTestStepExecution_testResult, visitor);
    _acceptSingle(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.javamodel.ITestStep.class, cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution._dynamic._dynamicPackage.DynamicTestStepExecution_testStep, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution._dynamic.javamodel.IDynamicTestStepExecution> selectToMeTestStep(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.javamodel.ITestStep object) {
    return _getToMeList(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution._dynamic.javamodel.IDynamicTestStepExecution.class, cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution._dynamic._dynamicPackage.DynamicTestStepExecution_testStep, object.getResource());
  }
  
  public static cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution._dynamic.javamodel.IDynamicTestStepExecution selectToMeTestResult(cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution.javamodel.ITestResult object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution._dynamic.javamodel.IDynamicTestStepExecution.class, cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution._dynamic._dynamicPackage.DynamicTestStepExecution_testResult, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1eed511e-9193-11e9-85e6-a377d9035ee3,cedrOiFmbYSbay+yGJ9u5bFZQxA=] */
