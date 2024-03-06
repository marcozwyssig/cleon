package cleon.architecturemethods.arc42.metamodel.template.asciidoc;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[7cc503a4-d182-11e8-b18f-df1540bb7a5c,imports]] */

/* End Protected Region   [[7cc503a4-d182-11e8-b18f-df1540bb7a5c,imports]] */

public class FunctionSpace_Asciidoc_SystemArc42 {

  /* Begin Protected Region [[7cc503a4-d182-11e8-b18f-df1540bb7a5c]] */
  
  /* End Protected Region   [[7cc503a4-d182-11e8-b18f-df1540bb7a5c]] */


  public static interface IDeploymentDiagramFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ffb34ff7-d576-11ea-9bae-37ef2cb951a8")
    public java.lang.String GetStandardDescription();

    @IDynamicResourceExtension.MethodId("ffb37747-d576-11ea-9bae-37ef2cb951a8")
    public java.lang.String RenderContent();

  }
  
  public static interface IDeploymentDiagramFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DeploymentDiagramFunctionsImpl implements IDeploymentDiagramFunctionsImpl {

    public static final IDeploymentDiagramFunctionsImpl INSTANCE = new DeploymentDiagramFunctionsImpl();

    private DeploymentDiagramFunctionsImpl() {}

  }
  
  public static class DeploymentDiagramFunctions {

    private DeploymentDiagramFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,7cc503a4-d182-11e8-b18f-df1540bb7a5c,4xDccwdccj6+zB76tdDvNYlMAHs=] */
