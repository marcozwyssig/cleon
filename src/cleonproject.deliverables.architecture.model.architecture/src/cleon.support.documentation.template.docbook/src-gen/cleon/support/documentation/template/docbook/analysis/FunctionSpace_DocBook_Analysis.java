package cleon.support.documentation.template.docbook.analysis;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[51cd6fe6-a6f0-11e8-9c81-8bd68c62e435,imports]] */

/* End Protected Region   [[51cd6fe6-a6f0-11e8-9c81-8bd68c62e435,imports]] */

public class FunctionSpace_DocBook_Analysis {

  /* Begin Protected Region [[51cd6fe6-a6f0-11e8-9c81-8bd68c62e435]] */
  
  /* End Protected Region   [[51cd6fe6-a6f0-11e8-9c81-8bd68c62e435]] */


  public static interface IBestFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5df9e4b1-a6f0-11e8-9c81-8bd68c62e435")
    public java.lang.String RenderContent();

  }
  
  public static interface IBestFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class BestFunctionsImpl implements IBestFunctionsImpl {

    public static final IBestFunctionsImpl INSTANCE = new BestFunctionsImpl();

    private BestFunctionsImpl() {}

  }
  
  public static class BestFunctions {

    private BestFunctions() {}

  }

  public static interface ICriteriasFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e759c9d8-b822-11e8-b3ad-4d0f42d6d5c2")
    public java.lang.String RenderContentElement();

  }
  
  public static interface ICriteriasFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class CriteriasFunctionsImpl implements ICriteriasFunctionsImpl {

    public static final ICriteriasFunctionsImpl INSTANCE = new CriteriasFunctionsImpl();

    private CriteriasFunctionsImpl() {}

  }
  
  public static class CriteriasFunctions {

    private CriteriasFunctions() {}

  }

  public static interface ISolutionsEvaluationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e759f063-b822-11e8-b3ad-4d0f42d6d5c2")
    public java.lang.String RenderContentElement();

  }
  
  public static interface ISolutionsEvaluationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SolutionsEvaluationFunctionsImpl implements ISolutionsEvaluationFunctionsImpl {

    public static final ISolutionsEvaluationFunctionsImpl INSTANCE = new SolutionsEvaluationFunctionsImpl();

    private SolutionsEvaluationFunctionsImpl() {}

  }
  
  public static class SolutionsEvaluationFunctions {

    private SolutionsEvaluationFunctions() {}

  }

  public static interface IDriversFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e759f079-b822-11e8-b3ad-4d0f42d6d5c2")
    public java.lang.String GetContext();

  }
  
  public static interface IDriversFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DriversFunctionsImpl implements IDriversFunctionsImpl {

    public static final IDriversFunctionsImpl INSTANCE = new DriversFunctionsImpl();

    private DriversFunctionsImpl() {}

  }
  
  public static class DriversFunctions {

    private DriversFunctions() {}

  }

  public static interface IEvaluationsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e759f082-b822-11e8-b3ad-4d0f42d6d5c2")
    public java.lang.String GetContext();

    @IDynamicResourceExtension.MethodId("e759f0bb-b822-11e8-b3ad-4d0f42d6d5c2")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IEvaluationsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class EvaluationsFunctionsImpl implements IEvaluationsFunctionsImpl {

    public static final IEvaluationsFunctionsImpl INSTANCE = new EvaluationsFunctionsImpl();

    private EvaluationsFunctionsImpl() {}

  }
  
  public static class EvaluationsFunctions {

    private EvaluationsFunctions() {}

  }

  public static interface ISolutionsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e759f0c4-b822-11e8-b3ad-4d0f42d6d5c2")
    public java.lang.String GetContext();

  }
  
  public static interface ISolutionsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SolutionsFunctionsImpl implements ISolutionsFunctionsImpl {

    public static final ISolutionsFunctionsImpl INSTANCE = new SolutionsFunctionsImpl();

    private SolutionsFunctionsImpl() {}

  }
  
  public static class SolutionsFunctions {

    private SolutionsFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,51cd6fe6-a6f0-11e8-9c81-8bd68c62e435,uqer28op7bRvI3lq9ciVZRLVdIM=] */
