package cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.security.network;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[10f570ce-0465-11ea-9e5a-73755cac0c6e,imports]] */

/* End Protected Region   [[10f570ce-0465-11ea-9e5a-73755cac0c6e,imports]] */

public class FunctionSpace_Network {

  /* Begin Protected Region [[10f570ce-0465-11ea-9e5a-73755cac0c6e]] */
  
  /* End Protected Region   [[10f570ce-0465-11ea-9e5a-73755cac0c6e]] */


  public static interface IFirewallSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("10f5bf38-0465-11ea-9e5a-73755cac0c6e")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("10f5bf3b-0465-11ea-9e5a-73755cac0c6e")
    public java.lang.String GetIncludePath();

  }
  
  public static interface IFirewallSystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class FirewallSystemConfigurationFunctionsImpl implements IFirewallSystemConfigurationFunctionsImpl {

    public static final IFirewallSystemConfigurationFunctionsImpl INSTANCE = new FirewallSystemConfigurationFunctionsImpl();

    private FirewallSystemConfigurationFunctionsImpl() {}

  }
  
  public static class FirewallSystemConfigurationFunctions {

    private FirewallSystemConfigurationFunctions() {}

  }

  public static interface IRouterSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("10f5bf45-0465-11ea-9e5a-73755cac0c6e")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("10f5bf48-0465-11ea-9e5a-73755cac0c6e")
    public java.lang.String GetIncludePath();

  }
  
  public static interface IRouterSystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RouterSystemConfigurationFunctionsImpl implements IRouterSystemConfigurationFunctionsImpl {

    public static final IRouterSystemConfigurationFunctionsImpl INSTANCE = new RouterSystemConfigurationFunctionsImpl();

    private RouterSystemConfigurationFunctionsImpl() {}

  }
  
  public static class RouterSystemConfigurationFunctions {

    private RouterSystemConfigurationFunctions() {}

  }

  public static interface IFirewallManagementSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9bb01b74-0525-11ea-9f40-b9fb30a62a90")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("9bb04287-0525-11ea-9f40-b9fb30a62a90")
    public java.lang.String GetIncludePath();

  }
  
  public static interface IFirewallManagementSystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class FirewallManagementSystemConfigurationFunctionsImpl implements IFirewallManagementSystemConfigurationFunctionsImpl {

    public static final IFirewallManagementSystemConfigurationFunctionsImpl INSTANCE = new FirewallManagementSystemConfigurationFunctionsImpl();

    private FirewallManagementSystemConfigurationFunctionsImpl() {}

  }
  
  public static class FirewallManagementSystemConfigurationFunctions {

    private FirewallManagementSystemConfigurationFunctions() {}

  }

  public static interface ISwitchManagementSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("a8e6ad40-0525-11ea-9f40-b9fb30a62a90")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("a8e6ad43-0525-11ea-9f40-b9fb30a62a90")
    public java.lang.String GetIncludePath();

  }
  
  public static interface ISwitchManagementSystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SwitchManagementSystemConfigurationFunctionsImpl implements ISwitchManagementSystemConfigurationFunctionsImpl {

    public static final ISwitchManagementSystemConfigurationFunctionsImpl INSTANCE = new SwitchManagementSystemConfigurationFunctionsImpl();

    private SwitchManagementSystemConfigurationFunctionsImpl() {}

  }
  
  public static class SwitchManagementSystemConfigurationFunctions {

    private SwitchManagementSystemConfigurationFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,10f570ce-0465-11ea-9e5a-73755cac0c6e,N2YSKk6JMTpp1vczwOvZ+4dNoDY=] */
