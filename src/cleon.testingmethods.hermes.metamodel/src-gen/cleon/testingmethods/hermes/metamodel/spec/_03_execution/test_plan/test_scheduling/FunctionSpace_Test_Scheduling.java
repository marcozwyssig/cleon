package cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scheduling;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[ae224ebc-9191-11e9-85e6-a377d9035ee3,imports]] */

/* End Protected Region   [[ae224ebc-9191-11e9-85e6-a377d9035ee3,imports]] */

public class FunctionSpace_Test_Scheduling {

  /* Begin Protected Region [[ae224ebc-9191-11e9-85e6-a377d9035ee3]] */
  
  /* End Protected Region   [[ae224ebc-9191-11e9-85e6-a377d9035ee3]] */


  public static interface ITesterFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b3e1410d-9191-11e9-85e6-a377d9035ee3")
    public List<cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IAuthorsAware> UsedTests();

  }
  
  public static interface ITesterFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TesterFunctionsImpl implements ITesterFunctionsImpl {

    public static final ITesterFunctionsImpl INSTANCE = new TesterFunctionsImpl();

    private TesterFunctionsImpl() {}

  }
  
  public static class TesterFunctions {

    private TesterFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,ae224ebc-9191-11e9-85e6-a377d9035ee3,UdxBclFdQQgPFPqt/xSh1OUHZNU=] */
