package cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_environment.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestEnvironment extends DynamicResource implements ITestEnvironment {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestEnvironment> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestEnvironment>() {
    
    @Override
    public ITestEnvironment create() {
      return new TestEnvironment();
    }
    
    @Override
    public ITestEnvironment create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestEnvironment(resourceRepository, resource);
    }
  
  };

  public TestEnvironment() {
    super(ITestEnvironment.TYPE_ID);
  }
  
  public TestEnvironment(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestEnvironment.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment selectEnvironmentView() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment.class, cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_environment.Test_environmentPackage.TestEnvironment_environmentView);
  }

  public TestEnvironment setEnvironmentView(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment environmentView) {
    _setSingle(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_environment.Test_environmentPackage.TestEnvironment_environmentView, environmentView);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public TestEnvironment setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_environment.javamodel.ITestConnection> selectTestConnection() {
    return _getMap(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_environment.javamodel.ITestConnection.class, cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_environment.Test_environmentPackage.TestEnvironment_testConnection);
  }

  public TestEnvironment setTestConnection(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_environment.javamodel.ITestConnection> testConnection) {
    _setMap(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_environment.Test_environmentPackage.TestEnvironment_testConnection, testConnection);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestEnvironment setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment.class, cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_environment.Test_environmentPackage.TestEnvironment_environmentView, visitor);
    _acceptMap(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_environment.javamodel.ITestConnection.class, cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_environment.Test_environmentPackage.TestEnvironment_testConnection, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_environment.javamodel.ITestEnvironment> selectToMeEnvironmentView(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment object) {
    return _getToMeList(object.getRepository(), cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_environment.javamodel.ITestEnvironment.class, cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_environment.Test_environmentPackage.TestEnvironment_environmentView, object.getResource());
  }
  
  public static cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_environment.javamodel.ITestEnvironment selectToMeTestConnection(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_environment.javamodel.ITestConnection object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_environment.javamodel.ITestEnvironment.class, cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_environment.Test_environmentPackage.TestEnvironment_testConnection, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8dd0a331-6761-11e9-9ec9-5fbc84faaeb1,WA82uqLP0rcaSQ5Kc2Tv7Y0TlPs=] */
