package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.procedure;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[74519eba-7e8c-11ec-b55c-f5ca121c82b7,imports]] */

/* End Protected Region   [[74519eba-7e8c-11ec-b55c-f5ca121c82b7,imports]] */

public class FunctionSpace_Procedure {

  /* Begin Protected Region [[74519eba-7e8c-11ec-b55c-f5ca121c82b7]] */
  
  /* End Protected Region   [[74519eba-7e8c-11ec-b55c-f5ca121c82b7]] */


  public static interface IDeploymentProcedureOrderFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("7fc857d3-7e8c-11ec-b55c-f5ca121c82b7")
    public java.lang.String SimpleName();

    @IDynamicResourceExtension.MethodId("719748ac-7eab-11ec-b55c-f5ca121c82b7")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> OnlyBuildSystemConfigurationsForInstallation();

  }
  
  public static interface IDeploymentProcedureOrderFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DeploymentProcedureOrderFunctionsImpl implements IDeploymentProcedureOrderFunctionsImpl {

    public static final IDeploymentProcedureOrderFunctionsImpl INSTANCE = new DeploymentProcedureOrderFunctionsImpl();

    private DeploymentProcedureOrderFunctionsImpl() {}

  }
  
  public static class DeploymentProcedureOrderFunctions {

    private DeploymentProcedureOrderFunctions() {}

  }

  public static interface IDeploymentProcedureConceptFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("a6ea8f7e-7eab-11ec-b55c-f5ca121c82b7")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> AllBuildSystemConfigurations();

    @IDynamicResourceExtension.MethodId("fd2ea921-7eb0-11ec-b55c-f5ca121c82b7")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> OnlyBuildSystemConfigurationsForInstallation();

  }
  
  public static interface IDeploymentProcedureConceptFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DeploymentProcedureConceptFunctionsImpl implements IDeploymentProcedureConceptFunctionsImpl {

    public static final IDeploymentProcedureConceptFunctionsImpl INSTANCE = new DeploymentProcedureConceptFunctionsImpl();

    private DeploymentProcedureConceptFunctionsImpl() {}

  }
  
  public static class DeploymentProcedureConceptFunctions {

    private DeploymentProcedureConceptFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,74519eba-7e8c-11ec-b55c-f5ca121c82b7,YBEIUz6ExpAVTo9lYgbaJ59f1M8=] */
