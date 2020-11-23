package cleon.projectmethods.hermes.metamodel.template.docbook.steering;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[64d352e5-1e05-11e7-882a-cdd93aa926f8,imports]] */

/* End Protected Region   [[64d352e5-1e05-11e7-882a-cdd93aa926f8,imports]] */

public class FunctionSpace_DocBook_Steering {

  /* Begin Protected Region [[64d352e5-1e05-11e7-882a-cdd93aa926f8]] */
  
  /* End Protected Region   [[64d352e5-1e05-11e7-882a-cdd93aa926f8]] */


  public static interface IRisksFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b828fc88-2b4a-11eb-863c-b9f41a0a3f06")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IRisksFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RisksFunctionsImpl implements IRisksFunctionsImpl {

    public static final IRisksFunctionsImpl INSTANCE = new RisksFunctionsImpl();

    private RisksFunctionsImpl() {}

  }
  
  public static class RisksFunctions {

    private RisksFunctions() {}

  }

  public static interface IRiskFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2e2107c2-2d8c-11eb-9bd8-07f8fe211915")
    public java.lang.String RenderContentElement();

    @IDynamicResourceExtension.MethodId("f778b19a-2d8e-11eb-9bd8-07f8fe211915")
    public java.lang.String RenderDescriptions();

  }
  
  public static interface IRiskFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("f778b19a-2d8e-11eb-9bd8-07f8fe211915")
    public java.lang.String RenderDescriptions(final cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.javamodel.IRisk risk);

  }
  
  public static class RiskFunctionsImpl implements IRiskFunctionsImpl {

    public static final IRiskFunctionsImpl INSTANCE = new RiskFunctionsImpl();

    private RiskFunctionsImpl() {}

    @Override
    public java.lang.String RenderDescriptions(final cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.javamodel.IRisk risk) {
      return null;
    }

  }
  
  public static class RiskFunctions {

    private RiskFunctions() {}

    public static java.lang.String RenderDescriptions(final cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.javamodel.IRisk risk) {
      return DynamicResourceUtil.invoke(IRiskFunctionsImpl.class, RiskFunctionsImpl.INSTANCE, risk).RenderDescriptions(risk);
    }

  }

  public static interface IAssessmentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("6c06f74a-2d93-11eb-9bd8-07f8fe211915")
    public java.lang.String RenderContentElement();

    @IDynamicResourceExtension.MethodId("6c06f74c-2d93-11eb-9bd8-07f8fe211915")
    public java.lang.String RenderDescriptions();

  }
  
  public static interface IAssessmentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("6c06f74c-2d93-11eb-9bd8-07f8fe211915")
    public java.lang.String RenderDescriptions(final cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.javamodel.IAssessment assessment);

  }
  
  public static class AssessmentFunctionsImpl implements IAssessmentFunctionsImpl {

    public static final IAssessmentFunctionsImpl INSTANCE = new AssessmentFunctionsImpl();

    private AssessmentFunctionsImpl() {}

    @Override
    public java.lang.String RenderDescriptions(final cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.javamodel.IAssessment assessment) {
      return null;
    }

  }
  
  public static class AssessmentFunctions {

    private AssessmentFunctions() {}

    public static java.lang.String RenderDescriptions(final cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.javamodel.IAssessment assessment) {
      return DynamicResourceUtil.invoke(IAssessmentFunctionsImpl.class, AssessmentFunctionsImpl.INSTANCE, assessment).RenderDescriptions(assessment);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,64d352e5-1e05-11e7-882a-cdd93aa926f8,F8qH6v+X2tLg6H+anlMfggXaJic=] */
