package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.architecture_and_design_patterns.architecture_pattern.microservice.servicelayer;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[d42ff275-247d-11f1-8a5a-5da401746046,imports]] */

/* End Protected Region   [[d42ff275-247d-11f1-8a5a-5da401746046,imports]] */

public class FunctionSpace_Service_Layer {

  /* Begin Protected Region [[d42ff275-247d-11f1-8a5a-5da401746046]] */
  
  /* End Protected Region   [[d42ff275-247d-11f1-8a5a-5da401746046]] */


  public static interface IServiceComponentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d42ff27a-247d-11f1-8a5a-5da401746046")
    public java.lang.String Object();

  }
  
  public static interface IServiceComponentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("d42ff27a-247d-11f1-8a5a-5da401746046")
    public java.lang.String Object(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.architecture_and_design_patterns.architecture_pattern.microservice.servicelayer.javamodel.IServiceComponent serviceComponent);

  }
  
  public static class ServiceComponentFunctionsImpl implements IServiceComponentFunctionsImpl {

    public static final IServiceComponentFunctionsImpl INSTANCE = new ServiceComponentFunctionsImpl();

    private ServiceComponentFunctionsImpl() {}

    @Override
    public java.lang.String Object(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.architecture_and_design_patterns.architecture_pattern.microservice.servicelayer.javamodel.IServiceComponent serviceComponent) {
      /* Begin Protected Region [[d42ff27a-247d-11f1-8a5a-5da401746046]] */
    	return ServicelayerPackage.ServiceComponent_components.getId().asGuid();
   
      /* End Protected Region   [[d42ff27a-247d-11f1-8a5a-5da401746046]] */
    }

  }
  
  public static class ServiceComponentFunctions {

    private ServiceComponentFunctions() {}

    public static java.lang.String Object(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.architecture_and_design_patterns.architecture_pattern.microservice.servicelayer.javamodel.IServiceComponent serviceComponent) {
      return DynamicResourceUtil.invoke(IServiceComponentFunctionsImpl.class, ServiceComponentFunctionsImpl.INSTANCE, serviceComponent).Object(serviceComponent);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,d42ff275-247d-11f1-8a5a-5da401746046,hTHUoeDUPYkDhejHf8z//Vm0pE8=] */
