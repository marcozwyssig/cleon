package cleon.operationalmethods.hermes.metamodel.spec.operational_manual;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[1753e26b-1bfd-11e9-9896-651e5faa32a4,imports]] */

/* End Protected Region   [[1753e26b-1bfd-11e9-9896-651e5faa32a4,imports]] */

public class FunctionSpace_Operation_Manual {

  /* Begin Protected Region [[1753e26b-1bfd-11e9-9896-651e5faa32a4]] */
  
  /* End Protected Region   [[1753e26b-1bfd-11e9-9896-651e5faa32a4]] */


  public static interface ISystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2705d406-1bfd-11e9-9896-651e5faa32a4")
    public java.lang.String GetName();

  }
  
  public static interface ISystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SystemConfigurationFunctionsImpl implements ISystemConfigurationFunctionsImpl {

    public static final ISystemConfigurationFunctionsImpl INSTANCE = new SystemConfigurationFunctionsImpl();

    private SystemConfigurationFunctionsImpl() {}

  }
  
  public static class SystemConfigurationFunctions {

    private SystemConfigurationFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,1753e26b-1bfd-11e9-9896-651e5faa32a4,Fgk4BWecaZgWFPVa2nPkf0vIVTA=] */
