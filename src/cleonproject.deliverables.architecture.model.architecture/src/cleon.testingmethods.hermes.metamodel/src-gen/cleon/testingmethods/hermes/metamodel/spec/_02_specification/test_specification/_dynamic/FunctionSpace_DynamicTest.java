package cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[5353461a-4f8d-11e9-ad5d-977b17aab907,imports]] */
import java.util.ArrayList;
import cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.javamodel.IAbstractTestPreconditionStep;
import cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.javamodel.ITestPreconditionStep;
import cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IAbstractDynamicTest;

/* End Protected Region   [[5353461a-4f8d-11e9-ad5d-977b17aab907,imports]] */

public class FunctionSpace_DynamicTest {

  /* Begin Protected Region [[5353461a-4f8d-11e9-ad5d-977b17aab907]] */

  /* End Protected Region   [[5353461a-4f8d-11e9-ad5d-977b17aab907]] */


  public static interface IFunctionalDynamicTestFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8aef9268-4f8d-11e9-ad5d-977b17aab907")
    public java.lang.String GetName();

  }
  
  public static interface IFunctionalDynamicTestFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class FunctionalDynamicTestFunctionsImpl implements IFunctionalDynamicTestFunctionsImpl {

    public static final IFunctionalDynamicTestFunctionsImpl INSTANCE = new FunctionalDynamicTestFunctionsImpl();

    private FunctionalDynamicTestFunctionsImpl() {}

  }
  
  public static class FunctionalDynamicTestFunctions {

    private FunctionalDynamicTestFunctions() {}

  }

  public static interface INonFunctionalDynamicTestFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b7a66937-4f8d-11e9-ad5d-977b17aab907")
    public java.lang.String GetName();

  }
  
  public static interface INonFunctionalDynamicTestFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class NonFunctionalDynamicTestFunctionsImpl implements INonFunctionalDynamicTestFunctionsImpl {

    public static final INonFunctionalDynamicTestFunctionsImpl INSTANCE = new NonFunctionalDynamicTestFunctionsImpl();

    private NonFunctionalDynamicTestFunctionsImpl() {}

  }
  
  public static class NonFunctionalDynamicTestFunctions {

    private NonFunctionalDynamicTestFunctions() {}

  }

  public static interface IDynamicTestFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d8bc7687-6b31-11e9-bd30-87fcf852dea7")
    public List<cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.javamodel.IAbstractTestPreconditionStep> GetAllPrecondition();

    @IDynamicResourceExtension.MethodId("2f38f888-7191-11e9-98e0-2719d32d2629")
    public cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.javamodel.ITestGlobalPrecondition GetGlobalPreconditionGroup();

    @IDynamicResourceExtension.MethodId("faa918d6-8edb-11eb-856f-95cb91a58e04")
    public java.lang.String NegativeTestName();

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

  public static interface IUsedTestGlobalPreconditionGroupFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d8cc38d1-6b32-11e9-bd30-87fcf852dea7")
    public List<cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.javamodel.IAbstractTestPreconditionStep> GetPreconditions();

  }
  
  public static interface IUsedTestGlobalPreconditionGroupFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("d8cc38d1-6b32-11e9-bd30-87fcf852dea7")
    public List<cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.javamodel.IAbstractTestPreconditionStep> GetPreconditions(final cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IUsedTestGlobalPreconditionGroup usedTestGlobalPreconditionGroup);

  }
  
  public static class UsedTestGlobalPreconditionGroupFunctionsImpl implements IUsedTestGlobalPreconditionGroupFunctionsImpl {

    public static final IUsedTestGlobalPreconditionGroupFunctionsImpl INSTANCE = new UsedTestGlobalPreconditionGroupFunctionsImpl();

    private UsedTestGlobalPreconditionGroupFunctionsImpl() {}

    @Override
    public List<cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.javamodel.IAbstractTestPreconditionStep> GetPreconditions(final cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IUsedTestGlobalPreconditionGroup usedTestGlobalPreconditionGroup) {
      /* Begin Protected Region [[d8cc38d1-6b32-11e9-bd30-87fcf852dea7]] */
      final List<IAbstractTestPreconditionStep> resultPreconditions = new ArrayList<>();

      for( final ITestPreconditionStep iterPrecondition : usedTestGlobalPreconditionGroup.selectTestGlobalPrecondition().selectTestLocalPreconditions())
      {
      	if(usedTestGlobalPreconditionGroup.selectTestOverridePrecondition().containsKey(iterPrecondition.getResource()))
      	{
      		resultPreconditions.add(usedTestGlobalPreconditionGroup.selectTestOverridePrecondition().get(iterPrecondition.getResource()));
      	}
      	else
      	{
      		resultPreconditions.add(iterPrecondition);
      	}
      }
      return resultPreconditions;

      /* End Protected Region   [[d8cc38d1-6b32-11e9-bd30-87fcf852dea7]] */
    }

  }
  
  public static class UsedTestGlobalPreconditionGroupFunctions {

    private UsedTestGlobalPreconditionGroupFunctions() {}

    public static List<cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.javamodel.IAbstractTestPreconditionStep> GetPreconditions(final cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IUsedTestGlobalPreconditionGroup usedTestGlobalPreconditionGroup) {
      return DynamicResourceUtil.invoke(IUsedTestGlobalPreconditionGroupFunctionsImpl.class, UsedTestGlobalPreconditionGroupFunctionsImpl.INSTANCE, usedTestGlobalPreconditionGroup).GetPreconditions(usedTestGlobalPreconditionGroup);
    }

  }

  public static interface IGlobalPreconditionsAwareFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("02863fe6-7191-11e9-98e0-2719d32d2629")
    public cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.javamodel.ITestGlobalPrecondition GetGlobalPreconditionGroup();

  }
  
  public static interface IGlobalPreconditionsAwareFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class GlobalPreconditionsAwareFunctionsImpl implements IGlobalPreconditionsAwareFunctionsImpl {

    public static final IGlobalPreconditionsAwareFunctionsImpl INSTANCE = new GlobalPreconditionsAwareFunctionsImpl();

    private GlobalPreconditionsAwareFunctionsImpl() {}

  }
  
  public static class GlobalPreconditionsAwareFunctions {

    private GlobalPreconditionsAwareFunctions() {}

  }

  public static interface IAbstractDynamicTestFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8af66c32-5166-11e9-bb61-971a423d31e9")
    public java.lang.String GetTestName();

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

  public static interface IDynamicTestReferenceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2b021254-7545-11e9-8ca5-a73df0698911")
    public java.lang.String GetName();

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

  public static interface ITestDynamicTestLevelSpecificationDocumentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5c131579-7626-11e9-bd98-2b827cfec50e")
    public cleon.common.doc.metamodel.spec.chapter.references.javamodel.IReference SelectAllReferences();

  }
  
  public static interface ITestDynamicTestLevelSpecificationDocumentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TestDynamicTestLevelSpecificationDocumentFunctionsImpl implements ITestDynamicTestLevelSpecificationDocumentFunctionsImpl {

    public static final ITestDynamicTestLevelSpecificationDocumentFunctionsImpl INSTANCE = new TestDynamicTestLevelSpecificationDocumentFunctionsImpl();

    private TestDynamicTestLevelSpecificationDocumentFunctionsImpl() {}

  }
  
  public static class TestDynamicTestLevelSpecificationDocumentFunctions {

    private TestDynamicTestLevelSpecificationDocumentFunctions() {}

  }

  public static interface IDynamicTestGroupFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("41634817-761f-11e9-bd98-2b827cfec50e")
    public java.lang.Integer Count();

    @IDynamicResourceExtension.MethodId("3e7c6f9f-920b-11eb-a126-6710d92c881e")
    public java.lang.Integer SumTotalEstimate_aE__aA_m_aC_();

  }
  
  public static interface IDynamicTestGroupFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("3e7c6f9f-920b-11eb-a126-6710d92c881e")
    public java.lang.Integer SumTotalEstimate_aE__aA_m_aC_(final cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IDynamicTestGroup dynamicTestGroup);

  }
  
  public static class DynamicTestGroupFunctionsImpl implements IDynamicTestGroupFunctionsImpl {

    public static final IDynamicTestGroupFunctionsImpl INSTANCE = new DynamicTestGroupFunctionsImpl();

    private DynamicTestGroupFunctionsImpl() {}

    @Override
    public java.lang.Integer SumTotalEstimate_aE__aA_m_aC_(final cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IDynamicTestGroup dynamicTestGroup) {
      /* Begin Protected Region [[3e7c6f9f-920b-11eb-a126-6710d92c881e]] */
      return dynamicTestGroup.selectDynamicTest().stream().mapToInt(IAbstractDynamicTest::selectExecutionTime_aE__aA_m_aC_).sum();
      /* End Protected Region   [[3e7c6f9f-920b-11eb-a126-6710d92c881e]] */
    }

  }
  
  public static class DynamicTestGroupFunctions {

    private DynamicTestGroupFunctions() {}

    public static java.lang.Integer SumTotalEstimate_aE__aA_m_aC_(final cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IDynamicTestGroup dynamicTestGroup) {
      return DynamicResourceUtil.invoke(IDynamicTestGroupFunctionsImpl.class, DynamicTestGroupFunctionsImpl.INSTANCE, dynamicTestGroup).SumTotalEstimate_aE__aA_m_aC_(dynamicTestGroup);
    }

  }

  public static interface ITestCaseSpecificationsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("076da764-7618-11e9-bd98-2b827cfec50e")
    public java.lang.Integer Count();

    @IDynamicResourceExtension.MethodId("21ce0f9d-920b-11eb-a126-6710d92c881e")
    public java.lang.Integer SumTotalEstimate_aE__aA_m_aC_();

  }
  
  public static interface ITestCaseSpecificationsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("076da764-7618-11e9-bd98-2b827cfec50e")
    public java.lang.Integer Count(final cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification.javamodel.ITestCaseSpecifications testCaseSpecifications);

    @IDynamicResourceExtension.MethodId("21ce0f9d-920b-11eb-a126-6710d92c881e")
    public java.lang.Integer SumTotalEstimate_aE__aA_m_aC_(final cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification.javamodel.ITestCaseSpecifications testCaseSpecifications);

  }
  
  public static class TestCaseSpecificationsFunctionsImpl implements ITestCaseSpecificationsFunctionsImpl {

    public static final ITestCaseSpecificationsFunctionsImpl INSTANCE = new TestCaseSpecificationsFunctionsImpl();

    private TestCaseSpecificationsFunctionsImpl() {}

    @Override
    public java.lang.Integer Count(final cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification.javamodel.ITestCaseSpecifications testCaseSpecifications) {
      /* Begin Protected Region [[076da764-7618-11e9-bd98-2b827cfec50e]] */
      return testCaseSpecifications.selectGroups().stream().mapToInt(x -> x.extension(IDynamicTestGroupFunctions.class).Count()).sum();
      /* End Protected Region   [[076da764-7618-11e9-bd98-2b827cfec50e]] */
    }

    @Override
    public java.lang.Integer SumTotalEstimate_aE__aA_m_aC_(final cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification.javamodel.ITestCaseSpecifications testCaseSpecifications) {
      /* Begin Protected Region [[21ce0f9d-920b-11eb-a126-6710d92c881e]] */
      return testCaseSpecifications.selectGroups().stream().mapToInt(x -> x.extension(IDynamicTestGroupFunctions.class).SumTotalEstimate_aE__aA_m_aC_()).sum();
      /* End Protected Region   [[21ce0f9d-920b-11eb-a126-6710d92c881e]] */
    }

  }
  
  public static class TestCaseSpecificationsFunctions {

    private TestCaseSpecificationsFunctions() {}

    public static java.lang.Integer Count(final cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification.javamodel.ITestCaseSpecifications testCaseSpecifications) {
      return DynamicResourceUtil.invoke(ITestCaseSpecificationsFunctionsImpl.class, TestCaseSpecificationsFunctionsImpl.INSTANCE, testCaseSpecifications).Count(testCaseSpecifications);
    }

    public static java.lang.Integer SumTotalEstimate_aE__aA_m_aC_(final cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification.javamodel.ITestCaseSpecifications testCaseSpecifications) {
      return DynamicResourceUtil.invoke(ITestCaseSpecificationsFunctionsImpl.class, TestCaseSpecificationsFunctionsImpl.INSTANCE, testCaseSpecifications).SumTotalEstimate_aE__aA_m_aC_(testCaseSpecifications);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,5353461a-4f8d-11e9-ad5d-977b17aab907,wSFy/S96PWL06lgWaNJyN1YzhOY=] */
