package cleon.architecturemethods.arc42.metamodel.diagram;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[c6475c2d-854e-11ea-9f0c-755186b47bc2,imports]] */

/* End Protected Region   [[c6475c2d-854e-11ea-9f0c-755186b47bc2,imports]] */

public class FunctionSpace_Diagram {

  /* Begin Protected Region [[c6475c2d-854e-11ea-9f0c-755186b47bc2]] */
  
  /* End Protected Region   [[c6475c2d-854e-11ea-9f0c-755186b47bc2]] */


  public static interface IDeploymentDiagramFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("df45ac56-854e-11ea-9f0c-755186b47bc2")
    public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.IDeploymentLevel Level();

    @IDynamicResourceExtension.MethodId("5bee3445-7ddb-11ec-be69-ab0911f63a77")
    public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode Environment();

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

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,c6475c2d-854e-11ea-9f0c-755186b47bc2,iqSqZNdmPupugRTUsCg/0YfQFAs=] */
