package cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[ac63ef02-66a8-11e9-9ec9-5fbc84faaeb1,imports]] */
import cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.javamodel.DynamicTest;
import cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.javamodel.IDynamicTest;
import cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.javamodel.ITestStep;

/* End Protected Region   [[ac63ef02-66a8-11e9-9ec9-5fbc84faaeb1,imports]] */

public class FunctionSpace_TestStep {

  /* Begin Protected Region [[ac63ef02-66a8-11e9-9ec9-5fbc84faaeb1]] */
  
  /* End Protected Region   [[ac63ef02-66a8-11e9-9ec9-5fbc84faaeb1]] */


  public static interface ITestStepFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("985c0961-6725-11e9-9ec9-5fbc84faaeb1")
    public java.lang.Integer Position();

  }
  
  public static interface ITestStepFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("985c0961-6725-11e9-9ec9-5fbc84faaeb1")
    public java.lang.Integer Position(final cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.javamodel.ITestStep testStep);

  }
  
  public static class TestStepFunctionsImpl implements ITestStepFunctionsImpl {

    public static final ITestStepFunctionsImpl INSTANCE = new TestStepFunctionsImpl();

    private TestStepFunctionsImpl() {}

    @Override
    public java.lang.Integer Position(final cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.javamodel.ITestStep testStep) {
      /* Begin Protected Region [[985c0961-6725-11e9-9ec9-5fbc84faaeb1]] */
    	Integer position = 1;
    	IDynamicTest dynamicTest = DynamicTest.selectToMeTestSteps(testStep);
    	for( ITestStep iterStep : dynamicTest.selectTestSteps())
    	{
    		if( iterStep.equals(testStep))
    		{
    			return position;
    		}
    		++position;
    	}
    	return -1;
      /* End Protected Region   [[985c0961-6725-11e9-9ec9-5fbc84faaeb1]] */
    }

  }
  
  public static class TestStepFunctions {

    private TestStepFunctions() {}

    public static java.lang.Integer Position(final cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.javamodel.ITestStep testStep) {
      return DynamicResourceUtil.invoke(ITestStepFunctionsImpl.class, TestStepFunctionsImpl.INSTANCE, testStep).Position(testStep);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,ac63ef02-66a8-11e9-9ec9-5fbc84faaeb1,PKQ7ladQxvDYPmrvQho9yt43VHk=] */
