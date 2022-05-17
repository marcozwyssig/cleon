package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[7b6d94a1-9370-11e9-8139-e76b19cfb4bf,imports]] */
import java.util.ArrayList;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSiteWithFunctionID;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IRN;
import ch.actifsource.util.log.Logger;
import java.util.stream.Collectors;

import cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.security.iam.javamodel.IReadOnlyDomainController;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite;
/* End Protected Region   [[7b6d94a1-9370-11e9-8139-e76b19cfb4bf,imports]] */

public class FunctionSpace_Topology {

  /* Begin Protected Region [[7b6d94a1-9370-11e9-8139-e76b19cfb4bf]] */

  /* End Protected Region   [[7b6d94a1-9370-11e9-8139-e76b19cfb4bf]] */


  public static interface IAbstractSiteFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8accd30d-9370-11e9-8139-e76b19cfb4bf")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ITopology Topology();

    @IDynamicResourceExtension.MethodId("6c917753-9375-11e9-8139-e76b19cfb4bf")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSiteWithHosts> AllAbstractSiteHosts();

    @IDynamicResourceExtension.MethodId("2e419e47-941f-11e9-bbdf-9b4dacbbf865")
    public List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> AllZones();

    @IDynamicResourceExtension.MethodId("ad33683d-3775-11ea-bb06-17b9485a5d0a")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSiteWithFunctionID> SortByFunctionId();

    @IDynamicResourceExtension.MethodId("394205d2-b07d-11ea-b791-9b401fd02359")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite ParentSite();

    @IDynamicResourceExtension.MethodId("0a9292f3-5e1a-11ea-b835-fbb06fdf6352")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> AllHosts();

    @IDynamicResourceExtension.MethodId("da63a564-4ff4-11eb-8df9-adb928521f3a")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> GetAbstractHostsBySystemConfiguration(final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration sysCfg);

    @IDynamicResourceExtension.MethodId("d6b27956-1eb0-11eb-9eef-0dadb2b460da")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> AllHostsWithAllowedManaged();

    @IDynamicResourceExtension.MethodId("7442d538-b4a2-11ea-b938-599963fc0a84")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite> AllSites();

    @IDynamicResourceExtension.MethodId("69ca3de9-dd82-11ea-9383-71e9cf1c59dd")
    public java.lang.String MonitoringSiteName();

    @IDynamicResourceExtension.MethodId("29579ce0-1dac-11eb-9d1c-a7ed1ac99c53")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> AllSystemConfigurations();

    @IDynamicResourceExtension.MethodId("c47824db-1deb-11eb-9bc6-673ab35ba343")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> AllSystemConfigurationsWithDepends();

    @IDynamicResourceExtension.MethodId("ea6c7b70-1deb-11eb-9bc6-673ab35ba343")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> AllSystemConfigurationsWithDependsDistinct();

    @IDynamicResourceExtension.MethodId("4d5553d5-1dac-11eb-9d1c-a7ed1ac99c53")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> AllSystemConfigurationsDistinct();

    @IDynamicResourceExtension.MethodId("0b8efbbd-19bb-11ea-bc72-af84f3c76c84")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ISite> GetAllAllowedManage();

    @IDynamicResourceExtension.MethodId("3b06b22a-1db6-11eb-9d1c-a7ed1ac99c53")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemComponent> AllSystemComponents();

    @IDynamicResourceExtension.MethodId("a4339819-1db6-11eb-9d1c-a7ed1ac99c53")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemComponent> AllSystemComponentsDistinct();

    @IDynamicResourceExtension.MethodId("db67f519-1f75-11eb-9ecc-5f700a9abe9c")
    public java.lang.String ShortName();

    @IDynamicResourceExtension.MethodId("d9c29dd7-394c-11eb-93f1-c3f5ad8bb73f")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> AllSystemConfigurationWithAllowedManaged();

    @IDynamicResourceExtension.MethodId("d666903b-394e-11eb-93f1-c3f5ad8bb73f")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IAbstractSystem> AllSystems();

    @IDynamicResourceExtension.MethodId("32297793-394f-11eb-93f1-c3f5ad8bb73f")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IAbstractSystem> AllSystemsDistinct();

    @IDynamicResourceExtension.MethodId("55c53842-394f-11eb-93f1-c3f5ad8bb73f")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IAbstractSystem> AllSystemsWithAllowedManaged();

    @IDynamicResourceExtension.MethodId("3e1c6fa9-57cb-11ea-bd7a-4baf1bc87b3c")
    public java.lang.String Owner();

    @IDynamicResourceExtension.MethodId("970d4edc-d5c8-11ec-ad12-8d6f8e00bc94")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> AllSystemConfigurationsWithDependsAndAllowedManagedAccessComponents();

    @IDynamicResourceExtension.MethodId("dfb6b05b-d5c8-11ec-ad12-8d6f8e00bc94")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> AllowAccessWith();

    @IDynamicResourceExtension.MethodId("971cc33b-d5c9-11ec-ad12-8d6f8e00bc94")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> AllSystemConfigurationsWithDependsAndAllowedManagedAccessComponentsDistinct();

  }
  
  public static interface IAbstractSiteFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("ad33683d-3775-11ea-bb06-17b9485a5d0a")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSiteWithFunctionID> SortByFunctionId(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite> abstractSiteList);

    @IDynamicResourceExtension.MethodId("db67f519-1f75-11eb-9ecc-5f700a9abe9c")
    public java.lang.String ShortName(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite abstractSite);

  }
  
  public static class AbstractSiteFunctionsImpl implements IAbstractSiteFunctionsImpl {

    public static final IAbstractSiteFunctionsImpl INSTANCE = new AbstractSiteFunctionsImpl();

    private AbstractSiteFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSiteWithFunctionID> SortByFunctionId(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite> abstractSiteList) {
      /* Begin Protected Region [[ad33683d-3775-11ea-bb06-17b9485a5d0a]] */
      return abstractSiteList.stream().filter(x -> x instanceof IAbstractSiteWithFunctionID)
      		.map(x -> (IAbstractSiteWithFunctionID) x)
      		.sorted(java.util.Comparator.comparing(IAbstractSiteWithFunctionID::selectFunctionID))
      		.collect(Collectors.toList());
      /* End Protected Region   [[ad33683d-3775-11ea-bb06-17b9485a5d0a]] */
    }

    @Override
    public java.lang.String ShortName(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite abstractSite) {
      return null;
    }

  }
  
  public static class AbstractSiteFunctions {

    private AbstractSiteFunctions() {}

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSiteWithFunctionID> SortByFunctionId(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite> abstractSiteList) {
      return DynamicResourceUtil.invoke(IAbstractSiteFunctionsImpl.class, AbstractSiteFunctionsImpl.INSTANCE, abstractSiteList).SortByFunctionId(abstractSiteList);
    }

    public static java.lang.String ShortName(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite abstractSite) {
      return DynamicResourceUtil.invoke(IAbstractSiteFunctionsImpl.class, AbstractSiteFunctionsImpl.INSTANCE, abstractSite).ShortName(abstractSite);
    }

  }

  public static interface IAbstractSiteCompositionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("94ab7e84-b4a2-11ea-b938-599963fc0a84")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite> AllSites();

  }
  
  public static interface IAbstractSiteCompositionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractSiteCompositionFunctionsImpl implements IAbstractSiteCompositionFunctionsImpl {

    public static final IAbstractSiteCompositionFunctionsImpl INSTANCE = new AbstractSiteCompositionFunctionsImpl();

    private AbstractSiteCompositionFunctionsImpl() {}

  }
  
  public static class AbstractSiteCompositionFunctions {

    private AbstractSiteCompositionFunctions() {}

  }

  public static interface IRNFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("a808f3f8-9370-11e9-8139-e76b19cfb4bf")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ITopology Topology();

    @IDynamicResourceExtension.MethodId("7090bff2-d5c9-11ec-ad12-8d6f8e00bc94")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> AllowAccessWith();

  }
  
  public static interface IRNFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("7090bff2-d5c9-11ec-ad12-8d6f8e00bc94")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> AllowAccessWith(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IRN rN);

  }
  
  public static class RNFunctionsImpl implements IRNFunctionsImpl {

    public static final IRNFunctionsImpl INSTANCE = new RNFunctionsImpl();

    private RNFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> AllowAccessWith(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IRN rN) {
      return null;
    }

  }
  
  public static class RNFunctions {

    private RNFunctions() {}

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> AllowAccessWith(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IRN rN) {
      return DynamicResourceUtil.invoke(IRNFunctionsImpl.class, RNFunctionsImpl.INSTANCE, rN).AllowAccessWith(rN);
    }

  }

  public static interface IAbstractSiteWithHostsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8ada83c1-0aa1-11ea-97f4-9d91b2097bad")
    public java.lang.String GroupName(final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration systemConfiguration, final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone subzone);

    @IDynamicResourceExtension.MethodId("5e11ab82-deaf-11e9-b714-478bec98e62d")
    public List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> UsedZones(final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration sysCfg);

    @IDynamicResourceExtension.MethodId("1351e2e7-df72-11e9-9827-a1514ee8d06a")
    public java.lang.String Guid(final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration systemConfiguration);

    @IDynamicResourceExtension.MethodId("205b7ce9-e051-11e9-aa67-4505845acdbd")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> AllSystemConfiguration();

    @IDynamicResourceExtension.MethodId("30077b36-e051-11e9-aa67-4505845acdbd")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> AllSystemConfigurationDistinct();

    @IDynamicResourceExtension.MethodId("74d772a9-e076-11e9-aa67-4505845acdbd")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ICommunicationSystem> AllCommunications();

    @IDynamicResourceExtension.MethodId("8f5cb108-e076-11e9-aa67-4505845acdbd")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ICommunicationSystem> AllCommunicationsDistinct();

    @IDynamicResourceExtension.MethodId("b22935c5-4ffc-11eb-8df9-adb928521f3a")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> GetAbstractHostsBySystemConfiguration(final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration sysCfg);

  }
  
  public static interface IAbstractSiteWithHostsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("b22935c5-4ffc-11eb-8df9-adb928521f3a")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> GetAbstractHostsBySystemConfiguration(final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration sysCfg, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSiteWithHosts abstractSiteWithHosts);

  }
  
  public static class AbstractSiteWithHostsFunctionsImpl implements IAbstractSiteWithHostsFunctionsImpl {

    public static final IAbstractSiteWithHostsFunctionsImpl INSTANCE = new AbstractSiteWithHostsFunctionsImpl();

    private AbstractSiteWithHostsFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> GetAbstractHostsBySystemConfiguration(final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration sysCfg, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSiteWithHosts abstractSiteWithHosts) {
      /* Begin Protected Region [[b22935c5-4ffc-11eb-8df9-adb928521f3a]] */
      final var list = new ArrayList<IAbstractHost>();
      abstractSiteWithHosts.selectHosts().get(sysCfg.getResource()).forEach(list::add);
      return list;
      /* End Protected Region   [[b22935c5-4ffc-11eb-8df9-adb928521f3a]] */
    }

  }
  
  public static class AbstractSiteWithHostsFunctions {

    private AbstractSiteWithHostsFunctions() {}

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> GetAbstractHostsBySystemConfiguration(final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration sysCfg, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSiteWithHosts abstractSiteWithHosts) {
      return DynamicResourceUtil.invoke(IAbstractSiteWithHostsFunctionsImpl.class, AbstractSiteWithHostsFunctionsImpl.INSTANCE, abstractSiteWithHosts).GetAbstractHostsBySystemConfiguration(sysCfg, abstractSiteWithHosts);
    }

  }

  public static interface ITDMFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8289bc8e-93e1-11e9-8139-e76b19cfb4bf")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ITopology Topology();

    @IDynamicResourceExtension.MethodId("8c45cc13-d5c9-11ec-ad12-8d6f8e00bc94")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> AllowAccessWith();

  }
  
  public static interface ITDMFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("8c45cc13-d5c9-11ec-ad12-8d6f8e00bc94")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> AllowAccessWith(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ITDM tDM);

  }
  
  public static class TDMFunctionsImpl implements ITDMFunctionsImpl {

    public static final ITDMFunctionsImpl INSTANCE = new TDMFunctionsImpl();

    private TDMFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> AllowAccessWith(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ITDM tDM) {
      return null;
    }

  }
  
  public static class TDMFunctions {

    private TDMFunctions() {}

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> AllowAccessWith(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ITDM tDM) {
      return DynamicResourceUtil.invoke(ITDMFunctionsImpl.class, TDMFunctionsImpl.INSTANCE, tDM).AllowAccessWith(tDM);
    }

  }

  public static interface IAbstractHostFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("6876a694-fb12-11e9-890e-576c93cea08c")
    public java.lang.String ShortName();

    @IDynamicResourceExtension.MethodId("9d2e0ada-0780-11ea-8638-e775d7e940cc")
    public java.lang.String SiteName();

    @IDynamicResourceExtension.MethodId("738023f9-09f0-11ea-baed-218c3e076b56")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSiteWithHosts Site();

    @IDynamicResourceExtension.MethodId("e6e98c18-b07c-11ea-b791-9b401fd02359")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite TopSite();

    @IDynamicResourceExtension.MethodId("1883c8f0-2408-11eb-83b1-3d2a97975978")
    public java.lang.String TopSiteName();

    @IDynamicResourceExtension.MethodId("54955539-570f-11ea-91a9-1992072893b1")
    public java.lang.String SimpleName();

    @IDynamicResourceExtension.MethodId("0112faa4-b073-11ea-b791-9b401fd02359")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> OnlyReadonlyDomainController();

    @IDynamicResourceExtension.MethodId("0f06e336-1eb7-11eb-9eef-0dadb2b460da")
    public List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> Subzones();

    @IDynamicResourceExtension.MethodId("7782b59b-243a-11eb-83b1-3d2a97975978")
    public java.lang.String AliasOrHostname();

    @IDynamicResourceExtension.MethodId("700c9e69-2a4f-11eb-903e-7d97d99d39d5")
    public java.lang.String FQDNAliasOrHostname();

    @IDynamicResourceExtension.MethodId("9a1c5624-c207-11eb-8c09-03c14294ecfb")
    public java.lang.String FQDNAliasOrHostnameWithService(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IPortService service);

    @IDynamicResourceExtension.MethodId("bec338eb-2a4f-11eb-903e-7d97d99d39d5")
    public java.lang.String DomainPrefix();

    @IDynamicResourceExtension.MethodId("eb3facce-a992-11eb-8f9b-01c801f6a12b")
    public cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode Environment();

    @IDynamicResourceExtension.MethodId("8cf5948b-b259-11eb-84da-a358b37bb644")
    public cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetworkNode NetworkNode();

    @IDynamicResourceExtension.MethodId("e786e6c2-d515-11ec-ad12-8d6f8e00bc94")
    public java.lang.String Owner();

  }
  
  public static interface IAbstractHostFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("0112faa4-b073-11ea-b791-9b401fd02359")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> OnlyReadonlyDomainController(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> abstractHostList);

  }
  
  public static class AbstractHostFunctionsImpl implements IAbstractHostFunctionsImpl {

    public static final IAbstractHostFunctionsImpl INSTANCE = new AbstractHostFunctionsImpl();

    private AbstractHostFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> OnlyReadonlyDomainController(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> abstractHostList) {
      /* Begin Protected Region [[0112faa4-b073-11ea-b791-9b401fd02359]] */
      return abstractHostList.stream()
      		.filter(x -> x.selectInstanceOf() instanceof IReadOnlyDomainController)
      		.collect(Collectors.toList());
      /* End Protected Region   [[0112faa4-b073-11ea-b791-9b401fd02359]] */
    }

  }
  
  public static class AbstractHostFunctions {

    private AbstractHostFunctions() {}

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> OnlyReadonlyDomainController(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> abstractHostList) {
      return DynamicResourceUtil.invoke(IAbstractHostFunctionsImpl.class, AbstractHostFunctionsImpl.INSTANCE, abstractHostList).OnlyReadonlyDomainController(abstractHostList);
    }

  }

  public static interface IStackHostFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8e5181ea-fb12-11e9-890e-576c93cea08c")
    public java.lang.String ShortName();

    @IDynamicResourceExtension.MethodId("be4d04b7-fd79-11ea-ab46-e355b3ca0d5e")
    public java.lang.String SiteName();

  }
  
  public static interface IStackHostFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class StackHostFunctionsImpl implements IStackHostFunctionsImpl {

    public static final IStackHostFunctionsImpl INSTANCE = new StackHostFunctionsImpl();

    private StackHostFunctionsImpl() {}

  }
  
  public static class StackHostFunctions {

    private StackHostFunctions() {}

  }

  public static interface INumberedHostFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("945f300c-fb12-11e9-890e-576c93cea08c")
    public java.lang.String ShortName();

  }
  
  public static interface INumberedHostFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class NumberedHostFunctionsImpl implements INumberedHostFunctionsImpl {

    public static final INumberedHostFunctionsImpl INSTANCE = new NumberedHostFunctionsImpl();

    private NumberedHostFunctionsImpl() {}

  }
  
  public static class NumberedHostFunctions {

    private NumberedHostFunctions() {}

  }

  public static interface IClusterFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("95b634af-fb12-11e9-890e-576c93cea08c")
    public java.lang.String ShortName();

  }
  
  public static interface IClusterFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ClusterFunctionsImpl implements IClusterFunctionsImpl {

    public static final IClusterFunctionsImpl INSTANCE = new ClusterFunctionsImpl();

    private ClusterFunctionsImpl() {}

  }
  
  public static class ClusterFunctions {

    private ClusterFunctions() {}

  }

  public static interface IVirtualIPFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b99ab33b-523c-11ea-b38c-2b48248ef5b9")
    public java.lang.String ShortName();

  }
  
  public static interface IVirtualIPFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class VirtualIPFunctionsImpl implements IVirtualIPFunctionsImpl {

    public static final IVirtualIPFunctionsImpl INSTANCE = new VirtualIPFunctionsImpl();

    private VirtualIPFunctionsImpl() {}

  }
  
  public static class VirtualIPFunctions {

    private VirtualIPFunctions() {}

  }

  public static interface ITopologyEnvironmentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b973cf54-51b0-11ea-a946-13c393300b57")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> AllSystemConfiguration();

    @IDynamicResourceExtension.MethodId("d3212487-51b0-11ea-a946-13c393300b57")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> AllSystemConfigurationDistinct();

    @IDynamicResourceExtension.MethodId("b3f3530a-84d5-11ea-ade9-0f308d716192")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSiteWithHosts> AllAbstractSiteHosts();

    @IDynamicResourceExtension.MethodId("7b9663a7-7c0b-11eb-838e-5dc8f4bc1072")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> AllHosts();

    @IDynamicResourceExtension.MethodId("7e2abbba-b4a3-11ea-b938-599963fc0a84")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite> AllAbstractSites();

    @IDynamicResourceExtension.MethodId("c108dd55-b1fc-11ea-a3a2-e9d3344bee73")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IRN GetRN(final java.lang.String rnName);

    @IDynamicResourceExtension.MethodId("d4ddc527-b1fc-11ea-a3a2-e9d3344bee73")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IRN> AllRNs();

    @IDynamicResourceExtension.MethodId("413834c0-b474-11ea-b938-599963fc0a84")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost GetAbstractHost(final java.lang.String siteName, final java.lang.String hostName);

    @IDynamicResourceExtension.MethodId("6f2ed2cf-b47e-11ea-b938-599963fc0a84")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite GetAbstractSite(final java.lang.String siteName);

  }
  
  public static interface ITopologyEnvironmentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("c108dd55-b1fc-11ea-a3a2-e9d3344bee73")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IRN GetRN(final java.lang.String rnName, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ITopologyEnvironment topologyEnvironment);

    @IDynamicResourceExtension.MethodId("413834c0-b474-11ea-b938-599963fc0a84")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost GetAbstractHost(final java.lang.String siteName, final java.lang.String hostName, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ITopologyEnvironment topologyEnvironment);

    @IDynamicResourceExtension.MethodId("6f2ed2cf-b47e-11ea-b938-599963fc0a84")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite GetAbstractSite(final java.lang.String siteName, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ITopologyEnvironment topologyEnvironment);

  }
  
  public static class TopologyEnvironmentFunctionsImpl implements ITopologyEnvironmentFunctionsImpl {

    public static final ITopologyEnvironmentFunctionsImpl INSTANCE = new TopologyEnvironmentFunctionsImpl();

    private TopologyEnvironmentFunctionsImpl() {}

    @Override
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IRN GetRN(final java.lang.String rnName, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ITopologyEnvironment topologyEnvironment) {
      /* Begin Protected Region [[c108dd55-b1fc-11ea-a3a2-e9d3344bee73]] */
      final var allRNs = topologyEnvironment.extension(ITopologyEnvironmentFunctions.class).AllRNs();
      for (final IRN rn : allRNs) {
      	Logger.instance().logInfo("Verify " + rnName + " with " + rn.selectName());
      	if (rn.selectName().equalsIgnoreCase(rnName)) {
      		return rn;
      	}
      }
      return null;
      /* End Protected Region   [[c108dd55-b1fc-11ea-a3a2-e9d3344bee73]] */
    }

    @Override
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost GetAbstractHost(final java.lang.String siteName, final java.lang.String hostName, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ITopologyEnvironment topologyEnvironment) {
      /* Begin Protected Region [[413834c0-b474-11ea-b938-599963fc0a84]] */
      final var abstractSite = topologyEnvironment.extension(ITopologyEnvironmentFunctions.class)
      		.GetAbstractSite(siteName);

      if (abstractSite == null) {
      	return null;
      }

      final var abstractSiteFunctions = abstractSite.extension(IAbstractSiteFunctions.class);

      for (final IAbstractHost host : abstractSiteFunctions.AllHosts()) {
      	final var abstractHostFunctions = host.extension(IAbstractHostFunctions.class);
      	final var hostSimpleName = abstractHostFunctions.SimpleName();
      	if (hostSimpleName.equalsIgnoreCase(hostName)) {
      		return host;
      	}
      }
      return null;
      /* End Protected Region   [[413834c0-b474-11ea-b938-599963fc0a84]] */
    }

    @Override
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite GetAbstractSite(final java.lang.String siteName, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ITopologyEnvironment topologyEnvironment) {
      /* Begin Protected Region [[6f2ed2cf-b47e-11ea-b938-599963fc0a84]] */
      Logger.instance().logInfo("Searching for site " + siteName);
      final var abstractSites = topologyEnvironment.extension(ITopologyEnvironmentFunctions.class)
      		.AllAbstractSites();

      for (final IAbstractSite abstractSite : abstractSites) {
      	Logger.instance().logInfo("Searching in site " + abstractSite.selectName());
      	if (siteName.equalsIgnoreCase(abstractSite.selectName())) {
      		return abstractSite;
      	}
      }
      return null;
      /* End Protected Region   [[6f2ed2cf-b47e-11ea-b938-599963fc0a84]] */
    }

  }
  
  public static class TopologyEnvironmentFunctions {

    private TopologyEnvironmentFunctions() {}

    public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IRN GetRN(final java.lang.String rnName, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ITopologyEnvironment topologyEnvironment) {
      return DynamicResourceUtil.invoke(ITopologyEnvironmentFunctionsImpl.class, TopologyEnvironmentFunctionsImpl.INSTANCE, topologyEnvironment).GetRN(rnName, topologyEnvironment);
    }

    public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost GetAbstractHost(final java.lang.String siteName, final java.lang.String hostName, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ITopologyEnvironment topologyEnvironment) {
      return DynamicResourceUtil.invoke(ITopologyEnvironmentFunctionsImpl.class, TopologyEnvironmentFunctionsImpl.INSTANCE, topologyEnvironment).GetAbstractHost(siteName, hostName, topologyEnvironment);
    }

    public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite GetAbstractSite(final java.lang.String siteName, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ITopologyEnvironment topologyEnvironment) {
      return DynamicResourceUtil.invoke(ITopologyEnvironmentFunctionsImpl.class, TopologyEnvironmentFunctionsImpl.INSTANCE, topologyEnvironment).GetAbstractSite(siteName, topologyEnvironment);
    }

  }

  public static interface INamedHostFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("940f54af-570f-11ea-91a9-1992072893b1")
    public java.lang.String ShortName();

  }
  
  public static interface INamedHostFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class NamedHostFunctionsImpl implements INamedHostFunctionsImpl {

    public static final INamedHostFunctionsImpl INSTANCE = new NamedHostFunctionsImpl();

    private NamedHostFunctionsImpl() {}

  }
  
  public static class NamedHostFunctions {

    private NamedHostFunctions() {}

  }

  public static interface IMBSHostFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d129ed0d-57c9-11ea-bd7a-4baf1bc87b3c")
    public java.lang.String ShortName();

  }
  
  public static interface IMBSHostFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class MBSHostFunctionsImpl implements IMBSHostFunctionsImpl {

    public static final IMBSHostFunctionsImpl INSTANCE = new MBSHostFunctionsImpl();

    private MBSHostFunctionsImpl() {}

  }
  
  public static class MBSHostFunctions {

    private MBSHostFunctions() {}

  }

  public static interface IStringLiteralFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("aa16144f-57cc-11ea-bd7a-4baf1bc87b3c")
    public java.lang.String AddDash();

  }
  
  public static interface IStringLiteralFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("aa16144f-57cc-11ea-bd7a-4baf1bc87b3c")
    public java.lang.String AddDash(final java.lang.String stringLiteral);

  }
  
  public static class StringLiteralFunctionsImpl implements IStringLiteralFunctionsImpl {

    public static final IStringLiteralFunctionsImpl INSTANCE = new StringLiteralFunctionsImpl();

    private StringLiteralFunctionsImpl() {}

    @Override
    public java.lang.String AddDash(final java.lang.String stringLiteral) {
      /* Begin Protected Region [[aa16144f-57cc-11ea-bd7a-4baf1bc87b3c]] */
      try {
      	if (!stringLiteral.isEmpty()) {
      		return "-";
      	}
      	return "";
      } catch (final java.lang.NullPointerException e) {
      	return null;
      }
      /* End Protected Region   [[aa16144f-57cc-11ea-bd7a-4baf1bc87b3c]] */
    }

  }
  
  public static class StringLiteralFunctions {

    private StringLiteralFunctions() {}

    public static java.lang.String AddDash(final java.lang.String stringLiteral) {
      return DynamicResourceUtil.invoke(IStringLiteralFunctionsImpl.class, StringLiteralFunctionsImpl.INSTANCE, stringLiteral).AddDash(stringLiteral);
    }

  }

  public static interface ISiteFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("66d2a1b5-8e02-11ea-b01b-6bc31a0e971d")
    public java.lang.String ShortName();

    @IDynamicResourceExtension.MethodId("3ede2031-d5c9-11ec-ad12-8d6f8e00bc94")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> AllowAccessWith();

  }
  
  public static interface ISiteFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SiteFunctionsImpl implements ISiteFunctionsImpl {

    public static final ISiteFunctionsImpl INSTANCE = new SiteFunctionsImpl();

    private SiteFunctionsImpl() {}

  }
  
  public static class SiteFunctions {

    private SiteFunctions() {}

  }

  public static interface IMulti_TNFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("915eafea-dd82-11ea-9383-71e9cf1c59dd")
    public java.lang.String MonitoringSiteName();

  }
  
  public static interface IMulti_TNFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class Multi_TNFunctionsImpl implements IMulti_TNFunctionsImpl {

    public static final IMulti_TNFunctionsImpl INSTANCE = new Multi_TNFunctionsImpl();

    private Multi_TNFunctionsImpl() {}

  }
  
  public static class Multi_TNFunctions {

    private Multi_TNFunctions() {}

  }

  public static interface IApplicationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("35be17e0-1df7-11eb-9bc6-673ab35ba343")
    public java.lang.String ShortName();

  }
  
  public static interface IApplicationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("35be17e0-1df7-11eb-9bc6-673ab35ba343")
    public java.lang.String ShortName(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IApplication application);

  }
  
  public static class ApplicationFunctionsImpl implements IApplicationFunctionsImpl {

    public static final IApplicationFunctionsImpl INSTANCE = new ApplicationFunctionsImpl();

    private ApplicationFunctionsImpl() {}

    @Override
    public java.lang.String ShortName(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IApplication application) {
      return null;
    }

  }
  
  public static class ApplicationFunctions {

    private ApplicationFunctions() {}

    public static java.lang.String ShortName(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IApplication application) {
      return DynamicResourceUtil.invoke(IApplicationFunctionsImpl.class, ApplicationFunctionsImpl.INSTANCE, application).ShortName(application);
    }

  }

  public static interface IOwnerAwareFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ed99b08f-1bac-11ec-b20c-778c25ff7c96")
    public java.lang.String Owner();

  }
  
  public static interface IOwnerAwareFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class OwnerAwareFunctionsImpl implements IOwnerAwareFunctionsImpl {

    public static final IOwnerAwareFunctionsImpl INSTANCE = new OwnerAwareFunctionsImpl();

    private OwnerAwareFunctionsImpl() {}

  }
  
  public static class OwnerAwareFunctions {

    private OwnerAwareFunctions() {}

  }

  public static interface IRemoteSiteFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("87195624-d5c9-11ec-ad12-8d6f8e00bc94")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> AllowAccessWith();

  }
  
  public static interface IRemoteSiteFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("87195624-d5c9-11ec-ad12-8d6f8e00bc94")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> AllowAccessWith(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IRemoteSite remoteSite);

  }
  
  public static class RemoteSiteFunctionsImpl implements IRemoteSiteFunctionsImpl {

    public static final IRemoteSiteFunctionsImpl INSTANCE = new RemoteSiteFunctionsImpl();

    private RemoteSiteFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> AllowAccessWith(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IRemoteSite remoteSite) {
      return null;
    }

  }
  
  public static class RemoteSiteFunctions {

    private RemoteSiteFunctions() {}

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> AllowAccessWith(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IRemoteSite remoteSite) {
      return DynamicResourceUtil.invoke(IRemoteSiteFunctionsImpl.class, RemoteSiteFunctionsImpl.INSTANCE, remoteSite).AllowAccessWith(remoteSite);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,7b6d94a1-9370-11e9-8139-e76b19cfb4bf,v3zJ5Ei9hK96PFnMYmYVPkTUDC8=] */
