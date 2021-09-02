package cleon.testingmethods.hermes.metamodel.template.docbook;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[983d95c3-4f88-11e9-ad5d-977b17aab907,imports]] */
import cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.javamodel.TestPreconditionAwareList;
import java.time.Duration;
import java.time.LocalTime;

/* End Protected Region   [[983d95c3-4f88-11e9-ad5d-977b17aab907,imports]] */

public class FunctionSpace_Docbook_Testing_Hermes5 {

  /* Begin Protected Region [[983d95c3-4f88-11e9-ad5d-977b17aab907]] */

  /* End Protected Region   [[983d95c3-4f88-11e9-ad5d-977b17aab907]] */


  public static interface IAbstractDynamicTestFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b844b9d6-51ab-11e9-9c3b-b122f30ac9b9")
    public java.lang.String RenderContentElement();

    @IDynamicResourceExtension.MethodId("3987412a-51b0-11e9-9c3b-b122f30ac9b9")
    public java.lang.String RenderDescriptions();

    @IDynamicResourceExtension.MethodId("29f96ed5-758a-11e9-83b7-6bd7eee0c537")
    public java.lang.String RenderTestDescription();

    @IDynamicResourceExtension.MethodId("36afaccc-758a-11e9-83b7-6bd7eee0c537")
    public java.lang.String RenderTestSteps();

  }
  
  public static interface IAbstractDynamicTestFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractDynamicTestFunctionsImpl implements IAbstractDynamicTestFunctionsImpl {

    public static final IAbstractDynamicTestFunctionsImpl INSTANCE = new AbstractDynamicTestFunctionsImpl();

    private AbstractDynamicTestFunctionsImpl() {}

  }
  
  public static class AbstractDynamicTestFunctions {

    private AbstractDynamicTestFunctions() {}

  }

  public static interface IDynamicTestFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("52bdfcfb-758a-11e9-83b7-6bd7eee0c537")
    public java.lang.String RenderTestDescription();

    @IDynamicResourceExtension.MethodId("5e0b82c6-758a-11e9-83b7-6bd7eee0c537")
    public java.lang.String RenderTestSteps();

  }
  
  public static interface IDynamicTestFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DynamicTestFunctionsImpl implements IDynamicTestFunctionsImpl {

    public static final IDynamicTestFunctionsImpl INSTANCE = new DynamicTestFunctionsImpl();

    private DynamicTestFunctionsImpl() {}

  }
  
  public static class DynamicTestFunctions {

    private DynamicTestFunctions() {}

  }

  public static interface IDynamicTestReferenceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c77e5542-758b-11e9-83b7-6bd7eee0c537")
    public java.lang.String RenderTestDescription();

    @IDynamicResourceExtension.MethodId("c77e5547-758b-11e9-83b7-6bd7eee0c537")
    public java.lang.String RenderTestSteps();

  }
  
  public static interface IDynamicTestReferenceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DynamicTestReferenceFunctionsImpl implements IDynamicTestReferenceFunctionsImpl {

    public static final IDynamicTestReferenceFunctionsImpl INSTANCE = new DynamicTestReferenceFunctionsImpl();

    private DynamicTestReferenceFunctionsImpl() {}

  }
  
  public static class DynamicTestReferenceFunctions {

    private DynamicTestReferenceFunctions() {}

  }

  public static interface ITestStepFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("39717caf-8e99-11e9-83a2-35c1705de7ac")
    public java.lang.String Render();

    @IDynamicResourceExtension.MethodId("30515472-7b6d-11eb-b8e5-2d821e359a02")
    public java.lang.String RenderResult();

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

    @IDynamicResourceExtension.MethodId("1e4de3d1-7a9c-11eb-87e9-09aeef13879c")
    public java.lang.String Render();

    @IDynamicResourceExtension.MethodId("6e98bd39-9165-11eb-bd45-ed9cc25142e8")
    public java.lang.String RenderResult();

  }
  
  public static interface ITestInputFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("1e4de3d1-7a9c-11eb-87e9-09aeef13879c")
    public java.lang.String Render(final cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.javamodel.ITestInput testInput);

  }
  
  public static class TestInputFunctionsImpl implements ITestInputFunctionsImpl {

    public static final ITestInputFunctionsImpl INSTANCE = new TestInputFunctionsImpl();

    private TestInputFunctionsImpl() {}

    @Override
    public java.lang.String Render(final cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.javamodel.ITestInput testInput) {
      return null;
    }

  }
  
  public static class TestInputFunctions {

    private TestInputFunctions() {}

    public static java.lang.String Render(final cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.javamodel.ITestInput testInput) {
      return DynamicResourceUtil.invoke(ITestInputFunctionsImpl.class, TestInputFunctionsImpl.INSTANCE, testInput).Render(testInput);
    }

  }

  public static interface ITestInputStringFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c6ef09a3-8e9b-11e9-83a2-35c1705de7ac")
    public java.lang.String Render();

    @IDynamicResourceExtension.MethodId("a95a167c-9165-11eb-bd45-ed9cc25142e8")
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

    @IDynamicResourceExtension.MethodId("f6b55503-8e99-11e9-83a2-35c1705de7ac")
    public java.lang.String Render();

    @IDynamicResourceExtension.MethodId("4136bc86-7b6d-11eb-b8e5-2d821e359a02")
    public java.lang.String RenderResult();

  }
  
  public static interface ITestResultFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("f6b55503-8e99-11e9-83a2-35c1705de7ac")
    public java.lang.String Render(final cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.javamodel.ITestResult testResult);

  }
  
  public static class TestResultFunctionsImpl implements ITestResultFunctionsImpl {

    public static final ITestResultFunctionsImpl INSTANCE = new TestResultFunctionsImpl();

    private TestResultFunctionsImpl() {}

    @Override
    public java.lang.String Render(final cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.javamodel.ITestResult testResult) {
      return null;
    }

  }
  
  public static class TestResultFunctions {

    private TestResultFunctions() {}

    public static java.lang.String Render(final cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.javamodel.ITestResult testResult) {
      return DynamicResourceUtil.invoke(ITestResultFunctionsImpl.class, TestResultFunctionsImpl.INSTANCE, testResult).Render(testResult);
    }

  }

  public static interface ITestResultEnvironmentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("154f4420-7b6d-11eb-b8e5-2d821e359a02")
    public java.lang.String Render();

    @IDynamicResourceExtension.MethodId("5c618a86-7b6d-11eb-b8e5-2d821e359a02")
    public java.lang.String RenderResult();

  }
  
  public static interface ITestResultEnvironmentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("154f4420-7b6d-11eb-b8e5-2d821e359a02")
    public java.lang.String Render(final cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.javamodel.ITestResultEnvironment testResultEnvironment);

  }
  
  public static class TestResultEnvironmentFunctionsImpl implements ITestResultEnvironmentFunctionsImpl {

    public static final ITestResultEnvironmentFunctionsImpl INSTANCE = new TestResultEnvironmentFunctionsImpl();

    private TestResultEnvironmentFunctionsImpl() {}

    @Override
    public java.lang.String Render(final cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.javamodel.ITestResultEnvironment testResultEnvironment) {
      return null;
    }

  }
  
  public static class TestResultEnvironmentFunctions {

    private TestResultEnvironmentFunctions() {}

    public static java.lang.String Render(final cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.javamodel.ITestResultEnvironment testResultEnvironment) {
      return DynamicResourceUtil.invoke(ITestResultEnvironmentFunctionsImpl.class, TestResultEnvironmentFunctionsImpl.INSTANCE, testResultEnvironment).Render(testResultEnvironment);
    }

  }

  public static interface ITestInputDataFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("3b8413f9-8e9a-11e9-83a2-35c1705de7ac")
    public java.lang.String Render();

    @IDynamicResourceExtension.MethodId("c8f6bd58-9165-11eb-bd45-ed9cc25142e8")
    public java.lang.String RenderResult();

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

    @IDynamicResourceExtension.MethodId("5ff9925c-8e9a-11e9-83a2-35c1705de7ac")
    public java.lang.String Render();

    @IDynamicResourceExtension.MethodId("d614494f-9165-11eb-bd45-ed9cc25142e8")
    public java.lang.String RenderResult();

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

    @IDynamicResourceExtension.MethodId("a0b6e835-8e9a-11e9-83a2-35c1705de7ac")
    public java.lang.String Render();

    @IDynamicResourceExtension.MethodId("e4e4daf8-9165-11eb-bd45-ed9cc25142e8")
    public java.lang.String RenderResult();

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

    @IDynamicResourceExtension.MethodId("b707a64a-8eb4-11e9-9c53-5f1b39fe78bd")
    public java.lang.String Render();

    @IDynamicResourceExtension.MethodId("f52f6362-9165-11eb-bd45-ed9cc25142e8")
    public java.lang.String RenderResult();

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

  public static interface ITestGlobalPreconditionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4792698d-7a97-11eb-87e9-09aeef13879c")
    public java.lang.String RenderContentElement();

    @IDynamicResourceExtension.MethodId("6a0026df-7b35-11eb-ae9b-d7162fb23e98")
    public java.lang.String RenderDescriptions();

  }
  
  public static interface ITestGlobalPreconditionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TestGlobalPreconditionFunctionsImpl implements ITestGlobalPreconditionFunctionsImpl {

    public static final ITestGlobalPreconditionFunctionsImpl INSTANCE = new TestGlobalPreconditionFunctionsImpl();

    private TestGlobalPreconditionFunctionsImpl() {}

  }
  
  public static class TestGlobalPreconditionFunctions {

    private TestGlobalPreconditionFunctions() {}

  }

  public static interface ITestFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("04b36f0d-7aa6-11eb-87e9-09aeef13879c")
    public java.lang.String RenderCoverageName();

  }
  
  public static interface ITestFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TestFunctionsImpl implements ITestFunctionsImpl {

    public static final ITestFunctionsImpl INSTANCE = new TestFunctionsImpl();

    private TestFunctionsImpl() {}

  }
  
  public static class TestFunctions {

    private TestFunctions() {}

  }

  public static interface ITestPreconditionStepFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("1559bb44-7b34-11eb-ae9b-d7162fb23e98")
    public java.lang.Integer Position();

  }
  
  public static interface ITestPreconditionStepFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("1559bb44-7b34-11eb-ae9b-d7162fb23e98")
    public java.lang.Integer Position(final cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.javamodel.ITestPreconditionStep testPreconditionStep);

  }
  
  public static class TestPreconditionStepFunctionsImpl implements ITestPreconditionStepFunctionsImpl {

    public static final ITestPreconditionStepFunctionsImpl INSTANCE = new TestPreconditionStepFunctionsImpl();

    private TestPreconditionStepFunctionsImpl() {}

    @Override
    public java.lang.Integer Position(final cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.javamodel.ITestPreconditionStep testPreconditionStep) {
      /* Begin Protected Region [[1559bb44-7b34-11eb-ae9b-d7162fb23e98]] */
      Integer position = 1;
      final var testGlobalPreconditions = TestPreconditionAwareList.selectToMeTestLocalPreconditions(testPreconditionStep);
      for( final var iterStep : testGlobalPreconditions.selectTestLocalPreconditions())
      {
      	if( iterStep.equals(testPreconditionStep))
      	{
      		return position;
      	}
      	++position;
      }
      return -1;
      /* End Protected Region   [[1559bb44-7b34-11eb-ae9b-d7162fb23e98]] */
    }

  }
  
  public static class TestPreconditionStepFunctions {

    private TestPreconditionStepFunctions() {}

    public static java.lang.Integer Position(final cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.javamodel.ITestPreconditionStep testPreconditionStep) {
      return DynamicResourceUtil.invoke(ITestPreconditionStepFunctionsImpl.class, TestPreconditionStepFunctionsImpl.INSTANCE, testPreconditionStep).Position(testPreconditionStep);
    }

  }

  public static interface ITestCaseSpecificationsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4ac3305c-7614-11e9-bd83-bda31a2da4a6")
    public java.lang.String RenderDescriptions();

    @IDynamicResourceExtension.MethodId("4c2f807c-7630-11e9-84bc-453c5bb8bcda")
    public List<cleon.common.doc.metamodel.spec.chapter.references.javamodel.IReference> SelectAllReferences();

    @IDynamicResourceExtension.MethodId("4d4b0d2e-7631-11e9-84bc-453c5bb8bcda")
    public List<cleon.common.doc.metamodel.spec.chapter.references.javamodel.IReference> SelectAllReferencesDistinct();

  }
  
  public static interface ITestCaseSpecificationsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TestCaseSpecificationsFunctionsImpl implements ITestCaseSpecificationsFunctionsImpl {

    public static final ITestCaseSpecificationsFunctionsImpl INSTANCE = new TestCaseSpecificationsFunctionsImpl();

    private TestCaseSpecificationsFunctionsImpl() {}

  }
  
  public static class TestCaseSpecificationsFunctions {

    private TestCaseSpecificationsFunctions() {}

  }

  public static interface IIntegerLiteralFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5f5f4b24-920e-11eb-a126-6710d92c881e")
    public java.lang.String InHours();

  }
  
  public static interface IIntegerLiteralFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("5f5f4b24-920e-11eb-a126-6710d92c881e")
    public java.lang.String InHours(final java.lang.Integer integerLiteral);

  }
  
  public static class IntegerLiteralFunctionsImpl implements IIntegerLiteralFunctionsImpl {

    public static final IIntegerLiteralFunctionsImpl INSTANCE = new IntegerLiteralFunctionsImpl();

    private IntegerLiteralFunctionsImpl() {}

    @Override
    public java.lang.String InHours(final java.lang.Integer integerLiteral) {
      /* Begin Protected Region [[5f5f4b24-920e-11eb-a126-6710d92c881e]] */
      return LocalTime.MIN.plus(Duration.ofMinutes( integerLiteral )).toString();
      /* End Protected Region   [[5f5f4b24-920e-11eb-a126-6710d92c881e]] */
    }

  }
  
  public static class IntegerLiteralFunctions {

    private IntegerLiteralFunctions() {}

    public static java.lang.String InHours(final java.lang.Integer integerLiteral) {
      return DynamicResourceUtil.invoke(IIntegerLiteralFunctionsImpl.class, IntegerLiteralFunctionsImpl.INSTANCE, integerLiteral).InHours(integerLiteral);
    }

  }

  public static interface ITestInputConnectionEnvironmentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("22d8d234-0c04-11ec-958d-1bedd06d8336")
    public java.lang.String RenderLine();

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

    @IDynamicResourceExtension.MethodId("9cbaf2b4-0c05-11ec-958d-1bedd06d8336")
    public java.lang.String RenderLine();

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

  public static interface ITestAbstractInputConnectionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("878e6b21-0c05-11ec-958d-1bedd06d8336")
    public java.lang.String RenderLine();

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

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,983d95c3-4f88-11e9-ad5d-977b17aab907,gxkfEVHuARgxkIEPetUi+RgcexM=] */
