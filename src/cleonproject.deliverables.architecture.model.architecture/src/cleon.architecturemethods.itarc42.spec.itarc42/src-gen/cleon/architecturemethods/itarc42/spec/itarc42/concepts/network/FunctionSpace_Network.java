package cleon.architecturemethods.itarc42.spec.itarc42.concepts.network;

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
    public List<cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.node.javamodel.INode> GetNetworkNodes();

    @IDynamicResourceExtension.MethodId("1d92d94f-7b1a-11e9-a70f-4dc03941a024")
    public List<cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.node.javamodel.INode> GetNetworkNodesFromNetdomain();

    @IDynamicResourceExtension.MethodId("dd95c0b7-7b11-11e9-a70f-4dc03941a024")
    public List<cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.node.javamodel.INode> GetNodesFromSecurityZone();

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

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,2acb3661-7b0e-11e9-a70f-4dc03941a024,fJd1hnc8/nDtOzgiQvZcLjs0T3A=] */
