package cleon.projectmethods.hermes.template.asciidoc.projectsteering;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[9f8f8bc1-ca32-11e8-82ac-e1eb952f770a,imports]] */

/* End Protected Region   [[9f8f8bc1-ca32-11e8-82ac-e1eb952f770a,imports]] */

public class FunctionSpace_Steering {

  /* Begin Protected Region [[9f8f8bc1-ca32-11e8-82ac-e1eb952f770a]] */
  
  /* End Protected Region   [[9f8f8bc1-ca32-11e8-82ac-e1eb952f770a]] */


  public static interface IDeliverableControllingFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9f904ee7-ca32-11e8-82ac-e1eb952f770a")
    public java.lang.String RenderContentElement();

    @IDynamicResourceExtension.MethodId("9f904f04-ca32-11e8-82ac-e1eb952f770a")
    public java.lang.String RenderChapters();

    @IDynamicResourceExtension.MethodId("9f904f0c-ca32-11e8-82ac-e1eb952f770a")
    public java.lang.String RenderDescriptions();

  }
  
  public static interface IDeliverableControllingFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DeliverableControllingFunctionsImpl implements IDeliverableControllingFunctionsImpl {

    public static final IDeliverableControllingFunctionsImpl INSTANCE = new DeliverableControllingFunctionsImpl();

    private DeliverableControllingFunctionsImpl() {}

  }
  
  public static class DeliverableControllingFunctions {

    private DeliverableControllingFunctions() {}

  }

  public static interface IDeliverableRisksFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9f907587-ca32-11e8-82ac-e1eb952f770a")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IDeliverableRisksFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DeliverableRisksFunctionsImpl implements IDeliverableRisksFunctionsImpl {

    public static final IDeliverableRisksFunctionsImpl INSTANCE = new DeliverableRisksFunctionsImpl();

    private DeliverableRisksFunctionsImpl() {}

  }
  
  public static class DeliverableRisksFunctions {

    private DeliverableRisksFunctions() {}

  }

  public static interface IDeliverableLampFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9f9075ad-ca32-11e8-82ac-e1eb952f770a")
    public java.lang.String RenderState();

    @IDynamicResourceExtension.MethodId("9f9075bb-ca32-11e8-82ac-e1eb952f770a")
    public java.lang.String RenderDescription();

  }
  
  public static interface IDeliverableLampFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DeliverableLampFunctionsImpl implements IDeliverableLampFunctionsImpl {

    public static final IDeliverableLampFunctionsImpl INSTANCE = new DeliverableLampFunctionsImpl();

    private DeliverableLampFunctionsImpl() {}

  }
  
  public static class DeliverableLampFunctions {

    private DeliverableLampFunctions() {}

  }

  public static interface IDeliverableLampStateFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9f9075be-ca32-11e8-82ac-e1eb952f770a")
    public java.lang.Boolean IsRed();

    @IDynamicResourceExtension.MethodId("9f9075c0-ca32-11e8-82ac-e1eb952f770a")
    public java.lang.Boolean IsYellow();

    @IDynamicResourceExtension.MethodId("9f9075c2-ca32-11e8-82ac-e1eb952f770a")
    public java.lang.Boolean IsGreen();

  }
  
  public static interface IDeliverableLampStateFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("9f9075be-ca32-11e8-82ac-e1eb952f770a")
    public java.lang.Boolean IsRed(final cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableLampState deliverableLampState);

    @IDynamicResourceExtension.MethodId("9f9075c0-ca32-11e8-82ac-e1eb952f770a")
    public java.lang.Boolean IsYellow(final cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableLampState deliverableLampState);

    @IDynamicResourceExtension.MethodId("9f9075c2-ca32-11e8-82ac-e1eb952f770a")
    public java.lang.Boolean IsGreen(final cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableLampState deliverableLampState);

  }
  
  public static class DeliverableLampStateFunctionsImpl implements IDeliverableLampStateFunctionsImpl {

    public static final IDeliverableLampStateFunctionsImpl INSTANCE = new DeliverableLampStateFunctionsImpl();

    private DeliverableLampStateFunctionsImpl() {}

    @Override
    public java.lang.Boolean IsRed(final cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableLampState deliverableLampState) {
      return deliverableLampState.isRed();
    }

    @Override
    public java.lang.Boolean IsYellow(final cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableLampState deliverableLampState) {
      return deliverableLampState.isYellow();
    }

    @Override
    public java.lang.Boolean IsGreen(final cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableLampState deliverableLampState) {
      return deliverableLampState.isGreen();
    }

  }
  
  public static class DeliverableLampStateFunctions {

    private DeliverableLampStateFunctions() {}

    public static java.lang.Boolean IsRed(final cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableLampState deliverableLampState) {
      return DynamicResourceUtil.invoke(IDeliverableLampStateFunctionsImpl.class, DeliverableLampStateFunctionsImpl.INSTANCE, deliverableLampState).IsRed(deliverableLampState);
    }

    public static java.lang.Boolean IsYellow(final cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableLampState deliverableLampState) {
      return DynamicResourceUtil.invoke(IDeliverableLampStateFunctionsImpl.class, DeliverableLampStateFunctionsImpl.INSTANCE, deliverableLampState).IsYellow(deliverableLampState);
    }

    public static java.lang.Boolean IsGreen(final cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableLampState deliverableLampState) {
      return DynamicResourceUtil.invoke(IDeliverableLampStateFunctionsImpl.class, DeliverableLampStateFunctionsImpl.INSTANCE, deliverableLampState).IsGreen(deliverableLampState);
    }

  }

  public static interface IDeliverableImpedimentsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9f90762b-ca32-11e8-82ac-e1eb952f770a")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IDeliverableImpedimentsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DeliverableImpedimentsFunctionsImpl implements IDeliverableImpedimentsFunctionsImpl {

    public static final IDeliverableImpedimentsFunctionsImpl INSTANCE = new DeliverableImpedimentsFunctionsImpl();

    private DeliverableImpedimentsFunctionsImpl() {}

  }
  
  public static class DeliverableImpedimentsFunctions {

    private DeliverableImpedimentsFunctions() {}

  }

  public static interface IImpedimentsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9f911195-ca32-11e8-82ac-e1eb952f770a")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IImpedimentsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ImpedimentsFunctionsImpl implements IImpedimentsFunctionsImpl {

    public static final IImpedimentsFunctionsImpl INSTANCE = new ImpedimentsFunctionsImpl();

    private ImpedimentsFunctionsImpl() {}

  }
  
  public static class ImpedimentsFunctions {

    private ImpedimentsFunctions() {}

  }

  public static interface IRisksFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9f9138e1-ca32-11e8-82ac-e1eb952f770a")
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

  public static interface IAssessmentsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9f915f8b-ca32-11e8-82ac-e1eb952f770a")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IAssessmentsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AssessmentsFunctionsImpl implements IAssessmentsFunctionsImpl {

    public static final IAssessmentsFunctionsImpl INSTANCE = new AssessmentsFunctionsImpl();

    private AssessmentsFunctionsImpl() {}

  }
  
  public static class AssessmentsFunctions {

    private AssessmentsFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,9f8f8bc1-ca32-11e8-82ac-e1eb952f770a,JrbqMkJV+CmIr1Nl16CU5BfwCnI=] */
