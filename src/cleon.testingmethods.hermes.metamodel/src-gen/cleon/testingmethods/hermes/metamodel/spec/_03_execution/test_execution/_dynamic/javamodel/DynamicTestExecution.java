package cleon.testingmethods.hermes.metamodel.spec._03_execution.test_execution._dynamic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DynamicTestExecution extends DynamicResource implements IDynamicTestExecution {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDynamicTestExecution> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDynamicTestExecution>() {
    
    @Override
    public IDynamicTestExecution create() {
      return new DynamicTestExecution();
    }
    
    @Override
    public IDynamicTestExecution create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DynamicTestExecution(resourceRepository, resource);
    }
  
  };

  public DynamicTestExecution() {
    super(IDynamicTestExecution.TYPE_ID);
  }
  
  public DynamicTestExecution(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDynamicTestExecution.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IAbstractDynamicTest selectAbstractDynamicTest() {
    return _getSingle(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IAbstractDynamicTest.class, cleon.testingmethods.hermes.metamodel.spec._03_execution.test_execution._dynamic._dynamicPackage.DynamicTestExecution_abstractDynamicTest);
  }

  public DynamicTestExecution setAbstractDynamicTest(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IAbstractDynamicTest abstractDynamicTest) {
    _setSingle(cleon.testingmethods.hermes.metamodel.spec._03_execution.test_execution._dynamic._dynamicPackage.DynamicTestExecution_abstractDynamicTest, abstractDynamicTest);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public DynamicTestExecution setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.metamodel.spec._03_execution.test_execution._dynamic.javamodel.IDynamicTestStepExecution> selectTestStep() {
    return _getMap(cleon.testingmethods.hermes.metamodel.spec._03_execution.test_execution._dynamic.javamodel.IDynamicTestStepExecution.class, cleon.testingmethods.hermes.metamodel.spec._03_execution.test_execution._dynamic._dynamicPackage.DynamicTestExecution_testStep);
  }

  public DynamicTestExecution setTestStep(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.metamodel.spec._03_execution.test_execution._dynamic.javamodel.IDynamicTestStepExecution> testStep) {
    _setMap(cleon.testingmethods.hermes.metamodel.spec._03_execution.test_execution._dynamic._dynamicPackage.DynamicTestExecution_testStep, testStep);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DynamicTestExecution setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IAbstractDynamicTest.class, cleon.testingmethods.hermes.metamodel.spec._03_execution.test_execution._dynamic._dynamicPackage.DynamicTestExecution_abstractDynamicTest, visitor);
    _acceptMap(cleon.testingmethods.hermes.metamodel.spec._03_execution.test_execution._dynamic.javamodel.IDynamicTestStepExecution.class, cleon.testingmethods.hermes.metamodel.spec._03_execution.test_execution._dynamic._dynamicPackage.DynamicTestExecution_testStep, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.testingmethods.hermes.metamodel.spec._03_execution.test_execution._dynamic.javamodel.IDynamicTestExecution> selectToMeAbstractDynamicTest(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IAbstractDynamicTest object) {
    return _getToMeList(object.getRepository(), cleon.testingmethods.hermes.metamodel.spec._03_execution.test_execution._dynamic.javamodel.IDynamicTestExecution.class, cleon.testingmethods.hermes.metamodel.spec._03_execution.test_execution._dynamic._dynamicPackage.DynamicTestExecution_abstractDynamicTest, object.getResource());
  }
  
  public static cleon.testingmethods.hermes.metamodel.spec._03_execution.test_execution._dynamic.javamodel.IDynamicTestExecution selectToMeTestStep(cleon.testingmethods.hermes.metamodel.spec._03_execution.test_execution._dynamic.javamodel.IDynamicTestStepExecution object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.metamodel.spec._03_execution.test_execution._dynamic.javamodel.IDynamicTestExecution.class, cleon.testingmethods.hermes.metamodel.spec._03_execution.test_execution._dynamic._dynamicPackage.DynamicTestExecution_testStep, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,db5a1fe6-9192-11e9-85e6-a377d9035ee3,2B7HebAyfGEvDdSGpGY5uy29TxA=] */
