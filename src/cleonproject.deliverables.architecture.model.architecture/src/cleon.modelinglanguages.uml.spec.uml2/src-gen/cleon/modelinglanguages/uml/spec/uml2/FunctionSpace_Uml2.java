package cleon.modelinglanguages.uml.spec.uml2;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[a3bb8694-1998-11e9-8cd4-efe75fb4587a,imports]] */

/* End Protected Region   [[a3bb8694-1998-11e9-8cd4-efe75fb4587a,imports]] */

public class FunctionSpace_Uml2 {

  /* Begin Protected Region [[a3bb8694-1998-11e9-8cd4-efe75fb4587a]] */
  
  /* End Protected Region   [[a3bb8694-1998-11e9-8cd4-efe75fb4587a]] */


  public static interface IUmlDiagramFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("afd732a3-1998-11e9-8cd4-efe75fb4587a")
    public java.lang.String GetStandardDescription();

  }
  
  public static interface IUmlDiagramFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("afd732a3-1998-11e9-8cd4-efe75fb4587a")
    public java.lang.String GetStandardDescription(final cleon.modelinglanguages.uml.spec.uml2.javamodel.IUmlDiagram umlDiagram);

  }
  
  public static class UmlDiagramFunctionsImpl implements IUmlDiagramFunctionsImpl {

    public static final IUmlDiagramFunctionsImpl INSTANCE = new UmlDiagramFunctionsImpl();

    private UmlDiagramFunctionsImpl() {}

    @Override
    public java.lang.String GetStandardDescription(final cleon.modelinglanguages.uml.spec.uml2.javamodel.IUmlDiagram umlDiagram) {
      return null;
    }

  }
  
  public static class UmlDiagramFunctions {

    private UmlDiagramFunctions() {}

    public static java.lang.String GetStandardDescription(final cleon.modelinglanguages.uml.spec.uml2.javamodel.IUmlDiagram umlDiagram) {
      return DynamicResourceUtil.invoke(IUmlDiagramFunctionsImpl.class, UmlDiagramFunctionsImpl.INSTANCE, umlDiagram).GetStandardDescription(umlDiagram);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,a3bb8694-1998-11e9-8cd4-efe75fb4587a,Do5yMQWh8+cRE1BFB/2XJYJG/WM=] */
