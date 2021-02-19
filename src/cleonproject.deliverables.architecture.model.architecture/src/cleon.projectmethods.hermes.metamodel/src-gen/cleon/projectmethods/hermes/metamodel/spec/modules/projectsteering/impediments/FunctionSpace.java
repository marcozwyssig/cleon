package cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.impediments;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[46612fb6-3385-11e6-b251-57783f5929b3,imports]] */

/* End Protected Region   [[46612fb6-3385-11e6-b251-57783f5929b3,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[46612fb6-3385-11e6-b251-57783f5929b3]] */
  
  /* End Protected Region   [[46612fb6-3385-11e6-b251-57783f5929b3]] */


  public static interface IImpedimentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4bf6efcf-3385-11e6-b251-57783f5929b3")
    public java.lang.String GetId();

  }
  
  public static interface IImpedimentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("4bf6efcf-3385-11e6-b251-57783f5929b3")
    public java.lang.String GetId(final cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.impediments.javamodel.IImpediment impediment);

  }
  
  public static class ImpedimentFunctionsImpl implements IImpedimentFunctionsImpl {

    public static final IImpedimentFunctionsImpl INSTANCE = new ImpedimentFunctionsImpl();

    private ImpedimentFunctionsImpl() {}

    @Override
    public java.lang.String GetId(final cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.impediments.javamodel.IImpediment impediment) {
      return java.lang.String.format("IM-%03d", impediment.selectIdentifier());
    }

  }
  
  public static class ImpedimentFunctions {

    private ImpedimentFunctions() {}

    public static java.lang.String GetId(final cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.impediments.javamodel.IImpediment impediment) {
      return DynamicResourceUtil.invoke(IImpedimentFunctionsImpl.class, ImpedimentFunctionsImpl.INSTANCE, impediment).GetId(impediment);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,46612fb6-3385-11e6-b251-57783f5929b3,PR0ZysaVckuT42QTLIq0QTYEp+4=] */
