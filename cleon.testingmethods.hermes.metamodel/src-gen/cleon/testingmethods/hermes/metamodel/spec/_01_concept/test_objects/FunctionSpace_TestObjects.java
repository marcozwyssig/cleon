package cleon.testingmethods.hermes.metamodel.spec._01_concept.test_objects;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[0d11ccf5-6747-11e9-9ec9-5fbc84faaeb1,imports]] */

/* End Protected Region   [[0d11ccf5-6747-11e9-9ec9-5fbc84faaeb1,imports]] */

public class FunctionSpace_TestObjects {

  /* Begin Protected Region [[0d11ccf5-6747-11e9-9ec9-5fbc84faaeb1]] */
  
  /* End Protected Region   [[0d11ccf5-6747-11e9-9ec9-5fbc84faaeb1]] */


  public static interface IDynamicTestObjectFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("1590c9fa-6747-11e9-9ec9-5fbc84faaeb1")
    public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverableAware GetArchitecture();

  }
  
  public static interface IDynamicTestObjectFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DynamicTestObjectFunctionsImpl implements IDynamicTestObjectFunctionsImpl {

    public static final IDynamicTestObjectFunctionsImpl INSTANCE = new DynamicTestObjectFunctionsImpl();

    private DynamicTestObjectFunctionsImpl() {}

  }
  
  public static class DynamicTestObjectFunctions {

    private DynamicTestObjectFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,0d11ccf5-6747-11e9-9ec9-5fbc84faaeb1,7VkAhK55GDdCRk407E7wQut1ISA=] */
