package cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.network;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[bebcf85b-ca3a-11e9-ab4d-95a547edc6e9,imports]] */

/* End Protected Region   [[bebcf85b-ca3a-11e9-ab4d-95a547edc6e9,imports]] */

public class FunctionSpace_Network {

  /* Begin Protected Region [[bebcf85b-ca3a-11e9-ab4d-95a547edc6e9]] */
  
  /* End Protected Region   [[bebcf85b-ca3a-11e9-ab4d-95a547edc6e9]] */


  public static interface IInternetFirewallSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("469dd14e-cb0a-11e9-9767-b30840f4f194")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("716cfc83-cb0a-11e9-9767-b30840f4f194")
    public java.lang.String GetIncludePath();

  }
  
  public static interface IInternetFirewallSystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class InternetFirewallSystemConfigurationFunctionsImpl implements IInternetFirewallSystemConfigurationFunctionsImpl {

    public static final IInternetFirewallSystemConfigurationFunctionsImpl INSTANCE = new InternetFirewallSystemConfigurationFunctionsImpl();

    private InternetFirewallSystemConfigurationFunctionsImpl() {}

  }
  
  public static class InternetFirewallSystemConfigurationFunctions {

    private InternetFirewallSystemConfigurationFunctions() {}

  }

  public static interface IPerimeterRouterSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2d8f53d4-cb0a-11e9-9767-b30840f4f194")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("793a83ca-cb0a-11e9-9767-b30840f4f194")
    public java.lang.String GetIncludePath();

  }
  
  public static interface IPerimeterRouterSystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class PerimeterRouterSystemConfigurationFunctionsImpl implements IPerimeterRouterSystemConfigurationFunctionsImpl {

    public static final IPerimeterRouterSystemConfigurationFunctionsImpl INSTANCE = new PerimeterRouterSystemConfigurationFunctionsImpl();

    private PerimeterRouterSystemConfigurationFunctionsImpl() {}

  }
  
  public static class PerimeterRouterSystemConfigurationFunctions {

    private PerimeterRouterSystemConfigurationFunctions() {}

  }

  public static interface IPerimeterSwitchSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("3ff1e6e9-cb0a-11e9-9767-b30840f4f194")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("7ae94461-cb0a-11e9-9767-b30840f4f194")
    public java.lang.String GetIncludePath();

  }
  
  public static interface IPerimeterSwitchSystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class PerimeterSwitchSystemConfigurationFunctionsImpl implements IPerimeterSwitchSystemConfigurationFunctionsImpl {

    public static final IPerimeterSwitchSystemConfigurationFunctionsImpl INSTANCE = new PerimeterSwitchSystemConfigurationFunctionsImpl();

    private PerimeterSwitchSystemConfigurationFunctionsImpl() {}

  }
  
  public static class PerimeterSwitchSystemConfigurationFunctions {

    private PerimeterSwitchSystemConfigurationFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,bebcf85b-ca3a-11e9-ab4d-95a547edc6e9,lIczyH0tZKENmOq6ig34fM37BLQ=] */
