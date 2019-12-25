package cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.test_input_connection.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITestInputConnectionEnvironment extends ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("2f47fb47-6d6d-11e9-b84d-d319514e887f");
  
  // relations
  
  public cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_environment.javamodel.ITestEnvironment selectTestEnvironment();
  
  public cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_environment.javamodel.ITestConnection selectUseConnection();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,2f47fb47-6d6d-11e9-b84d-d319514e887f,jYbcaNEf6hjUx+C/DjNOEMx6vps=] */
