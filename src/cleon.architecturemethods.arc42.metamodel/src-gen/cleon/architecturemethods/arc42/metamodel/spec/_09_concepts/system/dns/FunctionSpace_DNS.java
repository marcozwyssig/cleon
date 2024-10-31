package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.dns;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[c770edb4-c7ce-11ec-a59e-d1c88102a398,imports]] */
import cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.FunctionSpace_Access.IAccessSystemConfigurationToFunctions;
/* End Protected Region   [[c770edb4-c7ce-11ec-a59e-d1c88102a398,imports]] */

public class FunctionSpace_DNS {

  /* Begin Protected Region [[c770edb4-c7ce-11ec-a59e-d1c88102a398]] */

  /* End Protected Region   [[c770edb4-c7ce-11ec-a59e-d1c88102a398]] */


  public static interface IDNSSystemConfigurationIntegrationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("daff088a-c7ce-11ec-a59e-d1c88102a398")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessSystemConfigurationTo> AllAccessConfigurationTo();

    @IDynamicResourceExtension.MethodId("97fc3aec-c7cf-11ec-a59e-d1c88102a398")
    public java.lang.Boolean HasAccessConfigurationWithUseIPFalseTo();

  }
  
  public static interface IDNSSystemConfigurationIntegrationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("97fc3aec-c7cf-11ec-a59e-d1c88102a398")
    public java.lang.Boolean HasAccessConfigurationWithUseIPFalseTo(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.dns.javamodel.IDNSSystemConfigurationIntegration dNSSystemConfigurationIntegration);

  }
  
  public static class DNSSystemConfigurationIntegrationFunctionsImpl implements IDNSSystemConfigurationIntegrationFunctionsImpl {

    public static final IDNSSystemConfigurationIntegrationFunctionsImpl INSTANCE = new DNSSystemConfigurationIntegrationFunctionsImpl();

    private DNSSystemConfigurationIntegrationFunctionsImpl() {}

    @Override
    public java.lang.Boolean HasAccessConfigurationWithUseIPFalseTo(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.dns.javamodel.IDNSSystemConfigurationIntegration dNSSystemConfigurationIntegration) {
      /* Begin Protected Region [[97fc3aec-c7cf-11ec-a59e-d1c88102a398]] */
      final var dNSSystemConfigurationIntegrationFunctions = dNSSystemConfigurationIntegration.extension(IDNSSystemConfigurationIntegrationFunctions.class);
      final var list = dNSSystemConfigurationIntegrationFunctions.AllAccessConfigurationTo();
      if( list == null || list.isEmpty()) {
      	return false;
      }

      return !list.stream().allMatch(x -> {
      	final var accessConfigurationFunction = x.extension(IAccessSystemConfigurationToFunctions.class);
      	if (accessConfigurationFunction.UseIP()) {
      		return true;
      	}

      	return x.extension(IAccessSystemConfigurationToFunctions.class).AllAccessConfigurations().isEmpty();
      });

      /* End Protected Region   [[97fc3aec-c7cf-11ec-a59e-d1c88102a398]] */
    }

  }
  
  public static class DNSSystemConfigurationIntegrationFunctions {

    private DNSSystemConfigurationIntegrationFunctions() {}

    public static java.lang.Boolean HasAccessConfigurationWithUseIPFalseTo(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.dns.javamodel.IDNSSystemConfigurationIntegration dNSSystemConfigurationIntegration) {
      return DynamicResourceUtil.invoke(IDNSSystemConfigurationIntegrationFunctionsImpl.class, DNSSystemConfigurationIntegrationFunctionsImpl.INSTANCE, dNSSystemConfigurationIntegration).HasAccessConfigurationWithUseIPFalseTo(dNSSystemConfigurationIntegration);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,c770edb4-c7ce-11ec-a59e-d1c88102a398,fwo+p9M5ayUCd6SI+el2/28y7HY=] */
