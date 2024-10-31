package cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_users;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[1a1a2cf3-fa9b-11eb-be75-2537968f2820,imports]] */

/* End Protected Region   [[1a1a2cf3-fa9b-11eb-be75-2537968f2820,imports]] */

public class Test_Users_FunctionSpace {

  /* Begin Protected Region [[1a1a2cf3-fa9b-11eb-be75-2537968f2820]] */
  
  /* End Protected Region   [[1a1a2cf3-fa9b-11eb-be75-2537968f2820]] */


  public static interface ITestUserFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("21ade020-fa9b-11eb-be75-2537968f2820")
    public java.lang.String Id();

    @IDynamicResourceExtension.MethodId("2ac83249-fa9b-11eb-be75-2537968f2820")
    public java.lang.String Name();

  }
  
  public static interface ITestUserFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TestUserFunctionsImpl implements ITestUserFunctionsImpl {

    public static final ITestUserFunctionsImpl INSTANCE = new TestUserFunctionsImpl();

    private TestUserFunctionsImpl() {}

  }
  
  public static class TestUserFunctions {

    private TestUserFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,1a1a2cf3-fa9b-11eb-be75-2537968f2820,yvFiBPefjka/3t/jjA+pcBXUyTM=] */
