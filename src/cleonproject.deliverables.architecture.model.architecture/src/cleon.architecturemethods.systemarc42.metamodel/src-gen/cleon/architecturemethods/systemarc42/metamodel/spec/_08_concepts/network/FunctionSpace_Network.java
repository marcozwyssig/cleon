package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network;

import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
/* Begin Protected Region [[2acb3661-7b0e-11e9-a70f-4dc03941a024,imports]] */
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkSite;

public class FunctionSpace_Network {

  /* Begin Protected Region [[2acb3661-7b0e-11e9-a70f-4dc03941a024]] */

  /* End Protected Region   [[2acb3661-7b0e-11e9-a70f-4dc03941a024]] */


  public static class AbstractLogicalNetworkFunctions {

    private AbstractLogicalNetworkFunctions() {}

  }

  public static class AbstractLogicalNetworkFunctionsImpl implements IAbstractLogicalNetworkFunctionsImpl {

    public static final IAbstractLogicalNetworkFunctionsImpl INSTANCE = new AbstractLogicalNetworkFunctionsImpl();

    private AbstractLogicalNetworkFunctionsImpl() {}

  }

  public static class AbstractNetworkAwareFunctions {

    private AbstractNetworkAwareFunctions() {}

  }

  public static class AbstractNetworkAwareFunctionsImpl implements IAbstractNetworkAwareFunctionsImpl {

    public static final IAbstractNetworkAwareFunctionsImpl INSTANCE = new AbstractNetworkAwareFunctionsImpl();

    private AbstractNetworkAwareFunctionsImpl() {}

  }

  public static class AbstractNetworkFunctions {

    private AbstractNetworkFunctions() {}

  }

  public static class AbstractNetworkFunctionsImpl implements IAbstractNetworkFunctionsImpl {

    public static final IAbstractNetworkFunctionsImpl INSTANCE = new AbstractNetworkFunctionsImpl();

    private AbstractNetworkFunctionsImpl() {}

  }

  public static class AbstractPhysicalNetworkFunctions {

    private AbstractPhysicalNetworkFunctions() {}

  }

  public static class AbstractPhysicalNetworkFunctionsImpl implements IAbstractPhysicalNetworkFunctionsImpl {

    public static final IAbstractPhysicalNetworkFunctionsImpl INSTANCE = new AbstractPhysicalNetworkFunctionsImpl();

    private AbstractPhysicalNetworkFunctionsImpl() {}

  }

  public static class GatewayNodeFunctions {

    private GatewayNodeFunctions() {}

  }

  public static class GatewayNodeFunctionsImpl implements IGatewayNodeFunctionsImpl {

    public static final IGatewayNodeFunctionsImpl INSTANCE = new GatewayNodeFunctionsImpl();

    private GatewayNodeFunctionsImpl() {}

  }

  public static class HostNodeFunctions {

    private HostNodeFunctions() {}

  }

  public static class HostNodeFunctionsImpl implements IHostNodeFunctionsImpl {

    public static final IHostNodeFunctionsImpl INSTANCE = new HostNodeFunctionsImpl();

    private HostNodeFunctionsImpl() {}

  }

  public interface IAbstractLogicalNetworkFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d2cb1217-b074-11ea-b791-9b401fd02359") List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> GetAbstractHosts();

    @IDynamicResourceExtension.MethodId("3f16c5d8-ca42-11e9-83b0-559396620907") List<cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetworkNode> GetNodes();

  }

  public interface IAbstractLogicalNetworkFunctionsImpl extends IDynamicResourceExtensionJavaImpl {

  }

  public interface IAbstractNetworkAwareFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9b7b1e1b-ca42-11e9-83b0-559396620907") List<cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetworkNode> GetNodes();

  }

  public interface IAbstractNetworkAwareFunctionsImpl extends IDynamicResourceExtensionJavaImpl {

  }

  public interface IAbstractNetworkFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b8d3f6b9-ca3f-11e9-b209-f7d5bd0d6e0f") List<cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetworkNode> GetNodes();

  }

  public interface IAbstractNetworkFunctionsImpl extends IDynamicResourceExtensionJavaImpl {

  }

  public interface IAbstractPhysicalNetworkFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fd85db1d-5176-11ea-b9cb-85bbdfd861be") List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> AllAbstractHosts();

    @IDynamicResourceExtension.MethodId("e7ef1f46-5176-11ea-b9cb-85bbdfd861be") List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.IHostNode> AllHostNodes();

    @IDynamicResourceExtension.MethodId("2e929d64-5177-11ea-b9cb-85bbdfd861be") List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> AllSystemConfigurations();

    @IDynamicResourceExtension.MethodId("2f52abac-ca42-11e9-83b0-559396620907") List<cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetworkNode> GetNodes();

  }

  public interface IAbstractPhysicalNetworkFunctionsImpl extends IDynamicResourceExtensionJavaImpl {

  }

  public interface IGatewayNodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d345aafb-ca55-11e9-83b0-559396620907") java.lang.String Name();

  }

  public interface IGatewayNodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {

  }

  public interface IHostNodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fd907b14-a0f4-11ea-9ce3-334b0943657e") List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.IHostNode> AllHostNodes();

    @IDynamicResourceExtension.MethodId("18d59f34-dec4-11e9-b714-478bec98e62d") java.lang.String GroupName(final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration systemConfiguration, final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone securitySubZone);

    @IDynamicResourceExtension.MethodId("813b3e9d-df72-11e9-9827-a1514ee8d06a") java.lang.String Guid(final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration systemConfiguration, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSiteWithHosts abstractNetdomainHosts, final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone securitySubZone);

    @IDynamicResourceExtension.MethodId("d38cc226-df6c-11e9-9827-a1514ee8d06a") java.lang.String InterfaceTypeName(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone subZone);

    @IDynamicResourceExtension.MethodId("da20bbed-ca55-11e9-83b0-559396620907") java.lang.String Name();

  }

  public interface IHostNodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {

  }

  public interface INamedNetworkNodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b2bccfa0-ca55-11e9-83b0-559396620907") java.lang.String Name();

  }

  public interface INamedNetworkNodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {

  }

  public interface INetworkEnvironmentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2a3f2c0c-b212-11ea-a3a2-e9d3344bee73") cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkSite GetRN(final java.lang.String name);

  }

  public interface INetworkEnvironmentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {

    @IDynamicResourceExtension.MethodId("2a3f2c0c-b212-11ea-a3a2-e9d3344bee73") cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkSite GetRN(final java.lang.String name, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkEnvironment networkEnvironment);

  }

  public interface INetworkNodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("3436b570-7b0e-11e9-a70f-4dc03941a024") List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.javamodel.INode> GetNetworkNodes();

    @IDynamicResourceExtension.MethodId("1d92d94f-7b1a-11e9-a70f-4dc03941a024") List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.javamodel.INode> GetNetworkNodesFromNetdomain();

    @IDynamicResourceExtension.MethodId("dd95c0b7-7b11-11e9-a70f-4dc03941a024") List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.javamodel.INode> GetNodesFromSecurityZone();

  }

  public interface INetworkNodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {

  }

  public interface INetworkSiteFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e0940269-4cb1-11ea-9133-491af9338ef7") java.lang.Integer FunctionId();

    @IDynamicResourceExtension.MethodId("c47a831a-b212-11ea-a3a2-e9d3344bee73") cleon.modelinglanguages.network.metamodel.spec.javamodel.INetworkSubZone GetNetworkSubZone(final java.lang.String name);

  }

  public interface INetworkSiteFunctionsImpl extends IDynamicResourceExtensionJavaImpl {

    @IDynamicResourceExtension.MethodId("c47a831a-b212-11ea-a3a2-e9d3344bee73") cleon.modelinglanguages.network.metamodel.spec.javamodel.INetworkSubZone GetNetworkSubZone(final java.lang.String name, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkSite networkSite);

  }

  public static class NamedNetworkNodeFunctions {

    private NamedNetworkNodeFunctions() {}

  }

  public static class NamedNetworkNodeFunctionsImpl implements INamedNetworkNodeFunctionsImpl {

    public static final INamedNetworkNodeFunctionsImpl INSTANCE = new NamedNetworkNodeFunctionsImpl();

    private NamedNetworkNodeFunctionsImpl() {}

  }

  public static class NetworkEnvironmentFunctions {

    public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkSite GetRN(final java.lang.String name, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkEnvironment networkEnvironment) {
      return DynamicResourceUtil.invoke(INetworkEnvironmentFunctionsImpl.class, NetworkEnvironmentFunctionsImpl.INSTANCE, networkEnvironment).GetRN(name, networkEnvironment);
    }

    private NetworkEnvironmentFunctions() {}

  }

  public static class NetworkEnvironmentFunctionsImpl implements INetworkEnvironmentFunctionsImpl {

    public static final INetworkEnvironmentFunctionsImpl INSTANCE = new NetworkEnvironmentFunctionsImpl();

    private NetworkEnvironmentFunctionsImpl() {}

    @Override
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkSite GetRN(final java.lang.String name, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkEnvironment networkEnvironment) {
      /* Begin Protected Region [[2a3f2c0c-b212-11ea-a3a2-e9d3344bee73]] */
    	for( final INetworkSite networkSite : networkEnvironment.selectNetworkSite().values()) {
    		if( networkSite.selectSite().selectName().equalsIgnoreCase(name)) {
    			return networkSite;
    		}
		}
    	return null;
      /* End Protected Region   [[2a3f2c0c-b212-11ea-a3a2-e9d3344bee73]] */
    }

  }

  public static class NetworkNodeFunctions {

    private NetworkNodeFunctions() {}

  }

  public static class NetworkNodeFunctionsImpl implements INetworkNodeFunctionsImpl {

    public static final INetworkNodeFunctionsImpl INSTANCE = new NetworkNodeFunctionsImpl();

    private NetworkNodeFunctionsImpl() {}

  }

  public static class NetworkSiteFunctions {

    public static cleon.modelinglanguages.network.metamodel.spec.javamodel.INetworkSubZone GetNetworkSubZone(final java.lang.String name, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkSite networkSite) {
      return DynamicResourceUtil.invoke(INetworkSiteFunctionsImpl.class, NetworkSiteFunctionsImpl.INSTANCE, networkSite).GetNetworkSubZone(name, networkSite);
    }

    private NetworkSiteFunctions() {}

  }

  public static class NetworkSiteFunctionsImpl implements INetworkSiteFunctionsImpl {

    public static final INetworkSiteFunctionsImpl INSTANCE = new NetworkSiteFunctionsImpl();

    private NetworkSiteFunctionsImpl() {}

    @Override
    public cleon.modelinglanguages.network.metamodel.spec.javamodel.INetworkSubZone GetNetworkSubZone(final java.lang.String name, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkSite networkSite) {
      /* Begin Protected Region [[c47a831a-b212-11ea-a3a2-e9d3344bee73]] */
    	return null;
//    	for( final Resource key : networkSite.selectNetworkSubZone().keyIterable()) {
//    		Select.sim
//    	}
//
//    	for( INetworkSubZone networkSubZone : networkSite.selectNetworkSubZone().)
      /* End Protected Region   [[c47a831a-b212-11ea-a3a2-e9d3344bee73]] */
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,2acb3661-7b0e-11e9-a70f-4dc03941a024,yDzTQE4TWBDbdgvOQD2h9PCdHq4=] */
