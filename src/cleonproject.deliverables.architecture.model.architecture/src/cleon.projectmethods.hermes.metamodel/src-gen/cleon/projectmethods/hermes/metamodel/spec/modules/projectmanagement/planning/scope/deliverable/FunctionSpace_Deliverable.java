package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[b18da6d4-aaab-11e8-b25a-7dd9f85a27ad,imports]] */

/* End Protected Region   [[b18da6d4-aaab-11e8-b25a-7dd9f85a27ad,imports]] */

public class FunctionSpace_Deliverable {

  /* Begin Protected Region [[b18da6d4-aaab-11e8-b25a-7dd9f85a27ad]] */
  
  /* End Protected Region   [[b18da6d4-aaab-11e8-b25a-7dd9f85a27ad]] */


  public static interface IDeliverableFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("15832023-b46d-11e8-bb21-172cc8e5f7cd")
    public java.lang.String GetId();

    @IDynamicResourceExtension.MethodId("2547e171-6746-11e9-9ec9-5fbc84faaeb1")
    public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverableAware GetDeliverableAware();

  }
  
  public static interface IDeliverableFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("15832023-b46d-11e8-bb21-172cc8e5f7cd")
    public java.lang.String GetId(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable deliverable);

  }
  
  public static class DeliverableFunctionsImpl implements IDeliverableFunctionsImpl {

    public static final IDeliverableFunctionsImpl INSTANCE = new DeliverableFunctionsImpl();

    private DeliverableFunctionsImpl() {}

    @Override
    public java.lang.String GetId(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable deliverable) {
      return String.format("LO%02d", deliverable.selectIdentifier());
    }

  }
  
  public static class DeliverableFunctions {

    private DeliverableFunctions() {}

    public static java.lang.String GetId(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable deliverable) {
      return DynamicResourceUtil.invoke(IDeliverableFunctionsImpl.class, DeliverableFunctionsImpl.INSTANCE, deliverable).GetId(deliverable);
    }

  }

  public static interface INamedDeliverableFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c4ae807f-aaab-11e8-b25a-7dd9f85a27ad")
    public java.lang.String RenderDescription();

  }
  
  public static interface INamedDeliverableFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class NamedDeliverableFunctionsImpl implements INamedDeliverableFunctionsImpl {

    public static final INamedDeliverableFunctionsImpl INSTANCE = new NamedDeliverableFunctionsImpl();

    private NamedDeliverableFunctionsImpl() {}

  }
  
  public static class NamedDeliverableFunctions {

    private NamedDeliverableFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,b18da6d4-aaab-11e8-b25a-7dd9f85a27ad,nWzOpu5rpPQ51ifhCIFaTA8nAUY=] */
