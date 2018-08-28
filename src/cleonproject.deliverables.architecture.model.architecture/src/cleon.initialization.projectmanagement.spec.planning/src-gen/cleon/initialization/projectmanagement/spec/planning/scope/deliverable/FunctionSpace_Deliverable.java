package cleon.initialization.projectmanagement.spec.planning.scope.deliverable;

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

    @IDynamicResourceExtension.MethodId("b711da1f-aaab-11e8-b25a-7dd9f85a27ad")
    public java.lang.String RenderDescription();

  }
  
  public static interface IDeliverableFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DeliverableFunctionsImpl implements IDeliverableFunctionsImpl {

    public static final IDeliverableFunctionsImpl INSTANCE = new DeliverableFunctionsImpl();

    private DeliverableFunctionsImpl() {}

  }
  
  public static class DeliverableFunctions {

    private DeliverableFunctions() {}

  }

  public static interface ISimpleDeliverableFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c4ae807f-aaab-11e8-b25a-7dd9f85a27ad")
    public java.lang.String RenderDescription();

  }
  
  public static interface ISimpleDeliverableFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SimpleDeliverableFunctionsImpl implements ISimpleDeliverableFunctionsImpl {

    public static final ISimpleDeliverableFunctionsImpl INSTANCE = new SimpleDeliverableFunctionsImpl();

    private SimpleDeliverableFunctionsImpl() {}

  }
  
  public static class SimpleDeliverableFunctions {

    private SimpleDeliverableFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,b18da6d4-aaab-11e8-b25a-7dd9f85a27ad,BCUWhZy1j2UxURphUea3CffwoXc=] */
