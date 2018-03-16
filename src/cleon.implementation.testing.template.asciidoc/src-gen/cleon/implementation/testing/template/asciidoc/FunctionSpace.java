package cleon.implementation.testing.template.asciidoc;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[e4562fb5-d400-11e5-9dfc-cf0f3e030023,imports]] */

/* End Protected Region   [[e4562fb5-d400-11e5-9dfc-cf0f3e030023,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[e4562fb5-d400-11e5-9dfc-cf0f3e030023]] */
  
  /* End Protected Region   [[e4562fb5-d400-11e5-9dfc-cf0f3e030023]] */


  public static interface ITestingDocumentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("1ec27a77-1db0-11e6-974b-630b7f5d3b95")
    public java.lang.String GetDocumentPath();

  }
  
  public static interface ITestingDocumentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TestingDocumentFunctionsImpl implements ITestingDocumentFunctionsImpl {

    public static final ITestingDocumentFunctionsImpl INSTANCE = new TestingDocumentFunctionsImpl();

    private TestingDocumentFunctionsImpl() {}

  }
  
  public static class TestingDocumentFunctions {

    private TestingDocumentFunctions() {}

  }

  public static interface IStaticTestFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9d5ba40d-1dba-11e6-974b-630b7f5d3b95")
    public java.lang.String RenderDocumentContent();

  }
  
  public static interface IStaticTestFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class StaticTestFunctionsImpl implements IStaticTestFunctionsImpl {

    public static final IStaticTestFunctionsImpl INSTANCE = new StaticTestFunctionsImpl();

    private StaticTestFunctionsImpl() {}

  }
  
  public static class StaticTestFunctions {

    private StaticTestFunctions() {}

  }

  public static interface IStaticTestExecutionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ed7cc58e-2264-11e6-bcc1-f96f0d74dcad")
    public java.lang.String RenderDocumentContent();

  }
  
  public static interface IStaticTestExecutionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class StaticTestExecutionFunctionsImpl implements IStaticTestExecutionFunctionsImpl {

    public static final IStaticTestExecutionFunctionsImpl INSTANCE = new StaticTestExecutionFunctionsImpl();

    private StaticTestExecutionFunctionsImpl() {}

  }
  
  public static class StaticTestExecutionFunctions {

    private StaticTestExecutionFunctions() {}

  }

  public static interface ITestResultFunctions extends IDynamicResourceExtension {

    /**
     * 
     */
    @IDynamicResourceExtension.MethodId("1e34cd8a-226f-11e6-bcc1-f96f0d74dcad")
    public java.lang.String RenderResult();

  }
  
  public static interface ITestResultFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TestResultFunctionsImpl implements ITestResultFunctionsImpl {

    public static final ITestResultFunctionsImpl INSTANCE = new TestResultFunctionsImpl();

    private TestResultFunctionsImpl() {}

  }
  
  public static class TestResultFunctions {

    private TestResultFunctions() {}

  }

  public static interface ITestFailureFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("624f3127-226f-11e6-bcc1-f96f0d74dcad")
    public java.lang.String RenderResult();

  }
  
  public static interface ITestFailureFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TestFailureFunctionsImpl implements ITestFailureFunctionsImpl {

    public static final ITestFailureFunctionsImpl INSTANCE = new TestFailureFunctionsImpl();

    private TestFailureFunctionsImpl() {}

  }
  
  public static class TestFailureFunctions {

    private TestFailureFunctions() {}

  }

  public static interface ITestSuccessFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("6dfb78a4-226f-11e6-bcc1-f96f0d74dcad")
    public java.lang.String RenderResult();

  }
  
  public static interface ITestSuccessFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TestSuccessFunctionsImpl implements ITestSuccessFunctionsImpl {

    public static final ITestSuccessFunctionsImpl INSTANCE = new TestSuccessFunctionsImpl();

    private TestSuccessFunctionsImpl() {}

  }
  
  public static class TestSuccessFunctions {

    private TestSuccessFunctions() {}

  }

  public static interface ITestObjectsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("11f89b1b-2272-11e6-bcc1-f96f0d74dcad")
    public java.lang.String RenderDocumentContent();

  }
  
  public static interface ITestObjectsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TestObjectsFunctionsImpl implements ITestObjectsFunctionsImpl {

    public static final ITestObjectsFunctionsImpl INSTANCE = new TestObjectsFunctionsImpl();

    private TestObjectsFunctionsImpl() {}

  }
  
  public static class TestObjectsFunctions {

    private TestObjectsFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,e4562fb5-d400-11e5-9dfc-cf0f3e030023,5Umbtqq/nW8YXgUlAjrQVJoqyMI=] */
