package cleon.testingmethods.hermes.metamodel.spec._03_execution.test_execution.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class TestResult extends DynamicResource implements ITestResult {

  // abstract implementation, only used for static method calls
  private TestResult() {
    super(ITestResult.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,62ca893d-1cf3-11e6-aaba-9db7fdc64d7e,MEAGEykoxuNpEoFZjXQ5J2tvxmY=] */
