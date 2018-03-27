package cleon.initialization.projectmanagement.spec.resource.locations;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[2368a7c8-c76a-11e5-b3f9-43c5a0896ea1,imports]] */

/* End Protected Region   [[2368a7c8-c76a-11e5-b3f9-43c5a0896ea1,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[2368a7c8-c76a-11e5-b3f9-43c5a0896ea1]] */
  
  /* End Protected Region   [[2368a7c8-c76a-11e5-b3f9-43c5a0896ea1]] */


  public static interface ILocationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2368a7de-c76a-11e5-b3f9-43c5a0896ea1")
    public java.lang.String GetName();

  }
  
  public static interface ILocationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class LocationFunctionsImpl implements ILocationFunctionsImpl {

    public static final ILocationFunctionsImpl INSTANCE = new LocationFunctionsImpl();

    private LocationFunctionsImpl() {}

  }
  
  public static class LocationFunctions {

    private LocationFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,2368a7c8-c76a-11e5-b3f9-43c5a0896ea1,h8RCbRLr01aQHRxA9/n6FoNOeEg=] */
