package cleon.architecturemethods.itarc42.template.plantuml;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[f247dcd9-02db-11e9-9e58-33d596257b14,imports]] */

/* End Protected Region   [[f247dcd9-02db-11e9-9e58-33d596257b14,imports]] */

public class FunctionSpace_Buildingblock_PlantUml {

  /* Begin Protected Region [[f247dcd9-02db-11e9-9e58-33d596257b14]] */
  
  /* End Protected Region   [[f247dcd9-02db-11e9-9e58-33d596257b14]] */


  public static interface IBuildingBlockSystemOverviewDiagramFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("003fc30e-02dc-11e9-9e58-33d596257b14")
    public java.lang.String RenderUmlElement();

  }
  
  public static interface IBuildingBlockSystemOverviewDiagramFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class BuildingBlockSystemOverviewDiagramFunctionsImpl implements IBuildingBlockSystemOverviewDiagramFunctionsImpl {

    public static final IBuildingBlockSystemOverviewDiagramFunctionsImpl INSTANCE = new BuildingBlockSystemOverviewDiagramFunctionsImpl();

    private BuildingBlockSystemOverviewDiagramFunctionsImpl() {}

  }
  
  public static class BuildingBlockSystemOverviewDiagramFunctions {

    private BuildingBlockSystemOverviewDiagramFunctions() {}

  }

  public static interface IBuildingBlockOverviewDiagramFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("65308749-0a93-11e9-9f72-e5610a9d4cd3")
    public java.lang.String RenderUmlElement();

    @IDynamicResourceExtension.MethodId("cdffa9f4-0a95-11e9-9f72-e5610a9d4cd3")
    public cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock SelectWhitebox();

  }
  
  public static interface IBuildingBlockOverviewDiagramFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class BuildingBlockOverviewDiagramFunctionsImpl implements IBuildingBlockOverviewDiagramFunctionsImpl {

    public static final IBuildingBlockOverviewDiagramFunctionsImpl INSTANCE = new BuildingBlockOverviewDiagramFunctionsImpl();

    private BuildingBlockOverviewDiagramFunctionsImpl() {}

  }
  
  public static class BuildingBlockOverviewDiagramFunctions {

    private BuildingBlockOverviewDiagramFunctions() {}

  }

  public static interface IBuildingBlockDependenciesDiagramFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2507b706-0e17-11e9-8b4c-f9aec93d8b56")
    public java.lang.String RenderUmlElement();

    @IDynamicResourceExtension.MethodId("25082caa-0e17-11e9-8b4c-f9aec93d8b56")
    public cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock SelectBlackbox();

  }
  
  public static interface IBuildingBlockDependenciesDiagramFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class BuildingBlockDependenciesDiagramFunctionsImpl implements IBuildingBlockDependenciesDiagramFunctionsImpl {

    public static final IBuildingBlockDependenciesDiagramFunctionsImpl INSTANCE = new BuildingBlockDependenciesDiagramFunctionsImpl();

    private BuildingBlockDependenciesDiagramFunctionsImpl() {}

  }
  
  public static class BuildingBlockDependenciesDiagramFunctions {

    private BuildingBlockDependenciesDiagramFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,f247dcd9-02db-11e9-9e58-33d596257b14,aX8t+gQL2kw8GY8188HZ7r9h2cY=] */
