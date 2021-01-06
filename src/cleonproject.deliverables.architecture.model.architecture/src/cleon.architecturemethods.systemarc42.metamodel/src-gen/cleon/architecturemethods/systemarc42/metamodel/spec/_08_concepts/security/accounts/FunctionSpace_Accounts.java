package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[96deff1f-2830-11eb-a351-0f02534982d8,imports]] */
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.FunctionSpace_Topology.IAbstractSiteFunctions;
/* End Protected Region   [[96deff1f-2830-11eb-a351-0f02534982d8,imports]] */

public class FunctionSpace_Accounts {

  /* Begin Protected Region [[96deff1f-2830-11eb-a351-0f02534982d8]] */

  /* End Protected Region   [[96deff1f-2830-11eb-a351-0f02534982d8]] */


  public static interface IServiceAccountFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9f29a613-2830-11eb-a351-0f02534982d8")
    public java.lang.String AccountName();

    @IDynamicResourceExtension.MethodId("b4b25887-3a00-11eb-9823-adf6a3e0c300")
    public java.lang.Integer Id();

    @IDynamicResourceExtension.MethodId("50dab1e9-3a01-11eb-9823-adf6a3e0c300")
    public java.lang.Integer RangeId();

    @IDynamicResourceExtension.MethodId("edd9abe4-4ff1-11eb-8df9-adb928521f3a")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> GetAbstractHostsBySite(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IServiceAccountEnvironmentSite serviceAccountEnvironmentSite);

  }
  
  public static interface IServiceAccountFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("b4b25887-3a00-11eb-9823-adf6a3e0c300")
    public java.lang.Integer Id(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IServiceAccount serviceAccount);

    @IDynamicResourceExtension.MethodId("edd9abe4-4ff1-11eb-8df9-adb928521f3a")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> GetAbstractHostsBySite(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IServiceAccountEnvironmentSite serviceAccountEnvironmentSite, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IServiceAccount serviceAccount);

  }
  
  public static class ServiceAccountFunctionsImpl implements IServiceAccountFunctionsImpl {

    public static final IServiceAccountFunctionsImpl INSTANCE = new ServiceAccountFunctionsImpl();

    private ServiceAccountFunctionsImpl() {}

    @Override
    public java.lang.Integer Id(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IServiceAccount serviceAccount) {
      /* Begin Protected Region [[b4b25887-3a00-11eb-9823-adf6a3e0c300]] */
      if (serviceAccount.selectServiceAccountTemplate().selectOverrideId() != null) {
      	return serviceAccount.selectServiceAccountTemplate().selectOverrideId();
      }

      final var serviceAccountFunctions = serviceAccount.extension(IServiceAccountFunctions.class);
      final var id = serviceAccountFunctions.RangeId();
      return id + serviceAccount.selectServiceAccountTemplate().selectIdentifier();
      /* End Protected Region   [[b4b25887-3a00-11eb-9823-adf6a3e0c300]] */
    }

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> GetAbstractHostsBySite(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IServiceAccountEnvironmentSite serviceAccountEnvironmentSite, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IServiceAccount serviceAccount) {
      /* Begin Protected Region [[edd9abe4-4ff1-11eb-8df9-adb928521f3a]] */
      final var site = serviceAccountEnvironmentSite.selectServiceAccountForSite();
      final var abstractSiteFunctions = site.extension(IAbstractSiteFunctions.class);
      return abstractSiteFunctions.GetAbstractHostsBySystemConfiguration(
      		serviceAccount.selectServiceAccountTemplate().selectServiceConfigurationForServiceAccount());
      /* End Protected Region   [[edd9abe4-4ff1-11eb-8df9-adb928521f3a]] */
    }

  }
  
  public static class ServiceAccountFunctions {

    private ServiceAccountFunctions() {}

    public static java.lang.Integer Id(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IServiceAccount serviceAccount) {
      return DynamicResourceUtil.invoke(IServiceAccountFunctionsImpl.class, ServiceAccountFunctionsImpl.INSTANCE, serviceAccount).Id(serviceAccount);
    }

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> GetAbstractHostsBySite(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IServiceAccountEnvironmentSite serviceAccountEnvironmentSite, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IServiceAccount serviceAccount) {
      return DynamicResourceUtil.invoke(IServiceAccountFunctionsImpl.class, ServiceAccountFunctionsImpl.INSTANCE, serviceAccount).GetAbstractHostsBySite(serviceAccountEnvironmentSite, serviceAccount);
    }

  }

  public static interface IgMSA_ServiceAccountFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d4e3c4df-2830-11eb-a351-0f02534982d8")
    public java.lang.String AccountName();

  }
  
  public static interface IgMSA_ServiceAccountFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class gMSA_ServiceAccountFunctionsImpl implements IgMSA_ServiceAccountFunctionsImpl {

    public static final IgMSA_ServiceAccountFunctionsImpl INSTANCE = new gMSA_ServiceAccountFunctionsImpl();

    private gMSA_ServiceAccountFunctionsImpl() {}

  }
  
  public static class gMSA_ServiceAccountFunctions {

    private gMSA_ServiceAccountFunctions() {}

  }

  public static interface IServiceAccountEnvironmentSystemFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("061362f5-3951-11eb-93f1-c3f5ad8bb73f")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> SystemConfigurations();

  }
  
  public static interface IServiceAccountEnvironmentSystemFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ServiceAccountEnvironmentSystemFunctionsImpl implements IServiceAccountEnvironmentSystemFunctionsImpl {

    public static final IServiceAccountEnvironmentSystemFunctionsImpl INSTANCE = new ServiceAccountEnvironmentSystemFunctionsImpl();

    private ServiceAccountEnvironmentSystemFunctionsImpl() {}

  }
  
  public static class ServiceAccountEnvironmentSystemFunctions {

    private ServiceAccountEnvironmentSystemFunctions() {}

  }

  public static interface IServiceAccountTemplateFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d42e8939-5005-11eb-8df9-adb928521f3a")
    public java.lang.Integer Id();

  }
  
  public static interface IServiceAccountTemplateFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ServiceAccountTemplateFunctionsImpl implements IServiceAccountTemplateFunctionsImpl {

    public static final IServiceAccountTemplateFunctionsImpl INSTANCE = new ServiceAccountTemplateFunctionsImpl();

    private ServiceAccountTemplateFunctionsImpl() {}

  }
  
  public static class ServiceAccountTemplateFunctions {

    private ServiceAccountTemplateFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,96deff1f-2830-11eb-a351-0f02534982d8,RqnlWDUWk2FocgxccYBQIMHQ2yQ=] */
