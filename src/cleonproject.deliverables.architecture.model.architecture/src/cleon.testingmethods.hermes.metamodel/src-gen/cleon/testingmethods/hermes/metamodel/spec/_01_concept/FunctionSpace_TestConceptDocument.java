package cleon.testingmethods.hermes.metamodel.spec._01_concept;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[ff813ec3-6747-11e9-9ec9-5fbc84faaeb1,imports]] */

/* End Protected Region   [[ff813ec3-6747-11e9-9ec9-5fbc84faaeb1,imports]] */

public class FunctionSpace_TestConceptDocument {

  /* Begin Protected Region [[ff813ec3-6747-11e9-9ec9-5fbc84faaeb1]] */
  
  /* End Protected Region   [[ff813ec3-6747-11e9-9ec9-5fbc84faaeb1]] */


  public static interface ITestConceptDocumentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("070cdb9a-6748-11e9-9ec9-5fbc84faaeb1")
    public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverableAware GetArchitecture();

  }
  
  public static interface ITestConceptDocumentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TestConceptDocumentFunctionsImpl implements ITestConceptDocumentFunctionsImpl {

    public static final ITestConceptDocumentFunctionsImpl INSTANCE = new TestConceptDocumentFunctionsImpl();

    private TestConceptDocumentFunctionsImpl() {}

  }
  
  public static class TestConceptDocumentFunctions {

    private TestConceptDocumentFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,ff813ec3-6747-11e9-9ec9-5fbc84faaeb1,tWi9UoqiassFPloiuqGM1v904mg=] */
