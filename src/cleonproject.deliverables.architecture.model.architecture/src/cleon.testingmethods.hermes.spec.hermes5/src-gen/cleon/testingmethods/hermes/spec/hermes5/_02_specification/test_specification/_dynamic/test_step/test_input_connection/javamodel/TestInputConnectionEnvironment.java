package cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.test_input_connection.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestInputConnectionEnvironment extends DynamicResource implements ITestInputConnectionEnvironment {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestInputConnectionEnvironment> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestInputConnectionEnvironment>() {
    
    @Override
    public ITestInputConnectionEnvironment create() {
      return new TestInputConnectionEnvironment();
    }
    
    @Override
    public ITestInputConnectionEnvironment create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestInputConnectionEnvironment(resourceRepository, resource);
    }
  
  };

  public TestInputConnectionEnvironment() {
    super(ITestInputConnectionEnvironment.TYPE_ID);
  }
  
  public TestInputConnectionEnvironment(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestInputConnectionEnvironment.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public TestInputConnectionEnvironment setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_environment.javamodel.ITestEnvironment selectTestEnvironment() {
    return _getSingle(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_environment.javamodel.ITestEnvironment.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.test_input_connection.Test_input_connectionPackage.TestInputConnectionEnvironment_testEnvironment);
  }

  public TestInputConnectionEnvironment setTestEnvironment(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_environment.javamodel.ITestEnvironment testEnvironment) {
    _setSingle(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.test_input_connection.Test_input_connectionPackage.TestInputConnectionEnvironment_testEnvironment, testEnvironment);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestInputConnectionEnvironment setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_environment.javamodel.ITestConnection selectUseConnection() {
    return _getSingle(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_environment.javamodel.ITestConnection.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.test_input_connection.Test_input_connectionPackage.TestInputConnectionEnvironment_useConnection);
  }

  public TestInputConnectionEnvironment setUseConnection(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_environment.javamodel.ITestConnection useConnection) {
    _setSingle(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.test_input_connection.Test_input_connectionPackage.TestInputConnectionEnvironment_useConnection, useConnection);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_environment.javamodel.ITestEnvironment.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.test_input_connection.Test_input_connectionPackage.TestInputConnectionEnvironment_testEnvironment, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_environment.javamodel.ITestConnection.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.test_input_connection.Test_input_connectionPackage.TestInputConnectionEnvironment_useConnection, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.test_input_connection.javamodel.ITestInputConnectionEnvironment> selectToMeTestEnvironment(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_environment.javamodel.ITestEnvironment object) {
    return _getToMeList(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.test_input_connection.javamodel.ITestInputConnectionEnvironment.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.test_input_connection.Test_input_connectionPackage.TestInputConnectionEnvironment_testEnvironment, object.getResource());
  }
  
  public static java.util.List<cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.test_input_connection.javamodel.ITestInputConnectionEnvironment> selectToMeUseConnection(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_environment.javamodel.ITestConnection object) {
    return _getToMeList(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.test_input_connection.javamodel.ITestInputConnectionEnvironment.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.test_input_connection.Test_input_connectionPackage.TestInputConnectionEnvironment_useConnection, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2f47fb47-6d6d-11e9-b84d-d319514e887f,9yIvLBM8lLWP4y0lWQ37QcwkP64=] */
