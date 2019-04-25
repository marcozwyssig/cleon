package ikt.product.documentation.template.docbook;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[f5f4f4e0-0e29-11e9-8b4c-f9aec93d8b56,imports]] */

/* End Protected Region   [[f5f4f4e0-0e29-11e9-8b4c-f9aec93d8b56,imports]] */

public class FunctionSpace_Deployment_Docbook {

  /* Begin Protected Region [[f5f4f4e0-0e29-11e9-8b4c-f9aec93d8b56]] */
  
  /* End Protected Region   [[f5f4f4e0-0e29-11e9-8b4c-f9aec93d8b56]] */


  public static interface IDeploymentLevelFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("13e4610e-0e2a-11e9-8b4c-f9aec93d8b56")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IDeploymentLevelFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DeploymentLevelFunctionsImpl implements IDeploymentLevelFunctionsImpl {

    public static final IDeploymentLevelFunctionsImpl INSTANCE = new DeploymentLevelFunctionsImpl();

    private DeploymentLevelFunctionsImpl() {}

  }
  
  public static class DeploymentLevelFunctions {

    private DeploymentLevelFunctions() {}

  }

  public static interface IEnvironmentViewFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9b4d3279-0e9e-11e9-9f19-6d15636f4ecc")
    public java.lang.String RenderChapters();

  }
  
  public static interface IEnvironmentViewFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class EnvironmentViewFunctionsImpl implements IEnvironmentViewFunctionsImpl {

    public static final IEnvironmentViewFunctionsImpl INSTANCE = new EnvironmentViewFunctionsImpl();

    private EnvironmentViewFunctionsImpl() {}

  }
  
  public static class EnvironmentViewFunctions {

    private EnvironmentViewFunctions() {}

  }

  public static interface IDeployViewFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("cccabf27-1983-11e9-88a0-1f786f12e4c1")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IDeployViewFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DeployViewFunctionsImpl implements IDeployViewFunctionsImpl {

    public static final IDeployViewFunctionsImpl INSTANCE = new DeployViewFunctionsImpl();

    private DeployViewFunctionsImpl() {}

  }
  
  public static class DeployViewFunctions {

    private DeployViewFunctions() {}

  }

  public static interface IDeploymentDiagramFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("52e6d461-199d-11e9-9d43-9ddad24f774b")
    public java.lang.String GetStandardDescription();

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

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,f5f4f4e0-0e29-11e9-8b4c-f9aec93d8b56,u58HFUEvk3EaZNmGdfqca3v+jFA=] */
