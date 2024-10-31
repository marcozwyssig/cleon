package cleon.common.building.metamodel.spec;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[6d143fa2-2f1a-11ea-a393-0bc3b1f5682f,imports]] */

/* End Protected Region   [[6d143fa2-2f1a-11ea-a393-0bc3b1f5682f,imports]] */

public class FunctionSpace_BuildingConfig {

  /* Begin Protected Region [[6d143fa2-2f1a-11ea-a393-0bc3b1f5682f]] */
  
  /* End Protected Region   [[6d143fa2-2f1a-11ea-a393-0bc3b1f5682f]] */


  public static interface IBuildingConfigFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("7570995a-2f1a-11ea-a393-0bc3b1f5682f")
    public java.lang.String GetPath();

  }
  
  public static interface IBuildingConfigFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class BuildingConfigFunctionsImpl implements IBuildingConfigFunctionsImpl {

    public static final IBuildingConfigFunctionsImpl INSTANCE = new BuildingConfigFunctionsImpl();

    private BuildingConfigFunctionsImpl() {}

  }
  
  public static class BuildingConfigFunctions {

    private BuildingConfigFunctions() {}

  }

  public static interface IBuildingPluginFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("6106250e-2fb5-11ea-a393-0bc3b1f5682f")
    public java.lang.String PluginId();

  }
  
  public static interface IBuildingPluginFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class BuildingPluginFunctionsImpl implements IBuildingPluginFunctionsImpl {

    public static final IBuildingPluginFunctionsImpl INSTANCE = new BuildingPluginFunctionsImpl();

    private BuildingPluginFunctionsImpl() {}

  }
  
  public static class BuildingPluginFunctions {

    private BuildingPluginFunctions() {}

  }

  public static interface IBuildingPluginConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("22446d18-2fbf-11ea-803d-cf613be59924")
    public java.lang.String PluginId();

  }
  
  public static interface IBuildingPluginConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class BuildingPluginConfigurationFunctionsImpl implements IBuildingPluginConfigurationFunctionsImpl {

    public static final IBuildingPluginConfigurationFunctionsImpl INSTANCE = new BuildingPluginConfigurationFunctionsImpl();

    private BuildingPluginConfigurationFunctionsImpl() {}

  }
  
  public static class BuildingPluginConfigurationFunctions {

    private BuildingPluginConfigurationFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,6d143fa2-2f1a-11ea-a393-0bc3b1f5682f,EQ8wMuIoJnA0Ej22Ve/0IQpZ1Ew=] */
