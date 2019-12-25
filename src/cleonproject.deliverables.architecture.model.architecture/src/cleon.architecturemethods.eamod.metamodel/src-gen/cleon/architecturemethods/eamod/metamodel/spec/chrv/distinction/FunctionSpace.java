package cleon.architecturemethods.eamod.metamodel.spec.chrv.distinction;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[305afff5-0e19-11e6-ae01-ef640c578b9b,imports]] */

/* End Protected Region   [[305afff5-0e19-11e6-ae01-ef640c578b9b,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[305afff5-0e19-11e6-ae01-ef640c578b9b]] */
  
  /* End Protected Region   [[305afff5-0e19-11e6-ae01-ef640c578b9b]] */


  public static interface IDestinctionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("35f812bc-0e19-11e6-ae01-ef640c578b9b")
    public java.lang.String GetId();

  }
  
  public static interface IDestinctionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DestinctionFunctionsImpl implements IDestinctionFunctionsImpl {

    public static final IDestinctionFunctionsImpl INSTANCE = new DestinctionFunctionsImpl();

    private DestinctionFunctionsImpl() {}

  }
  
  public static class DestinctionFunctions {

    private DestinctionFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,305afff5-0e19-11e6-ae01-ef640c578b9b,k+ttjUkVMPIYgTb++JnZx8Tsyj4=] */
