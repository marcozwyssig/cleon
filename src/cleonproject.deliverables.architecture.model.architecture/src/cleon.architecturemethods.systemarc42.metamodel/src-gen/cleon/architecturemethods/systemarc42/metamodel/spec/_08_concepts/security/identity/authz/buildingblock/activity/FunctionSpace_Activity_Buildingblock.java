package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.buildingblock.activity;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[9fbae63a-0a1c-11eb-a857-d17d567fc174,imports]] */
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.FunctionSpace_Accounts.IServiceAccountFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.FunctionSpace_Activity_Deployment.IActivityPermissionFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.ActivityPermission;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IActivityPermission;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.role.FunctionSpace_Role.IRoleSystemComponentFunctions;

import java.util.ArrayList;
/* End Protected Region   [[9fbae63a-0a1c-11eb-a857-d17d567fc174,imports]] */

public class FunctionSpace_Activity_Buildingblock {

  /* Begin Protected Region [[9fbae63a-0a1c-11eb-a857-d17d567fc174]] */

  /* End Protected Region   [[9fbae63a-0a1c-11eb-a857-d17d567fc174]] */


  public static interface IAbstractAuthZBuildingBlockPermissionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("11904919-0a1d-11eb-a857-d17d567fc174")
    public java.lang.String CommonName();

    @IDynamicResourceExtension.MethodId("4a3a0826-6fab-11eb-a1e4-f1bdb2897690")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IActivityPermission> ToActivePermissions(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.javamodel.IServiceAccount serviceAccount);

    @IDynamicResourceExtension.MethodId("b3a49380-de4c-11eb-b028-df36f0dc7b24")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IActivityPermission> ToActivePermissions(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent roleSystemComponent);

    @IDynamicResourceExtension.MethodId("dc5d1980-864b-11eb-9869-4317e18e6c88")
    public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration SystemConfiguration();

    @IDynamicResourceExtension.MethodId("2cce0dbb-864c-11eb-9869-4317e18e6c88")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IPermission Permission();

    @IDynamicResourceExtension.MethodId("02efc120-864e-11eb-9869-4317e18e6c88")
    public java.lang.String SimpleName();

    @IDynamicResourceExtension.MethodId("76754559-864e-11eb-9869-4317e18e6c88")
    public java.lang.String CommonNameSpecific();

  }
  
  public static interface IAbstractAuthZBuildingBlockPermissionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("4a3a0826-6fab-11eb-a1e4-f1bdb2897690")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IActivityPermission> ToActivePermissions(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.javamodel.IServiceAccount serviceAccount, final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.buildingblock.activity.javamodel.IAbstractAuthZBuildingBlockPermission> abstractAuthZBuildingBlockPermissionList);

    @IDynamicResourceExtension.MethodId("b3a49380-de4c-11eb-b028-df36f0dc7b24")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IActivityPermission> ToActivePermissions(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent roleSystemComponent, final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.buildingblock.activity.javamodel.IAbstractAuthZBuildingBlockPermission> abstractAuthZBuildingBlockPermissionList);

  }
  
  public static class AbstractAuthZBuildingBlockPermissionFunctionsImpl implements IAbstractAuthZBuildingBlockPermissionFunctionsImpl {

    public static final IAbstractAuthZBuildingBlockPermissionFunctionsImpl INSTANCE = new AbstractAuthZBuildingBlockPermissionFunctionsImpl();

    private AbstractAuthZBuildingBlockPermissionFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IActivityPermission> ToActivePermissions(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.javamodel.IServiceAccount serviceAccount, final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.buildingblock.activity.javamodel.IAbstractAuthZBuildingBlockPermission> abstractAuthZBuildingBlockPermissionList) {
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
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IActivityPermission> ToActivePermissions(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent roleSystemComponent, final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.buildingblock.activity.javamodel.IAbstractAuthZBuildingBlockPermission> abstractAuthZBuildingBlockPermissionList) {
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

  }
  
  public static class AbstractAuthZBuildingBlockPermissionFunctions {

    private AbstractAuthZBuildingBlockPermissionFunctions() {}

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IActivityPermission> ToActivePermissions(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.javamodel.IServiceAccount serviceAccount, final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.buildingblock.activity.javamodel.IAbstractAuthZBuildingBlockPermission> abstractAuthZBuildingBlockPermissionList) {
      return DynamicResourceUtil.invoke(IAbstractAuthZBuildingBlockPermissionFunctionsImpl.class, AbstractAuthZBuildingBlockPermissionFunctionsImpl.INSTANCE, abstractAuthZBuildingBlockPermissionList).ToActivePermissions(serviceAccount, abstractAuthZBuildingBlockPermissionList);
    }

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IActivityPermission> ToActivePermissions(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent roleSystemComponent, final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.buildingblock.activity.javamodel.IAbstractAuthZBuildingBlockPermission> abstractAuthZBuildingBlockPermissionList) {
      return DynamicResourceUtil.invoke(IAbstractAuthZBuildingBlockPermissionFunctionsImpl.class, AbstractAuthZBuildingBlockPermissionFunctionsImpl.INSTANCE, abstractAuthZBuildingBlockPermissionList).ToActivePermissions(roleSystemComponent, abstractAuthZBuildingBlockPermissionList);
    }

  }

  public static interface IAuthZBuildingBlockForPermissionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f5ec10ef-864b-11eb-9869-4317e18e6c88")
    public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration SystemConfiguration();

    @IDynamicResourceExtension.MethodId("35ba7315-864c-11eb-9869-4317e18e6c88")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IPermission Permission();

    @IDynamicResourceExtension.MethodId("11848368-864e-11eb-9869-4317e18e6c88")
    public java.lang.String SimpleName();

    @IDynamicResourceExtension.MethodId("db1f3ad7-864e-11eb-9869-4317e18e6c88")
    public java.lang.String CommonNameSpecific();

  }
  
  public static interface IAuthZBuildingBlockForPermissionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AuthZBuildingBlockForPermissionFunctionsImpl implements IAuthZBuildingBlockForPermissionFunctionsImpl {

    public static final IAuthZBuildingBlockForPermissionFunctionsImpl INSTANCE = new AuthZBuildingBlockForPermissionFunctionsImpl();

    private AuthZBuildingBlockForPermissionFunctionsImpl() {}

  }
  
  public static class AuthZBuildingBlockForPermissionFunctions {

    private AuthZBuildingBlockForPermissionFunctions() {}

  }

  public static interface IAuthZBuildingBlockPropertyPermissionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4011ca15-d5bf-11ec-ad12-8d6f8e00bc94")
    public java.lang.String SimpleName();

    @IDynamicResourceExtension.MethodId("4011ca1e-d5bf-11ec-ad12-8d6f8e00bc94")
    public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration SystemConfiguration();

    @IDynamicResourceExtension.MethodId("4011ca27-d5bf-11ec-ad12-8d6f8e00bc94")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IPermission Permission();

    @IDynamicResourceExtension.MethodId("4011ca3b-d5bf-11ec-ad12-8d6f8e00bc94")
    public java.lang.String CommonNameSpecific();

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
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IAbstractSystemOrSystemConfiguration> AllRelevantComponentsForAuthZBuildingBlockForSystem();

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

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,9fbae63a-0a1c-11eb-a857-d17d567fc174,3nmHwSU+/OLqPnuC1VCdVLN4hvU=] */
