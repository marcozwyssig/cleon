package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[96deff1f-2830-11eb-a351-0f02534982d8,imports]] */
import java.util.stream.Collectors;

import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.FunctionSpace_Topology.IAbstractSiteFunctions;
import cleon.common.resources.metamodel.spec.active.FunctionSpace_Active.IEnabledWithDefaultTrueAwareFunctions;
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
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> GetAbstractHostsBySite(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.javamodel.IServiceAccountEnvironmentSite serviceAccountEnvironmentSite);

    @IDynamicResourceExtension.MethodId("0e5d40d5-54b8-11eb-8ec7-9b1f37a1ee7d")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite GetAbstractSite();

    @IDynamicResourceExtension.MethodId("0574c273-54af-11eb-8ec7-9b1f37a1ee7d")
    public java.lang.Boolean Value();

    @IDynamicResourceExtension.MethodId("2dd63939-54e5-11eb-a33f-e91880debedc")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.javamodel.IServiceAccount> OnlyEnabledServiceAccounts();

    @IDynamicResourceExtension.MethodId("e69cc8c3-6faa-11eb-a1e4-f1bdb2897690")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.buildingblock.activity.javamodel.IAbstractAuthZBuildingBlockPermission> AllAuthZBuildingBlockForPermissions();

    @IDynamicResourceExtension.MethodId("6e5cb357-6fb3-11eb-a1e4-f1bdb2897690")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite> GetAllowedSiteForServiceAccount();

    @IDynamicResourceExtension.MethodId("8c44f6c8-1a23-11ec-b0ee-97e8d0c296b8")
    public java.lang.String SimpleName();

    @IDynamicResourceExtension.MethodId("98aef332-9eee-11ec-8d98-a946e0e0308e")
    public java.lang.Boolean PasswordNeverExpires();

  }
  
  public static interface IServiceAccountFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("b4b25887-3a00-11eb-9823-adf6a3e0c300")
    public java.lang.Integer Id(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.javamodel.IServiceAccount serviceAccount);

    @IDynamicResourceExtension.MethodId("edd9abe4-4ff1-11eb-8df9-adb928521f3a")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> GetAbstractHostsBySite(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.javamodel.IServiceAccountEnvironmentSite serviceAccountEnvironmentSite, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.javamodel.IServiceAccount serviceAccount);

    @IDynamicResourceExtension.MethodId("0574c273-54af-11eb-8ec7-9b1f37a1ee7d")
    public java.lang.Boolean Value(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.javamodel.IServiceAccount serviceAccount);

    @IDynamicResourceExtension.MethodId("2dd63939-54e5-11eb-a33f-e91880debedc")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.javamodel.IServiceAccount> OnlyEnabledServiceAccounts(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.javamodel.IServiceAccount> serviceAccountList);

    @IDynamicResourceExtension.MethodId("98aef332-9eee-11ec-8d98-a946e0e0308e")
    public java.lang.Boolean PasswordNeverExpires(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.javamodel.IServiceAccount serviceAccount);

  }
  
  public static class ServiceAccountFunctionsImpl implements IServiceAccountFunctionsImpl {

    public static final IServiceAccountFunctionsImpl INSTANCE = new ServiceAccountFunctionsImpl();

    private ServiceAccountFunctionsImpl() {}

    @Override
    public java.lang.Integer Id(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.javamodel.IServiceAccount serviceAccount) {
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
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> GetAbstractHostsBySite(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.javamodel.IServiceAccountEnvironmentSite serviceAccountEnvironmentSite, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.javamodel.IServiceAccount serviceAccount) {
      /* Begin Protected Region [[edd9abe4-4ff1-11eb-8df9-adb928521f3a]] */
      final var site = serviceAccountEnvironmentSite.selectSite();
      final var abstractSiteFunctions = site.extension(IAbstractSiteFunctions.class);
      return abstractSiteFunctions.GetAbstractHostsBySystemConfiguration(
      		serviceAccount.selectServiceAccountTemplate().selectServiceConfigurationForServiceAccount());
      /* End Protected Region   [[edd9abe4-4ff1-11eb-8df9-adb928521f3a]] */
    }

    @Override
    public java.lang.Boolean Value(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.javamodel.IServiceAccount serviceAccount) {
      /* Begin Protected Region [[0574c273-54af-11eb-8ec7-9b1f37a1ee7d]] */
      final var accountFunctions = serviceAccount.extension(IServiceAccountFunctions.class);
      final var defaultTrueAwareFunctions = accountFunctions.GetAbstractSite()
      		.extension(IEnabledWithDefaultTrueAwareFunctions.class);

      if (!defaultTrueAwareFunctions.IsActiveOrDefaultTrue()) {
      	return false;
      }
      return serviceAccount.extension(IEnabledWithDefaultTrueAwareFunctions.class).IsActiveOrDefaultTrue();
      /* End Protected Region   [[0574c273-54af-11eb-8ec7-9b1f37a1ee7d]] */
    }

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.javamodel.IServiceAccount> OnlyEnabledServiceAccounts(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.javamodel.IServiceAccount> serviceAccountList) {
      /* Begin Protected Region [[2dd63939-54e5-11eb-a33f-e91880debedc]] */
      return serviceAccountList.stream().filter(this::Value).collect(Collectors.toList());
      /* End Protected Region   [[2dd63939-54e5-11eb-a33f-e91880debedc]] */
    }

    @Override
    public java.lang.Boolean PasswordNeverExpires(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.javamodel.IServiceAccount serviceAccount) {
      /* Begin Protected Region [[98aef332-9eee-11ec-8d98-a946e0e0308e]] */
      final var serviceTemplate = serviceAccount.selectServiceAccountTemplate(); 
      if( serviceTemplate.selectPasswordNeverExpires() == null ) {
      	return true;
      }

      return serviceTemplate.selectPasswordNeverExpires().booleanValue();
      /* End Protected Region   [[98aef332-9eee-11ec-8d98-a946e0e0308e]] */
    }

  }
  
  public static class ServiceAccountFunctions {

    private ServiceAccountFunctions() {}

    public static java.lang.Integer Id(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.javamodel.IServiceAccount serviceAccount) {
      return DynamicResourceUtil.invoke(IServiceAccountFunctionsImpl.class, ServiceAccountFunctionsImpl.INSTANCE, serviceAccount).Id(serviceAccount);
    }

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> GetAbstractHostsBySite(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.javamodel.IServiceAccountEnvironmentSite serviceAccountEnvironmentSite, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.javamodel.IServiceAccount serviceAccount) {
      return DynamicResourceUtil.invoke(IServiceAccountFunctionsImpl.class, ServiceAccountFunctionsImpl.INSTANCE, serviceAccount).GetAbstractHostsBySite(serviceAccountEnvironmentSite, serviceAccount);
    }

    public static java.lang.Boolean Value(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.javamodel.IServiceAccount serviceAccount) {
      return DynamicResourceUtil.invoke(IServiceAccountFunctionsImpl.class, ServiceAccountFunctionsImpl.INSTANCE, serviceAccount).Value(serviceAccount);
    }

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.javamodel.IServiceAccount> OnlyEnabledServiceAccounts(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.javamodel.IServiceAccount> serviceAccountList) {
      return DynamicResourceUtil.invoke(IServiceAccountFunctionsImpl.class, ServiceAccountFunctionsImpl.INSTANCE, serviceAccountList).OnlyEnabledServiceAccounts(serviceAccountList);
    }

    public static java.lang.Boolean PasswordNeverExpires(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.javamodel.IServiceAccount serviceAccount) {
      return DynamicResourceUtil.invoke(IServiceAccountFunctionsImpl.class, ServiceAccountFunctionsImpl.INSTANCE, serviceAccount).PasswordNeverExpires(serviceAccount);
    }

  }

  public static interface IgMSA_ServiceAccountFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d4e3c4df-2830-11eb-a351-0f02534982d8")
    public java.lang.String AccountName();

    @IDynamicResourceExtension.MethodId("763e9dd6-9eef-11ec-8d98-a946e0e0308e")
    public java.lang.Boolean PasswordNeverExpires();

  }
  
  public static interface IgMSA_ServiceAccountFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("763e9dd6-9eef-11ec-8d98-a946e0e0308e")
    public java.lang.Boolean PasswordNeverExpires(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.javamodel.IServiceAccount gMSA_ServiceAccount);

  }
  
  public static class gMSA_ServiceAccountFunctionsImpl implements IgMSA_ServiceAccountFunctionsImpl {

    public static final IgMSA_ServiceAccountFunctionsImpl INSTANCE = new gMSA_ServiceAccountFunctionsImpl();

    private gMSA_ServiceAccountFunctionsImpl() {}

    @Override
    public java.lang.Boolean PasswordNeverExpires(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.javamodel.IServiceAccount gMSA_ServiceAccount) {
      return true;
    }

  }
  
  public static class gMSA_ServiceAccountFunctions {

    private gMSA_ServiceAccountFunctions() {}

    public static java.lang.Boolean PasswordNeverExpires(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.accounts.javamodel.IServiceAccount gMSA_ServiceAccount) {
      return DynamicResourceUtil.invoke(IgMSA_ServiceAccountFunctionsImpl.class, gMSA_ServiceAccountFunctionsImpl.INSTANCE, gMSA_ServiceAccount).PasswordNeverExpires(gMSA_ServiceAccount);
    }

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

  public static interface IServiceAccountEnvironmentSiteFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("768c04a2-7826-11eb-b1ee-19aff392296d")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite> AllSites();

  }
  
  public static interface IServiceAccountEnvironmentSiteFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ServiceAccountEnvironmentSiteFunctionsImpl implements IServiceAccountEnvironmentSiteFunctionsImpl {

    public static final IServiceAccountEnvironmentSiteFunctionsImpl INSTANCE = new ServiceAccountEnvironmentSiteFunctionsImpl();

    private ServiceAccountEnvironmentSiteFunctionsImpl() {}

  }
  
  public static class ServiceAccountEnvironmentSiteFunctions {

    private ServiceAccountEnvironmentSiteFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,96deff1f-2830-11eb-a351-0f02534982d8,M3PDDN4OtdwpUV8hOJwXS9s7nSg=] */
