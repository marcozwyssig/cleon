package cleon.architecturemethods.arc42.metamodel.template.plantuml;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[99b9ae90-eaab-11e8-88d3-bfc6b992bdec,imports]] */

/* End Protected Region   [[99b9ae90-eaab-11e8-88d3-bfc6b992bdec,imports]] */

public class FunctionSpace_PlantUml {

  /* Begin Protected Region [[99b9ae90-eaab-11e8-88d3-bfc6b992bdec]] */
  
  /* End Protected Region   [[99b9ae90-eaab-11e8-88d3-bfc6b992bdec]] */


  public static interface IDomainContextDiagramFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("a584a19f-eaab-11e8-88d3-bfc6b992bdec")
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

    @IDynamicResourceExtension.MethodId("728bf04e-eaaf-11e8-88d3-bfc6b992bdec")
    public java.lang.String RenderUmlElement();

    @IDynamicResourceExtension.MethodId("6484f9d3-61c1-11ea-b250-8d3b1d076722")
    public java.lang.String OLD_RenderUmlElement();

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

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,99b9ae90-eaab-11e8-88d3-bfc6b992bdec,AgZJ8jfp4CSwM4pib05R4h31Cgk=] */
