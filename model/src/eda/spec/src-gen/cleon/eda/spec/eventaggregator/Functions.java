package cleon.eda.spec.eventaggregator;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[3fe557b9-d232-11e4-8b90-c7d981a5f2fd,imports]] */

/* End Protected Region   [[3fe557b9-d232-11e4-8b90-c7d981a5f2fd,imports]] */

public class Functions {

  /* Begin Protected Region [[3fe557b9-d232-11e4-8b90-c7d981a5f2fd]] */
  
  /* End Protected Region   [[3fe557b9-d232-11e4-8b90-c7d981a5f2fd]] */


  public static interface IPubSubEventFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("73afdb2e-d232-11e4-8b90-c7d981a5f2fd")
    public java.lang.String EventName();

    @IDynamicResourceExtension.MethodId("f3289c72-d232-11e4-8b90-c7d981a5f2fd")
    public java.lang.String PubSubEventName();

  }
  
  public static interface IPubSubEventFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class PubSubEventFunctionsImpl implements IPubSubEventFunctionsImpl {

    public static final IPubSubEventFunctionsImpl INSTANCE = new PubSubEventFunctionsImpl();

    private PubSubEventFunctionsImpl() {}

  }
  
  public static class PubSubEventFunctions {

    private PubSubEventFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,3fe557b9-d232-11e4-8b90-c7d981a5f2fd,iETPq6rRAQt/f0ceB/wUiPpje7I=] */
