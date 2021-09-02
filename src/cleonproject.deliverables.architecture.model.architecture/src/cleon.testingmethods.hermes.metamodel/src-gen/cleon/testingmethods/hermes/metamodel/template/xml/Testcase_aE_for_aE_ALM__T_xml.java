package cleon.testingmethods.hermes.metamodel.template.xml;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[63a490f7-9db6-11eb-ac11-8525f5400242,imports]] */

/* End Protected Region   [[63a490f7-9db6-11eb-ac11-8525f5400242,imports]] */

public class Testcase_aE_for_aE_ALM__T_xml {

  /* Begin Protected Region [[63a490f7-9db6-11eb-ac11-8525f5400242]] */
  
  /* End Protected Region   [[63a490f7-9db6-11eb-ac11-8525f5400242]] */


  public static interface ITestStepFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e4512c7e-9dd2-11eb-ac11-8525f5400242")
    public java.lang.String Description();

    @IDynamicResourceExtension.MethodId("f9659892-9dd2-11eb-ac11-8525f5400242")
    public java.lang.String Result();

  }
  
  public static interface ITestStepFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TestStepFunctionsImpl implements ITestStepFunctionsImpl {

    public static final ITestStepFunctionsImpl INSTANCE = new TestStepFunctionsImpl();

    private TestStepFunctionsImpl() {}

  }
  
  public static class TestStepFunctions {

    private TestStepFunctions() {}

  }

  public static interface ITestInputFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b6efcbe6-9dd7-11eb-ac11-8525f5400242")
    public java.lang.String Description();

    @IDynamicResourceExtension.MethodId("b6efcbe9-9dd7-11eb-ac11-8525f5400242")
    public java.lang.String Result();

  }
  
  public static interface ITestInputFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("b6efcbe6-9dd7-11eb-ac11-8525f5400242")
    public java.lang.String Description(final cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.javamodel.ITestInput testInput);

  }
  
  public static class TestInputFunctionsImpl implements ITestInputFunctionsImpl {

    public static final ITestInputFunctionsImpl INSTANCE = new TestInputFunctionsImpl();

    private TestInputFunctionsImpl() {}

    @Override
    public java.lang.String Description(final cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.javamodel.ITestInput testInput) {
      return null;
    }

  }
  
  public static class TestInputFunctions {

    private TestInputFunctions() {}

    public static java.lang.String Description(final cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.javamodel.ITestInput testInput) {
      return DynamicResourceUtil.invoke(ITestInputFunctionsImpl.class, TestInputFunctionsImpl.INSTANCE, testInput).Description(testInput);
    }

  }

  public static interface ITestInputStringFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b6efcbf6-9dd7-11eb-ac11-8525f5400242")
    public java.lang.String Description();

    @IDynamicResourceExtension.MethodId("b6efcc00-9dd7-11eb-ac11-8525f5400242")
    public java.lang.String RenderResult();

  }
  
  public static interface ITestInputStringFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TestInputStringFunctionsImpl implements ITestInputStringFunctionsImpl {

    public static final ITestInputStringFunctionsImpl INSTANCE = new TestInputStringFunctionsImpl();

    private TestInputStringFunctionsImpl() {}

  }
  
  public static class TestInputStringFunctions {

    private TestInputStringFunctions() {}

  }

  public static interface ITestResultFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b6efcc03-9dd7-11eb-ac11-8525f5400242")
    public java.lang.String Description();

    @IDynamicResourceExtension.MethodId("b6efcc19-9dd7-11eb-ac11-8525f5400242")
    public java.lang.String Result();

  }
  
  public static interface ITestResultFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("b6efcc03-9dd7-11eb-ac11-8525f5400242")
    public java.lang.String Description(final cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.javamodel.ITestResult testResult);

  }
  
  public static class TestResultFunctionsImpl implements ITestResultFunctionsImpl {

    public static final ITestResultFunctionsImpl INSTANCE = new TestResultFunctionsImpl();

    private TestResultFunctionsImpl() {}

    @Override
    public java.lang.String Description(final cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.javamodel.ITestResult testResult) {
      return null;
    }

  }
  
  public static class TestResultFunctions {

    private TestResultFunctions() {}

    public static java.lang.String Description(final cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.javamodel.ITestResult testResult) {
      return DynamicResourceUtil.invoke(ITestResultFunctionsImpl.class, TestResultFunctionsImpl.INSTANCE, testResult).Description(testResult);
    }

  }

  public static interface ITestResultEnvironmentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b6efcc1c-9dd7-11eb-ac11-8525f5400242")
    public java.lang.String Description();

    @IDynamicResourceExtension.MethodId("b6efcc45-9dd7-11eb-ac11-8525f5400242")
    public java.lang.String Result();

  }
  
  public static interface ITestResultEnvironmentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("b6efcc1c-9dd7-11eb-ac11-8525f5400242")
    public java.lang.String Description(final cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.javamodel.ITestResultEnvironment testResultEnvironment);

  }
  
  public static class TestResultEnvironmentFunctionsImpl implements ITestResultEnvironmentFunctionsImpl {

    public static final ITestResultEnvironmentFunctionsImpl INSTANCE = new TestResultEnvironmentFunctionsImpl();

    private TestResultEnvironmentFunctionsImpl() {}

    @Override
    public java.lang.String Description(final cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.javamodel.ITestResultEnvironment testResultEnvironment) {
      return null;
    }

  }
  
  public static class TestResultEnvironmentFunctions {

    private TestResultEnvironmentFunctions() {}

    public static java.lang.String Description(final cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.javamodel.ITestResultEnvironment testResultEnvironment) {
      return DynamicResourceUtil.invoke(ITestResultEnvironmentFunctionsImpl.class, TestResultEnvironmentFunctionsImpl.INSTANCE, testResultEnvironment).Description(testResultEnvironment);
    }

  }

  public static interface ITestInputDataFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b6efcc53-9dd7-11eb-ac11-8525f5400242")
    public java.lang.String Description();

    @IDynamicResourceExtension.MethodId("b6efcc56-9dd7-11eb-ac11-8525f5400242")
    public java.lang.String Result();

  }
  
  public static interface ITestInputDataFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TestInputDataFunctionsImpl implements ITestInputDataFunctionsImpl {

    public static final ITestInputDataFunctionsImpl INSTANCE = new TestInputDataFunctionsImpl();

    private TestInputDataFunctionsImpl() {}

  }
  
  public static class TestInputDataFunctions {

    private TestInputDataFunctions() {}

  }

  public static interface ITestInputToolFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b6efcc6c-9dd7-11eb-ac11-8525f5400242")
    public java.lang.String Description();

    @IDynamicResourceExtension.MethodId("b6efcc6f-9dd7-11eb-ac11-8525f5400242")
    public java.lang.String Result();

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

  public static interface ITestInputUserFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b6efcc7d-9dd7-11eb-ac11-8525f5400242")
    public java.lang.String Description();

    @IDynamicResourceExtension.MethodId("b6efcc80-9dd7-11eb-ac11-8525f5400242")
    public java.lang.String Result();

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

    @IDynamicResourceExtension.MethodId("e6b17133-9dd7-11eb-ac11-8525f5400242")
    public java.lang.String Description();

    @IDynamicResourceExtension.MethodId("e6b17136-9dd7-11eb-ac11-8525f5400242")
    public java.lang.String Result();

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

  public static interface ITestAbstractInputConnectionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c67c305d-0c05-11ec-958d-1bedd06d8336")
    public java.lang.String Description();

  }
  
  public static interface ITestAbstractInputConnectionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TestAbstractInputConnectionFunctionsImpl implements ITestAbstractInputConnectionFunctionsImpl {

    public static final ITestAbstractInputConnectionFunctionsImpl INSTANCE = new TestAbstractInputConnectionFunctionsImpl();

    private TestAbstractInputConnectionFunctionsImpl() {}

  }
  
  public static class TestAbstractInputConnectionFunctions {

    private TestAbstractInputConnectionFunctions() {}

  }

  public static interface ITestInputConnectionEnvironmentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("13592904-0c06-11ec-958d-1bedd06d8336")
    public java.lang.String Description();

  }
  
  public static interface ITestInputConnectionEnvironmentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TestInputConnectionEnvironmentFunctionsImpl implements ITestInputConnectionEnvironmentFunctionsImpl {

    public static final ITestInputConnectionEnvironmentFunctionsImpl INSTANCE = new TestInputConnectionEnvironmentFunctionsImpl();

    private TestInputConnectionEnvironmentFunctionsImpl() {}

  }
  
  public static class TestInputConnectionEnvironmentFunctions {

    private TestInputConnectionEnvironmentFunctions() {}

  }

  public static interface ITestInputConnectionEnvironmentNotPossibleFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("1f66f225-0c06-11ec-958d-1bedd06d8336")
    public java.lang.String Description();

  }
  
  public static interface ITestInputConnectionEnvironmentNotPossibleFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TestInputConnectionEnvironmentNotPossibleFunctionsImpl implements ITestInputConnectionEnvironmentNotPossibleFunctionsImpl {

    public static final ITestInputConnectionEnvironmentNotPossibleFunctionsImpl INSTANCE = new TestInputConnectionEnvironmentNotPossibleFunctionsImpl();

    private TestInputConnectionEnvironmentNotPossibleFunctionsImpl() {}

  }
  
  public static class TestInputConnectionEnvironmentNotPossibleFunctions {

    private TestInputConnectionEnvironmentNotPossibleFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,63a490f7-9db6-11eb-ac11-8525f5400242,IVk0vmovp5LfcDPWluwfp9TC0+s=] */
