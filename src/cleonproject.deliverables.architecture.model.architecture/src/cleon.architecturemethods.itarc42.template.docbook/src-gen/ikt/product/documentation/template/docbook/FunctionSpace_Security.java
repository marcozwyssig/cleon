package ikt.product.documentation.template.docbook;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[8db33913-1e0a-11e9-834d-77c41fccc6bf,imports]] */

/* End Protected Region   [[8db33913-1e0a-11e9-834d-77c41fccc6bf,imports]] */

public class FunctionSpace_Security {

  /* Begin Protected Region [[8db33913-1e0a-11e9-834d-77c41fccc6bf]] */
  
  /* End Protected Region   [[8db33913-1e0a-11e9-834d-77c41fccc6bf]] */


  public static interface IActivitySecurityGroupFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ffcbe63a-1e15-11e9-865e-41ef48a95f70")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IActivitySecurityGroupFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ActivitySecurityGroupFunctionsImpl implements IActivitySecurityGroupFunctionsImpl {

    public static final IActivitySecurityGroupFunctionsImpl INSTANCE = new ActivitySecurityGroupFunctionsImpl();

    private ActivitySecurityGroupFunctionsImpl() {}

  }
  
  public static class ActivitySecurityGroupFunctions {

    private ActivitySecurityGroupFunctions() {}

  }

  public static interface IActivityGroupsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8fcdfb48-1e18-11e9-865e-41ef48a95f70")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IActivityGroupsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ActivityGroupsFunctionsImpl implements IActivityGroupsFunctionsImpl {

    public static final IActivityGroupsFunctionsImpl INSTANCE = new ActivityGroupsFunctionsImpl();

    private ActivityGroupsFunctionsImpl() {}

  }
  
  public static class ActivityGroupsFunctions {

    private ActivityGroupsFunctions() {}

  }

  public static interface IRoleSecurityGroupFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fa35cae7-1e1b-11e9-865e-41ef48a95f70")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IRoleSecurityGroupFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RoleSecurityGroupFunctionsImpl implements IRoleSecurityGroupFunctionsImpl {

    public static final IRoleSecurityGroupFunctionsImpl INSTANCE = new RoleSecurityGroupFunctionsImpl();

    private RoleSecurityGroupFunctionsImpl() {}

  }
  
  public static class RoleSecurityGroupFunctions {

    private RoleSecurityGroupFunctions() {}

  }

  public static interface IRoleGroupsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0093bca4-1e1c-11e9-865e-41ef48a95f70")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IRoleGroupsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RoleGroupsFunctionsImpl implements IRoleGroupsFunctionsImpl {

    public static final IRoleGroupsFunctionsImpl INSTANCE = new RoleGroupsFunctionsImpl();

    private RoleGroupsFunctionsImpl() {}

  }
  
  public static class RoleGroupsFunctions {

    private RoleGroupsFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,8db33913-1e0a-11e9-834d-77c41fccc6bf,DJpcCGonqzaR5xOr3hCfPVbnD6E=] */
