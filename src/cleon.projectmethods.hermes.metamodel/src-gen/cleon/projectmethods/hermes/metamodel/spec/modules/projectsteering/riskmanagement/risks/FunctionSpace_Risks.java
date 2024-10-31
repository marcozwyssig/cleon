package cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[f25d187d-2f08-11e6-8bd9-a77b8d2a3a0e,imports]] */

/* End Protected Region   [[f25d187d-2f08-11e6-8bd9-a77b8d2a3a0e,imports]] */

public class FunctionSpace_Risks {

  /* Begin Protected Region [[f25d187d-2f08-11e6-8bd9-a77b8d2a3a0e]] */
  
  /* End Protected Region   [[f25d187d-2f08-11e6-8bd9-a77b8d2a3a0e]] */


  public static interface IRiskFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f99fc537-2f08-11e6-8bd9-a77b8d2a3a0e")
    public java.lang.String GetId();

  }
  
  public static interface IRiskFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("f99fc537-2f08-11e6-8bd9-a77b8d2a3a0e")
    public java.lang.String GetId(final cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.javamodel.IRisk risk);

  }
  
  public static class RiskFunctionsImpl implements IRiskFunctionsImpl {

    public static final IRiskFunctionsImpl INSTANCE = new RiskFunctionsImpl();

    private RiskFunctionsImpl() {}

    @Override
    public java.lang.String GetId(final cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.javamodel.IRisk risk) {
      return java.lang.String.format("RK-%03d", risk.selectIdentifier());
    }

  }
  
  public static class RiskFunctions {

    private RiskFunctions() {}

    public static java.lang.String GetId(final cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.javamodel.IRisk risk) {
      return DynamicResourceUtil.invoke(IRiskFunctionsImpl.class, RiskFunctionsImpl.INSTANCE, risk).GetId(risk);
    }

  }

  public static interface IRiskStateFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4fb05fd1-3250-11e6-ab4d-73a9260c8088")
    public java.lang.Boolean IsOpen();

    @IDynamicResourceExtension.MethodId("7a8e30af-3250-11e6-ab4d-73a9260c8088")
    public java.lang.Boolean IsClosed();

  }
  
  public static interface IRiskStateFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("4fb05fd1-3250-11e6-ab4d-73a9260c8088")
    public java.lang.Boolean IsOpen(final cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.javamodel.IRiskState riskState);

    @IDynamicResourceExtension.MethodId("7a8e30af-3250-11e6-ab4d-73a9260c8088")
    public java.lang.Boolean IsClosed(final cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.javamodel.IRiskState riskState);

  }
  
  public static class RiskStateFunctionsImpl implements IRiskStateFunctionsImpl {

    public static final IRiskStateFunctionsImpl INSTANCE = new RiskStateFunctionsImpl();

    private RiskStateFunctionsImpl() {}

    @Override
    public java.lang.Boolean IsOpen(final cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.javamodel.IRiskState riskState) {
      return !riskState.isClosed();
    }

    @Override
    public java.lang.Boolean IsClosed(final cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.javamodel.IRiskState riskState) {
      return riskState.isClosed();
    }

  }
  
  public static class RiskStateFunctions {

    private RiskStateFunctions() {}

    public static java.lang.Boolean IsOpen(final cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.javamodel.IRiskState riskState) {
      return DynamicResourceUtil.invoke(IRiskStateFunctionsImpl.class, RiskStateFunctionsImpl.INSTANCE, riskState).IsOpen(riskState);
    }

    public static java.lang.Boolean IsClosed(final cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.javamodel.IRiskState riskState) {
      return DynamicResourceUtil.invoke(IRiskStateFunctionsImpl.class, RiskStateFunctionsImpl.INSTANCE, riskState).IsClosed(riskState);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,f25d187d-2f08-11e6-8bd9-a77b8d2a3a0e,NhurpyUMY7hXbhutpGzuXGAV4KI=] */
