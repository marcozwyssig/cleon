package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[7b6d94a1-9370-11e9-8139-e76b19cfb4bf,imports]] */
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSiteWithFunctionID;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IRN;
import ch.actifsource.util.log.Logger;
import java.util.stream.Collectors;
import cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.security.iam.javamodel.ISlaveActiveDirectorySystemConfiguration;
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
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSiteWithFunctionID> sortByFunctionId();

    @IDynamicResourceExtension.MethodId("394205d2-b07d-11ea-b791-9b401fd02359")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite ParentSite();

    @IDynamicResourceExtension.MethodId("0a9292f3-5e1a-11ea-b835-fbb06fdf6352")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> AllHosts();

    @IDynamicResourceExtension.MethodId("7442d538-b4a2-11ea-b938-599963fc0a84")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite> AllSites();

    @IDynamicResourceExtension.MethodId("69ca3de9-dd82-11ea-9383-71e9cf1c59dd")
    public java.lang.String MonitoringSiteName();

  }
  
  public static interface IAbstractSiteFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("ad33683d-3775-11ea-bb06-17b9485a5d0a")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSiteWithFunctionID> sortByFunctionId(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite> abstractSiteList);

  }
  
  public static class AbstractSiteFunctionsImpl implements IAbstractSiteFunctionsImpl {

    public static final IAbstractSiteFunctionsImpl INSTANCE = new AbstractSiteFunctionsImpl();

    private AbstractSiteFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSiteWithFunctionID> sortByFunctionId(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite> abstractSiteList) {
      /* Begin Protected Region [[ad33683d-3775-11ea-bb06-17b9485a5d0a]] */
      return abstractSiteList.stream().filter(x -> x instanceof IAbstractSiteWithFunctionID)
      		.map(x -> (IAbstractSiteWithFunctionID) x)
      		.sorted(java.util.Comparator.comparing(IAbstractSiteWithFunctionID::selectFunctionID))
      		.collect(Collectors.toList());
      /* End Protected Region   [[ad33683d-3775-11ea-bb06-17b9485a5d0a]] */
    }

  }
  
  public static class AbstractSiteFunctions {

    private AbstractSiteFunctions() {}

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSiteWithFunctionID> sortByFunctionId(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite> abstractSiteList) {
      return DynamicResourceUtil.invoke(IAbstractSiteFunctionsImpl.class, AbstractSiteFunctionsImpl.INSTANCE, abstractSiteList).sortByFunctionId(abstractSiteList);
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

  }
  
  public static interface IRNFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RNFunctionsImpl implements IRNFunctionsImpl {

    public static final IRNFunctionsImpl INSTANCE = new RNFunctionsImpl();

    private RNFunctionsImpl() {}

  }
  
  public static class RNFunctions {

    private RNFunctions() {}

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
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ICommunication> AllCommunications();

    @IDynamicResourceExtension.MethodId("8f5cb108-e076-11e9-aa67-4505845acdbd")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ICommunication> AllCommunicationsDistinct();

  }
  
  public static interface IAbstractSiteWithHostsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractSiteWithHostsFunctionsImpl implements IAbstractSiteWithHostsFunctionsImpl {

    public static final IAbstractSiteWithHostsFunctionsImpl INSTANCE = new AbstractSiteWithHostsFunctionsImpl();

    private AbstractSiteWithHostsFunctionsImpl() {}

  }
  
  public static class AbstractSiteWithHostsFunctions {

    private AbstractSiteWithHostsFunctions() {}

  }

  public static interface ITDMFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8289bc8e-93e1-11e9-8139-e76b19cfb4bf")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ITopology Topology();

  }
  
  public static interface ITDMFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TDMFunctionsImpl implements ITDMFunctionsImpl {

    public static final ITDMFunctionsImpl INSTANCE = new TDMFunctionsImpl();

    private TDMFunctionsImpl() {}

  }
  
  public static class TDMFunctions {

    private TDMFunctions() {}

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

    @IDynamicResourceExtension.MethodId("54955539-570f-11ea-91a9-1992072893b1")
    public java.lang.String SimpleName();

    @IDynamicResourceExtension.MethodId("3e1c6fa9-57cb-11ea-bd7a-4baf1bc87b3c")
    public java.lang.String Owner();

    @IDynamicResourceExtension.MethodId("0112faa4-b073-11ea-b791-9b401fd02359")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> OnlyReadonlyDomainController();

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
      		.filter(x -> x.selectInstanceOf() instanceof ISlaveActiveDirectorySystemConfiguration)
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
      final List<IRN> allRNs = topologyEnvironment.extension(ITopologyEnvironmentFunctions.class).AllRNs();
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
      final IAbstractSite abstractSite = topologyEnvironment.extension(ITopologyEnvironmentFunctions.class)
      		.GetAbstractSite(siteName);

      if (abstractSite == null) {
      	return null;
      }

      final IAbstractSiteFunctions abstractSiteFunctions = abstractSite.extension(IAbstractSiteFunctions.class);

      for (final IAbstractHost host : abstractSiteFunctions.AllHosts()) {
      	final IAbstractHostFunctions abstractHostFunctions = host.extension(IAbstractHostFunctions.class);
      	final String hostSimpleName = abstractHostFunctions.SimpleName();
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
      final List<IAbstractSite> abstractSites = topologyEnvironment
      		.extension(ITopologyEnvironmentFunctions.class).AllAbstractSites();

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

  public static interface ITNFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("915eafea-dd82-11ea-9383-71e9cf1c59dd")
    public java.lang.String MonitoringSiteName();

  }
  
  public static interface ITNFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TNFunctionsImpl implements ITNFunctionsImpl {

    public static final ITNFunctionsImpl INSTANCE = new TNFunctionsImpl();

    private TNFunctionsImpl() {}

  }
  
  public static class TNFunctions {

    private TNFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,7b6d94a1-9370-11e9-8139-e76b19cfb4bf,mQyMMx1yzJG/BlzbWDcLq/TEnZg=] */
