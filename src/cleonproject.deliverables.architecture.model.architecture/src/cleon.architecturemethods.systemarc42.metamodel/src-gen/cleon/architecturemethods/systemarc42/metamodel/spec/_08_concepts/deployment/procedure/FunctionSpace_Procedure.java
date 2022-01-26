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


  public static interface IDeploymentOrderFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("7fc857d3-7e8c-11ec-b55c-f5ca121c82b7")
    public java.lang.String SimpleName();

  }
  
  public static interface IDeploymentOrderFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DeploymentOrderFunctionsImpl implements IDeploymentOrderFunctionsImpl {

    public static final IDeploymentOrderFunctionsImpl INSTANCE = new DeploymentOrderFunctionsImpl();

    private DeploymentOrderFunctionsImpl() {}

  }
  
  public static class DeploymentOrderFunctions {

    private DeploymentOrderFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,74519eba-7e8c-11ec-b55c-f5ca121c82b7,5OdJ5f9m2tfZcjDYh8aXdAhlMz4=] */
