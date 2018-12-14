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

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,4b45a8b9-fa3f-11e8-af47-e5bdd8100025,X/6KqS7wQQnTMSazja0O7gcYW4k=] */
