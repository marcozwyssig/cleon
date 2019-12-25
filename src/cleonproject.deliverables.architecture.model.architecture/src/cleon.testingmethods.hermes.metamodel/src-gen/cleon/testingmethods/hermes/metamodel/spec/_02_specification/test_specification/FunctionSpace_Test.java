package cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[39bab0b8-4f8d-11e9-ad5d-977b17aab907,imports]] */

/* End Protected Region   [[39bab0b8-4f8d-11e9-ad5d-977b17aab907,imports]] */

public class FunctionSpace_Test {

  /* Begin Protected Region [[39bab0b8-4f8d-11e9-ad5d-977b17aab907]] */
  
  /* End Protected Region   [[39bab0b8-4f8d-11e9-ad5d-977b17aab907]] */


  public static interface ITestFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("dbf30cb6-1dba-11e6-974b-630b7f5d3b95")
    public java.lang.String GetId();

    @IDynamicResourceExtension.MethodId("54c47614-1dbb-11e6-974b-630b7f5d3b95")
    public java.lang.String GetName();

  }
  
  public static interface ITestFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("dbf30cb6-1dba-11e6-974b-630b7f5d3b95")
    public java.lang.String GetId(final cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification.javamodel.ITest test);

  }
  
  public static class TestFunctionsImpl implements ITestFunctionsImpl {

    public static final ITestFunctionsImpl INSTANCE = new TestFunctionsImpl();

    private TestFunctionsImpl() {}

    @Override
    public java.lang.String GetId(final cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification.javamodel.ITest test) {
      return java.lang.String.format("TS-%03d", test.selectIdentifier());
    }

  }
  
  public static class TestFunctions {

    private TestFunctions() {}

    public static java.lang.String GetId(final cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification.javamodel.ITest test) {
      return DynamicResourceUtil.invoke(ITestFunctionsImpl.class, TestFunctionsImpl.INSTANCE, test).GetId(test);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,39bab0b8-4f8d-11e9-ad5d-977b17aab907,SIsG5LWjgjtL3Ef354rngRbBeVQ=] */
