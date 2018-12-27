package cleon.modelinglanguages.network.template.docbook;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[ec94c029-054e-11e9-b814-a133e521728c,imports]] */

/* End Protected Region   [[ec94c029-054e-11e9-b814-a133e521728c,imports]] */

public class FunctionSpace_Docbook {

  /* Begin Protected Region [[ec94c029-054e-11e9-b814-a133e521728c]] */
  
  /* End Protected Region   [[ec94c029-054e-11e9-b814-a133e521728c]] */


  public static interface INetworkDiagramFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fb4c5f36-092f-11e9-8c40-11db3668c0c9")
    public java.lang.String RenderContent();

  }
  
  public static interface INetworkDiagramFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class NetworkDiagramFunctionsImpl implements INetworkDiagramFunctionsImpl {

    public static final INetworkDiagramFunctionsImpl INSTANCE = new NetworkDiagramFunctionsImpl();

    private NetworkDiagramFunctionsImpl() {}

  }
  
  public static class NetworkDiagramFunctions {

    private NetworkDiagramFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,ec94c029-054e-11e9-b814-a133e521728c,Mnj03FHPrAdz2DKCDgPSN6qE6Aw=] */
