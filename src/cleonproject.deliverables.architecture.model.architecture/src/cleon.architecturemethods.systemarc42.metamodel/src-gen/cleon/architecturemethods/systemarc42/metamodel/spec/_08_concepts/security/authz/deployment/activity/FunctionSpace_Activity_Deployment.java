package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[512e5470-7f07-11e9-98a3-b1bd805f0a31,imports]] */
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.FunctionSpace_AuthZ_Deployment.*;
import cleon.common.resources.metamodel.spec.active.FunctionSpace_Active.IEnabledWithDefaultTrueAwareFunctions;
import java.util.stream.Collectors;
/* End Protected Region   [[512e5470-7f07-11e9-98a3-b1bd805f0a31,imports]] */

public class FunctionSpace_Activity_Deployment {

  /* Begin Protected Region [[512e5470-7f07-11e9-98a3-b1bd805f0a31]] */

  /* End Protected Region   [[512e5470-7f07-11e9-98a3-b1bd805f0a31]] */


  public static interface IActivityPermissionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8b08df13-7f26-11e9-9a52-07d4b074defc")
    public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration GetSystemConfiguration();

    @IDynamicResourceExtension.MethodId("188608b0-7f27-11e9-9a52-07d4b074defc")
    public java.lang.Integer GetSystemConfigurationId();

    @IDynamicResourceExtension.MethodId("cd8a84f5-7f27-11e9-9a52-07d4b074defc")
    public java.lang.Integer PermissionCount();

    @IDynamicResourceExtension.MethodId("f259b386-c56e-11e9-9daa-cf9f9f7341e8")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityPermission> AllActivityPermissionInDomain();

    @IDynamicResourceExtension.MethodId("f97abbec-016b-11ea-8b45-335c84231cb6")
    public java.lang.String FormatId();

    @IDynamicResourceExtension.MethodId("a4552697-0def-11ea-91d3-b3e983305cb0")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.role.javamodel.IRoleSystemComponent> AllUsedRoleSystemComponent();

    @IDynamicResourceExtension.MethodId("e76ea796-0a1d-11eb-a857-d17d567fc174")
    public java.lang.String GetIdAsString();

    @IDynamicResourceExtension.MethodId("601de2c0-0a1e-11eb-a857-d17d567fc174")
    public java.lang.Integer GetId();

    @IDynamicResourceExtension.MethodId("d7ca023b-27eb-11eb-b239-011c2d3c4f88")
    public <T extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityPermission> List<T> OnlyActiveOrDefaultTrue();

    @IDynamicResourceExtension.MethodId("05d1f501-bff1-11e9-80a1-d5ff22ac3c31")
    public java.lang.String Description(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivitySiteGroup netDomainGroup);

    @IDynamicResourceExtension.MethodId("295e7d8e-bff2-11e9-80a1-d5ff22ac3c31")
    public java.lang.Boolean HasAccess(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.role.javamodel.IRoleSystemComponent role);

    @IDynamicResourceExtension.MethodId("4982d3d9-6fb0-11eb-a1e4-f1bdb2897690")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite GetAbstractSite();

    @IDynamicResourceExtension.MethodId("28c748b0-7116-11eb-8b0e-e301c2085b42")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IServiceAccount> ToServiceAccount();

  }
  
  public static interface IActivityPermissionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("f97abbec-016b-11ea-8b45-335c84231cb6")
    public java.lang.String FormatId(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityPermission activityPermission);

    @IDynamicResourceExtension.MethodId("601de2c0-0a1e-11eb-a857-d17d567fc174")
    public java.lang.Integer GetId(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityPermission activityPermission);

    @IDynamicResourceExtension.MethodId("d7ca023b-27eb-11eb-b239-011c2d3c4f88")
    public <T extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityPermission> List<T> OnlyActiveOrDefaultTrue(final List<T> activityPermissionList);

    @IDynamicResourceExtension.MethodId("295e7d8e-bff2-11e9-80a1-d5ff22ac3c31")
    public java.lang.Boolean HasAccess(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.role.javamodel.IRoleSystemComponent role, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityPermission activityPermission);

    @IDynamicResourceExtension.MethodId("28c748b0-7116-11eb-8b0e-e301c2085b42")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IServiceAccount> ToServiceAccount(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityPermission> activityPermissionList);

  }
  
  public static class ActivityPermissionFunctionsImpl implements IActivityPermissionFunctionsImpl {

    public static final IActivityPermissionFunctionsImpl INSTANCE = new ActivityPermissionFunctionsImpl();

    private ActivityPermissionFunctionsImpl() {}

    @Override
    public java.lang.String FormatId(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityPermission activityPermission) {
      return String.format("A%04d", activityPermission.extension(IActivityPermissionFunctions.class).GetId());
    }

    @Override
    public java.lang.Integer GetId(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityPermission activityPermission) {
      /* Begin Protected Region [[601de2c0-0a1e-11eb-a857-d17d567fc174]] */
      return Integer.valueOf(activityPermission.extension(IActivityPermissionFunctions.class).GetIdAsString());
      /* End Protected Region   [[601de2c0-0a1e-11eb-a857-d17d567fc174]] */
    }

    @Override
    public <T extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityPermission> List<T> OnlyActiveOrDefaultTrue(final List<T> activityPermissionList) {
      /* Begin Protected Region [[d7ca023b-27eb-11eb-b239-011c2d3c4f88]] */
      return activityPermissionList.stream().filter(x -> {
      	if (!x.selectActivityTemplate().extension(IEnabledWithDefaultTrueAwareFunctions.class)
      			.IsActiveOrDefaultTrue()) {
      		return false;
      	}
      	return x.extension(IEnabledWithDefaultTrueAwareFunctions.class).IsActiveOrDefaultTrue();
      }).collect(Collectors.toList());
      /* End Protected Region   [[d7ca023b-27eb-11eb-b239-011c2d3c4f88]] */
    }

    @Override
    public java.lang.Boolean HasAccess(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.role.javamodel.IRoleSystemComponent role, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityPermission activityPermission) {
      /* Begin Protected Region [[295e7d8e-bff2-11e9-80a1-d5ff22ac3c31]] */
      return role.selectHasActivities().contains(activityPermission);
      /* End Protected Region   [[295e7d8e-bff2-11e9-80a1-d5ff22ac3c31]] */
    }

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IServiceAccount> ToServiceAccount(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityPermission> activityPermissionList) {
      /* Begin Protected Region [[28c748b0-7116-11eb-8b0e-e301c2085b42]] */
      for( final var activityPermission : activityPermissionList) {
      	activityPermission.extension(IActivityPermissionFunctions.class);

      	//var serviceAccountz = ServiceAccount.selectToMeServiceAccountTemplate(activityPermission.selectActivityTemplate());

      }
      return null;
      /* End Protected Region   [[28c748b0-7116-11eb-8b0e-e301c2085b42]] */
    }

  }
  
  public static class ActivityPermissionFunctions {

    private ActivityPermissionFunctions() {}

    public static java.lang.String FormatId(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityPermission activityPermission) {
      return DynamicResourceUtil.invoke(IActivityPermissionFunctionsImpl.class, ActivityPermissionFunctionsImpl.INSTANCE, activityPermission).FormatId(activityPermission);
    }

    public static java.lang.Integer GetId(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityPermission activityPermission) {
      return DynamicResourceUtil.invoke(IActivityPermissionFunctionsImpl.class, ActivityPermissionFunctionsImpl.INSTANCE, activityPermission).GetId(activityPermission);
    }

    public static <T extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityPermission> List<T> OnlyActiveOrDefaultTrue(final List<T> activityPermissionList) {
      return DynamicResourceUtil.invoke(IActivityPermissionFunctionsImpl.class, ActivityPermissionFunctionsImpl.INSTANCE, activityPermissionList).OnlyActiveOrDefaultTrue(activityPermissionList);
    }

    public static java.lang.Boolean HasAccess(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.role.javamodel.IRoleSystemComponent role, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityPermission activityPermission) {
      return DynamicResourceUtil.invoke(IActivityPermissionFunctionsImpl.class, ActivityPermissionFunctionsImpl.INSTANCE, activityPermission).HasAccess(role, activityPermission);
    }

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IServiceAccount> ToServiceAccount(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityPermission> activityPermissionList) {
      return DynamicResourceUtil.invoke(IActivityPermissionFunctionsImpl.class, ActivityPermissionFunctionsImpl.INSTANCE, activityPermissionList).ToServiceAccount(activityPermissionList);
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
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IPermissions> AllPermissions();

    @IDynamicResourceExtension.MethodId("84f4910e-809a-11e9-8e65-f3f639e40a34")
    public java.lang.Integer CountAllPermission();

    @IDynamicResourceExtension.MethodId("a9b5bf5c-809a-11e9-8e65-f3f639e40a34")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IPermission> AllPermission();

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

  public static interface IActivitySiteGroupFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("aaa0cf46-9c90-11e9-9b32-35cf2fd07621")
    public java.lang.Integer Max();

    @IDynamicResourceExtension.MethodId("a5682b11-9c98-11e9-9b32-35cf2fd07621")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityPermission> AllActivityPermissions();

    @IDynamicResourceExtension.MethodId("40656397-0d2c-11ea-b914-3dd9896c252a")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityPermission> AllAvailableActivityPermissions();

  }
  
  public static interface IActivitySiteGroupFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("aaa0cf46-9c90-11e9-9b32-35cf2fd07621")
    public java.lang.Integer Max(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivitySiteGroup activitySiteGroup);

  }
  
  public static class ActivitySiteGroupFunctionsImpl implements IActivitySiteGroupFunctionsImpl {

    public static final IActivitySiteGroupFunctionsImpl INSTANCE = new ActivitySiteGroupFunctionsImpl();

    private ActivitySiteGroupFunctionsImpl() {}

    @Override
    public java.lang.Integer Max(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivitySiteGroup activitySiteGroup) {
      /* Begin Protected Region [[aaa0cf46-9c90-11e9-9b32-35cf2fd07621]] */
      final var groupFunctions = activitySiteGroup.extension(IAbstractGroupFunctions.class);
      final var activityRootGroups = groupFunctions.GetRootActivityGroup();
      final var activityRootGroupsFunctions = activityRootGroups
      		.extension(IActivityRootGroupsFunctions.class);
      var permissionsCount = 1;
      if (activityRootGroupsFunctions.PermissionCount() != 0) {
      	permissionsCount = activityRootGroupsFunctions.PermissionCount();
      }
      var systemConfigurationCount = 1;
      if (activityRootGroupsFunctions.SystemConfigurationCount() != 0) {
      	systemConfigurationCount = activityRootGroupsFunctions.SystemConfigurationCount();
      }

      return permissionsCount * systemConfigurationCount;
      /* End Protected Region   [[aaa0cf46-9c90-11e9-9b32-35cf2fd07621]] */
    }

  }
  
  public static class ActivitySiteGroupFunctions {

    private ActivitySiteGroupFunctions() {}

    public static java.lang.Integer Max(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivitySiteGroup activitySiteGroup) {
      return DynamicResourceUtil.invoke(IActivitySiteGroupFunctionsImpl.class, ActivitySiteGroupFunctionsImpl.INSTANCE, activitySiteGroup).Max(activitySiteGroup);
    }

  }

  public static interface IActivityRootGroupsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("1f3616cb-9c91-11e9-9b32-35cf2fd07621")
    public java.lang.Integer SystemConfigurationCount();

    @IDynamicResourceExtension.MethodId("51a63a8d-9c91-11e9-9b32-35cf2fd07621")
    public java.lang.Integer PermissionCount();

    @IDynamicResourceExtension.MethodId("6024626b-9c98-11e9-9b32-35cf2fd07621")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivitySiteGroup> AllActivityNetDomaingroups();

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

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,512e5470-7f07-11e9-98a3-b1bd805f0a31,I1WrBAxADhzL4X8eqL87fMjsXOQ=] */
