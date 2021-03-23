package cleon.architecturemethods.systemarc42.metamodel.template.puppet;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[f7e5720e-8bdb-11eb-a832-91f5636963f2,imports]] */

/* End Protected Region   [[f7e5720e-8bdb-11eb-a832-91f5636963f2,imports]] */

public class firewall__T_yaml {

  /* Begin Protected Region [[f7e5720e-8bdb-11eb-a832-91f5636963f2]] */
  
  /* End Protected Region   [[f7e5720e-8bdb-11eb-a832-91f5636963f2]] */


  public static interface IServiceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f7e57217-8bdb-11eb-a832-91f5636963f2")
    public java.lang.String PolicyName(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource);

  }
  
  public static interface IServiceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ServiceFunctionsImpl implements IServiceFunctionsImpl {

    public static final IServiceFunctionsImpl INSTANCE = new ServiceFunctionsImpl();

    private ServiceFunctionsImpl() {}

  }
  
  public static class ServiceFunctions {

    private ServiceFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,f7e5720e-8bdb-11eb-a832-91f5636963f2,rGdeThaefqLF4xqlH5CqxECLz0E=] */
