package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[9fbae63a-0a1c-11eb-a857-d17d567fc174,imports]] */
import cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.FunctionSpace_Accounts.IServiceAccountFunctions;
import cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.FunctionSpace_Activity_Deployment.IActivityPermissionFunctions;
import cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.ActivityPermission;
import cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IActivityPermission;
import cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.FunctionSpace_Role.IRoleSystemComponentFunctions;

import java.util.ArrayList;
/* End Protected Region   [[9fbae63a-0a1c-11eb-a857-d17d567fc174,imports]] */

public class FunctionSpace_Activity_Template {

  /* Begin Protected Region [[9fbae63a-0a1c-11eb-a857-d17d567fc174]] */

  /* End Protected Region   [[9fbae63a-0a1c-11eb-a857-d17d567fc174]] */


  public static interface IAbstractActivityTemplatePermissionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("11904919-0a1d-11eb-a857-d17d567fc174")
    public java.lang.String CommonName();

    @IDynamicResourceExtension.MethodId("4a3a0826-6fab-11eb-a1e4-f1bdb2897690")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IActivityPermission> ToActivePermissions(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.javamodel.IServiceAccount serviceAccount);

    @IDynamicResourceExtension.MethodId("b3a49380-de4c-11eb-b028-df36f0dc7b24")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IActivityPermission> ToActivePermissionsForSites(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent roleSystemComponent);

    @IDynamicResourceExtension.MethodId("16c9702d-53a6-11ed-9288-01a0bbf601b0")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IActivityPermission> ToActivePermissionsForLocalSite(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent roleSystemComponent);

    @IDynamicResourceExtension.MethodId("dc5d1980-864b-11eb-9869-4317e18e6c88")
    public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.system.javamodel.IAbstractSystemOrSystemConfiguration AbstractSystemOrSystemConfiguration();

    @IDynamicResourceExtension.MethodId("2cce0dbb-864c-11eb-9869-4317e18e6c88")
    public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IPermissionTemplate Permission();

    @IDynamicResourceExtension.MethodId("02efc120-864e-11eb-9869-4317e18e6c88")
    public java.lang.String SimpleName();

    @IDynamicResourceExtension.MethodId("76754559-864e-11eb-9869-4317e18e6c88")
    public java.lang.String CommonNameSpecific();

    @IDynamicResourceExtension.MethodId("c258e93e-e44f-11ee-89a2-d75dd4a11557")
    public java.lang.String TypeName();

    @IDynamicResourceExtension.MethodId("42b44a01-07d7-11f0-bc12-1bbda1d7028e")
    public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel.IActivityTemplateForAbstractSystemOrSystemConfiguration AuthZBuildingBlockForAbstractSystemOrSystemConfiguration();

  }
  
  public static interface IAbstractActivityTemplatePermissionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("4a3a0826-6fab-11eb-a1e4-f1bdb2897690")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IActivityPermission> ToActivePermissions(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.javamodel.IServiceAccount serviceAccount, final List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel.IAbstractActivityTemplatePermission> abstractActivityTemplatePermissionList);

    @IDynamicResourceExtension.MethodId("b3a49380-de4c-11eb-b028-df36f0dc7b24")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IActivityPermission> ToActivePermissionsForSites(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent roleSystemComponent, final List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel.IAbstractActivityTemplatePermission> abstractActivityTemplatePermissionList);

    @IDynamicResourceExtension.MethodId("16c9702d-53a6-11ed-9288-01a0bbf601b0")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IActivityPermission> ToActivePermissionsForLocalSite(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent roleSystemComponent, final List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel.IAbstractActivityTemplatePermission> abstractActivityTemplatePermissionList);

  }
  
  public static class AbstractActivityTemplatePermissionFunctionsImpl implements IAbstractActivityTemplatePermissionFunctionsImpl {

    public static final IAbstractActivityTemplatePermissionFunctionsImpl INSTANCE = new AbstractActivityTemplatePermissionFunctionsImpl();

    private AbstractActivityTemplatePermissionFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IActivityPermission> ToActivePermissions(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.javamodel.IServiceAccount serviceAccount, final List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel.IAbstractActivityTemplatePermission> abstractActivityTemplatePermissionList) {
      /* Begin Protected Region [[4a3a0826-6fab-11eb-a1e4-f1bdb2897690]] */
      final var serviceAccountFunctions = serviceAccount.extension(IServiceAccountFunctions.class);
      final var abstractSites = serviceAccountFunctions.GetAllowedSiteForServiceAccount();

      final var activityPermissions = new ArrayList<IActivityPermission>();
      abstractActivityTemplatePermissionList.stream().forEach( x -> {
      	for( final var activityPermission : ActivityPermission.selectToMeActivityTemplate(x) ) {
      		if (!activityPermissions.contains(activityPermission)) {
      			final var activityPermissionFunctions = activityPermission.extension(IActivityPermissionFunctions.class);
      			if( abstractSites.contains(activityPermissionFunctions.GetAbstractSite())) {
      				activityPermissions.add(activityPermission);
      			}
      		}
      	}
      });
      return activityPermissions;
      /* End Protected Region   [[4a3a0826-6fab-11eb-a1e4-f1bdb2897690]] */
    }

    @Override
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IActivityPermission> ToActivePermissionsForSites(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent roleSystemComponent, final List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel.IAbstractActivityTemplatePermission> abstractActivityTemplatePermissionList) {
      /* Begin Protected Region [[b3a49380-de4c-11eb-b028-df36f0dc7b24]] */
      final var roleSystemComponentFunctions = roleSystemComponent.extension(IRoleSystemComponentFunctions.class);
      final var abstractSites = roleSystemComponentFunctions.GetAllowedSiteForRoleSystemComponent();

      final var activityPermissions = new ArrayList<IActivityPermission>();
      abstractActivityTemplatePermissionList.stream().forEach( x -> {
      	for( final var activityPermission : ActivityPermission.selectToMeActivityTemplate(x) ) {
      		if (!activityPermissions.contains(activityPermission)) {
      			final var activityPermissionFunctions = activityPermission.extension(IActivityPermissionFunctions.class);
      			if( abstractSites.contains(activityPermissionFunctions.GetAbstractSite())) {
      				activityPermissions.add(activityPermission);
      			}
      		}
      	}
      });
      return activityPermissions;

      /* End Protected Region   [[b3a49380-de4c-11eb-b028-df36f0dc7b24]] */
    }

    @Override
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IActivityPermission> ToActivePermissionsForLocalSite(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent roleSystemComponent, final List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel.IAbstractActivityTemplatePermission> abstractActivityTemplatePermissionList) {
      /* Begin Protected Region [[16c9702d-53a6-11ed-9288-01a0bbf601b0]] */
      final var roleSystemComponentFunctions = roleSystemComponent.extension(IRoleSystemComponentFunctions.class);
      final var abstractSite = roleSystemComponentFunctions.GetAllowedLocalSiteForRoleSystemComponent();

      final var activityPermissions = new ArrayList<IActivityPermission>();
      abstractActivityTemplatePermissionList.stream().forEach( x -> {
      	for( final var activityPermission : ActivityPermission.selectToMeActivityTemplate(x) ) {
      		if (!activityPermissions.contains(activityPermission)) {
      			final var activityPermissionFunctions = activityPermission.extension(IActivityPermissionFunctions.class);
      			if( abstractSite.equals(activityPermissionFunctions.GetAbstractSite())) {
      				activityPermissions.add(activityPermission);
      			}
      		}
      	}
      });
      return activityPermissions;
      /* End Protected Region   [[16c9702d-53a6-11ed-9288-01a0bbf601b0]] */
    }

  }
  
  public static class AbstractActivityTemplatePermissionFunctions {

    private AbstractActivityTemplatePermissionFunctions() {}

    public static List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IActivityPermission> ToActivePermissions(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.javamodel.IServiceAccount serviceAccount, final List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel.IAbstractActivityTemplatePermission> abstractActivityTemplatePermissionList) {
      return DynamicResourceUtil.invoke(IAbstractActivityTemplatePermissionFunctionsImpl.class, AbstractActivityTemplatePermissionFunctionsImpl.INSTANCE, abstractActivityTemplatePermissionList).ToActivePermissions(serviceAccount, abstractActivityTemplatePermissionList);
    }

    public static List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IActivityPermission> ToActivePermissionsForSites(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent roleSystemComponent, final List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel.IAbstractActivityTemplatePermission> abstractActivityTemplatePermissionList) {
      return DynamicResourceUtil.invoke(IAbstractActivityTemplatePermissionFunctionsImpl.class, AbstractActivityTemplatePermissionFunctionsImpl.INSTANCE, abstractActivityTemplatePermissionList).ToActivePermissionsForSites(roleSystemComponent, abstractActivityTemplatePermissionList);
    }

    public static List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IActivityPermission> ToActivePermissionsForLocalSite(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent roleSystemComponent, final List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel.IAbstractActivityTemplatePermission> abstractActivityTemplatePermissionList) {
      return DynamicResourceUtil.invoke(IAbstractActivityTemplatePermissionFunctionsImpl.class, AbstractActivityTemplatePermissionFunctionsImpl.INSTANCE, abstractActivityTemplatePermissionList).ToActivePermissionsForLocalSite(roleSystemComponent, abstractActivityTemplatePermissionList);
    }

  }

  public static interface IActivityTemplatePermissionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f5ec10ef-864b-11eb-9869-4317e18e6c88")
    public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.system.javamodel.IAbstractSystemOrSystemConfiguration AbstractSystemOrSystemConfiguration();

    @IDynamicResourceExtension.MethodId("5298e41e-07d7-11f0-bc12-1bbda1d7028e")
    public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel.IActivityTemplateForAbstractSystemOrSystemConfiguration AuthZBuildingBlockForAbstractSystemOrSystemConfiguration();

    @IDynamicResourceExtension.MethodId("35ba7315-864c-11eb-9869-4317e18e6c88")
    public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IPermissionTemplate Permission();

    @IDynamicResourceExtension.MethodId("11848368-864e-11eb-9869-4317e18e6c88")
    public java.lang.String SimpleName();

    @IDynamicResourceExtension.MethodId("db1f3ad7-864e-11eb-9869-4317e18e6c88")
    public java.lang.String CommonNameSpecific();

    @IDynamicResourceExtension.MethodId("d46fde89-e44d-11ee-89a2-d75dd4a11557")
    public java.lang.String TypeName();

  }
  
  public static interface IActivityTemplatePermissionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ActivityTemplatePermissionFunctionsImpl implements IActivityTemplatePermissionFunctionsImpl {

    public static final IActivityTemplatePermissionFunctionsImpl INSTANCE = new ActivityTemplatePermissionFunctionsImpl();

    private ActivityTemplatePermissionFunctionsImpl() {}

  }
  
  public static class ActivityTemplatePermissionFunctions {

    private ActivityTemplatePermissionFunctions() {}

  }

  public static interface IActivityTemplatePropertyPermissionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4011ca15-d5bf-11ec-ad12-8d6f8e00bc94")
    public java.lang.String SimpleName();

    @IDynamicResourceExtension.MethodId("4011ca1e-d5bf-11ec-ad12-8d6f8e00bc94")
    public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.system.javamodel.IAbstractSystemOrSystemConfiguration AbstractSystemOrSystemConfiguration();

    @IDynamicResourceExtension.MethodId("625a3fb2-07d7-11f0-bc12-1bbda1d7028e")
    public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel.IActivityTemplateForAbstractSystemOrSystemConfiguration AuthZBuildingBlockForAbstractSystemOrSystemConfiguration();

    @IDynamicResourceExtension.MethodId("4011ca27-d5bf-11ec-ad12-8d6f8e00bc94")
    public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IPermissionTemplate Permission();

    @IDynamicResourceExtension.MethodId("4011ca3b-d5bf-11ec-ad12-8d6f8e00bc94")
    public java.lang.String CommonNameSpecific();

    @IDynamicResourceExtension.MethodId("39e01fe9-e450-11ee-89a2-d75dd4a11557")
    public java.lang.String TypeName();

  }
  
  public static interface IActivityTemplatePropertyPermissionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ActivityTemplatePropertyPermissionFunctionsImpl implements IActivityTemplatePropertyPermissionFunctionsImpl {

    public static final IActivityTemplatePropertyPermissionFunctionsImpl INSTANCE = new ActivityTemplatePropertyPermissionFunctionsImpl();

    private ActivityTemplatePropertyPermissionFunctionsImpl() {}

  }
  
  public static class ActivityTemplatePropertyPermissionFunctions {

    private ActivityTemplatePropertyPermissionFunctions() {}

  }

  public static interface IActivityTemplateForSystemFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("aa464d71-4bd3-11ed-bcee-57344264bda3")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.system.javamodel.IAbstractSystemOrSystemConfiguration> AllRelevantComponentsForAuthZBuildingBlockForSystem();

  }
  
  public static interface IActivityTemplateForSystemFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ActivityTemplateForSystemFunctionsImpl implements IActivityTemplateForSystemFunctionsImpl {

    public static final IActivityTemplateForSystemFunctionsImpl INSTANCE = new ActivityTemplateForSystemFunctionsImpl();

    private ActivityTemplateForSystemFunctionsImpl() {}

  }
  
  public static class ActivityTemplateForSystemFunctions {

    private ActivityTemplateForSystemFunctions() {}

  }

  public static interface IActivityTemplateForAbstractSystemOrSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e73b564e-4c9f-11ed-b0be-c9d58a207ca0")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel.IAbstractActivityTemplatePermission> AllPermissions();

    @IDynamicResourceExtension.MethodId("15c3a72e-04b9-11f0-8e81-9be04e08660a")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel.IAbstractActivityTemplatePermission> AllPermissionWithDependsOn();

    @IDynamicResourceExtension.MethodId("835a2845-04b9-11f0-8e81-9be04e08660a")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel.IAbstractActivityTemplatePermission> AlllPermissionsFromDependsOn();

    @IDynamicResourceExtension.MethodId("8e7888ce-04b9-11f0-8e81-9be04e08660a")
    public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration SystemConfiguration();

    @IDynamicResourceExtension.MethodId("0d8d6bf9-04bc-11f0-8e81-9be04e08660a")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.system.javamodel.IAbstractSystemOrSystemConfiguration> AllDependsTo();

    @IDynamicResourceExtension.MethodId("91d66a43-07d2-11f0-bc12-1bbda1d7028e")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IPermissionTemplate> AllPermissionsTemplates();

  }
  
  public static interface IActivityTemplateForAbstractSystemOrSystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ActivityTemplateForAbstractSystemOrSystemConfigurationFunctionsImpl implements IActivityTemplateForAbstractSystemOrSystemConfigurationFunctionsImpl {

    public static final IActivityTemplateForAbstractSystemOrSystemConfigurationFunctionsImpl INSTANCE = new ActivityTemplateForAbstractSystemOrSystemConfigurationFunctionsImpl();

    private ActivityTemplateForAbstractSystemOrSystemConfigurationFunctionsImpl() {}

  }
  
  public static class ActivityTemplateForAbstractSystemOrSystemConfigurationFunctions {

    private ActivityTemplateForAbstractSystemOrSystemConfigurationFunctions() {}

  }

  public static interface IActivityTemplateAwareFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b7d4ff36-0fd7-11f0-999f-c7e64e984aff")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> GetSystemConfigurationDependencies();

  }
  
  public static interface IActivityTemplateAwareFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ActivityTemplateAwareFunctionsImpl implements IActivityTemplateAwareFunctionsImpl {

    public static final IActivityTemplateAwareFunctionsImpl INSTANCE = new ActivityTemplateAwareFunctionsImpl();

    private ActivityTemplateAwareFunctionsImpl() {}

  }
  
  public static class ActivityTemplateAwareFunctions {

    private ActivityTemplateAwareFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,9fbae63a-0a1c-11eb-a857-d17d567fc174,b5VY+XU+dIrx7e7ZbxngDadsUFw=] */
