package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[2acb3661-7b0e-11e9-a70f-4dc03941a024,imports]] */
import cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.FunctionSpace_Topology.IAbstractHostFunctions;
import java.util.stream.Collectors;
/* End Protected Region   [[2acb3661-7b0e-11e9-a70f-4dc03941a024,imports]] */

public class FunctionSpace_Network {

  /* Begin Protected Region [[2acb3661-7b0e-11e9-a70f-4dc03941a024]] */

  /* End Protected Region   [[2acb3661-7b0e-11e9-a70f-4dc03941a024]] */


  public static interface IAbstractNetworkFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b8d3f6b9-ca3f-11e9-b209-f7d5bd0d6e0f")
    public List<cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetworkNode> GetNodes();

    @IDynamicResourceExtension.MethodId("1892b598-6416-11ee-8110-b92476c997e7")
    public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.IIPNetworkConcept NetworkConcept();

    @IDynamicResourceExtension.MethodId("0e8bc3ec-6417-11ee-8110-b92476c997e7")
    public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSite NetworkSite();

  }
  
  public static interface IAbstractNetworkFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractNetworkFunctionsImpl implements IAbstractNetworkFunctionsImpl {

    public static final IAbstractNetworkFunctionsImpl INSTANCE = new AbstractNetworkFunctionsImpl();

    private AbstractNetworkFunctionsImpl() {}

  }
  
  public static class AbstractNetworkFunctions {

    private AbstractNetworkFunctions() {}

  }

  public static interface IAbstractPhysicalNetworkFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2f52abac-ca42-11e9-83b0-559396620907")
    public List<cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetworkNode> GetNodes();

    @IDynamicResourceExtension.MethodId("e7ef1f46-5176-11ea-b9cb-85bbdfd861be")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkHostNode> AllHostNodes();

    @IDynamicResourceExtension.MethodId("fd85db1d-5176-11ea-b9cb-85bbdfd861be")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost> AllAbstractHosts();

    @IDynamicResourceExtension.MethodId("2e929d64-5177-11ea-b9cb-85bbdfd861be")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> AllSystemConfigurations();

  }
  
  public static interface IAbstractPhysicalNetworkFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractPhysicalNetworkFunctionsImpl implements IAbstractPhysicalNetworkFunctionsImpl {

    public static final IAbstractPhysicalNetworkFunctionsImpl INSTANCE = new AbstractPhysicalNetworkFunctionsImpl();

    private AbstractPhysicalNetworkFunctionsImpl() {}

  }
  
  public static class AbstractPhysicalNetworkFunctions {

    private AbstractPhysicalNetworkFunctions() {}

  }

  public static interface IAbstractLogicalNetworkFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("3f16c5d8-ca42-11e9-83b0-559396620907")
    public List<cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetworkNode> GetNodes();

    @IDynamicResourceExtension.MethodId("d2cb1217-b074-11ea-b791-9b401fd02359")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost> GetAbstractHosts();

  }
  
  public static interface IAbstractLogicalNetworkFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractLogicalNetworkFunctionsImpl implements IAbstractLogicalNetworkFunctionsImpl {

    public static final IAbstractLogicalNetworkFunctionsImpl INSTANCE = new AbstractLogicalNetworkFunctionsImpl();

    private AbstractLogicalNetworkFunctionsImpl() {}

  }
  
  public static class AbstractLogicalNetworkFunctions {

    private AbstractLogicalNetworkFunctions() {}

  }

  public static interface IAbstractNetworkAwareFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9b7b1e1b-ca42-11e9-83b0-559396620907")
    public List<cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetworkNode> GetNodes();

  }
  
  public static interface IAbstractNetworkAwareFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractNetworkAwareFunctionsImpl implements IAbstractNetworkAwareFunctionsImpl {

    public static final IAbstractNetworkAwareFunctionsImpl INSTANCE = new AbstractNetworkAwareFunctionsImpl();

    private AbstractNetworkAwareFunctionsImpl() {}

  }
  
  public static class AbstractNetworkAwareFunctions {

    private AbstractNetworkAwareFunctions() {}

  }

  public static interface INetworkHostNodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("da20bbed-ca55-11e9-83b0-559396620907")
    public java.lang.String Name();

    @IDynamicResourceExtension.MethodId("18d59f34-dec4-11e9-b714-478bec98e62d")
    public java.lang.String GroupName(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration systemConfiguration, final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone securitySubZone);

    @IDynamicResourceExtension.MethodId("d38cc226-df6c-11e9-9827-a1514ee8d06a")
    public java.lang.String InterfaceTypeName(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone subZone);

    @IDynamicResourceExtension.MethodId("813b3e9d-df72-11e9-9827-a1514ee8d06a")
    public java.lang.String Guid(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration systemConfiguration, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSiteWithHosts abstractNetdomainHosts, final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone securitySubZone);

    @IDynamicResourceExtension.MethodId("fd907b14-a0f4-11ea-9ce3-334b0943657e")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkHostNode> AllNetworkHostNodes();

    @IDynamicResourceExtension.MethodId("80fe48ff-f40a-11ea-ade2-eb32c9704a85")
    public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.IIPNetworkConcept NetworkConcept();

    @IDynamicResourceExtension.MethodId("aacd4176-f40a-11ea-ade2-eb32c9704a85")
    public cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.domain.javamodel.IDomain DefaultDomain();

    @IDynamicResourceExtension.MethodId("4273ea53-f408-11ea-ade2-eb32c9704a85")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkHostNode> InDomain(final cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.domain.javamodel.IDomain domain);

    @IDynamicResourceExtension.MethodId("a9fbd2d9-9b98-11ec-8985-9dc243cc3ec6")
    public java.lang.Boolean DNSRecordSet();

    @IDynamicResourceExtension.MethodId("7c03499a-e186-11ec-bbb2-25acacf78f08")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkHostNode> OnlyToGenerate();

    @IDynamicResourceExtension.MethodId("7f82ff07-ea83-11ed-8ef9-93417a35a5ab")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost> SelectHosts();

    @IDynamicResourceExtension.MethodId("71b29b11-0ab6-11ee-a86d-478d6a2bb65d")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost> SelectHostsSorted();

    @IDynamicResourceExtension.MethodId("521dd1a0-0ab8-11ee-a86d-478d6a2bb65d")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost> SelectHosts_2();

    @IDynamicResourceExtension.MethodId("db40846a-0ab9-11ee-a86d-478d6a2bb65d")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost> AllAbstractHosts();

    @IDynamicResourceExtension.MethodId("29fee71c-0aba-11ee-a86d-478d6a2bb65d")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> AllSystemConfigurationsInNetwork();

    @IDynamicResourceExtension.MethodId("7a2454c6-0aba-11ee-a86d-478d6a2bb65d")
    public cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone SecuritySubZone();

    @IDynamicResourceExtension.MethodId("aa3a661e-0abb-11ee-a86d-478d6a2bb65d")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost> AllAbstractHostsWhereSecuritySubzone(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone securitySubZone);

  }
  
  public static interface INetworkHostNodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("4273ea53-f408-11ea-ade2-eb32c9704a85")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkHostNode> InDomain(final cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.domain.javamodel.IDomain domain, final List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkHostNode> networkHostNodeList);

    @IDynamicResourceExtension.MethodId("a9fbd2d9-9b98-11ec-8985-9dc243cc3ec6")
    public java.lang.Boolean DNSRecordSet(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkHostNode networkHostNode);

    @IDynamicResourceExtension.MethodId("7c03499a-e186-11ec-bbb2-25acacf78f08")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkHostNode> OnlyToGenerate(final List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkHostNode> networkHostNodeList);

    @IDynamicResourceExtension.MethodId("521dd1a0-0ab8-11ee-a86d-478d6a2bb65d")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost> SelectHosts_2(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkHostNode networkHostNode);

  }
  
  public static class NetworkHostNodeFunctionsImpl implements INetworkHostNodeFunctionsImpl {

    public static final INetworkHostNodeFunctionsImpl INSTANCE = new NetworkHostNodeFunctionsImpl();

    private NetworkHostNodeFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkHostNode> InDomain(final cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.domain.javamodel.IDomain domain, final List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkHostNode> networkHostNodeList) {
      /* Begin Protected Region [[4273ea53-f408-11ea-ade2-eb32c9704a85]] */
      return networkHostNodeList.stream().filter(x -> {
      	final var functions = x.extension(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.FunctionSpace_Network.INetworkHostNodeFunctions.class);
      	if( x.selectRestrictToDomains().isEmpty() ) {
      		return functions.DefaultDomain().equals(domain);
      	}

      	return x.selectRestrictToDomains().contains(domain);
      }).collect(Collectors.toList());
      /* End Protected Region   [[4273ea53-f408-11ea-ade2-eb32c9704a85]] */
    }

    @Override
    public java.lang.Boolean DNSRecordSet(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkHostNode networkHostNode) {
      /* Begin Protected Region [[a9fbd2d9-9b98-11ec-8985-9dc243cc3ec6]] */
      if( networkHostNode.selectExportDNSRecord() == null) {
      	return true;
      }

      return networkHostNode.selectExportDNSRecord();
      /* End Protected Region   [[a9fbd2d9-9b98-11ec-8985-9dc243cc3ec6]] */
    }

    @Override
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkHostNode> OnlyToGenerate(final List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkHostNode> networkHostNodeList) {
      /* Begin Protected Region [[7c03499a-e186-11ec-bbb2-25acacf78f08]] */
      return networkHostNodeList.stream().filter( x -> {
      	final var skipHostGeneration = x.selectHost().selectSkipHostGeneration();
      	if( skipHostGeneration == null || !skipHostGeneration.booleanValue()) {

      		final var functions = x.selectHost().extension(IAbstractHostFunctions.class);
      		final var centralorTnSite = functions.CentralOrTNSite();

      		final var skipHostGenerationFor = centralorTnSite.selectSkipHostGenerationFor();
      		final var cmp = x.selectHost().selectInstanceOf();
      		if (skipHostGenerationFor != null && skipHostGenerationFor.contains(cmp)) {
      			ch.actifsource.util.log.Logger.instance().logInfo("Generation skipped " + functions.AliasOrHostname());
      			return false;
      		}
      		return true;
      	}
      	return false;
      }).collect(Collectors.toList());
      /* End Protected Region   [[7c03499a-e186-11ec-bbb2-25acacf78f08]] */
    }

    @Override
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost> SelectHosts_2(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkHostNode networkHostNode) {
      /* Begin Protected Region [[521dd1a0-0ab8-11ee-a86d-478d6a2bb65d]] */
      final var networkHostNodeFunctions = networkHostNode.extension(INetworkHostNodeFunctions.class);
      final var securitySubZone = networkHostNodeFunctions.SecuritySubZone();
      return networkHostNodeFunctions.AllAbstractHostsWhereSecuritySubzone(securitySubZone);
      /* End Protected Region   [[521dd1a0-0ab8-11ee-a86d-478d6a2bb65d]] */
    }

  }
  
  public static class NetworkHostNodeFunctions {

    private NetworkHostNodeFunctions() {}

    public static List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkHostNode> InDomain(final cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.domain.javamodel.IDomain domain, final List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkHostNode> networkHostNodeList) {
      return DynamicResourceUtil.invoke(INetworkHostNodeFunctionsImpl.class, NetworkHostNodeFunctionsImpl.INSTANCE, networkHostNodeList).InDomain(domain, networkHostNodeList);
    }

    public static java.lang.Boolean DNSRecordSet(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkHostNode networkHostNode) {
      return DynamicResourceUtil.invoke(INetworkHostNodeFunctionsImpl.class, NetworkHostNodeFunctionsImpl.INSTANCE, networkHostNode).DNSRecordSet(networkHostNode);
    }

    public static List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkHostNode> OnlyToGenerate(final List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkHostNode> networkHostNodeList) {
      return DynamicResourceUtil.invoke(INetworkHostNodeFunctionsImpl.class, NetworkHostNodeFunctionsImpl.INSTANCE, networkHostNodeList).OnlyToGenerate(networkHostNodeList);
    }

    public static List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost> SelectHosts_2(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkHostNode networkHostNode) {
      return DynamicResourceUtil.invoke(INetworkHostNodeFunctionsImpl.class, NetworkHostNodeFunctionsImpl.INSTANCE, networkHostNode).SelectHosts_2(networkHostNode);
    }

  }

  public static interface INetworkSiteFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e0940269-4cb1-11ea-9133-491af9338ef7")
    public java.lang.Integer FunctionId();

    @IDynamicResourceExtension.MethodId("c47a831a-b212-11ea-a3a2-e9d3344bee73")
    public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSubZone GetNetworkSubZone(final java.lang.String name);

    @IDynamicResourceExtension.MethodId("38a08e41-eb06-11ec-84eb-43814bf81118")
    public List<cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask> ExcludeCIDRForADSite();

    @IDynamicResourceExtension.MethodId("9ed2d99e-f079-11ec-9c6a-1f9bef34e8b6")
    public List<cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask> SelectCIDRForADSite();

  }
  
  public static interface INetworkSiteFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("c47a831a-b212-11ea-a3a2-e9d3344bee73")
    public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSubZone GetNetworkSubZone(final java.lang.String name, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSite networkSite);

    @IDynamicResourceExtension.MethodId("9ed2d99e-f079-11ec-9c6a-1f9bef34e8b6")
    public List<cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask> SelectCIDRForADSite(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSite networkSite);

  }
  
  public static class NetworkSiteFunctionsImpl implements INetworkSiteFunctionsImpl {

    public static final INetworkSiteFunctionsImpl INSTANCE = new NetworkSiteFunctionsImpl();

    private NetworkSiteFunctionsImpl() {}

    @Override
    public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSubZone GetNetworkSubZone(final java.lang.String name, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSite networkSite) {
      /* Begin Protected Region [[c47a831a-b212-11ea-a3a2-e9d3344bee73]] */
      for( final var networkSubZone : networkSite.selectNetworkSubZone().values() ) {
      	final var subZoneFunctions = networkSubZone.extension(cleon.architecturemethods.arc42.metamodel.template.xml.FunctionSpace_XML.INetworkSubZoneFunctions.class);
      	final var subzoneName = subZoneFunctions.Name();
      	if( subzoneName.equalsIgnoreCase(name)) {
      		return networkSubZone;
      	}
      }
      return null;
      /* End Protected Region   [[c47a831a-b212-11ea-a3a2-e9d3344bee73]] */
    }

    @Override
    public List<cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask> SelectCIDRForADSite(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSite networkSite) {
      /* Begin Protected Region [[9ed2d99e-f079-11ec-9c6a-1f9bef34e8b6]] */
      if( !networkSite.selectExportADSite()) {
      	return null;
      }

      return networkSite.extension(INetworkSiteFunctions.class).ExcludeCIDRForADSite();
      /* End Protected Region   [[9ed2d99e-f079-11ec-9c6a-1f9bef34e8b6]] */
    }

  }
  
  public static class NetworkSiteFunctions {

    private NetworkSiteFunctions() {}

    public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSubZone GetNetworkSubZone(final java.lang.String name, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSite networkSite) {
      return DynamicResourceUtil.invoke(INetworkSiteFunctionsImpl.class, NetworkSiteFunctionsImpl.INSTANCE, networkSite).GetNetworkSubZone(name, networkSite);
    }

    public static List<cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask> SelectCIDRForADSite(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSite networkSite) {
      return DynamicResourceUtil.invoke(INetworkSiteFunctionsImpl.class, NetworkSiteFunctionsImpl.INSTANCE, networkSite).SelectCIDRForADSite(networkSite);
    }

  }

  public static interface INetworkEnvironmentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2a3f2c0c-b212-11ea-a3a2-e9d3344bee73")
    public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSite GetSite(final java.lang.String name);

    @IDynamicResourceExtension.MethodId("c2dc3cb7-b478-11ea-b938-599963fc0a84")
    public cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_D GetIP(final java.lang.String ip);

  }
  
  public static interface INetworkEnvironmentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("2a3f2c0c-b212-11ea-a3a2-e9d3344bee73")
    public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSite GetSite(final java.lang.String name, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkEnvironment networkEnvironment);

  }
  
  public static class NetworkEnvironmentFunctionsImpl implements INetworkEnvironmentFunctionsImpl {

    public static final INetworkEnvironmentFunctionsImpl INSTANCE = new NetworkEnvironmentFunctionsImpl();

    private NetworkEnvironmentFunctionsImpl() {}

    @Override
    public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSite GetSite(final java.lang.String name, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkEnvironment networkEnvironment) {
      /* Begin Protected Region [[2a3f2c0c-b212-11ea-a3a2-e9d3344bee73]] */
      for( final var networkSite : networkEnvironment.selectNetworkSite().values()) {
      	if( networkSite.selectSite().selectName().equalsIgnoreCase(name)) {
      		return networkSite;
      	}
      }
      return null;
      /* End Protected Region   [[2a3f2c0c-b212-11ea-a3a2-e9d3344bee73]] */
    }

  }
  
  public static class NetworkEnvironmentFunctions {

    private NetworkEnvironmentFunctions() {}

    public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkSite GetSite(final java.lang.String name, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkEnvironment networkEnvironment) {
      return DynamicResourceUtil.invoke(INetworkEnvironmentFunctionsImpl.class, NetworkEnvironmentFunctionsImpl.INSTANCE, networkEnvironment).GetSite(name, networkEnvironment);
    }

  }

  public static interface INetworkSubZoneFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f0059be4-4cf1-11ea-b2c1-57c8b0ec51b7")
    public java.lang.String Vlan();

  }
  
  public static interface INetworkSubZoneFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class NetworkSubZoneFunctionsImpl implements INetworkSubZoneFunctionsImpl {

    public static final INetworkSubZoneFunctionsImpl INSTANCE = new NetworkSubZoneFunctionsImpl();

    private NetworkSubZoneFunctionsImpl() {}

  }
  
  public static class NetworkSubZoneFunctions {

    private NetworkSubZoneFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,2acb3661-7b0e-11e9-a70f-4dc03941a024,JpYIhfanyBcVAP8DrTN3ymT3JG8=] */
