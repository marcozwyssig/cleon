package cleon.architecturemethods.systemarc42.metamodel.template.puppet;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[cfa40d24-5180-11ea-a946-13c393300b57,imports]] */
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.ActivitySystemConfiguration;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IActivitySystemConfiguration;
import cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.FunctionSpace_SystemArc42_BuildingBlockView.ISystemConfigurationFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.buildingblock.activity.FunctionSpace_Activity_Buildingblock.IAbstractAuthZBuildingBlockPermissionFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.FunctionSpace_AuthZ_Deployment.IAbstractGroupFunctions;
import java.util.stream.Collectors;
/* End Protected Region   [[cfa40d24-5180-11ea-a946-13c393300b57,imports]] */

public class ad_aE_Management__T_yaml {

  /* Begin Protected Region [[cfa40d24-5180-11ea-a946-13c393300b57]] */

  /* End Protected Region   [[cfa40d24-5180-11ea-a946-13c393300b57]] */


  public static interface IAbstractHostFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("82ca75a5-b075-11ea-b791-9b401fd02359")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IActivityPermission WriteActivity();

  }
  
  public static interface IAbstractHostFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("82ca75a5-b075-11ea-b791-9b401fd02359")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IActivityPermission WriteActivity(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost abstractHost);

  }
  
  public static class AbstractHostFunctionsImpl implements IAbstractHostFunctionsImpl {

    public static final IAbstractHostFunctionsImpl INSTANCE = new AbstractHostFunctionsImpl();

    private AbstractHostFunctionsImpl() {}

    @Override
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IActivityPermission WriteActivity(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost abstractHost) {
      /* Begin Protected Region [[82ca75a5-b075-11ea-b791-9b401fd02359]] */
      final var abstractHostFunctions = abstractHost
      		.extension(
      				cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.FunctionSpace_Topology.IAbstractHostFunctions.class);

      final var configurationFunctions = abstractHost.selectInstanceOf().extension(ISystemConfigurationFunctions.class);
      final var parentSystemConfiguration = configurationFunctions.DependsToSystemConfiguration();
      if( parentSystemConfiguration == null ) {
      	return null;
      }

      final var activitySystemConfigurations = ActivitySystemConfiguration
      		.selectToMeActivityForSystemConfiguration(parentSystemConfiguration);
      for (final IActivitySystemConfiguration activitySystemConfiguration : activitySystemConfigurations) {
      	final var abstractGroupFunctions = activitySystemConfiguration
      			.extension(IAbstractGroupFunctions.class);
      	final var site = abstractGroupFunctions.GetSite();
      	if (site.equals(abstractHostFunctions.TopSite())) {
      		return activitySystemConfiguration.selectActivitiesForPermissions().values().stream()
      				.filter(x -> {
      					final var activityPermissionFunctions = x.selectActivityTemplate().extension(IAbstractAuthZBuildingBlockPermissionFunctions.class);
      					return activityPermissionFunctions.Permission().selectName().equals("write");
      				})
      				.findFirst().orElse(null);
      	}
      }
      return null;

      /* End Protected Region   [[82ca75a5-b075-11ea-b791-9b401fd02359]] */
    }

  }
  
  public static class AbstractHostFunctions {

    private AbstractHostFunctions() {}

    public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.deployment.activity.javamodel.IActivityPermission WriteActivity(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost abstractHost) {
      return DynamicResourceUtil.invoke(IAbstractHostFunctionsImpl.class, AbstractHostFunctionsImpl.INSTANCE, abstractHost).WriteActivity(abstractHost);
    }

  }

  public static interface INetworkSiteFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8247b809-b873-11eb-8e8b-1d4fd4efa35e")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkSite> WhereOUExportIsTrue();

  }
  
  public static interface INetworkSiteFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("8247b809-b873-11eb-8e8b-1d4fd4efa35e")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkSite> WhereOUExportIsTrue(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkSite> networkSiteList);

  }
  
  public static class NetworkSiteFunctionsImpl implements INetworkSiteFunctionsImpl {

    public static final INetworkSiteFunctionsImpl INSTANCE = new NetworkSiteFunctionsImpl();

    private NetworkSiteFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkSite> WhereOUExportIsTrue(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkSite> networkSiteList) {
      /* Begin Protected Region [[8247b809-b873-11eb-8e8b-1d4fd4efa35e]] */
      return networkSiteList.stream().filter(x -> x.selectExportOU() == null || x.selectExportOU().booleanValue()).collect(Collectors.toList());
      /* End Protected Region   [[8247b809-b873-11eb-8e8b-1d4fd4efa35e]] */
    }

  }
  
  public static class NetworkSiteFunctions {

    private NetworkSiteFunctions() {}

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkSite> WhereOUExportIsTrue(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkSite> networkSiteList) {
      return DynamicResourceUtil.invoke(INetworkSiteFunctionsImpl.class, NetworkSiteFunctionsImpl.INSTANCE, networkSiteList).WhereOUExportIsTrue(networkSiteList);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,cfa40d24-5180-11ea-a946-13c393300b57,HbWqW26b9Rfnc72KxHI1ipX+d60=] */
