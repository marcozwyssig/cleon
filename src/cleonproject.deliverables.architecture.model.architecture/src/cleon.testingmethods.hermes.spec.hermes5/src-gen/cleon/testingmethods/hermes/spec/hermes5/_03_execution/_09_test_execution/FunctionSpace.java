package cleon.testingmethods.hermes.spec.hermes5._03_execution._09_test_execution;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[103de61d-20da-11e6-9368-9172b77c2cff,imports]] */
import cleon.testingmethods.hermes.spec.hermes5._03_execution._09_test_execution.javamodel.ITestSuccess;
/* End Protected Region   [[103de61d-20da-11e6-9368-9172b77c2cff,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[103de61d-20da-11e6-9368-9172b77c2cff]] */
  
  /* End Protected Region   [[103de61d-20da-11e6-9368-9172b77c2cff]] */


  public static interface ITestResultFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0057e3c8-20dd-11e6-9368-9172b77c2cff")
    public java.lang.Boolean IsPassed();

  }
  
  public static interface ITestResultFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("0057e3c8-20dd-11e6-9368-9172b77c2cff")
    public java.lang.Boolean IsPassed(final cleon.testingmethods.hermes.spec.hermes5._03_execution._09_test_execution.javamodel.ITestResult testResult);

  }
  
  public static class TestResultFunctionsImpl implements ITestResultFunctionsImpl {

    public static final ITestResultFunctionsImpl INSTANCE = new TestResultFunctionsImpl();

    private TestResultFunctionsImpl() {}

    @Override
    public java.lang.Boolean IsPassed(final cleon.testingmethods.hermes.spec.hermes5._03_execution._09_test_execution.javamodel.ITestResult testResult) {
      /* Begin Protected Region [[0057e3c8-20dd-11e6-9368-9172b77c2cff]] */
        if( testResult instanceof ITestSuccess)
        {
      	return true;  
        }
        return false;   
      /* End Protected Region   [[0057e3c8-20dd-11e6-9368-9172b77c2cff]] */
    }

  }
  
  public static class TestResultFunctions {

    private TestResultFunctions() {}

    public static java.lang.Boolean IsPassed(final cleon.testingmethods.hermes.spec.hermes5._03_execution._09_test_execution.javamodel.ITestResult testResult) {
      return DynamicResourceUtil.invoke(ITestResultFunctionsImpl.class, TestResultFunctionsImpl.INSTANCE, testResult).IsPassed(testResult);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,103de61d-20da-11e6-9368-9172b77c2cff,4RJNEsE/s2LxnHlRz2S/eHNM+WU=] */
