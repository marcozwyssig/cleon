package cleon.modelinglanguages.uml.template.plantuml;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[4b45a8b9-fa3f-11e8-af47-e5bdd8100025,imports]] */

/* End Protected Region   [[4b45a8b9-fa3f-11e8-af47-e5bdd8100025,imports]] */

public class FunctionSpace_Plantuml {

  /* Begin Protected Region [[4b45a8b9-fa3f-11e8-af47-e5bdd8100025]] */
  
  /* End Protected Region   [[4b45a8b9-fa3f-11e8-af47-e5bdd8100025]] */


  public static interface IUmlDiagramFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fcfaf5ee-eaac-11e8-88d3-bfc6b992bdec")
    public java.lang.String RenderUmlElement();

    @IDynamicResourceExtension.MethodId("0d089c4a-eaad-11e8-88d3-bfc6b992bdec")
    public java.lang.String RenderUmlDiagram();

    @IDynamicResourceExtension.MethodId("d2dedc91-eaae-11e8-88d3-bfc6b992bdec")
    public java.lang.String RenderUml();

    @IDynamicResourceExtension.MethodId("dba73b0a-ff95-11e8-9d0c-c96c1e9b7b46")
    public java.lang.String RenderUmlOptions();

    @IDynamicResourceExtension.MethodId("b0c7655c-ddd9-11e9-bb03-150413ca6880")
    public java.lang.String FullFileName();

    @IDynamicResourceExtension.MethodId("ce9f2a3b-ddd9-11e9-bb03-150413ca6880")
    public java.lang.String FileName();

  }
  
  public static interface IUmlDiagramFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class UmlDiagramFunctionsImpl implements IUmlDiagramFunctionsImpl {

    public static final IUmlDiagramFunctionsImpl INSTANCE = new UmlDiagramFunctionsImpl();

    private UmlDiagramFunctionsImpl() {}

  }
  
  public static class UmlDiagramFunctions {

    private UmlDiagramFunctions() {}

  }

  public static interface IBuildingBlockFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("7227f211-0aa6-11e9-b5db-cdf0b8dad9e4")
    public java.lang.String GetIncludePath();

    @IDynamicResourceExtension.MethodId("b5703850-0aa6-11e9-b5db-cdf0b8dad9e4")
    public java.lang.String RenderAllIncludes();

    @IDynamicResourceExtension.MethodId("b719eee1-247e-11e9-a054-db6d80fba790")
    public java.lang.String RenderBuildingBlockName();

    @IDynamicResourceExtension.MethodId("e6579744-247e-11e9-a054-db6d80fba790")
    public java.lang.String pumlSimpleName();

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

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,4b45a8b9-fa3f-11e8-af47-e5bdd8100025,haXBBCULKKz08iQgtUcZLEV2Fq0=] */
