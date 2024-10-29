package cleon.applications.actifsource.metamodel.spec;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[5066b3da-d7bd-11ea-ae00-5518e944c256,imports]] */

/* End Protected Region   [[5066b3da-d7bd-11ea-ae00-5518e944c256,imports]] */

public class FunctionSpace_Actifsource {

  /* Begin Protected Region [[5066b3da-d7bd-11ea-ae00-5518e944c256]] */
  
  /* End Protected Region   [[5066b3da-d7bd-11ea-ae00-5518e944c256]] */


  public static interface IBuildingBlockFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("7e9f968c-d7bd-11ea-ae00-5518e944c256")
    public java.lang.String FullActifsourceBuildingBlockName();

  }
  
  public static interface IBuildingBlockFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class BuildingBlockFunctionsImpl implements IBuildingBlockFunctionsImpl {

    public static final IBuildingBlockFunctionsImpl INSTANCE = new BuildingBlockFunctionsImpl();

    private BuildingBlockFunctionsImpl() {}

  }
  
  public static class BuildingBlockFunctions {

    private BuildingBlockFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,5066b3da-d7bd-11ea-ae00-5518e944c256,gpO1YO5ZnvBpw8696IWdPpcOSJc=] */
