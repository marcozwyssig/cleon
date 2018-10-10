package cleon.architecturemethods.eamod.spec.eamod.nsov.v1.nsov;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[dd118ee3-c118-11e6-8f58-ad3c6ee7602f,imports]] */

/* End Protected Region   [[dd118ee3-c118-11e6-8f58-ad3c6ee7602f,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[dd118ee3-c118-11e6-8f58-ad3c6ee7602f]] */
  
  /* End Protected Region   [[dd118ee3-c118-11e6-8f58-ad3c6ee7602f]] */


  public static interface IServiceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e257f5da-c118-11e6-8f58-ad3c6ee7602f")
    public java.lang.String GetId();

    @IDynamicResourceExtension.MethodId("773c4bce-c155-11e6-8f58-ad3c6ee7602f")
    public java.lang.String GetName();

  }
  
  public static interface IServiceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("e257f5da-c118-11e6-8f58-ad3c6ee7602f")
    public java.lang.String GetId(final cleon.architecturemethods.eamod.spec.eamod.nsov.v1.nsov.javamodel.IService service);

  }
  
  public static class ServiceFunctionsImpl implements IServiceFunctionsImpl {

    public static final IServiceFunctionsImpl INSTANCE = new ServiceFunctionsImpl();

    private ServiceFunctionsImpl() {}

    @Override
    public java.lang.String GetId(final cleon.architecturemethods.eamod.spec.eamod.nsov.v1.nsov.javamodel.IService service) {
      return String.format("SVC-%03d", service.selectIdentifier());  
    }

  }
  
  public static class ServiceFunctions {

    private ServiceFunctions() {}

    public static java.lang.String GetId(final cleon.architecturemethods.eamod.spec.eamod.nsov.v1.nsov.javamodel.IService service) {
      return DynamicResourceUtil.invoke(IServiceFunctionsImpl.class, ServiceFunctionsImpl.INSTANCE, service).GetId(service);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,dd118ee3-c118-11e6-8f58-ad3c6ee7602f,8JKdgcTzGPgB4+s09GOGQdrTKsA=] */
