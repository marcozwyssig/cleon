package cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[2acb3661-7b0e-11e9-a70f-4dc03941a024,imports]] */

/* End Protected Region   [[2acb3661-7b0e-11e9-a70f-4dc03941a024,imports]] */

public class FunctionSpace_Network {

  /* Begin Protected Region [[2acb3661-7b0e-11e9-a70f-4dc03941a024]] */
  
  /* End Protected Region   [[2acb3661-7b0e-11e9-a70f-4dc03941a024]] */


  public static interface INetworkNodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("3436b570-7b0e-11e9-a70f-4dc03941a024")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.node.javamodel.INode> GetNetworkNodes();

    @IDynamicResourceExtension.MethodId("1d92d94f-7b1a-11e9-a70f-4dc03941a024")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.node.javamodel.INode> GetNetworkNodesFromNetdomain();

    @IDynamicResourceExtension.MethodId("dd95c0b7-7b11-11e9-a70f-4dc03941a024")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.node.javamodel.INode> GetNodesFromSecurityZone();

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
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.javamodel.IHostNode> AllHostNodes();

    @IDynamicResourceExtension.MethodId("fd85db1d-5176-11ea-b9cb-85bbdfd861be")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.IAbstractHost> AllAbstractHosts();

    @IDynamicResourceExtension.MethodId("2e929d64-5177-11ea-b9cb-85bbdfd861be")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.to_move.system.javamodel.ISystemConfiguration> AllSystemConfigurations();

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

  public static interface IDefaultGatewayNodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("bb161c9a-ca55-11e9-83b0-559396620907")
    public java.lang.String Name();

  }
  
  public static interface IDefaultGatewayNodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DefaultGatewayNodeFunctionsImpl implements IDefaultGatewayNodeFunctionsImpl {

    public static final IDefaultGatewayNodeFunctionsImpl INSTANCE = new DefaultGatewayNodeFunctionsImpl();

    private DefaultGatewayNodeFunctionsImpl() {}

  }
  
  public static class DefaultGatewayNodeFunctions {

    private DefaultGatewayNodeFunctions() {}

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
    public java.lang.String GroupName(final cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.to_move.system.javamodel.ISystemConfiguration systemConfiguration, final cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.IAbstractSiteWithHosts abstractNetdomainHosts, final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone securitySubZone);

    @IDynamicResourceExtension.MethodId("d38cc226-df6c-11e9-9827-a1514ee8d06a")
    public java.lang.String InterfaceTypeName(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone subZone);

    @IDynamicResourceExtension.MethodId("813b3e9d-df72-11e9-9827-a1514ee8d06a")
    public java.lang.String Guid(final cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.to_move.system.javamodel.ISystemConfiguration systemConfiguration, final cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.IAbstractSiteWithHosts abstractNetdomainHosts, final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone securitySubZone);

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

  }
  
  public static interface INetworkSiteFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class NetworkSiteFunctionsImpl implements INetworkSiteFunctionsImpl {

    public static final INetworkSiteFunctionsImpl INSTANCE = new NetworkSiteFunctionsImpl();

    private NetworkSiteFunctionsImpl() {}

  }
  
  public static class NetworkSiteFunctions {

    private NetworkSiteFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,2acb3661-7b0e-11e9-a70f-4dc03941a024,TGQV4qIS8GvtarElq40GVGpgSn0=] */
