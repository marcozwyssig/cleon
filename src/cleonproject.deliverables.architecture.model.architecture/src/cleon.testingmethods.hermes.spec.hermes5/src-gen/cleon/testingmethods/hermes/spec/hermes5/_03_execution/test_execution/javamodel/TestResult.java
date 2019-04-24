package cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class TestResult extends DynamicResource implements ITestResult {

  // abstract implementation, only used for static method calls
  private TestResult() {
    super(ITestResult.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution.javamodel.ITestResult> selectToMeTestQualityCriteria(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._static.javamodel.ITestQualityCriteria object) {
    return _getToMeList(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution.javamodel.ITestResult.class, cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution.Test_executionPackage.TestResult_testQualityCriteria, object.getResource());
  }
  
  public static java.util.List<cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution.javamodel.ITestResult> selectToMeTester(cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember object) {
    return _getToMeList(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution.javamodel.ITestResult.class, cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution.Test_executionPackage.TestResult_tester, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,62ca893d-1cf3-11e6-aaba-9db7fdc64d7e,ZUlOtiaqrQwjmxRMVT13uE4RLmg=] */
