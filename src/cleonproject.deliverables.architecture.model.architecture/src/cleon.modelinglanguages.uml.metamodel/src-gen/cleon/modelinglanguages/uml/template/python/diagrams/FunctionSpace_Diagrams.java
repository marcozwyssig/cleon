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

    @IDynamicResourceExtension.MethodId("e4eef884-a065-11ec-b8bd-93035f893c15")
    public java.lang.String RenderImports();

  }
  
  public static interface IUmlDiagramFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("e4eef884-a065-11ec-b8bd-93035f893c15")
    public java.lang.String RenderImports(final cleon.modelinglanguages.uml.metamodel.spec.javamodel.IUmlDiagram umlDiagram);

  }
  
  public static class UmlDiagramFunctionsImpl implements IUmlDiagramFunctionsImpl {

    public static final IUmlDiagramFunctionsImpl INSTANCE = new UmlDiagramFunctionsImpl();

    private UmlDiagramFunctionsImpl() {}

    @Override
    public java.lang.String RenderImports(final cleon.modelinglanguages.uml.metamodel.spec.javamodel.IUmlDiagram umlDiagram) {
      return null;
    }

  }
  
  public static class UmlDiagramFunctions {

    private UmlDiagramFunctions() {}

    public static java.lang.String RenderImports(final cleon.modelinglanguages.uml.metamodel.spec.javamodel.IUmlDiagram umlDiagram) {
      return DynamicResourceUtil.invoke(IUmlDiagramFunctionsImpl.class, UmlDiagramFunctionsImpl.INSTANCE, umlDiagram).RenderImports(umlDiagram);
    }

  }

}

      /* Begin Protected Region [[e4eef884-a065-11ec-b8bd-93035f893c15]] */
      // XXX implement template function here   
      /* End Protected Region   [[e4eef884-a065-11ec-b8bd-93035f893c15]] */
/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,fdab4fd0-9fc1-11ec-a0ca-03d8d5268a60,kfz2U+mDRE2FYzFlhoD/R81FDbM=] */
