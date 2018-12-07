package cleon.architecturemethods.arc42.template.plantuml;

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


  public static interface IDomainContextFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("a584a19f-eaab-11e8-88d3-bfc6b992bdec")
    public java.lang.String RenderUmlElement();

  }
  
  public static interface IDomainContextFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DomainContextFunctionsImpl implements IDomainContextFunctionsImpl {

    public static final IDomainContextFunctionsImpl INSTANCE = new DomainContextFunctionsImpl();

    private DomainContextFunctionsImpl() {}

  }
  
  public static class DomainContextFunctions {

    private DomainContextFunctions() {}

  }

  public static interface ITechnicalContextFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("728bf04e-eaaf-11e8-88d3-bfc6b992bdec")
    public java.lang.String RenderUmlElement();

  }
  
  public static interface ITechnicalContextFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TechnicalContextFunctionsImpl implements ITechnicalContextFunctionsImpl {

    public static final ITechnicalContextFunctionsImpl INSTANCE = new TechnicalContextFunctionsImpl();

    private TechnicalContextFunctionsImpl() {}

  }
  
  public static class TechnicalContextFunctions {

    private TechnicalContextFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,99b9ae90-eaab-11e8-88d3-bfc6b992bdec,i9sbrbzIO3pF8bHrz/C3kZQYMO0=] */
