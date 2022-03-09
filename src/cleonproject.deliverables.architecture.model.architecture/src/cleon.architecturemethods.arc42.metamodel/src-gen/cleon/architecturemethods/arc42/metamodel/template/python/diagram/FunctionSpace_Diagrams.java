package cleon.architecturemethods.arc42.metamodel.template.python.diagram;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[d0d6be29-9fd4-11ec-a0ca-03d8d5268a60,imports]] */

/* End Protected Region   [[d0d6be29-9fd4-11ec-a0ca-03d8d5268a60,imports]] */

public class FunctionSpace_Diagrams {

  /* Begin Protected Region [[d0d6be29-9fd4-11ec-a0ca-03d8d5268a60]] */
  
  /* End Protected Region   [[d0d6be29-9fd4-11ec-a0ca-03d8d5268a60]] */


  public static interface IDomainContextDiagramFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d0d6e4aa-9fd4-11ec-a0ca-03d8d5268a60")
    public java.lang.String RenderUmlElement();

  }
  
  public static interface IDomainContextDiagramFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DomainContextDiagramFunctionsImpl implements IDomainContextDiagramFunctionsImpl {

    public static final IDomainContextDiagramFunctionsImpl INSTANCE = new DomainContextDiagramFunctionsImpl();

    private DomainContextDiagramFunctionsImpl() {}

  }
  
  public static class DomainContextDiagramFunctions {

    private DomainContextDiagramFunctions() {}

  }

  public static interface ITechnicalContextDiagramFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d0d6e4da-9fd4-11ec-a0ca-03d8d5268a60")
    public java.lang.String RenderUmlElement();

  }
  
  public static interface ITechnicalContextDiagramFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TechnicalContextDiagramFunctionsImpl implements ITechnicalContextDiagramFunctionsImpl {

    public static final ITechnicalContextDiagramFunctionsImpl INSTANCE = new TechnicalContextDiagramFunctionsImpl();

    private TechnicalContextDiagramFunctionsImpl() {}

  }
  
  public static class TechnicalContextDiagramFunctions {

    private TechnicalContextDiagramFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,d0d6be29-9fd4-11ec-a0ca-03d8d5268a60,tPb1j5o9j5rFe+3OSUQdF14p9HQ=] */
