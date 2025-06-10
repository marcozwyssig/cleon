package cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.controlling.deliverable;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[afaee166-be00-11e6-a3f0-c7681ee45a3f,imports]] */

/* End Protected Region   [[afaee166-be00-11e6-a3f0-c7681ee45a3f,imports]] */

public class FunctionSpace_Controlling {

  /* Begin Protected Region [[afaee166-be00-11e6-a3f0-c7681ee45a3f]] */
  
  /* End Protected Region   [[afaee166-be00-11e6-a3f0-c7681ee45a3f]] */


  public static interface IDeliverableControllingFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0bf0e40b-be0c-11e6-a3f0-c7681ee45a3f")
    public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.javamodel.IBacklog GetBacklog();

  }
  
  public static interface IDeliverableControllingFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DeliverableControllingFunctionsImpl implements IDeliverableControllingFunctionsImpl {

    public static final IDeliverableControllingFunctionsImpl INSTANCE = new DeliverableControllingFunctionsImpl();

    private DeliverableControllingFunctionsImpl() {}

  }
  
  public static class DeliverableControllingFunctions {

    private DeliverableControllingFunctions() {}

  }

  public static interface IDeliverablesControllingFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e9b1fa92-3eb4-11e7-a89c-83d57940f0e3")
    public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.javamodel.IPlanning GetPlanning();

  }
  
  public static interface IDeliverablesControllingFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DeliverablesControllingFunctionsImpl implements IDeliverablesControllingFunctionsImpl {

    public static final IDeliverablesControllingFunctionsImpl INSTANCE = new DeliverablesControllingFunctionsImpl();

    private DeliverablesControllingFunctionsImpl() {}

  }
  
  public static class DeliverablesControllingFunctions {

    private DeliverablesControllingFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,afaee166-be00-11e6-a3f0-c7681ee45a3f,4dDfPJV16jsGSejkzCHOx676rlQ=] */
