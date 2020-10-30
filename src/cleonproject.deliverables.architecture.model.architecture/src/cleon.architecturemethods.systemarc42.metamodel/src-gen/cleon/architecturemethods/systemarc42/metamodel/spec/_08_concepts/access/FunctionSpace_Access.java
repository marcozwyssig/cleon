package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[cffe4329-19c9-11eb-8585-65084a06c07f,imports]] */

/* End Protected Region   [[cffe4329-19c9-11eb-8585-65084a06c07f,imports]] */

public class FunctionSpace_Access {

  /* Begin Protected Region [[cffe4329-19c9-11eb-8585-65084a06c07f]] */
  
  /* End Protected Region   [[cffe4329-19c9-11eb-8585-65084a06c07f]] */


  public static interface ISystemConfigurationAccessFromFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f3bc8050-19c9-11eb-8585-65084a06c07f")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> Sources();

  }
  
  public static interface ISystemConfigurationAccessFromFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SystemConfigurationAccessFromFunctionsImpl implements ISystemConfigurationAccessFromFunctionsImpl {

    public static final ISystemConfigurationAccessFromFunctionsImpl INSTANCE = new SystemConfigurationAccessFromFunctionsImpl();

    private SystemConfigurationAccessFromFunctionsImpl() {}

  }
  
  public static class SystemConfigurationAccessFromFunctions {

    private SystemConfigurationAccessFromFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,cffe4329-19c9-11eb-8585-65084a06c07f,XmQKeOcLA8wlr0RtRNrIix9AVRk=] */
