package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[512e5470-7f07-11e9-98a3-b1bd805f0a31,imports]] */
import cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.FunctionSpace_Activity_Deployment.*;
import cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.FunctionSpace_Role.IRoleSystemComponentFunctions;
import cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.RoleSystemComponent;
import cleon.common.resources.metamodel.spec.active.FunctionSpace_Active.IEnabledWithDefaultTrueAwareFunctions;
import java.util.stream.Collectors;
import java.util.ArrayList;

import cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.FunctionSpace_ServiceAccounts.IServiceAccountFunctions;
import cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.role.FunctionSpace_AuthZBuildingBlockForSystemComponent_Actor.IRoleTemplateFunctions;
import cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.javamodel.IServiceAccountTemplate;
import cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.javamodel.ServiceAccount;
import cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel.ActivityTemplateAware;
import cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.role.javamodel.IRoleTemplate;

/* End Protected Region   [[512e5470-7f07-11e9-98a3-b1bd805f0a31,imports]] */

public class FunctionSpace_Activity_Deployment {

  /* Begin Protected Region [[512e5470-7f07-11e9-98a3-b1bd805f0a31]] */
  
  /* End Protected Region   [[512e5470-7f07-11e9-98a3-b1bd805f0a31]] */


  public static interface IActivityPermissionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("236c6c0e-4e0e-11ed-a85e-ff0e1a36b8ae")
    public ch.actifsource.core.javamodel.IDecorator ActivitySiteGroup();

    @IDynamicResourceExtension.MethodId("8e3d374b-04ba-11f0-8e81-9be04e08660a")
    public ch.actifsource.core.javamodel.IDecorator ActivitySystemConfiguration();

    @IDynamicResourceExtension.MethodId("51adcb01-dfed-11ec-8f56-b9160f87f47a")
    public List<ch.actifsource.core.javamodel.IDecorator> AllActivityPermissionInEnvironment();

    @IDynamicResourceExtension.MethodId("f259b386-c56e-11e9-9daa-cf9f9f7341e8")
    public List<ch.actifsource.core.javamodel.IDecorator> AllActivityPermissionInSite();

    @IDynamicResourceExtension.MethodId("947f9071-ae40-11eb-9680-77b158711103")
    public List<ch.actifsource.core.javamodel.IDecorator> AllUsedRoleSystemComponentOnlyEnabledDistinct();

    @IDynamicResourceExtension.MethodId("7b900ced-ae40-11eb-9680-77b158711103")
    public List<ch.actifsource.core.javamodel.IDecorator> AllUsedRoleSystemComponentOnlyEnabled();

    @IDynamicResourceExtension.MethodId("1db46192-8dae-11ed-bb98-e70249753acb")
    public java.lang.String Description(final ch.actifsource.core.javamodel.IDecorator activitySiteGroup);

    @IDynamicResourceExtension.MethodId("f97abbec-016b-11ea-8b45-335c84231cb6")
    public java.lang.String FormatId();

    @IDynamicResourceExtension.MethodId("4982d3d9-6fb0-11eb-a1e4-f1bdb2897690")
    public ch.actifsource.core.javamodel.INamedResource GetAbstractSite();

    @IDynamicResourceExtension.MethodId("601de2c0-0a1e-11eb-a857-d17d567fc174")
    public java.lang.Integer GetId();

    @IDynamicResourceExtension.MethodId("8b08df13-7f26-11e9-9a52-07d4b074defc")
    public ch.actifsource.core.javamodel.INamedResource GetSystemConfiguration();

    @IDynamicResourceExtension.MethodId("295e7d8e-bff2-11e9-80a1-d5ff22ac3c31")
    public java.lang.Boolean HasAccess(final ch.actifsource.core.javamodel.IDecorator role);

    @IDynamicResourceExtension.MethodId("d7ca023b-27eb-11eb-b239-011c2d3c4f88")
    public <T extends ch.actifsource.core.javamodel.IDecorator> List<T> OnlyActiveOrDefaultTrue();

    @IDynamicResourceExtension.MethodId("cd8a84f5-7f27-11e9-9a52-07d4b074defc")
    public java.lang.Integer PermissionCount();

    @IDynamicResourceExtension.MethodId("05d1f501-bff1-11e9-80a1-d5ff22ac3c31")
    public java.lang.String StandardDescription(final ch.actifsource.core.javamodel.IDecorator activitySiteGroup);

    @IDynamicResourceExtension.MethodId("a4552697-0def-11ea-91d3-b3e983305cb0")
    public List<ch.actifsource.core.javamodel.IDecorator> ToRoleSystemComponents();

    @IDynamicResourceExtension.MethodId("28c748b0-7116-11eb-8b0e-e301c2085b42")
    public List<ch.actifsource.core.javamodel.IDecorator> ToServiceAccounts();

    @IDynamicResourceExtension.MethodId("abf2fc43-05ab-11f0-a7b1-53303e9b84a9")
    public java.lang.String UsedIn();

  }
  
  public static interface IActivityPermissionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("f97abbec-016b-11ea-8b45-335c84231cb6")
    public java.lang.String FormatId(final ch.actifsource.core.javamodel.IDecorator activityPermission);

    @IDynamicResourceExtension.MethodId("601de2c0-0a1e-11eb-a857-d17d567fc174")
    public java.lang.Integer GetId(final ch.actifsource.core.javamodel.IDecorator activityPermission);

    @IDynamicResourceExtension.MethodId("295e7d8e-bff2-11e9-80a1-d5ff22ac3c31")
    public java.lang.Boolean HasAccess(final ch.actifsource.core.javamodel.IDecorator role, final ch.actifsource.core.javamodel.IDecorator activityPermission);

    @IDynamicResourceExtension.MethodId("d7ca023b-27eb-11eb-b239-011c2d3c4f88")
    public <T extends ch.actifsource.core.javamodel.IDecorator> List<T> OnlyActiveOrDefaultTrue(final List<T> activityPermissionList);

    @IDynamicResourceExtension.MethodId("a4552697-0def-11ea-91d3-b3e983305cb0")
    public List<ch.actifsource.core.javamodel.IDecorator> ToRoleSystemComponents(final ch.actifsource.core.javamodel.IDecorator activityPermission);

    @IDynamicResourceExtension.MethodId("28c748b0-7116-11eb-8b0e-e301c2085b42")
    public List<ch.actifsource.core.javamodel.IDecorator> ToServiceAccounts(final ch.actifsource.core.javamodel.IDecorator activityPermission);

  }
  
  public static class ActivityPermissionFunctionsImpl implements IActivityPermissionFunctionsImpl {

    public static final IActivityPermissionFunctionsImpl INSTANCE = new ActivityPermissionFunctionsImpl();

    private ActivityPermissionFunctionsImpl() {}

    @Override
    public java.lang.String FormatId(final ch.actifsource.core.javamodel.IDecorator activityPermission) {
      return String.format("%04d", activityPermission.extension(IActivityPermissionFunctions.class).GetId());
    }

    @Override
    public java.lang.Integer GetId(final ch.actifsource.core.javamodel.IDecorator activityPermission) {
      /* Begin Protected Region [[601de2c0-0a1e-11eb-a857-d17d567fc174]] */
      final var activitySiteGroup = activityPermission.extension(IActivityPermissionFunctions.class).ActivitySiteGroup();
      final var activitySiteConfiguration = activityPermission.extension(IActivityPermissionFunctions.class).ActivitySystemConfiguration();
      
      var startAt = 0;
      if( activitySiteConfiguration.selectStartAt() != null ) {
    	  startAt = activitySiteConfiguration.selectStartAt();
      }
      
      return (activitySiteGroup.selectIdentifier() * 100) + startAt + activityPermission.selectActivityTemplate().selectIdentifier();
      /* End Protected Region   [[601de2c0-0a1e-11eb-a857-d17d567fc174]] */
    }

    @Override
    public java.lang.Boolean HasAccess(final ch.actifsource.core.javamodel.IDecorator role, final ch.actifsource.core.javamodel.IDecorator activityPermission) {
      /* Begin Protected Region [[295e7d8e-bff2-11e9-80a1-d5ff22ac3c31]] */
      return role.extension(IRoleSystemComponentFunctions.class).AllActivities().contains(activityPermission);
      /* End Protected Region   [[295e7d8e-bff2-11e9-80a1-d5ff22ac3c31]] */
    }

    @Override
    public <T extends ch.actifsource.core.javamodel.IDecorator> List<T> OnlyActiveOrDefaultTrue(final List<T> activityPermissionList) {
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
    public List<ch.actifsource.core.javamodel.IDecorator> ToRoleSystemComponents(final ch.actifsource.core.javamodel.IDecorator activityPermission) {
      /* Begin Protected Region [[a4552697-0def-11ea-91d3-b3e983305cb0]] */
      final var roleSystemComponentResult = new ArrayList<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent>();
      final var activityPermissionFunctions = activityPermission.extension(IActivityPermissionFunctions.class);
      final var abstractSite = activityPermissionFunctions.GetAbstractSite();

      final var accountTemplatesOnAllSites = ActivityTemplateAware.selectToMeActivityTemplatePermissionOnSites(activityPermission.selectActivityTemplate());
      for(final var accountTemplate  : accountTemplatesOnAllSites.stream().filter(IRoleTemplate.class::isInstance).map(IRoleTemplate.class::cast).collect(Collectors.toList())) {
      	if( accountTemplate instanceof IRoleTemplate) {
      		final var authZBuildingBlockForSystemComponent = accountTemplate;
      		for( final var all : authZBuildingBlockForSystemComponent.extension(IRoleTemplateFunctions.class).AllBasedOnReverse()) {
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

      final var accountTemplatesOnLocalSite = ActivityTemplateAware.selectToMeActivityTemplatePermissionsOnLocalSite(activityPermission.selectActivityTemplate());
      for(final var accountTemplate  : accountTemplatesOnLocalSite.stream().filter(IRoleTemplate.class::isInstance).map(IRoleTemplate.class::cast).collect(Collectors.toList())) {
      	if( accountTemplate instanceof IRoleTemplate) {
      		final var authZBuildingBlockForSystemComponent = accountTemplate;
      		for( final var all : authZBuildingBlockForSystemComponent.extension(IRoleTemplateFunctions.class).AllBasedOnReverse()) {
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
    public List<ch.actifsource.core.javamodel.IDecorator> ToServiceAccounts(final ch.actifsource.core.javamodel.IDecorator activityPermission) {
      /* Begin Protected Region [[28c748b0-7116-11eb-8b0e-e301c2085b42]] */
      final var serviceAccountsResult = new ArrayList<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.javamodel.IServiceAccount>();
      final var activityPermissionFunctions = activityPermission.extension(IActivityPermissionFunctions.class);
      final var abstractSite = activityPermissionFunctions.GetAbstractSite();

      final var serviceAccountTemplates = ActivityTemplateAware.selectToMeActivityTemplatePermissionOnSites(activityPermission.selectActivityTemplate());
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

    public static java.lang.String FormatId(final ch.actifsource.core.javamodel.IDecorator activityPermission) {
      return DynamicResourceUtil.invoke(IActivityPermissionFunctionsImpl.class, ActivityPermissionFunctionsImpl.INSTANCE, activityPermission).FormatId(activityPermission);
    }

    public static java.lang.Integer GetId(final ch.actifsource.core.javamodel.IDecorator activityPermission) {
      return DynamicResourceUtil.invoke(IActivityPermissionFunctionsImpl.class, ActivityPermissionFunctionsImpl.INSTANCE, activityPermission).GetId(activityPermission);
    }

    public static java.lang.Boolean HasAccess(final ch.actifsource.core.javamodel.IDecorator role, final ch.actifsource.core.javamodel.IDecorator activityPermission) {
      return DynamicResourceUtil.invoke(IActivityPermissionFunctionsImpl.class, ActivityPermissionFunctionsImpl.INSTANCE, activityPermission).HasAccess(role, activityPermission);
    }

    public static <T extends ch.actifsource.core.javamodel.IDecorator> List<T> OnlyActiveOrDefaultTrue(final List<T> activityPermissionList) {
      return DynamicResourceUtil.invoke(IActivityPermissionFunctionsImpl.class, ActivityPermissionFunctionsImpl.INSTANCE, activityPermissionList).OnlyActiveOrDefaultTrue(activityPermissionList);
    }

    public static List<ch.actifsource.core.javamodel.IDecorator> ToRoleSystemComponents(final ch.actifsource.core.javamodel.IDecorator activityPermission) {
      return DynamicResourceUtil.invoke(IActivityPermissionFunctionsImpl.class, ActivityPermissionFunctionsImpl.INSTANCE, activityPermission).ToRoleSystemComponents(activityPermission);
    }

    public static List<ch.actifsource.core.javamodel.IDecorator> ToServiceAccounts(final ch.actifsource.core.javamodel.IDecorator activityPermission) {
      return DynamicResourceUtil.invoke(IActivityPermissionFunctionsImpl.class, ActivityPermissionFunctionsImpl.INSTANCE, activityPermission).ToServiceAccounts(activityPermission);
    }

  }

  public static interface IPermissionTemplateFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ae00f0bd-7f27-11e9-9a52-07d4b074defc")
    public java.lang.Integer Count();

  }
  
  public static interface IPermissionTemplateFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class PermissionTemplateFunctionsImpl implements IPermissionTemplateFunctionsImpl {

    public static final IPermissionTemplateFunctionsImpl INSTANCE = new PermissionTemplateFunctionsImpl();

    private PermissionTemplateFunctionsImpl() {}

  }
  
  public static class PermissionTemplateFunctions {

    private PermissionTemplateFunctions() {}

  }

  public static interface IPermissionTemplatesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("6715a024-809a-11e9-8e65-f3f639e40a34")
    public List<ch.actifsource.core.javamodel.INamedResource> AllPermissionTemplatesRecursive();

    @IDynamicResourceExtension.MethodId("84f4910e-809a-11e9-8e65-f3f639e40a34")
    public java.lang.Integer CountAllPermissionTemplates();

    @IDynamicResourceExtension.MethodId("a9b5bf5c-809a-11e9-8e65-f3f639e40a34")
    public List<ch.actifsource.core.javamodel.INamedResource> AllPermissionTemplates();

  }
  
  public static interface IPermissionTemplatesFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class PermissionTemplatesFunctionsImpl implements IPermissionTemplatesFunctionsImpl {

    public static final IPermissionTemplatesFunctionsImpl INSTANCE = new PermissionTemplatesFunctionsImpl();

    private PermissionTemplatesFunctionsImpl() {}

  }
  
  public static class PermissionTemplatesFunctions {

    private PermissionTemplatesFunctions() {}

  }

  public static interface IActivitySiteGroupFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("aaa0cf46-9c90-11e9-9b32-35cf2fd07621")
    public java.lang.Integer Max();

    @IDynamicResourceExtension.MethodId("a5682b11-9c98-11e9-9b32-35cf2fd07621")
    public List<ch.actifsource.core.javamodel.IDecorator> AllActivityPermissions();

    @IDynamicResourceExtension.MethodId("40656397-0d2c-11ea-b914-3dd9896c252a")
    public List<ch.actifsource.core.javamodel.IDecorator> AllAvailableActivityPermissions();

    @IDynamicResourceExtension.MethodId("0bafdc45-4e09-11ed-a85e-ff0e1a36b8ae")
    public ch.actifsource.core.javamodel.IDecorator EnvironmentRBAC();

  }
  
  public static interface IActivitySiteGroupFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("aaa0cf46-9c90-11e9-9b32-35cf2fd07621")
    public java.lang.Integer Max(final ch.actifsource.core.javamodel.IDecorator activitySiteGroup);

  }
  
  public static class ActivitySiteGroupFunctionsImpl implements IActivitySiteGroupFunctionsImpl {

    public static final IActivitySiteGroupFunctionsImpl INSTANCE = new ActivitySiteGroupFunctionsImpl();

    private ActivitySiteGroupFunctionsImpl() {}

    @Override
    public java.lang.Integer Max(final ch.actifsource.core.javamodel.IDecorator activitySiteGroup) {
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

    public static java.lang.Integer Max(final ch.actifsource.core.javamodel.IDecorator activitySiteGroup) {
      return DynamicResourceUtil.invoke(IActivitySiteGroupFunctionsImpl.class, ActivitySiteGroupFunctionsImpl.INSTANCE, activitySiteGroup).Max(activitySiteGroup);
    }

  }

  public static interface IActivityRootGroupsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("1f3616cb-9c91-11e9-9b32-35cf2fd07621")
    public java.lang.Integer SystemConfigurationCount();

    @IDynamicResourceExtension.MethodId("51a63a8d-9c91-11e9-9b32-35cf2fd07621")
    public java.lang.Integer PermissionCount();

    @IDynamicResourceExtension.MethodId("6024626b-9c98-11e9-9b32-35cf2fd07621")
    public List<ch.actifsource.core.javamodel.IDecorator> AllActivitySiteGroups();

    @IDynamicResourceExtension.MethodId("8b3398ac-07d8-11f0-bc12-1bbda1d7028e")
    public List<ch.actifsource.core.javamodel.INamedResource> AllADGroups();

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

  public static interface IActivitySystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fcef0ccb-04bd-11f0-8e81-9be04e08660a")
    public java.lang.String SimpleName();

  }
  
  public static interface IActivitySystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ActivitySystemConfigurationFunctionsImpl implements IActivitySystemConfigurationFunctionsImpl {

    public static final IActivitySystemConfigurationFunctionsImpl INSTANCE = new ActivitySystemConfigurationFunctionsImpl();

    private ActivitySystemConfigurationFunctionsImpl() {}

  }
  
  public static class ActivitySystemConfigurationFunctions {

    private ActivitySystemConfigurationFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,512e5470-7f07-11e9-98a3-b1bd805f0a31,oQQL3yug+3WccyH6n7YXtdvVCQ4=] */
