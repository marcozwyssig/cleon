package cleon.modelinglanguages.uml.template.python.diagrams;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[fdab4fd0-9fc1-11ec-a0ca-03d8d5268a60,imports]] */

/* End Protected Region   [[fdab4fd0-9fc1-11ec-a0ca-03d8d5268a60,imports]] */

public class FunctionSpace_Diagrams {

  /* Begin Protected Region [[fdab4fd0-9fc1-11ec-a0ca-03d8d5268a60]] */
  
  /* End Protected Region   [[fdab4fd0-9fc1-11ec-a0ca-03d8d5268a60]] */


  public static interface IUmlDiagramFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("3877318e-9fc2-11ec-a0ca-03d8d5268a60")
    public java.lang.String RenderUmlDiagram();

    @IDynamicResourceExtension.MethodId("bc537d83-9fc3-11ec-a0ca-03d8d5268a60")
    public java.lang.String RenderUml();

    @IDynamicResourceExtension.MethodId("c6dcc9d9-9fc3-11ec-a0ca-03d8d5268a60")
    public java.lang.String RenderUmlOptions();

    @IDynamicResourceExtension.MethodId("d1942a01-9fc3-11ec-a0ca-03d8d5268a60")
    public java.lang.String RenderUmlElement();

    @IDynamicResourceExtension.MethodId("e0eed43e-9fc3-11ec-a0ca-03d8d5268a60")
    public java.lang.String FullFileName();

    @IDynamicResourceExtension.MethodId("e0eed44b-9fc3-11ec-a0ca-03d8d5268a60")
    public java.lang.String FullFileNameWithExtension();

    @IDynamicResourceExtension.MethodId("e0eed452-9fc3-11ec-a0ca-03d8d5268a60")
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

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,fdab4fd0-9fc1-11ec-a0ca-03d8d5268a60,qpavJxwTE3Xa72TV9+57lUPl/Aw=] */
