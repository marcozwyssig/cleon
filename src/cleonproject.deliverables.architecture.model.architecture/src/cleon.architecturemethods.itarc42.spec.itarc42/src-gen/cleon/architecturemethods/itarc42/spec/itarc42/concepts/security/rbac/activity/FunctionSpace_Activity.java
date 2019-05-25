package cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.activity;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[512e5470-7f07-11e9-98a3-b1bd805f0a31,imports]] */
import cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.FunctionSpace_RBAC.*;
/* End Protected Region   [[512e5470-7f07-11e9-98a3-b1bd805f0a31,imports]] */

public class FunctionSpace_Activity {

  /* Begin Protected Region [[512e5470-7f07-11e9-98a3-b1bd805f0a31]] */
  
  /* End Protected Region   [[512e5470-7f07-11e9-98a3-b1bd805f0a31]] */


  public static interface IActivityPermissionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("228c5f41-1e12-11e9-865e-41ef48a95f70")
    public java.lang.Integer GetId();

    @IDynamicResourceExtension.MethodId("8b08df13-7f26-11e9-9a52-07d4b074defc")
    public cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel.ISystemConfiguration GetSystemConfiguration();

    @IDynamicResourceExtension.MethodId("188608b0-7f27-11e9-9a52-07d4b074defc")
    public java.lang.Integer GetSystemConfigurationId();

    @IDynamicResourceExtension.MethodId("cd8a84f5-7f27-11e9-9a52-07d4b074defc")
    public java.lang.Integer PermissionCount();

  }
  
  public static interface IActivityPermissionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("228c5f41-1e12-11e9-865e-41ef48a95f70")
    public java.lang.Integer GetId(final cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.activity.javamodel.IActivityPermission activityPermission);

  }
  
  public static class ActivityPermissionFunctionsImpl implements IActivityPermissionFunctionsImpl {

    public static final IActivityPermissionFunctionsImpl INSTANCE = new ActivityPermissionFunctionsImpl();

    private ActivityPermissionFunctionsImpl() {}

    @Override
    public java.lang.Integer GetId(final cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.activity.javamodel.IActivityPermission activityPermission) {
      /* Begin Protected Region [[228c5f41-1e12-11e9-865e-41ef48a95f70]] */
    	IAbstractGroupFunctions functions = activityPermission.extension(IAbstractGroupFunctions.class);
    	Integer permissionId = activityPermission.selectPermission().selectIdentifier();
    	Integer netdomainId = functions.GetNetdomainId();
    	IActivityPermissionFunctions permissionFunctions = activityPermission.extension(IActivityPermissionFunctions.class);
    	Integer systemconfigurationId = permissionFunctions.GetSystemConfigurationId();
    	Integer permissionCount = permissionFunctions.PermissionCount();
    	return netdomainId + (2 * systemconfigurationId) + permissionCount + permissionId;   
      /* End Protected Region   [[228c5f41-1e12-11e9-865e-41ef48a95f70]] */
    }

  }
  
  public static class ActivityPermissionFunctions {

    private ActivityPermissionFunctions() {}

    public static java.lang.Integer GetId(final cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.activity.javamodel.IActivityPermission activityPermission) {
      return DynamicResourceUtil.invoke(IActivityPermissionFunctionsImpl.class, ActivityPermissionFunctionsImpl.INSTANCE, activityPermission).GetId(activityPermission);
    }

  }

  public static interface IPermissionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ae00f0bd-7f27-11e9-9a52-07d4b074defc")
    public java.lang.Integer Count();

  }
  
  public static interface IPermissionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class PermissionFunctionsImpl implements IPermissionFunctionsImpl {

    public static final IPermissionFunctionsImpl INSTANCE = new PermissionFunctionsImpl();

    private PermissionFunctionsImpl() {}

  }
  
  public static class PermissionFunctions {

    private PermissionFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,512e5470-7f07-11e9-98a3-b1bd805f0a31,DD2ZrMWCTwunDo7ECn9vEIzhBM0=] */
