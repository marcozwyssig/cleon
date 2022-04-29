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


  public static interface IDNSSystemConfigurationScopeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("daff088a-c7ce-11ec-a59e-d1c88102a398")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessSystemConfigurationTo> AllAccessConfigurationTo();

    @IDynamicResourceExtension.MethodId("97fc3aec-c7cf-11ec-a59e-d1c88102a398")
    public java.lang.Boolean HasAccessConfigurationTo();

  }
  
  public static interface IDNSSystemConfigurationScopeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DNSSystemConfigurationScopeFunctionsImpl implements IDNSSystemConfigurationScopeFunctionsImpl {

    public static final IDNSSystemConfigurationScopeFunctionsImpl INSTANCE = new DNSSystemConfigurationScopeFunctionsImpl();

    private DNSSystemConfigurationScopeFunctionsImpl() {}

  }
  
  public static class DNSSystemConfigurationScopeFunctions {

    private DNSSystemConfigurationScopeFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,c770edb4-c7ce-11ec-a59e-d1c88102a398,YQ6X1BFEk0tFDtZ77FP1vmayLj8=] */
