package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.activity;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[9fbae63a-0a1c-11eb-a857-d17d567fc174,imports]] */
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.FunctionSpace_Accounts.IServiceAccountFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.FunctionSpace_Activity_Deployment.IActivityPermissionFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.ActivityPermission;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityPermission;

import java.util.ArrayList;
/* End Protected Region   [[9fbae63a-0a1c-11eb-a857-d17d567fc174,imports]] */

public class FunctionSpace_Activity_Buildingblock {

  /* Begin Protected Region [[9fbae63a-0a1c-11eb-a857-d17d567fc174]] */

  /* End Protected Region   [[9fbae63a-0a1c-11eb-a857-d17d567fc174]] */


  public static interface IAuthZBuildingBlockForPermissionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("11904919-0a1d-11eb-a857-d17d567fc174")
    public java.lang.String CommonName();

    @IDynamicResourceExtension.MethodId("4a3a0826-6fab-11eb-a1e4-f1bdb2897690")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityPermission> ToActivePermissions(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IServiceAccount serviceAccount);

  }
  
  public static interface IAuthZBuildingBlockForPermissionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("4a3a0826-6fab-11eb-a1e4-f1bdb2897690")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityPermission> ToActivePermissions(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IServiceAccount serviceAccount, final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.activity.javamodel.IAuthZBuildingBlockForPermission> authZBuildingBlockForPermissionList);

  }
  
  public static class AuthZBuildingBlockForPermissionFunctionsImpl implements IAuthZBuildingBlockForPermissionFunctionsImpl {

    public static final IAuthZBuildingBlockForPermissionFunctionsImpl INSTANCE = new AuthZBuildingBlockForPermissionFunctionsImpl();

    private AuthZBuildingBlockForPermissionFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityPermission> ToActivePermissions(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IServiceAccount serviceAccount, final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.activity.javamodel.IAuthZBuildingBlockForPermission> authZBuildingBlockForPermissionList) {
      /* Begin Protected Region [[4a3a0826-6fab-11eb-a1e4-f1bdb2897690]] */
      final var serviceAccountFunctions = serviceAccount.extension(IServiceAccountFunctions.class);
      final var abstractSites = serviceAccountFunctions.GetAllowedSiteForServiceAccount();

      final var activityPermissions = new ArrayList<IActivityPermission>();
      authZBuildingBlockForPermissionList.stream().forEach( x -> {
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

  }
  
  public static class AuthZBuildingBlockForPermissionFunctions {

    private AuthZBuildingBlockForPermissionFunctions() {}

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityPermission> ToActivePermissions(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IServiceAccount serviceAccount, final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.activity.javamodel.IAuthZBuildingBlockForPermission> authZBuildingBlockForPermissionList) {
      return DynamicResourceUtil.invoke(IAuthZBuildingBlockForPermissionFunctionsImpl.class, AuthZBuildingBlockForPermissionFunctionsImpl.INSTANCE, authZBuildingBlockForPermissionList).ToActivePermissions(serviceAccount, authZBuildingBlockForPermissionList);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,9fbae63a-0a1c-11eb-a857-d17d567fc174,yXvhBE2kl4ctWqhiQgn2HhAfG2k=] */
