package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[747b9b47-6746-11e9-9ec9-5fbc84faaeb1,imports]] */

/* End Protected Region   [[747b9b47-6746-11e9-9ec9-5fbc84faaeb1,imports]] */

public class FunctionSpace_PlanningDocument {

  /* Begin Protected Region [[747b9b47-6746-11e9-9ec9-5fbc84faaeb1]] */
  
  /* End Protected Region   [[747b9b47-6746-11e9-9ec9-5fbc84faaeb1]] */


  public static interface IPlanningFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("7a837db6-6746-11e9-9ec9-5fbc84faaeb1")
    public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable GetDeliverables();

  }
  
  public static interface IPlanningFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class PlanningFunctionsImpl implements IPlanningFunctionsImpl {

    public static final IPlanningFunctionsImpl INSTANCE = new PlanningFunctionsImpl();

    private PlanningFunctionsImpl() {}

  }
  
  public static class PlanningFunctions {

    private PlanningFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,747b9b47-6746-11e9-9ec9-5fbc84faaeb1,OCoPt/tagbmyA5Jige/VUUcg1Zs=] */
