package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[512e5470-7f07-11e9-98a3-b1bd805f0a31,imports]] */
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.FunctionSpace_AuthZ_Deployment.*;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.role.FunctionSpace_Role.IRoleSystemComponentFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.role.javamodel.RoleSystemComponent;
import cleon.common.resources.metamodel.spec.active.FunctionSpace_Active.IEnabledWithDefaultTrueAwareFunctions;
import java.util.stream.Collectors;
import java.util.ArrayList;

import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.FunctionSpace_Accounts.IServiceAccountFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.javamodel.IServiceAccountTemplate;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.javamodel.ServiceAccount;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.buildingblock.activity.javamodel.ActivityTemplateAware;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.buildingblock.actor.FunctionSpace_AuthZBuildingBlockForSystemComponent_Actor.IAuthZBuildingBlockForSystemComponentFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.buildingblock.actor.javamodel.IAuthZBuildingBlockForSystemComponent;

/* End Protected Region   [[512e5470-7f07-11e9-98a3-b1bd805f0a31,imports]] */

public class FunctionSpace_Activity_Deployment {

  /* Begin Protected Region [[512e5470-7f07-11e9-98a3-b1bd805f0a31]] */

  /* End Protected Region   [[512e5470-7f07-11e9-98a3-b1bd805f0a31]] */


  public static interface IActivityPermissionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8b08df13-7f26-11e9-9a52-07d4b074defc")
    public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration GetSystemConfiguration();

    @IDynamicResourceExtension.MethodId("cd8a84f5-7f27-11e9-9a52-07d4b074defc")
    public java.lang.Integer PermissionCount();

    @IDynamicResourceExtension.MethodId("f259b386-c56e-11e9-9daa-cf9f9f7341e8")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IActivityPermission> AllActivityPermissionInSite();

    @IDynamicResourceExtension.MethodId("51adcb01-dfed-11ec-8f56-b9160f87f47a")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IActivityPermission> AllActivityPermissionInEnvironment();

    @IDynamicResourceExtension.MethodId("f97abbec-016b-11ea-8b45-335c84231cb6")
    public java.lang.String FormatId();

    @IDynamicResourceExtension.MethodId("a4552697-0def-11ea-91d3-b3e983305cb0")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent> ToRoleSystemComponents();

    @IDynamicResourceExtension.MethodId("601de2c0-0a1e-11eb-a857-d17d567fc174")
    public java.lang.Integer GetId();

    @IDynamicResourceExtension.MethodId("d7ca023b-27eb-11eb-b239-011c2d3c4f88")
    public <T extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IActivityPermission> List<T> OnlyActiveOrDefaultTrue();

    @IDynamicResourceExtension.MethodId("05d1f501-bff1-11e9-80a1-d5ff22ac3c31")
    public java.lang.String StandardDescription(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IActivitySiteGroup activitySiteGroup);

    @IDynamicResourceExtension.MethodId("295e7d8e-bff2-11e9-80a1-d5ff22ac3c31")
    public java.lang.Boolean HasAccess(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent role);

    @IDynamicResourceExtension.MethodId("4982d3d9-6fb0-11eb-a1e4-f1bdb2897690")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite GetAbstractSite();

    @IDynamicResourceExtension.MethodId("28c748b0-7116-11eb-8b0e-e301c2085b42")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.javamodel.IServiceAccount> ToServiceAccounts();

    @IDynamicResourceExtension.MethodId("7b900ced-ae40-11eb-9680-77b158711103")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent> AllUsedRoleSystemComponentOnlyEnabled();

    @IDynamicResourceExtension.MethodId("947f9071-ae40-11eb-9680-77b158711103")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent> AllUsedRoleSystemComponentOnlyEnabledDistinct();

    @IDynamicResourceExtension.MethodId("236c6c0e-4e0e-11ed-a85e-ff0e1a36b8ae")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IActivitySiteGroup ActivitySiteGroup();

    @IDynamicResourceExtension.MethodId("1db46192-8dae-11ed-bb98-e70249753acb")
    public java.lang.String Description(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IActivitySiteGroup activitySiteGroup);

  }
  
  public static interface IActivityPermissionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("f97abbec-016b-11ea-8b45-335c84231cb6")
    public java.lang.String FormatId(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IActivityPermission activityPermission);

    @IDynamicResourceExtension.MethodId("a4552697-0def-11ea-91d3-b3e983305cb0")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent> ToRoleSystemComponents(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IActivityPermission activityPermission);

    @IDynamicResourceExtension.MethodId("601de2c0-0a1e-11eb-a857-d17d567fc174")
    public java.lang.Integer GetId(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IActivityPermission activityPermission);

    @IDynamicResourceExtension.MethodId("d7ca023b-27eb-11eb-b239-011c2d3c4f88")
    public <T extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IActivityPermission> List<T> OnlyActiveOrDefaultTrue(final List<T> activityPermissionList);

    @IDynamicResourceExtension.MethodId("295e7d8e-bff2-11e9-80a1-d5ff22ac3c31")
    public java.lang.Boolean HasAccess(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent role, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IActivityPermission activityPermission);

    @IDynamicResourceExtension.MethodId("28c748b0-7116-11eb-8b0e-e301c2085b42")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.javamodel.IServiceAccount> ToServiceAccounts(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IActivityPermission activityPermission);

  }
  
  public static class ActivityPermissionFunctionsImpl implements IActivityPermissionFunctionsImpl {

    public static final IActivityPermissionFunctionsImpl INSTANCE = new ActivityPermissionFunctionsImpl();

    private ActivityPermissionFunctionsImpl() {}

    @Override
    public java.lang.String FormatId(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IActivityPermission activityPermission) {
      return String.format("A%04d", activityPermission.extension(IActivityPermissionFunctions.class).GetId());
    }

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent> ToRoleSystemComponents(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IActivityPermission activityPermission) {
      /* Begin Protected Region [[a4552697-0def-11ea-91d3-b3e983305cb0]] */
      final var roleSystemComponentResult = new ArrayList<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent>();
      final var activityPermissionFunctions = activityPermission.extension(IActivityPermissionFunctions.class);
      final var abstractSite = activityPermissionFunctions.GetAbstractSite();

      final var accountTemplatesOnAllSites = ActivityTemplateAware.selectToMeActivityTemplatesOnSites(activityPermission.selectActivityTemplate());
      for(final var accountTemplate  : accountTemplatesOnAllSites.stream().filter(IAuthZBuildingBlockForSystemComponent.class::isInstance).map(IAuthZBuildingBlockForSystemComponent.class::cast).collect(Collectors.toList())) {
      	if( accountTemplate instanceof IAuthZBuildingBlockForSystemComponent) {
      		final var authZBuildingBlockForSystemComponent = accountTemplate;
      		for( final var all : authZBuildingBlockForSystemComponent.extension(IAuthZBuildingBlockForSystemComponentFunctions.class).AllBasedOnReverse()) {
      			for( final var roleSystemComponent : RoleSystemComponent.selectToMeSystemComponentRoleTemplate(all)) {
      				if( roleSystemComponent.selectExcludeActivities().contains(activityPermission)) {
      					continue;
      				}

      				final var roleSystemComponentFunctions = roleSystemComponent.extension(IRoleSystemComponentFunctions.class);
      				final var abstractSites = roleSystemComponentFunctions.GetAllowedSiteForRoleSystemComponent();
      				if( abstractSites.contains(abstractSite) && !roleSystemComponentResult.contains(roleSystemComponent)) {
      					roleSystemComponentResult.add(roleSystemComponent);
      				}
      			}
      		}
      	}
      }

      final var accountTemplatesOnLocalSite = ActivityTemplateAware.selectToMeActivityTemplatesOnLocalSite(activityPermission.selectActivityTemplate());
      for(final var accountTemplate  : accountTemplatesOnLocalSite.stream().filter(IAuthZBuildingBlockForSystemComponent.class::isInstance).map(IAuthZBuildingBlockForSystemComponent.class::cast).collect(Collectors.toList())) {
      	if( accountTemplate instanceof IAuthZBuildingBlockForSystemComponent) {
      		final var authZBuildingBlockForSystemComponent = accountTemplate;
      		for( final var all : authZBuildingBlockForSystemComponent.extension(IAuthZBuildingBlockForSystemComponentFunctions.class).AllBasedOnReverse()) {
      			for( final var roleSystemComponent : RoleSystemComponent.selectToMeSystemComponentRoleTemplate(all)) {
      				if( roleSystemComponent.selectExcludeActivities().contains(activityPermission)) {
      					continue;
      				}

      				final var roleSystemComponentFunctions = roleSystemComponent.extension(IRoleSystemComponentFunctions.class);
      				final var abstractSites = roleSystemComponentFunctions.GetAllowedLocalSiteForRoleSystemComponent();
      				if( abstractSites.equals(abstractSite) && !roleSystemComponentResult.contains(roleSystemComponent)) {
      					roleSystemComponentResult.add(roleSystemComponent);
      				}
      			}
      		}
      	}
      }

      return roleSystemComponentResult;
      /* End Protected Region   [[a4552697-0def-11ea-91d3-b3e983305cb0]] */
    }

    @Override
    public java.lang.Integer GetId(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IActivityPermission activityPermission) {
      /* Begin Protected Region [[601de2c0-0a1e-11eb-a857-d17d567fc174]] */
      final var activitySiteGroup = activityPermission.extension(IActivityPermissionFunctions.class).ActivitySiteGroup();
      return activitySiteGroup.selectIdentifier() * 100 + activityPermission.selectActivityTemplate().selectIdentifier();
      /* End Protected Region   [[601de2c0-0a1e-11eb-a857-d17d567fc174]] */
    }

    @Override
    public <T extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IActivityPermission> List<T> OnlyActiveOrDefaultTrue(final List<T> activityPermissionList) {
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
    public java.lang.Boolean HasAccess(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent role, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IActivityPermission activityPermission) {
      /* Begin Protected Region [[295e7d8e-bff2-11e9-80a1-d5ff22ac3c31]] */
      return role.extension(IRoleSystemComponentFunctions.class).AllActivities().contains(activityPermission);
      /* End Protected Region   [[295e7d8e-bff2-11e9-80a1-d5ff22ac3c31]] */
    }

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.javamodel.IServiceAccount> ToServiceAccounts(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IActivityPermission activityPermission) {
      /* Begin Protected Region [[28c748b0-7116-11eb-8b0e-e301c2085b42]] */
      final var serviceAccountsResult = new ArrayList<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.javamodel.IServiceAccount>();
      final var activityPermissionFunctions = activityPermission.extension(IActivityPermissionFunctions.class);
      final var abstractSite = activityPermissionFunctions.GetAbstractSite();

      final var serviceAccountTemplates = ActivityTemplateAware.selectToMeActivityTemplatesOnSites(activityPermission.selectActivityTemplate());
      for(final var serviceAccountTemplate  : serviceAccountTemplates ) {
      	if( !(serviceAccountTemplate instanceof IServiceAccountTemplate) ) {
      		continue;
      	}

      	final var serviceAccounts = ServiceAccount.selectToMeServiceAccountTemplate((IServiceAccountTemplate)serviceAccountTemplate);
      	for( final var serviceAccount : serviceAccounts ) {
      		final var serviceAccountFunctions = serviceAccount.extension(IServiceAccountFunctions.class);
      		final var abstractSites = serviceAccountFunctions.GetAllowedSiteForServiceAccount();
      		if( abstractSites.contains(abstractSite) && !serviceAccountsResult.contains(serviceAccount)) {
      			serviceAccountsResult.add(serviceAccount);
      		}
      	}
      }
      return serviceAccountsResult;
      /* End Protected Region   [[28c748b0-7116-11eb-8b0e-e301c2085b42]] */
    }

  }
  
  public static class ActivityPermissionFunctions {

    private ActivityPermissionFunctions() {}

    public static java.lang.String FormatId(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IActivityPermission activityPermission) {
      return DynamicResourceUtil.invoke(IActivityPermissionFunctionsImpl.class, ActivityPermissionFunctionsImpl.INSTANCE, activityPermission).FormatId(activityPermission);
    }

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent> ToRoleSystemComponents(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IActivityPermission activityPermission) {
      return DynamicResourceUtil.invoke(IActivityPermissionFunctionsImpl.class, ActivityPermissionFunctionsImpl.INSTANCE, activityPermission).ToRoleSystemComponents(activityPermission);
    }

    public static java.lang.Integer GetId(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IActivityPermission activityPermission) {
      return DynamicResourceUtil.invoke(IActivityPermissionFunctionsImpl.class, ActivityPermissionFunctionsImpl.INSTANCE, activityPermission).GetId(activityPermission);
    }

    public static <T extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IActivityPermission> List<T> OnlyActiveOrDefaultTrue(final List<T> activityPermissionList) {
      return DynamicResourceUtil.invoke(IActivityPermissionFunctionsImpl.class, ActivityPermissionFunctionsImpl.INSTANCE, activityPermissionList).OnlyActiveOrDefaultTrue(activityPermissionList);
    }

    public static java.lang.Boolean HasAccess(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent role, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IActivityPermission activityPermission) {
      return DynamicResourceUtil.invoke(IActivityPermissionFunctionsImpl.class, ActivityPermissionFunctionsImpl.INSTANCE, activityPermission).HasAccess(role, activityPermission);
    }

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.javamodel.IServiceAccount> ToServiceAccounts(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IActivityPermission activityPermission) {
      return DynamicResourceUtil.invoke(IActivityPermissionFunctionsImpl.class, ActivityPermissionFunctionsImpl.INSTANCE, activityPermission).ToServiceAccounts(activityPermission);
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
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IPermissions> AllPermissions();

    @IDynamicResourceExtension.MethodId("84f4910e-809a-11e9-8e65-f3f639e40a34")
    public java.lang.Integer CountAllPermission();

    @IDynamicResourceExtension.MethodId("a9b5bf5c-809a-11e9-8e65-f3f639e40a34")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IPermission> AllPermission();

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
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IActivityPermission> AllActivityPermissions();

    @IDynamicResourceExtension.MethodId("40656397-0d2c-11ea-b914-3dd9896c252a")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IActivityPermission> AllAvailableActivityPermissions();

    @IDynamicResourceExtension.MethodId("0bafdc45-4e09-11ed-a85e-ff0e1a36b8ae")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.javamodel.IEnvironmentRBAC EnvironmentRBAC();

  }
  
  public static interface IActivitySiteGroupFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("aaa0cf46-9c90-11e9-9b32-35cf2fd07621")
    public java.lang.Integer Max(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IActivitySiteGroup activitySiteGroup);

  }
  
  public static class ActivitySiteGroupFunctionsImpl implements IActivitySiteGroupFunctionsImpl {

    public static final IActivitySiteGroupFunctionsImpl INSTANCE = new ActivitySiteGroupFunctionsImpl();

    private ActivitySiteGroupFunctionsImpl() {}

    @Override
    public java.lang.Integer Max(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IActivitySiteGroup activitySiteGroup) {
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

    public static java.lang.Integer Max(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IActivitySiteGroup activitySiteGroup) {
      return DynamicResourceUtil.invoke(IActivitySiteGroupFunctionsImpl.class, ActivitySiteGroupFunctionsImpl.INSTANCE, activitySiteGroup).Max(activitySiteGroup);
    }

  }

  public static interface IActivityRootGroupsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("1f3616cb-9c91-11e9-9b32-35cf2fd07621")
    public java.lang.Integer SystemConfigurationCount();

    @IDynamicResourceExtension.MethodId("51a63a8d-9c91-11e9-9b32-35cf2fd07621")
    public java.lang.Integer PermissionCount();

    @IDynamicResourceExtension.MethodId("6024626b-9c98-11e9-9b32-35cf2fd07621")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IActivitySiteGroup> AllActivitySiteGroups();

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

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,512e5470-7f07-11e9-98a3-b1bd805f0a31,CfMTN1uPIpB5GfPJY/vz0coU3aw=] */
