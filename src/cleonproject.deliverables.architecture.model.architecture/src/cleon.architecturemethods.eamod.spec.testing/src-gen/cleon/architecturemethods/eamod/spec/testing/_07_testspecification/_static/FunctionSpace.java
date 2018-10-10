package cleon.architecturemethods.eamod.spec.testing._07_testspecification._static;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[61add92d-1cf4-11e6-aaba-9db7fdc64d7e,imports]] */
import cleon.architecturemethods.eamod.spec.testing._09_test_execution.FunctionSpace.ITestResultFunctions;
import cleon.architecturemethods.eamod.spec.testing._09_test_execution.FunctionSpace.ITestResultFunctionsImpl;
import cleon.architecturemethods.eamod.spec.testing._09_test_execution.FunctionSpace.TestResultFunctions;
import cleon.architecturemethods.eamod.spec.testing._09_test_execution.FunctionSpace.TestResultFunctionsImpl;
import cleon.architecturemethods.eamod.spec.testing._09_test_execution.javamodel.ITestResult;
/* End Protected Region   [[61add92d-1cf4-11e6-aaba-9db7fdc64d7e,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[61add92d-1cf4-11e6-aaba-9db7fdc64d7e]] */
  
  /* End Protected Region   [[61add92d-1cf4-11e6-aaba-9db7fdc64d7e]] */


  public static interface IStaticTestFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("69569aa2-1cf4-11e6-aaba-9db7fdc64d7e")
    public cleon.architecturemethods.eamod.spec.testing._07_testspecification._static.javamodel.ITestSubjectArea GetTestSubjectArea();

    @IDynamicResourceExtension.MethodId("5d21ba45-1dbb-11e6-974b-630b7f5d3b95")
    public java.lang.String GetName();

    @IDynamicResourceExtension.MethodId("5dbb0bce-20d9-11e6-9368-9172b77c2cff")
    public java.lang.Boolean AllTestArePassed();

    @IDynamicResourceExtension.MethodId("6e176fb8-2270-11e6-bcc1-f96f0d74dcad")
    public List<cleon.architecturemethods.eamod.spec.testing._07_testspecification._static.javamodel.IStaticTest> AllRequirements();

    @IDynamicResourceExtension.MethodId("4b74c368-2275-11e6-bcc1-f96f0d74dcad")
    public List<cleon.architecturemethods.eamod.spec.testing._09_test_execution.javamodel.ITestFailure> AllFailedRequirements();

    @IDynamicResourceExtension.MethodId("9780138a-2275-11e6-bcc1-f96f0d74dcad")
    public List<cleon.architecturemethods.eamod.spec.testing._09_test_execution.javamodel.ITestSuccess> AllSucessfulRequirements();

    @IDynamicResourceExtension.MethodId("5a192049-2276-11e6-bcc1-f96f0d74dcad")
    public List<cleon.architecturemethods.eamod.spec.testing._09_test_execution.javamodel.ITestResult> AllTestResults();

  }
  
  public static interface IStaticTestFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("5dbb0bce-20d9-11e6-9368-9172b77c2cff")
    public java.lang.Boolean AllTestArePassed(final cleon.architecturemethods.eamod.spec.testing._07_testspecification._static.javamodel.IStaticTest staticTest);

  }
  
  public static class StaticTestFunctionsImpl implements IStaticTestFunctionsImpl {

    public static final IStaticTestFunctionsImpl INSTANCE = new StaticTestFunctionsImpl();

    private StaticTestFunctionsImpl() {}

    @Override
    public java.lang.Boolean AllTestArePassed(final cleon.architecturemethods.eamod.spec.testing._07_testspecification._static.javamodel.IStaticTest staticTest) {
      /* Begin Protected Region [[5dbb0bce-20d9-11e6-9368-9172b77c2cff]] */
    	return staticTest.selectTestResult().values().stream().allMatch(y -> TestResultFunctions.IsPassed(y));
      /* End Protected Region   [[5dbb0bce-20d9-11e6-9368-9172b77c2cff]] */
    }

  }
  
  public static class StaticTestFunctions {

    private StaticTestFunctions() {}

    public static java.lang.Boolean AllTestArePassed(final cleon.architecturemethods.eamod.spec.testing._07_testspecification._static.javamodel.IStaticTest staticTest) {
      return DynamicResourceUtil.invoke(IStaticTestFunctionsImpl.class, StaticTestFunctionsImpl.INSTANCE, staticTest).AllTestArePassed(staticTest);
    }

  }

  public static interface ITestFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("dbf30cb6-1dba-11e6-974b-630b7f5d3b95")
    public java.lang.String GetId();

    @IDynamicResourceExtension.MethodId("54c47614-1dbb-11e6-974b-630b7f5d3b95")
    public java.lang.String GetName();

  }
  
  public static interface ITestFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("dbf30cb6-1dba-11e6-974b-630b7f5d3b95")
    public java.lang.String GetId(final cleon.architecturemethods.eamod.spec.testing._07_testspecification.javamodel.ITest test);

  }
  
  public static class TestFunctionsImpl implements ITestFunctionsImpl {

    public static final ITestFunctionsImpl INSTANCE = new TestFunctionsImpl();

    private TestFunctionsImpl() {}

    @Override
    public java.lang.String GetId(final cleon.architecturemethods.eamod.spec.testing._07_testspecification.javamodel.ITest test) {
      return java.lang.String.format("TS-%03d", test.selectIdentifier());
    }

  }
  
  public static class TestFunctions {

    private TestFunctions() {}

    public static java.lang.String GetId(final cleon.architecturemethods.eamod.spec.testing._07_testspecification.javamodel.ITest test) {
      return DynamicResourceUtil.invoke(ITestFunctionsImpl.class, TestFunctionsImpl.INSTANCE, test).GetId(test);
    }

  }

  public static interface ITestSubjectAreaFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("596743ff-2270-11e6-bcc1-f96f0d74dcad")
    public List<cleon.architecturemethods.eamod.spec.testing._07_testspecification._static.javamodel.IStaticTest> AllRequirements();

    @IDynamicResourceExtension.MethodId("43e52f76-2275-11e6-bcc1-f96f0d74dcad")
    public List<cleon.architecturemethods.eamod.spec.testing._09_test_execution.javamodel.ITestSuccess> AllSuccessfulRequirements();

    @IDynamicResourceExtension.MethodId("b440c416-2275-11e6-bcc1-f96f0d74dcad")
    public List<cleon.architecturemethods.eamod.spec.testing._09_test_execution.javamodel.ITestFailure> AllFailedRequirements();

    @IDynamicResourceExtension.MethodId("439dd0c6-2276-11e6-bcc1-f96f0d74dcad")
    public List<cleon.architecturemethods.eamod.spec.testing._09_test_execution.javamodel.ITestResult> AllTestResults();

  }
  
  public static interface ITestSubjectAreaFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TestSubjectAreaFunctionsImpl implements ITestSubjectAreaFunctionsImpl {

    public static final ITestSubjectAreaFunctionsImpl INSTANCE = new TestSubjectAreaFunctionsImpl();

    private TestSubjectAreaFunctionsImpl() {}

  }
  
  public static class TestSubjectAreaFunctions {

    private TestSubjectAreaFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,61add92d-1cf4-11e6-aaba-9db7fdc64d7e,pVzs7X0O8itEm3BFPDp7jGRrquI=] */
