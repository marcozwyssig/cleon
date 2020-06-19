package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[2acb3661-7b0e-11e9-a70f-4dc03941a024,imports]] */
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkSite;
import cleon.architecturemethods.systemarc42.metamodel.template.xml.FunctionSpace_XML.INetworkSubZoneFunctions;
import cleon.modelinglanguages.network.metamodel.spec.javamodel.INetworkSubZone;
/* End Protected Region   [[2acb3661-7b0e-11e9-a70f-4dc03941a024,imports]] */

public class FunctionSpace_Network {

  /* Begin Protected Region [[2acb3661-7b0e-11e9-a70f-4dc03941a024]] */

  /* End Protected Region   [[2acb3661-7b0e-11e9-a70f-4dc03941a024]] */


  public static interface INetworkNodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("3436b570-7b0e-11e9-a70f-4dc03941a024")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.javamodel.INode> GetNetworkNodes();

    @IDynamicResourceExtension.MethodId("1d92d94f-7b1a-11e9-a70f-4dc03941a024")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.javamodel.INode> GetNetworkNodesFromNetdomain();

    @IDynamicResourceExtension.MethodId("dd95c0b7-7b11-11e9-a70f-4dc03941a024")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.javamodel.INode> GetNodesFromSecurityZone();

  }
  
  public static interface INetworkNodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class NetworkNodeFunctionsImpl implements INetworkNodeFunctionsImpl {

    public static final INetworkNodeFunctionsImpl INSTANCE = new NetworkNodeFunctionsImpl();

    private NetworkNodeFunctionsImpl() {}

  }
  
  public static class NetworkNodeFunctions {

    private NetworkNodeFunctions() {}

  }

  public static interface IAbstractNetworkFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b8d3f6b9-ca3f-11e9-b209-f7d5bd0d6e0f")
    public List<cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetworkNode> GetNodes();

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
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.IHostNode> AllHostNodes();

    @IDynamicResourceExtension.MethodId("fd85db1d-5176-11ea-b9cb-85bbdfd861be")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> AllAbstractHosts();

    @IDynamicResourceExtension.MethodId("2e929d64-5177-11ea-b9cb-85bbdfd861be")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> AllSystemConfigurations();

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
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> GetAbstractHosts();

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

  public static interface INamedNetworkNodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b2bccfa0-ca55-11e9-83b0-559396620907")
    public java.lang.String Name();

  }
  
  public static interface INamedNetworkNodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class NamedNetworkNodeFunctionsImpl implements INamedNetworkNodeFunctionsImpl {

    public static final INamedNetworkNodeFunctionsImpl INSTANCE = new NamedNetworkNodeFunctionsImpl();

    private NamedNetworkNodeFunctionsImpl() {}

  }
  
  public static class NamedNetworkNodeFunctions {

    private NamedNetworkNodeFunctions() {}

  }

  public static interface IGatewayNodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d345aafb-ca55-11e9-83b0-559396620907")
    public java.lang.String Name();

  }
  
  public static interface IGatewayNodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class GatewayNodeFunctionsImpl implements IGatewayNodeFunctionsImpl {

    public static final IGatewayNodeFunctionsImpl INSTANCE = new GatewayNodeFunctionsImpl();

    private GatewayNodeFunctionsImpl() {}

  }
  
  public static class GatewayNodeFunctions {

    private GatewayNodeFunctions() {}

  }

  public static interface IHostNodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("da20bbed-ca55-11e9-83b0-559396620907")
    public java.lang.String Name();

    @IDynamicResourceExtension.MethodId("18d59f34-dec4-11e9-b714-478bec98e62d")
    public java.lang.String GroupName(final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration systemConfiguration, final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone securitySubZone);

    @IDynamicResourceExtension.MethodId("d38cc226-df6c-11e9-9827-a1514ee8d06a")
    public java.lang.String InterfaceTypeName(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone subZone);

    @IDynamicResourceExtension.MethodId("813b3e9d-df72-11e9-9827-a1514ee8d06a")
    public java.lang.String Guid(final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration systemConfiguration, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSiteWithHosts abstractNetdomainHosts, final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone securitySubZone);

    @IDynamicResourceExtension.MethodId("fd907b14-a0f4-11ea-9ce3-334b0943657e")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.IHostNode> AllHostNodes();

  }
  
  public static interface IHostNodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class HostNodeFunctionsImpl implements IHostNodeFunctionsImpl {

    public static final IHostNodeFunctionsImpl INSTANCE = new HostNodeFunctionsImpl();

    private HostNodeFunctionsImpl() {}

  }
  
  public static class HostNodeFunctions {

    private HostNodeFunctions() {}

  }

  public static interface INetworkSiteFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e0940269-4cb1-11ea-9133-491af9338ef7")
    public java.lang.Integer FunctionId();

    @IDynamicResourceExtension.MethodId("c47a831a-b212-11ea-a3a2-e9d3344bee73")
    public cleon.modelinglanguages.network.metamodel.spec.javamodel.INetworkSubZone GetNetworkSubZone(final java.lang.String name);

  }
  
  public static interface INetworkSiteFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("c47a831a-b212-11ea-a3a2-e9d3344bee73")
    public cleon.modelinglanguages.network.metamodel.spec.javamodel.INetworkSubZone GetNetworkSubZone(final java.lang.String name, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkSite networkSite);

  }
  
  public static class NetworkSiteFunctionsImpl implements INetworkSiteFunctionsImpl {

    public static final INetworkSiteFunctionsImpl INSTANCE = new NetworkSiteFunctionsImpl();

    private NetworkSiteFunctionsImpl() {}

    @Override
    public cleon.modelinglanguages.network.metamodel.spec.javamodel.INetworkSubZone GetNetworkSubZone(final java.lang.String name, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkSite networkSite) {
      /* Begin Protected Region [[c47a831a-b212-11ea-a3a2-e9d3344bee73]] */
    	for( final INetworkSubZone networkSubZone : networkSite.selectNetworkSubZone().values() ) {
    		final INetworkSubZoneFunctions subZoneFunctions = networkSubZone.extension(INetworkSubZoneFunctions.class);
    		final String subzoneName = subZoneFunctions.Name();
    		if( subzoneName.equalsIgnoreCase(name)) {
    			return networkSubZone;
    		}
    	}
    	return null;
      /* End Protected Region   [[c47a831a-b212-11ea-a3a2-e9d3344bee73]] */
    }

  }
  
  public static class NetworkSiteFunctions {

    private NetworkSiteFunctions() {}

    public static cleon.modelinglanguages.network.metamodel.spec.javamodel.INetworkSubZone GetNetworkSubZone(final java.lang.String name, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkSite networkSite) {
      return DynamicResourceUtil.invoke(INetworkSiteFunctionsImpl.class, NetworkSiteFunctionsImpl.INSTANCE, networkSite).GetNetworkSubZone(name, networkSite);
    }

  }

  public static interface INetworkEnvironmentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2a3f2c0c-b212-11ea-a3a2-e9d3344bee73")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkSite GetRN(final java.lang.String name);

  }
  
  public static interface INetworkEnvironmentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("2a3f2c0c-b212-11ea-a3a2-e9d3344bee73")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkSite GetRN(final java.lang.String name, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkEnvironment networkEnvironment);

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
  
  public static class NetworkEnvironmentFunctions {

    private NetworkEnvironmentFunctions() {}

    public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkSite GetRN(final java.lang.String name, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkEnvironment networkEnvironment) {
      return DynamicResourceUtil.invoke(INetworkEnvironmentFunctionsImpl.class, NetworkEnvironmentFunctionsImpl.INSTANCE, networkEnvironment).GetRN(name, networkEnvironment);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,2acb3661-7b0e-11e9-a70f-4dc03941a024,yDzTQE4TWBDbdgvOQD2h9PCdHq4=] */
