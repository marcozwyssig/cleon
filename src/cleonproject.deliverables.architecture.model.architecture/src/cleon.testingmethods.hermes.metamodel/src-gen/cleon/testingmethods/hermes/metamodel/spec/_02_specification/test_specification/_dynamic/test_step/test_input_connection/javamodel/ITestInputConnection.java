package cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.test_input_connection.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITestInputConnection extends cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.javamodel.IAbstractTestInput, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.javamodel.ITestUserAware, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.javamodel.ITestToolAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("386c957f-6b1b-11e9-bd30-87fcf852dea7");
  
  // relations
  
  public cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.test_input_connection.javamodel.IConnectionType selectConnectionType();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.test_input_connection.javamodel.ITestAbstractInputConnection> selectTestInputConnectionEnvironment();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,386c957f-6b1b-11e9-bd30-87fcf852dea7,pMihYIKAx7Rtn1GQPXAF47XcQgQ=] */
