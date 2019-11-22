package cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.activity;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[512e5470-7f07-11e9-98a3-b1bd805f0a31,imports]] */
import cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.FunctionSpace_RBAC.*;
import cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.activity.javamodel.IActivityRootGroups;
/* End Protected Region   [[512e5470-7f07-11e9-98a3-b1bd805f0a31,imports]] */

public class FunctionSpace_Activity {

  /* Begin Protected Region [[512e5470-7f07-11e9-98a3-b1bd805f0a31]] */
  
  /* End Protected Region   [[512e5470-7f07-11e9-98a3-b1bd805f0a31]] */


  public static interface IActivityPermissionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8b08df13-7f26-11e9-9a52-07d4b074defc")
    public cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel.ISystemConfiguration GetSystemConfiguration();

    @IDynamicResourceExtension.MethodId("188608b0-7f27-11e9-9a52-07d4b074defc")
    public java.lang.Integer GetSystemConfigurationId();

    @IDynamicResourceExtension.MethodId("cd8a84f5-7f27-11e9-9a52-07d4b074defc")
    public java.lang.Integer PermissionCount();

    @IDynamicResourceExtension.MethodId("f259b386-c56e-11e9-9daa-cf9f9f7341e8")
    public List<cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.activity.javamodel.IActivityPermission> AllActivityPermissionInDomain();

    @IDynamicResourceExtension.MethodId("f97abbec-016b-11ea-8b45-335c84231cb6")
    public java.lang.String GetId();

  }
  
  public static interface IActivityPermissionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("f97abbec-016b-11ea-8b45-335c84231cb6")
    public java.lang.String GetId(final cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.activity.javamodel.IActivityPermission activityPermission);

  }
  
  public static class ActivityPermissionFunctionsImpl implements IActivityPermissionFunctionsImpl {

    public static final IActivityPermissionFunctionsImpl INSTANCE = new ActivityPermissionFunctionsImpl();

    private ActivityPermissionFunctionsImpl() {}

    @Override
    public java.lang.String GetId(final cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.activity.javamodel.IActivityPermission activityPermission) {
      return String.format("A%04d", activityPermission.selectIdentifier());
    }

  }
  
  public static class ActivityPermissionFunctions {

    private ActivityPermissionFunctions() {}

    public static java.lang.String GetId(final cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.activity.javamodel.IActivityPermission activityPermission) {
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

  public static interface IPermissionsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("6715a024-809a-11e9-8e65-f3f639e40a34")
    public List<cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.activity.javamodel.IPermissions> AllPermissions();

    @IDynamicResourceExtension.MethodId("84f4910e-809a-11e9-8e65-f3f639e40a34")
    public java.lang.Integer CountAllPermission();

    @IDynamicResourceExtension.MethodId("a9b5bf5c-809a-11e9-8e65-f3f639e40a34")
    public List<cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.activity.javamodel.IPermission> AllPermission();

  }
  
  public static interface IPermissionsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class PermissionsFunctionsImpl implements IPermissionsFunctionsImpl {

    public static final IPermissionsFunctionsImpl INSTANCE = new PermissionsFunctionsImpl();

    private PermissionsFunctionsImpl() {}

  }
  
  public static class PermissionsFunctions {

    private PermissionsFunctions() {}

  }

  public static interface IActivityNetdomainGroupFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("aaa0cf46-9c90-11e9-9b32-35cf2fd07621")
    public java.lang.Integer Max();

    @IDynamicResourceExtension.MethodId("a5682b11-9c98-11e9-9b32-35cf2fd07621")
    public List<cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.activity.javamodel.IActivityPermission> AllActivityPermissions();

    @IDynamicResourceExtension.MethodId("40656397-0d2c-11ea-b914-3dd9896c252a")
    public List<cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.activity.javamodel.IActivityPermission> AllAvailableActivityPermissions();

  }
  
  public static interface IActivityNetdomainGroupFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("aaa0cf46-9c90-11e9-9b32-35cf2fd07621")
    public java.lang.Integer Max(final cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.activity.javamodel.IActivityNetdomainGroup activityNetdomainGroup);

  }
  
  public static class ActivityNetdomainGroupFunctionsImpl implements IActivityNetdomainGroupFunctionsImpl {

    public static final IActivityNetdomainGroupFunctionsImpl INSTANCE = new ActivityNetdomainGroupFunctionsImpl();

    private ActivityNetdomainGroupFunctionsImpl() {}

    @Override
    public java.lang.Integer Max(final cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.activity.javamodel.IActivityNetdomainGroup activityNetdomainGroup) {
      /* Begin Protected Region [[aaa0cf46-9c90-11e9-9b32-35cf2fd07621]] */
    	IAbstractGroupFunctions groupFunctions = activityNetdomainGroup.extension(IAbstractGroupFunctions.class);
    	IActivityRootGroups activityRootGroups = groupFunctions.GetRootActivityGroup();    	
    	IActivityRootGroupsFunctions activityRootGroupsFunctions = activityRootGroups.extension(IActivityRootGroupsFunctions.class);
    	int permissionsCount = 1;
    	if( activityRootGroupsFunctions.PermissionCount() != 0) {
    		permissionsCount = activityRootGroupsFunctions.PermissionCount();
    	}
    	int systemConfigurationCount = 1;
    	if( activityRootGroupsFunctions.SystemConfigurationCount() != 0) {
    		systemConfigurationCount = activityRootGroupsFunctions.SystemConfigurationCount();
    	}
    	
    	return permissionsCount * systemConfigurationCount;   
      /* End Protected Region   [[aaa0cf46-9c90-11e9-9b32-35cf2fd07621]] */
    }

  }
  
  public static class ActivityNetdomainGroupFunctions {

    private ActivityNetdomainGroupFunctions() {}

    public static java.lang.Integer Max(final cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.activity.javamodel.IActivityNetdomainGroup activityNetdomainGroup) {
      return DynamicResourceUtil.invoke(IActivityNetdomainGroupFunctionsImpl.class, ActivityNetdomainGroupFunctionsImpl.INSTANCE, activityNetdomainGroup).Max(activityNetdomainGroup);
    }

  }

  public static interface IActivityRootGroupsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("1f3616cb-9c91-11e9-9b32-35cf2fd07621")
    public java.lang.Integer SystemConfigurationCount();

    @IDynamicResourceExtension.MethodId("51a63a8d-9c91-11e9-9b32-35cf2fd07621")
    public java.lang.Integer PermissionCount();

    @IDynamicResourceExtension.MethodId("6024626b-9c98-11e9-9b32-35cf2fd07621")
    public List<cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.activity.javamodel.IActivityNetdomainGroup> AllActivityNetDomaingroups();

  }
  
  public static interface IActivityRootGroupsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ActivityRootGroupsFunctionsImpl implements IActivityRootGroupsFunctionsImpl {

    public static final IActivityRootGroupsFunctionsImpl INSTANCE = new ActivityRootGroupsFunctionsImpl();

    private ActivityRootGroupsFunctionsImpl() {}

  }
  
  public static class ActivityRootGroupsFunctions {

    private ActivityRootGroupsFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,512e5470-7f07-11e9-98a3-b1bd805f0a31,YFtxAXqdNH6ToCl5rFpH/x2VD/Y=] */
