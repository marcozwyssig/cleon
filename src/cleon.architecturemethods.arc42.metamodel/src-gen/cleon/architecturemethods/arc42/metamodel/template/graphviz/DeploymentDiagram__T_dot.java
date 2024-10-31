package cleon.architecturemethods.arc42.metamodel.template.graphviz;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[4d144ab7-854e-11ea-9f0c-755186b47bc2,imports]] */

/* End Protected Region   [[4d144ab7-854e-11ea-9f0c-755186b47bc2,imports]] */

public class DeploymentDiagram__T_dot {

  /* Begin Protected Region [[4d144ab7-854e-11ea-9f0c-755186b47bc2]] */
  
  /* End Protected Region   [[4d144ab7-854e-11ea-9f0c-755186b47bc2]] */


  public static interface INodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("cc21c372-853f-11ea-9f0c-755186b47bc2")
    public java.lang.String RenderNode();

  }
  
  public static interface INodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class NodeFunctionsImpl implements INodeFunctionsImpl {

    public static final INodeFunctionsImpl INSTANCE = new NodeFunctionsImpl();

    private NodeFunctionsImpl() {}

  }
  
  public static class NodeFunctions {

    private NodeFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,4d144ab7-854e-11ea-9f0c-755186b47bc2,y9EluDWT1yMxEDdJNRdxfzsLtBM=] */
