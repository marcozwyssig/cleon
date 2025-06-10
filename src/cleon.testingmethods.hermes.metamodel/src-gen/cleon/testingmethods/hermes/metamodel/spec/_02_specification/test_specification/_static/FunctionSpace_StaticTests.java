package cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._static;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[61add92d-1cf4-11e6-aaba-9db7fdc64d7e,imports]] */

/* End Protected Region   [[61add92d-1cf4-11e6-aaba-9db7fdc64d7e,imports]] */

public class FunctionSpace_StaticTests {

  /* Begin Protected Region [[61add92d-1cf4-11e6-aaba-9db7fdc64d7e]] */
  
  /* End Protected Region   [[61add92d-1cf4-11e6-aaba-9db7fdc64d7e]] */


  public static interface IStaticTestFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("69569aa2-1cf4-11e6-aaba-9db7fdc64d7e")
    public cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._static.javamodel.ITestSubjectArea GetTestSubjectArea();

    @IDynamicResourceExtension.MethodId("5d21ba45-1dbb-11e6-974b-630b7f5d3b95")
    public java.lang.String GetName();

    @IDynamicResourceExtension.MethodId("5dbb0bce-20d9-11e6-9368-9172b77c2cff")
    public java.lang.Boolean AllTestArePassed();

    @IDynamicResourceExtension.MethodId("6e176fb8-2270-11e6-bcc1-f96f0d74dcad")
    public List<cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._static.javamodel.IStaticTest> AllRequirements();

  }
  
  public static interface IStaticTestFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("5dbb0bce-20d9-11e6-9368-9172b77c2cff")
    public java.lang.Boolean AllTestArePassed(final cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._static.javamodel.IStaticTest staticTest);

  }
  
  public static class StaticTestFunctionsImpl implements IStaticTestFunctionsImpl {

    public static final IStaticTestFunctionsImpl INSTANCE = new StaticTestFunctionsImpl();

    private StaticTestFunctionsImpl() {}

    @Override
    public java.lang.Boolean AllTestArePassed(final cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._static.javamodel.IStaticTest staticTest) {
      /* Begin Protected Region [[5dbb0bce-20d9-11e6-9368-9172b77c2cff]] */
    	return null;   
      /* End Protected Region   [[5dbb0bce-20d9-11e6-9368-9172b77c2cff]] */
    }

  }
  
  public static class StaticTestFunctions {

    private StaticTestFunctions() {}

    public static java.lang.Boolean AllTestArePassed(final cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._static.javamodel.IStaticTest staticTest) {
      return DynamicResourceUtil.invoke(IStaticTestFunctionsImpl.class, StaticTestFunctionsImpl.INSTANCE, staticTest).AllTestArePassed(staticTest);
    }

  }

  public static interface ITestSubjectAreaFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("596743ff-2270-11e6-bcc1-f96f0d74dcad")
    public List<cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._static.javamodel.IStaticTest> AllRequirements();

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

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,61add92d-1cf4-11e6-aaba-9db7fdc64d7e,h5uWyYsDo3U7xVX/nFCaSIe3LOA=] */
