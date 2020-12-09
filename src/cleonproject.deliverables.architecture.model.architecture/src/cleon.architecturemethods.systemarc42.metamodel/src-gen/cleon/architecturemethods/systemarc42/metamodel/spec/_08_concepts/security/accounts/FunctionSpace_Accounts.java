package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[96deff1f-2830-11eb-a351-0f02534982d8,imports]] */

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

  }
  
  public static interface IServiceAccountFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("b4b25887-3a00-11eb-9823-adf6a3e0c300")
    public java.lang.Integer Id(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IServiceAccount serviceAccount);

  }
  
  public static class ServiceAccountFunctionsImpl implements IServiceAccountFunctionsImpl {

    public static final IServiceAccountFunctionsImpl INSTANCE = new ServiceAccountFunctionsImpl();

    private ServiceAccountFunctionsImpl() {}

    @Override
    public java.lang.Integer Id(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IServiceAccount serviceAccount) {
      /* Begin Protected Region [[b4b25887-3a00-11eb-9823-adf6a3e0c300]] */
    	IServiceAccountFunctions serviceAccountFunctions = serviceAccount.extension(IServiceAccountFunctions.class);
    	Integer id = serviceAccountFunctions.RangeId();
    	return id + serviceAccount.selectServiceAccountTemplate().selectIdentifier();
      /* End Protected Region   [[b4b25887-3a00-11eb-9823-adf6a3e0c300]] */
    }

  }
  
  public static class ServiceAccountFunctions {

    private ServiceAccountFunctions() {}

    public static java.lang.Integer Id(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IServiceAccount serviceAccount) {
      return DynamicResourceUtil.invoke(IServiceAccountFunctionsImpl.class, ServiceAccountFunctionsImpl.INSTANCE, serviceAccount).Id(serviceAccount);
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

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,96deff1f-2830-11eb-a351-0f02534982d8,0dCrNKgJN6QKuwQH9xmFIcOojNE=] */
