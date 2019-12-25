package cleon.modelinglanguages.uml.template.docbook;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[f406e1ac-fa41-11e8-af47-e5bdd8100025,imports]] */

/* End Protected Region   [[f406e1ac-fa41-11e8-af47-e5bdd8100025,imports]] */

public class FunctionSpace_Docbook {

  /* Begin Protected Region [[f406e1ac-fa41-11e8-af47-e5bdd8100025]] */
  
  /* End Protected Region   [[f406e1ac-fa41-11e8-af47-e5bdd8100025]] */


  public static interface IUmlDiagramFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("02f97b23-fa42-11e8-af47-e5bdd8100025")
    public java.lang.String RenderContent();

    @IDynamicResourceExtension.MethodId("49992d11-0df3-11e9-a28e-8b950dcca323")
    public java.lang.Boolean CanGenerate();

  }
  
  public static interface IUmlDiagramFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("49992d11-0df3-11e9-a28e-8b950dcca323")
    public java.lang.Boolean CanGenerate(final cleon.modelinglanguages.uml.metamodel.spec.javamodel.IUmlDiagram umlDiagram);

  }
  
  public static class UmlDiagramFunctionsImpl implements IUmlDiagramFunctionsImpl {

    public static final IUmlDiagramFunctionsImpl INSTANCE = new UmlDiagramFunctionsImpl();

    private UmlDiagramFunctionsImpl() {}

    @Override
    public java.lang.Boolean CanGenerate(final cleon.modelinglanguages.uml.metamodel.spec.javamodel.IUmlDiagram umlDiagram) {
      return true;
    }

  }
  
  public static class UmlDiagramFunctions {

    private UmlDiagramFunctions() {}

    public static java.lang.Boolean CanGenerate(final cleon.modelinglanguages.uml.metamodel.spec.javamodel.IUmlDiagram umlDiagram) {
      return DynamicResourceUtil.invoke(IUmlDiagramFunctionsImpl.class, UmlDiagramFunctionsImpl.INSTANCE, umlDiagram).CanGenerate(umlDiagram);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,f406e1ac-fa41-11e8-af47-e5bdd8100025,ZJA8iIKe75QxhAwY6aBheCQHG1g=] */
