package cleon.implementation.testing.spec.testing._09_test_execution.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITestFailure extends cleon.implementation.testing.spec.testing._09_test_execution.javamodel.ITestResult {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c78ee45d-1cf3-11e6-aaba-9db7fdc64d7e");
  
  // attributes
  
  public java.lang.String selectFailureReason();
  
  public cleon.implementation.testing.spec.testing._05_test_constraints._02_failureclass.javamodel.IFailureClass selectFailureClass();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c78ee45d-1cf3-11e6-aaba-9db7fdc64d7e,up8A1dzYzyhhI3gsoiPznOy+F4Q=] */
