package cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.test_input_connection.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestInputConnection extends DynamicResource implements ITestInputConnection {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestInputConnection> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestInputConnection>() {
    
    @Override
    public ITestInputConnection create() {
      return new TestInputConnection();
    }
    
    @Override
    public ITestInputConnection create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestInputConnection(resourceRepository, resource);
    }
  
  };

  public TestInputConnection() {
    super(ITestInputConnection.TYPE_ID);
  }
  
  public TestInputConnection(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestInputConnection.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.test_input_connection.javamodel.IConnectionType selectConnectionType() {
    return _getSingle(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.test_input_connection.javamodel.IConnectionType.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.test_input_connection.Test_input_connectionPackage.TestInputConnection_connectionType);
  }

  public TestInputConnection setConnectionType(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.test_input_connection.javamodel.IConnectionType connectionType) {
    _setSingle(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.test_input_connection.Test_input_connectionPackage.TestInputConnection_connectionType, connectionType);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.test_input_connection.javamodel.ITestInputConnectionEnvironment> selectTestInputConnectionEnvironment() {
    return _getMap(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.test_input_connection.javamodel.ITestInputConnectionEnvironment.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.test_input_connection.Test_input_connectionPackage.TestInputConnection_testInputConnectionEnvironment);
  }

  public TestInputConnection setTestInputConnectionEnvironment(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.test_input_connection.javamodel.ITestInputConnectionEnvironment> testInputConnectionEnvironment) {
    _setMap(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.test_input_connection.Test_input_connectionPackage.TestInputConnection_testInputConnectionEnvironment, testInputConnectionEnvironment);
    return this;
  }
    
  @Override
  public cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_users.javamodel.ITestUser selectTestUser() {
    return _getSingle(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_users.javamodel.ITestUser.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.Test_stepPackage.TestUserAware_testUser);
  }

  public TestInputConnection setTestUser(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_users.javamodel.ITestUser testUser) {
    _setSingle(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.Test_stepPackage.TestUserAware_testUser, testUser);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestInputConnection setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.test_input_connection.javamodel.IConnectionType.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.test_input_connection.Test_input_connectionPackage.TestInputConnection_connectionType, visitor);
    _acceptMap(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.test_input_connection.javamodel.ITestInputConnectionEnvironment.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.test_input_connection.Test_input_connectionPackage.TestInputConnection_testInputConnectionEnvironment, visitor);
    _acceptSingle(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_users.javamodel.ITestUser.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.Test_stepPackage.TestUserAware_testUser, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.test_input_connection.javamodel.ITestInputConnection> selectToMeConnectionType(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.test_input_connection.javamodel.IConnectionType object) {
    return _getToMeList(object.getRepository(), cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.test_input_connection.javamodel.ITestInputConnection.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.test_input_connection.Test_input_connectionPackage.TestInputConnection_connectionType, object.getResource());
  }
  
  public static cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.test_input_connection.javamodel.ITestInputConnection selectToMeTestInputConnectionEnvironment(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.test_input_connection.javamodel.ITestInputConnectionEnvironment object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.test_input_connection.javamodel.ITestInputConnection.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.test_input_connection.Test_input_connectionPackage.TestInputConnection_testInputConnectionEnvironment, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,386c957f-6b1b-11e9-bd30-87fcf852dea7,Z6pKmT7QTTTuOOyLJ9L4dlqzbaw=] */
