package cleon.testingmethods.hermes.metamodel.spec._03_execution.test_execution.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITestFailure extends cleon.testingmethods.hermes.metamodel.spec._03_execution.test_execution.javamodel.ITestResult {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c78ee45d-1cf3-11e6-aaba-9db7fdc64d7e");
  
  // attributes
  
  public java.lang.String selectFailureReason();
  
  public java.lang.String selectTicketId();
  
  public cleon.testingmethods.hermes.metamodel.spec._01_concept.test_constraints.failureclass.javamodel.IFailureClass selectFailureClass();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c78ee45d-1cf3-11e6-aaba-9db7fdc64d7e,qAUXYDoFKp18r6iH6vLdpGHzOfQ=] */
