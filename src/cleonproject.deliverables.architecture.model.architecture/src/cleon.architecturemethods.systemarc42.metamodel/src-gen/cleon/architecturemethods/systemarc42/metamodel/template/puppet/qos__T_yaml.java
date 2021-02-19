package cleon.architecturemethods.systemarc42.metamodel.template.puppet;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[7efd3326-a0e1-11ea-8daa-afb4679c3497,imports]] */

/* End Protected Region   [[7efd3326-a0e1-11ea-8daa-afb4679c3497,imports]] */

public class qos__T_yaml {

  /* Begin Protected Region [[7efd3326-a0e1-11ea-8daa-afb4679c3497]] */
  
  /* End Protected Region   [[7efd3326-a0e1-11ea-8daa-afb4679c3497]] */


  public static interface IServiceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("a5d67638-a0e2-11ea-8daa-afb4679c3497")
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

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,7efd3326-a0e1-11ea-8daa-afb4679c3497,BwSoaki0ZIgtmda1g+j9EaJlFcY=] */
