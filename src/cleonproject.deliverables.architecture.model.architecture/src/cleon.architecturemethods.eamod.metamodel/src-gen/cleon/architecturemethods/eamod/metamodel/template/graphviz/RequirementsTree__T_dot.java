package cleon.architecturemethods.eamod.metamodel.template.graphviz;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[5151c353-72d7-11eb-90be-95ba8485a14b,imports]] */

/* End Protected Region   [[5151c353-72d7-11eb-90be-95ba8485a14b,imports]] */

public class RequirementsTree__T_dot {

  /* Begin Protected Region [[5151c353-72d7-11eb-90be-95ba8485a14b]] */
  
  /* End Protected Region   [[5151c353-72d7-11eb-90be-95ba8485a14b]] */


  public static interface IRequirementsDocumentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fde091aa-72d7-11eb-90be-95ba8485a14b")
    public java.lang.String RenderDrivers();

    @IDynamicResourceExtension.MethodId("13835b0e-72d8-11eb-90be-95ba8485a14b")
    public java.lang.String RenderGoals();

    @IDynamicResourceExtension.MethodId("20e6053d-72d8-11eb-90be-95ba8485a14b")
    public java.lang.String RenderPrinciples();

    @IDynamicResourceExtension.MethodId("313596ce-72d8-11eb-90be-95ba8485a14b")
    public java.lang.String RenderSubjectAreas();

    @IDynamicResourceExtension.MethodId("3add35ac-72d8-11eb-90be-95ba8485a14b")
    public java.lang.String RenderSources();

  }
  
  public static interface IRequirementsDocumentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RequirementsDocumentFunctionsImpl implements IRequirementsDocumentFunctionsImpl {

    public static final IRequirementsDocumentFunctionsImpl INSTANCE = new RequirementsDocumentFunctionsImpl();

    private RequirementsDocumentFunctionsImpl() {}

  }
  
  public static class RequirementsDocumentFunctions {

    private RequirementsDocumentFunctions() {}

  }

  public static interface IDriverFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9822c5a7-72d8-11eb-90be-95ba8485a14b")
    public java.lang.String RenderDriver();

  }
  
  public static interface IDriverFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DriverFunctionsImpl implements IDriverFunctionsImpl {

    public static final IDriverFunctionsImpl INSTANCE = new DriverFunctionsImpl();

    private DriverFunctionsImpl() {}

  }
  
  public static class DriverFunctions {

    private DriverFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,5151c353-72d7-11eb-90be-95ba8485a14b,mPC79SkzQPreU++uDqzMpOO51Mk=] */
