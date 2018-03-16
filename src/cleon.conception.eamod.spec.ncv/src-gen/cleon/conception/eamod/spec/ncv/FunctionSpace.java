package cleon.conception.eamod.spec.ncv;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[aba3fb66-bc8d-11e6-904c-8bf6f8927ff0,imports]] */

/* End Protected Region   [[aba3fb66-bc8d-11e6-904c-8bf6f8927ff0,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[aba3fb66-bc8d-11e6-904c-8bf6f8927ff0]] */
  
  /* End Protected Region   [[aba3fb66-bc8d-11e6-904c-8bf6f8927ff0]] */


  public static interface ICapabilityFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("aba3fb68-bc8d-11e6-904c-8bf6f8927ff0")
    public java.lang.String GetId();

  }
  
  public static interface ICapabilityFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("aba3fb68-bc8d-11e6-904c-8bf6f8927ff0")
    public java.lang.String GetId(final cleon.conception.eamod.spec.ncv.javamodel.ICapability capability);

  }
  
  public static class CapabilityFunctionsImpl implements ICapabilityFunctionsImpl {

    public static final ICapabilityFunctionsImpl INSTANCE = new CapabilityFunctionsImpl();

    private CapabilityFunctionsImpl() {}

    @Override
    public java.lang.String GetId(final cleon.conception.eamod.spec.ncv.javamodel.ICapability capability) {
      /* Begin Protected Region [[aba3fb68-bc8d-11e6-904c-8bf6f8927ff0]] */
    	return String.format("CAP-%03d", capability.selectIdentifier());  
      /* End Protected Region   [[aba3fb68-bc8d-11e6-904c-8bf6f8927ff0]] */
    }

  }
  
  public static class CapabilityFunctions {

    private CapabilityFunctions() {}

    public static java.lang.String GetId(final cleon.conception.eamod.spec.ncv.javamodel.ICapability capability) {
      return DynamicResourceUtil.invoke(ICapabilityFunctionsImpl.class, CapabilityFunctionsImpl.INSTANCE, capability).GetId(capability);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,aba3fb66-bc8d-11e6-904c-8bf6f8927ff0,DLaq3ozMaxSGK+pLT8Jyr9KreNE=] */
