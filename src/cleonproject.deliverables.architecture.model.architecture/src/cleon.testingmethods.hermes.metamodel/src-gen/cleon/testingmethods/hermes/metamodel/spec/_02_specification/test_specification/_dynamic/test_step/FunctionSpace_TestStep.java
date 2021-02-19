package cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[ac63ef02-66a8-11e9-9ec9-5fbc84faaeb1,imports]] */
import cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.DynamicTest;
import cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IDynamicTest;
import cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.javamodel.ITestStep;

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
    public java.lang.Integer Position(final cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.javamodel.ITestStep testStep);

  }
  
  public static class TestStepFunctionsImpl implements ITestStepFunctionsImpl {

    public static final ITestStepFunctionsImpl INSTANCE = new TestStepFunctionsImpl();

    private TestStepFunctionsImpl() {}

    @Override
    public java.lang.Integer Position(final cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.javamodel.ITestStep testStep) {
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

    public static java.lang.Integer Position(final cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.javamodel.ITestStep testStep) {
      return DynamicResourceUtil.invoke(ITestStepFunctionsImpl.class, TestStepFunctionsImpl.INSTANCE, testStep).Position(testStep);
    }

  }

  public static interface ITestUserAwareFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9dfe0c68-7182-11e9-98e0-2719d32d2629")
    public cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IDynamicTest SelectTestSteps();

  }
  
  public static interface ITestUserAwareFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TestUserAwareFunctionsImpl implements ITestUserAwareFunctionsImpl {

    public static final ITestUserAwareFunctionsImpl INSTANCE = new TestUserAwareFunctionsImpl();

    private TestUserAwareFunctionsImpl() {}

  }
  
  public static class TestUserAwareFunctions {

    private TestUserAwareFunctions() {}

  }

  public static interface ITestInputUserFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("bdcc234f-7182-11e9-98e0-2719d32d2629")
    public cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IDynamicTest SelectTestSteps();

    @IDynamicResourceExtension.MethodId("936782dd-7199-11e9-98e0-2719d32d2629")
    public java.lang.String SimpleName();

  }
  
  public static interface ITestInputUserFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TestInputUserFunctionsImpl implements ITestInputUserFunctionsImpl {

    public static final ITestInputUserFunctionsImpl INSTANCE = new TestInputUserFunctionsImpl();

    private TestInputUserFunctionsImpl() {}

  }
  
  public static class TestInputUserFunctions {

    private TestInputUserFunctions() {}

  }

  public static interface ITestInputConnectionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c4c3e442-7182-11e9-98e0-2719d32d2629")
    public cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IDynamicTest SelectTestSteps();

  }
  
  public static interface ITestInputConnectionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TestInputConnectionFunctionsImpl implements ITestInputConnectionFunctionsImpl {

    public static final ITestInputConnectionFunctionsImpl INSTANCE = new TestInputConnectionFunctionsImpl();

    private TestInputConnectionFunctionsImpl() {}

  }
  
  public static class TestInputConnectionFunctions {

    private TestInputConnectionFunctions() {}

  }

  public static interface ITestInputToolFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("55cc2dc0-7199-11e9-98e0-2719d32d2629")
    public cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IDynamicTest SelectTestSteps();

    @IDynamicResourceExtension.MethodId("f10a9c7d-7199-11e9-98e0-2719d32d2629")
    public java.lang.String SimpleName();

  }
  
  public static interface ITestInputToolFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TestInputToolFunctionsImpl implements ITestInputToolFunctionsImpl {

    public static final ITestInputToolFunctionsImpl INSTANCE = new TestInputToolFunctionsImpl();

    private TestInputToolFunctionsImpl() {}

  }
  
  public static class TestInputToolFunctions {

    private TestInputToolFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,ac63ef02-66a8-11e9-9ec9-5fbc84faaeb1,+r+NMlZ88HRUDQwI0Qp/H2nT2yU=] */
