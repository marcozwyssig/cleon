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
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkSite;
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

    @IDynamicResourceExtension.MethodId("8ec5c942-ba41-11ec-a408-4ba6a2d760ef")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkSite> WhereIsADSite();

    @IDynamicResourceExtension.MethodId("9312f1cb-ba43-11ec-a408-4ba6a2d760ef")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkSite> WithoutNMS();

    @IDynamicResourceExtension.MethodId("5937518e-ba45-11ec-a408-4ba6a2d760ef")
    public java.lang.String SimpleName();

    @IDynamicResourceExtension.MethodId("953981e0-bbc8-11ec-815c-69b4d4138e89")
    public List<cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask> SelectCidrs();

  }
  
  public static interface INetworkSiteFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("8247b809-b873-11eb-8e8b-1d4fd4efa35e")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkSite> WhereOUExportIsTrue(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkSite> networkSiteList);

    @IDynamicResourceExtension.MethodId("8ec5c942-ba41-11ec-a408-4ba6a2d760ef")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkSite> WhereIsADSite(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkSite> networkSiteList);

    @IDynamicResourceExtension.MethodId("9312f1cb-ba43-11ec-a408-4ba6a2d760ef")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkSite> WithoutNMS(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkSite> networkSiteList);

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

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkSite> WhereIsADSite(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkSite> networkSiteList) {
      /* Begin Protected Region [[8ec5c942-ba41-11ec-a408-4ba6a2d760ef]] */
        return networkSiteList.stream().filter(x -> x.selectExportADSite() == null || x.selectExportADSite().booleanValue()).collect(Collectors.toList());   
      /* End Protected Region   [[8ec5c942-ba41-11ec-a408-4ba6a2d760ef]] */
    }

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkSite> WithoutNMS(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkSite> networkSiteList) {
      /* Begin Protected Region [[9312f1cb-ba43-11ec-a408-4ba6a2d760ef]] */
    	return networkSiteList.stream().filter(x -> x.extension(INetworkSiteFunctions.class).SimpleName().contains("NMS") == false).collect(Collectors.toList());   
      /* End Protected Region   [[9312f1cb-ba43-11ec-a408-4ba6a2d760ef]] */
    }

  }
  
  public static class NetworkSiteFunctions {

    private NetworkSiteFunctions() {}

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkSite> WhereOUExportIsTrue(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkSite> networkSiteList) {
      return DynamicResourceUtil.invoke(INetworkSiteFunctionsImpl.class, NetworkSiteFunctionsImpl.INSTANCE, networkSiteList).WhereOUExportIsTrue(networkSiteList);
    }

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkSite> WhereIsADSite(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkSite> networkSiteList) {
      return DynamicResourceUtil.invoke(INetworkSiteFunctionsImpl.class, NetworkSiteFunctionsImpl.INSTANCE, networkSiteList).WhereIsADSite(networkSiteList);
    }

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkSite> WithoutNMS(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkSite> networkSiteList) {
      return DynamicResourceUtil.invoke(INetworkSiteFunctionsImpl.class, NetworkSiteFunctionsImpl.INSTANCE, networkSiteList).WithoutNMS(networkSiteList);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,cfa40d24-5180-11ea-a946-13c393300b57,D0+x+3ciB360ALxBLcGh8uzcyrA=] */
