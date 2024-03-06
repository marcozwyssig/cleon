package cleon.architecturemethods.arc42.metamodel.template.puppet;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[cfa40d24-5180-11ea-a946-13c393300b57,imports]] */
import java.util.stream.Collectors;
/* End Protected Region   [[cfa40d24-5180-11ea-a946-13c393300b57,imports]] */

public class ad_aE_Management__T_yaml {

  /* Begin Protected Region [[cfa40d24-5180-11ea-a946-13c393300b57]] */

  /* End Protected Region   [[cfa40d24-5180-11ea-a946-13c393300b57]] */


  public static interface INetworkSiteFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8247b809-b873-11eb-8e8b-1d4fd4efa35e")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSite> WhereOUExportIsTrue();

    @IDynamicResourceExtension.MethodId("8ec5c942-ba41-11ec-a408-4ba6a2d760ef")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSite> WhereIsADSite();

    @IDynamicResourceExtension.MethodId("9312f1cb-ba43-11ec-a408-4ba6a2d760ef")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSite> WithoutNMS();

    @IDynamicResourceExtension.MethodId("5937518e-ba45-11ec-a408-4ba6a2d760ef")
    public java.lang.String SimpleName();

    @IDynamicResourceExtension.MethodId("953981e0-bbc8-11ec-815c-69b4d4138e89")
    public List<cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask> SelectsAvailableCidrs();

    @IDynamicResourceExtension.MethodId("66c52651-f07c-11ec-9c6a-1f9bef34e8b6")
    public List<cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask> SelectCidrs();

  }
  
  public static interface INetworkSiteFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("8247b809-b873-11eb-8e8b-1d4fd4efa35e")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSite> WhereOUExportIsTrue(final List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSite> networkSiteList);

    @IDynamicResourceExtension.MethodId("8ec5c942-ba41-11ec-a408-4ba6a2d760ef")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSite> WhereIsADSite(final List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSite> networkSiteList);

    @IDynamicResourceExtension.MethodId("9312f1cb-ba43-11ec-a408-4ba6a2d760ef")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSite> WithoutNMS(final List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSite> networkSiteList);

    @IDynamicResourceExtension.MethodId("66c52651-f07c-11ec-9c6a-1f9bef34e8b6")
    public List<cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask> SelectCidrs(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSite networkSite);

  }
  
  public static class NetworkSiteFunctionsImpl implements INetworkSiteFunctionsImpl {

    public static final INetworkSiteFunctionsImpl INSTANCE = new NetworkSiteFunctionsImpl();

    private NetworkSiteFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSite> WhereOUExportIsTrue(final List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSite> networkSiteList) {
      /* Begin Protected Region [[8247b809-b873-11eb-8e8b-1d4fd4efa35e]] */
      return networkSiteList.stream().filter(x -> x.selectExportOU() == null || x.selectExportOU().booleanValue()).collect(Collectors.toList());
      /* End Protected Region   [[8247b809-b873-11eb-8e8b-1d4fd4efa35e]] */
    }

    @Override
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSite> WhereIsADSite(final List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSite> networkSiteList) {
      /* Begin Protected Region [[8ec5c942-ba41-11ec-a408-4ba6a2d760ef]] */
      return networkSiteList.stream().filter(x -> x.selectExportADSite() == null || x.selectExportADSite().booleanValue()).collect(Collectors.toList());
      /* End Protected Region   [[8ec5c942-ba41-11ec-a408-4ba6a2d760ef]] */
    }

    @Override
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSite> WithoutNMS(final List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSite> networkSiteList) {
      /* Begin Protected Region [[9312f1cb-ba43-11ec-a408-4ba6a2d760ef]] */
      return networkSiteList.stream().filter(x -> !x.extension(INetworkSiteFunctions.class).SimpleName().contains("NMS")).collect(Collectors.toList());
      /* End Protected Region   [[9312f1cb-ba43-11ec-a408-4ba6a2d760ef]] */
    }

    @Override
    public List<cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask> SelectCidrs(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSite networkSite) {
      /* Begin Protected Region [[66c52651-f07c-11ec-9c6a-1f9bef34e8b6]] */
      if( networkSite.selectExportADSite() != null && !networkSite.selectExportADSite() ) {
      	return null;
      }
      return networkSite.extension(INetworkSiteFunctions.class).SelectsAvailableCidrs();
      /* End Protected Region   [[66c52651-f07c-11ec-9c6a-1f9bef34e8b6]] */
    }

  }
  
  public static class NetworkSiteFunctions {

    private NetworkSiteFunctions() {}

    public static List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSite> WhereOUExportIsTrue(final List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSite> networkSiteList) {
      return DynamicResourceUtil.invoke(INetworkSiteFunctionsImpl.class, NetworkSiteFunctionsImpl.INSTANCE, networkSiteList).WhereOUExportIsTrue(networkSiteList);
    }

    public static List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSite> WhereIsADSite(final List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSite> networkSiteList) {
      return DynamicResourceUtil.invoke(INetworkSiteFunctionsImpl.class, NetworkSiteFunctionsImpl.INSTANCE, networkSiteList).WhereIsADSite(networkSiteList);
    }

    public static List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSite> WithoutNMS(final List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSite> networkSiteList) {
      return DynamicResourceUtil.invoke(INetworkSiteFunctionsImpl.class, NetworkSiteFunctionsImpl.INSTANCE, networkSiteList).WithoutNMS(networkSiteList);
    }

    public static List<cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask> SelectCidrs(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSite networkSite) {
      return DynamicResourceUtil.invoke(INetworkSiteFunctionsImpl.class, NetworkSiteFunctionsImpl.INSTANCE, networkSite).SelectCidrs(networkSite);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,cfa40d24-5180-11ea-a946-13c393300b57,Z90RHRFm9gFILvSrzTR0Qd0w8+Y=] */
