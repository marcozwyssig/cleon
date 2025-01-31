package cleon.architecturemethods.hermes.metamodel.spec.licensing;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[279525f0-dfc2-11ef-b0be-9b4cac321140,imports]] */

/* End Protected Region   [[279525f0-dfc2-11ef-b0be-9b4cac321140,imports]] */

public class FunctionSpace_Licensing {

  /* Begin Protected Region [[279525f0-dfc2-11ef-b0be-9b4cac321140]] */
  
  /* End Protected Region   [[279525f0-dfc2-11ef-b0be-9b4cac321140]] */


  public static interface IAbstractProductLicensingFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2d0ad9e8-dfc2-11ef-b0be-9b4cac321140")
    public cleon.architecturemethods.arc42.metamodel.spec.javamodel.ISystemArc42Document SystemArc42Document();

  }
  
  public static interface IAbstractProductLicensingFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractProductLicensingFunctionsImpl implements IAbstractProductLicensingFunctionsImpl {

    public static final IAbstractProductLicensingFunctionsImpl INSTANCE = new AbstractProductLicensingFunctionsImpl();

    private AbstractProductLicensingFunctionsImpl() {}

  }
  
  public static class AbstractProductLicensingFunctions {

    private AbstractProductLicensingFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,279525f0-dfc2-11ef-b0be-9b4cac321140,CVRM5wiJsfX+qkHjTDY3Aj2uEEk=] */
