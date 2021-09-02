package cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.test_input_connection.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestInputConnectionEnvironmentNotPossible extends DynamicResource implements ITestInputConnectionEnvironmentNotPossible {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestInputConnectionEnvironmentNotPossible> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestInputConnectionEnvironmentNotPossible>() {
    
    @Override
    public ITestInputConnectionEnvironmentNotPossible create() {
      return new TestInputConnectionEnvironmentNotPossible();
    }
    
    @Override
    public ITestInputConnectionEnvironmentNotPossible create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestInputConnectionEnvironmentNotPossible(resourceRepository, resource);
    }
  
  };

  public TestInputConnectionEnvironmentNotPossible() {
    super(ITestInputConnectionEnvironmentNotPossible.TYPE_ID);
  }
  
  public TestInputConnectionEnvironmentNotPossible(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestInputConnectionEnvironmentNotPossible.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_environment.javamodel.ITestEnvironment selectEnvironment() {
    return _getSingle(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_environment.javamodel.ITestEnvironment.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.test_input_connection.Test_input_connectionPackage.TestAbstractInputConnection_environment);
  }

  public TestInputConnectionEnvironmentNotPossible setEnvironment(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_environment.javamodel.ITestEnvironment environment) {
    _setSingle(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.test_input_connection.Test_input_connectionPackage.TestAbstractInputConnection_environment, environment);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public TestInputConnectionEnvironmentNotPossible setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestInputConnectionEnvironmentNotPossible setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_environment.javamodel.ITestEnvironment.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.test_input_connection.Test_input_connectionPackage.TestAbstractInputConnection_environment, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6d391980-0bfe-11ec-958d-1bedd06d8336,e17bkSY0Fp2/HEaCV0KgHR5NLzg=] */
