package cleon.architecturemethods.arc42.metamodel.template.puppet;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[47530bae-111d-11ea-b1a8-559fc9dee05c,imports]] */
import cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkHostNode;
import cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost;
import cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.INamedHost;
import cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.INumberedHost;
import cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.FunctionSpace_SystemConfiguration.ISystemConfigurationFunctions;
import java.util.ArrayList;

/* End Protected Region   [[47530bae-111d-11ea-b1a8-559fc9dee05c,imports]] */

public class ad_aE_DNS__T_yaml {

  /* Begin Protected Region [[47530bae-111d-11ea-b1a8-559fc9dee05c]] */

  /* End Protected Region   [[47530bae-111d-11ea-b1a8-559fc9dee05c]] */


  public static interface INetworkHostNodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("52232d8b-14d8-11ea-a57d-f9a0d62ee07e")
    public List<ch.actifsource.core.javamodel.IDecorator> Exclude();

  }
  
  public static interface INetworkHostNodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("52232d8b-14d8-11ea-a57d-f9a0d62ee07e")
    public List<ch.actifsource.core.javamodel.IDecorator> Exclude(final List<ch.actifsource.core.javamodel.IDecorator> networkHostNodeList);

  }
  
  public static class NetworkHostNodeFunctionsImpl implements INetworkHostNodeFunctionsImpl {

    public static final INetworkHostNodeFunctionsImpl INSTANCE = new NetworkHostNodeFunctionsImpl();

    private NetworkHostNodeFunctionsImpl() {}

    @Override
    public List<ch.actifsource.core.javamodel.IDecorator> Exclude(final List<ch.actifsource.core.javamodel.IDecorator> networkHostNodeList) {
      /* Begin Protected Region [[52232d8b-14d8-11ea-a57d-f9a0d62ee07e]] */
      final var validNodes = new ArrayList<INetworkHostNode>();
      for( final var hostNode : networkHostNodeList ) {
      	if( hostNode.selectExportDNSRecord() != null && !hostNode.selectExportDNSRecord().booleanValue()) {
      		continue;
      	}
      	final var node = hostNode.selectHost();
      	if( (node instanceof INumberedHost || node instanceof INamedHost) && node.selectInstanceOf().extension(ISystemConfigurationFunctions.class).IsDependsOnWindows()) {
      		continue;
      	}
      	validNodes.add(hostNode);
      }
      return validNodes;
      /* End Protected Region   [[52232d8b-14d8-11ea-a57d-f9a0d62ee07e]] */
    }

  }
  
  public static class NetworkHostNodeFunctions {

    private NetworkHostNodeFunctions() {}

    public static List<ch.actifsource.core.javamodel.IDecorator> Exclude(final List<ch.actifsource.core.javamodel.IDecorator> networkHostNodeList) {
      return DynamicResourceUtil.invoke(INetworkHostNodeFunctionsImpl.class, NetworkHostNodeFunctionsImpl.INSTANCE, networkHostNodeList).Exclude(networkHostNodeList);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,47530bae-111d-11ea-b1a8-559fc9dee05c,2VkvG+QM+GPSSwKkXa6/XJs8OAc=] */
