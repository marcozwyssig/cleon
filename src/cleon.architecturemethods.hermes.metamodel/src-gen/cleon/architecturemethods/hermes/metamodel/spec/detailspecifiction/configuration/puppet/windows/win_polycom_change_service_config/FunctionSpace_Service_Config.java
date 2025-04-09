package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_change_service_config;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[8f28082b-1087-11f0-b378-11a495632127,imports]] */

/* End Protected Region   [[8f28082b-1087-11f0-b378-11a495632127,imports]] */

public class FunctionSpace_Service_Config {

  /* Begin Protected Region [[8f28082b-1087-11f0-b378-11a495632127]] */
  
  /* End Protected Region   [[8f28082b-1087-11f0-b378-11a495632127]] */


  public static interface IServiceConfigFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9582c52b-1087-11f0-b378-11a495632127")
    public java.lang.String LogonAs();

  }
  
  public static interface IServiceConfigFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ServiceConfigFunctionsImpl implements IServiceConfigFunctionsImpl {

    public static final IServiceConfigFunctionsImpl INSTANCE = new ServiceConfigFunctionsImpl();

    private ServiceConfigFunctionsImpl() {}

  }
  
  public static class ServiceConfigFunctions {

    private ServiceConfigFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,8f28082b-1087-11f0-b378-11a495632127,G6+ZUYx/LdjCaXCX4KJ+KAk7r+s=] */
