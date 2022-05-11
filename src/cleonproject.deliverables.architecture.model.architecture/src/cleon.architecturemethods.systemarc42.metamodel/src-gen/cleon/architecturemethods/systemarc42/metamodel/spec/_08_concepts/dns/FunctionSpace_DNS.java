package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.dns;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[c770edb4-c7ce-11ec-a59e-d1c88102a398,imports]] */

/* End Protected Region   [[c770edb4-c7ce-11ec-a59e-d1c88102a398,imports]] */

public class FunctionSpace_DNS {

  /* Begin Protected Region [[c770edb4-c7ce-11ec-a59e-d1c88102a398]] */
  
  /* End Protected Region   [[c770edb4-c7ce-11ec-a59e-d1c88102a398]] */


  public static interface IDNSSystemConfigurationIntegrationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("daff088a-c7ce-11ec-a59e-d1c88102a398")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessSystemConfigurationTo> AllAccessConfigurationTo();

    @IDynamicResourceExtension.MethodId("97fc3aec-c7cf-11ec-a59e-d1c88102a398")
    public java.lang.Boolean HasAccessConfigurationTo();

  }
  
  public static interface IDNSSystemConfigurationIntegrationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DNSSystemConfigurationIntegrationFunctionsImpl implements IDNSSystemConfigurationIntegrationFunctionsImpl {

    public static final IDNSSystemConfigurationIntegrationFunctionsImpl INSTANCE = new DNSSystemConfigurationIntegrationFunctionsImpl();

    private DNSSystemConfigurationIntegrationFunctionsImpl() {}

  }
  
  public static class DNSSystemConfigurationIntegrationFunctions {

    private DNSSystemConfigurationIntegrationFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,c770edb4-c7ce-11ec-a59e-d1c88102a398,uo23eB9NltF0s19DoJSf54eIuRI=] */
