package cleon.architecturemethods.systemarc42.metamodel.template.puppet;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[47530bae-111d-11ea-b1a8-559fc9dee05c,imports]] */
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkHostNode;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.INamedHost;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.INumberedHost;
import cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.FunctionSpace_SystemConfiguration.ISystemConfigurationFunctions;
import java.util.ArrayList;

/* End Protected Region   [[47530bae-111d-11ea-b1a8-559fc9dee05c,imports]] */

public class ad_aE_DNS__T_yaml {

  /* Begin Protected Region [[47530bae-111d-11ea-b1a8-559fc9dee05c]] */

  /* End Protected Region   [[47530bae-111d-11ea-b1a8-559fc9dee05c]] */


  public static interface INetworkHostNodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("52232d8b-14d8-11ea-a57d-f9a0d62ee07e")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkHostNode> Exclude();

  }
  
  public static interface INetworkHostNodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("52232d8b-14d8-11ea-a57d-f9a0d62ee07e")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkHostNode> Exclude(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkHostNode> networkHostNodeList);

  }
  
  public static class NetworkHostNodeFunctionsImpl implements INetworkHostNodeFunctionsImpl {

    public static final INetworkHostNodeFunctionsImpl INSTANCE = new NetworkHostNodeFunctionsImpl();

    private NetworkHostNodeFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkHostNode> Exclude(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkHostNode> networkHostNodeList) {
      /* Begin Protected Region [[52232d8b-14d8-11ea-a57d-f9a0d62ee07e]] */
      final var validNodes = new ArrayList<INetworkHostNode>();
      for( final var hostNode : networkHostNodeList ) {
      	if( (hostNode.selectExportDNSRecord() != null) && !hostNode.selectExportDNSRecord().booleanValue()) {
      		continue;
      	}
      	final var node = hostNode.selectHost();
      	if( ((node instanceof INumberedHost) || (node instanceof INamedHost)) && node.selectInstanceOf().extension(ISystemConfigurationFunctions.class).IsDependsOnWindows()) {
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

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkHostNode> Exclude(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.network.javamodel.INetworkHostNode> networkHostNodeList) {
      return DynamicResourceUtil.invoke(INetworkHostNodeFunctionsImpl.class, NetworkHostNodeFunctionsImpl.INSTANCE, networkHostNodeList).Exclude(networkHostNodeList);
    }

  }

  public static interface IStringLiteralFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("7ae3dc62-ac1b-11eb-8ce4-4df2726518e8")
    public java.lang.String ReplacePointToUnderscore();

  }
  
  public static interface IStringLiteralFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("7ae3dc62-ac1b-11eb-8ce4-4df2726518e8")
    public java.lang.String ReplacePointToUnderscore(final java.lang.String stringLiteral);

  }
  
  public static class StringLiteralFunctionsImpl implements IStringLiteralFunctionsImpl {

    public static final IStringLiteralFunctionsImpl INSTANCE = new StringLiteralFunctionsImpl();

    private StringLiteralFunctionsImpl() {}

    @Override
    public java.lang.String ReplacePointToUnderscore(final java.lang.String stringLiteral) {
      /* Begin Protected Region [[7ae3dc62-ac1b-11eb-8ce4-4df2726518e8]] */
      return stringLiteral.replace('.', '-');
      /* End Protected Region   [[7ae3dc62-ac1b-11eb-8ce4-4df2726518e8]] */
    }

  }
  
  public static class StringLiteralFunctions {

    private StringLiteralFunctions() {}

    public static java.lang.String ReplacePointToUnderscore(final java.lang.String stringLiteral) {
      return DynamicResourceUtil.invoke(IStringLiteralFunctionsImpl.class, StringLiteralFunctionsImpl.INSTANCE, stringLiteral).ReplacePointToUnderscore(stringLiteral);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,47530bae-111d-11ea-b1a8-559fc9dee05c,iNtLRGNk3ULCn6OpWk3wc9yNwvs=] */
