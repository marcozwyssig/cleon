package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.buildingblock.activity;

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

public class FunctionSpace_Activity_Buildingblock {

  /* Begin Protected Region [[9fbae63a-0a1c-11eb-a857-d17d567fc174]] */

  /* End Protected Region   [[9fbae63a-0a1c-11eb-a857-d17d567fc174]] */


  public static interface IAbstractAuthZBuildingBlockPermissionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("11904919-0a1d-11eb-a857-d17d567fc174")
    public java.lang.String CommonName();

    @IDynamicResourceExtension.MethodId("4a3a0826-6fab-11eb-a1e4-f1bdb2897690")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IActivityPermission> ToActivePermissions(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.javamodel.IServiceAccount serviceAccount);

    @IDynamicResourceExtension.MethodId("b3a49380-de4c-11eb-b028-df36f0dc7b24")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IActivityPermission> ToActivePermissionsForSites(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent roleSystemComponent);

    @IDynamicResourceExtension.MethodId("16c9702d-53a6-11ed-9288-01a0bbf601b0")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IActivityPermission> ToActivePermissionsForLocalSite(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent roleSystemComponent);

    @IDynamicResourceExtension.MethodId("dc5d1980-864b-11eb-9869-4317e18e6c88")
    public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IAbstractSystemOrSystemConfiguration AbstractSystemOrSystemConfiguration();

    @IDynamicResourceExtension.MethodId("2cce0dbb-864c-11eb-9869-4317e18e6c88")
    public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IPermission Permission();

    @IDynamicResourceExtension.MethodId("02efc120-864e-11eb-9869-4317e18e6c88")
    public java.lang.String SimpleName();

    @IDynamicResourceExtension.MethodId("76754559-864e-11eb-9869-4317e18e6c88")
    public java.lang.String CommonNameSpecific();

    @IDynamicResourceExtension.MethodId("c258e93e-e44f-11ee-89a2-d75dd4a11557")
    public java.lang.String TypeName();

  }
  
  public static interface IAbstractAuthZBuildingBlockPermissionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("4a3a0826-6fab-11eb-a1e4-f1bdb2897690")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IActivityPermission> ToActivePermissions(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.javamodel.IServiceAccount serviceAccount, final List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.buildingblock.activity.javamodel.IAbstractAuthZBuildingBlockPermission> abstractAuthZBuildingBlockPermissionList);

    @IDynamicResourceExtension.MethodId("b3a49380-de4c-11eb-b028-df36f0dc7b24")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IActivityPermission> ToActivePermissionsForSites(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent roleSystemComponent, final List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.buildingblock.activity.javamodel.IAbstractAuthZBuildingBlockPermission> abstractAuthZBuildingBlockPermissionList);

    @IDynamicResourceExtension.MethodId("16c9702d-53a6-11ed-9288-01a0bbf601b0")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IActivityPermission> ToActivePermissionsForLocalSite(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent roleSystemComponent, final List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.buildingblock.activity.javamodel.IAbstractAuthZBuildingBlockPermission> abstractAuthZBuildingBlockPermissionList);

  }
  
  public static class AbstractAuthZBuildingBlockPermissionFunctionsImpl implements IAbstractAuthZBuildingBlockPermissionFunctionsImpl {

    public static final IAbstractAuthZBuildingBlockPermissionFunctionsImpl INSTANCE = new AbstractAuthZBuildingBlockPermissionFunctionsImpl();

    private AbstractAuthZBuildingBlockPermissionFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IActivityPermission> ToActivePermissions(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.javamodel.IServiceAccount serviceAccount, final List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.buildingblock.activity.javamodel.IAbstractAuthZBuildingBlockPermission> abstractAuthZBuildingBlockPermissionList) {
      /* Begin Protected Region [[4a3a0826-6fab-11eb-a1e4-f1bdb2897690]] */
      final var serviceAccountFunctions = serviceAccount.extension(IServiceAccountFunctions.class);
      final var abstractSites = serviceAccountFunctions.GetAllowedSiteForServiceAccount();

      final var activityPermissions = new ArrayList<IActivityPermission>();
      abstractAuthZBuildingBlockPermissionList.stream().forEach( x -> {
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
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IActivityPermission> ToActivePermissionsForSites(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent roleSystemComponent, final List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.buildingblock.activity.javamodel.IAbstractAuthZBuildingBlockPermission> abstractAuthZBuildingBlockPermissionList) {
      /* Begin Protected Region [[b3a49380-de4c-11eb-b028-df36f0dc7b24]] */
      final var roleSystemComponentFunctions = roleSystemComponent.extension(IRoleSystemComponentFunctions.class);
      final var abstractSites = roleSystemComponentFunctions.GetAllowedSiteForRoleSystemComponent();

      final var activityPermissions = new ArrayList<IActivityPermission>();
      abstractAuthZBuildingBlockPermissionList.stream().forEach( x -> {
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
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IActivityPermission> ToActivePermissionsForLocalSite(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent roleSystemComponent, final List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.buildingblock.activity.javamodel.IAbstractAuthZBuildingBlockPermission> abstractAuthZBuildingBlockPermissionList) {
      /* Begin Protected Region [[16c9702d-53a6-11ed-9288-01a0bbf601b0]] */
      final var roleSystemComponentFunctions = roleSystemComponent.extension(IRoleSystemComponentFunctions.class);
      final var abstractSite = roleSystemComponentFunctions.GetAllowedLocalSiteForRoleSystemComponent();

      final var activityPermissions = new ArrayList<IActivityPermission>();
      abstractAuthZBuildingBlockPermissionList.stream().forEach( x -> {
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
  
  public static class AbstractAuthZBuildingBlockPermissionFunctions {

    private AbstractAuthZBuildingBlockPermissionFunctions() {}

    public static List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IActivityPermission> ToActivePermissions(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.javamodel.IServiceAccount serviceAccount, final List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.buildingblock.activity.javamodel.IAbstractAuthZBuildingBlockPermission> abstractAuthZBuildingBlockPermissionList) {
      return DynamicResourceUtil.invoke(IAbstractAuthZBuildingBlockPermissionFunctionsImpl.class, AbstractAuthZBuildingBlockPermissionFunctionsImpl.INSTANCE, abstractAuthZBuildingBlockPermissionList).ToActivePermissions(serviceAccount, abstractAuthZBuildingBlockPermissionList);
    }

    public static List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IActivityPermission> ToActivePermissionsForSites(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent roleSystemComponent, final List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.buildingblock.activity.javamodel.IAbstractAuthZBuildingBlockPermission> abstractAuthZBuildingBlockPermissionList) {
      return DynamicResourceUtil.invoke(IAbstractAuthZBuildingBlockPermissionFunctionsImpl.class, AbstractAuthZBuildingBlockPermissionFunctionsImpl.INSTANCE, abstractAuthZBuildingBlockPermissionList).ToActivePermissionsForSites(roleSystemComponent, abstractAuthZBuildingBlockPermissionList);
    }

    public static List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IActivityPermission> ToActivePermissionsForLocalSite(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent roleSystemComponent, final List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.buildingblock.activity.javamodel.IAbstractAuthZBuildingBlockPermission> abstractAuthZBuildingBlockPermissionList) {
      return DynamicResourceUtil.invoke(IAbstractAuthZBuildingBlockPermissionFunctionsImpl.class, AbstractAuthZBuildingBlockPermissionFunctionsImpl.INSTANCE, abstractAuthZBuildingBlockPermissionList).ToActivePermissionsForLocalSite(roleSystemComponent, abstractAuthZBuildingBlockPermissionList);
    }

  }

  public static interface IAuthZBuildingBlockPermissionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f5ec10ef-864b-11eb-9869-4317e18e6c88")
    public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IAbstractSystemOrSystemConfiguration AbstractSystemOrSystemConfiguration();

    @IDynamicResourceExtension.MethodId("35ba7315-864c-11eb-9869-4317e18e6c88")
    public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IPermission Permission();

    @IDynamicResourceExtension.MethodId("11848368-864e-11eb-9869-4317e18e6c88")
    public java.lang.String SimpleName();

    @IDynamicResourceExtension.MethodId("db1f3ad7-864e-11eb-9869-4317e18e6c88")
    public java.lang.String CommonNameSpecific();

    @IDynamicResourceExtension.MethodId("d46fde89-e44d-11ee-89a2-d75dd4a11557")
    public java.lang.String TypeName();

  }
  
  public static interface IAuthZBuildingBlockPermissionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AuthZBuildingBlockPermissionFunctionsImpl implements IAuthZBuildingBlockPermissionFunctionsImpl {

    public static final IAuthZBuildingBlockPermissionFunctionsImpl INSTANCE = new AuthZBuildingBlockPermissionFunctionsImpl();

    private AuthZBuildingBlockPermissionFunctionsImpl() {}

  }
  
  public static class AuthZBuildingBlockPermissionFunctions {

    private AuthZBuildingBlockPermissionFunctions() {}

  }

  public static interface IAuthZBuildingBlockPropertyPermissionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4011ca15-d5bf-11ec-ad12-8d6f8e00bc94")
    public java.lang.String SimpleName();

    @IDynamicResourceExtension.MethodId("4011ca1e-d5bf-11ec-ad12-8d6f8e00bc94")
    public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IAbstractSystemOrSystemConfiguration AbstractSystemOrSystemConfiguration();

    @IDynamicResourceExtension.MethodId("4011ca27-d5bf-11ec-ad12-8d6f8e00bc94")
    public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IPermission Permission();

    @IDynamicResourceExtension.MethodId("4011ca3b-d5bf-11ec-ad12-8d6f8e00bc94")
    public java.lang.String CommonNameSpecific();

    @IDynamicResourceExtension.MethodId("39e01fe9-e450-11ee-89a2-d75dd4a11557")
    public java.lang.String TypeName();

  }
  
  public static interface IAuthZBuildingBlockPropertyPermissionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AuthZBuildingBlockPropertyPermissionFunctionsImpl implements IAuthZBuildingBlockPropertyPermissionFunctionsImpl {

    public static final IAuthZBuildingBlockPropertyPermissionFunctionsImpl INSTANCE = new AuthZBuildingBlockPropertyPermissionFunctionsImpl();

    private AuthZBuildingBlockPropertyPermissionFunctionsImpl() {}

  }
  
  public static class AuthZBuildingBlockPropertyPermissionFunctions {

    private AuthZBuildingBlockPropertyPermissionFunctions() {}

  }

  public static interface IAuthZBuildingBlockForSystemFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("aa464d71-4bd3-11ed-bcee-57344264bda3")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IAbstractSystemOrSystemConfiguration> AllRelevantComponentsForAuthZBuildingBlockForSystem();

  }
  
  public static interface IAuthZBuildingBlockForSystemFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AuthZBuildingBlockForSystemFunctionsImpl implements IAuthZBuildingBlockForSystemFunctionsImpl {

    public static final IAuthZBuildingBlockForSystemFunctionsImpl INSTANCE = new AuthZBuildingBlockForSystemFunctionsImpl();

    private AuthZBuildingBlockForSystemFunctionsImpl() {}

  }
  
  public static class AuthZBuildingBlockForSystemFunctions {

    private AuthZBuildingBlockForSystemFunctions() {}

  }

  public static interface IAuthZBuildingBlockForAbstractSystemOrSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e73b564e-4c9f-11ed-b0be-c9d58a207ca0")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.buildingblock.activity.javamodel.IAbstractAuthZBuildingBlockPermission> AllPermissionTemplates();

  }
  
  public static interface IAuthZBuildingBlockForAbstractSystemOrSystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AuthZBuildingBlockForAbstractSystemOrSystemConfigurationFunctionsImpl implements IAuthZBuildingBlockForAbstractSystemOrSystemConfigurationFunctionsImpl {

    public static final IAuthZBuildingBlockForAbstractSystemOrSystemConfigurationFunctionsImpl INSTANCE = new AuthZBuildingBlockForAbstractSystemOrSystemConfigurationFunctionsImpl();

    private AuthZBuildingBlockForAbstractSystemOrSystemConfigurationFunctionsImpl() {}

  }
  
  public static class AuthZBuildingBlockForAbstractSystemOrSystemConfigurationFunctions {

    private AuthZBuildingBlockForAbstractSystemOrSystemConfigurationFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,9fbae63a-0a1c-11eb-a857-d17d567fc174,fFWyt4iSDTOjbWnX2Ddv+r+EWws=] */
