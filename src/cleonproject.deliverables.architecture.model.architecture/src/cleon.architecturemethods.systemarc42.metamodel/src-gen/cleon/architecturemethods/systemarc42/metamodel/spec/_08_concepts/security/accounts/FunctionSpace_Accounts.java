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


  public static interface IAccountFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9f29a613-2830-11eb-a351-0f02534982d8")
    public java.lang.String AccountName();

  }
  
  public static interface IAccountFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AccountFunctionsImpl implements IAccountFunctionsImpl {

    public static final IAccountFunctionsImpl INSTANCE = new AccountFunctionsImpl();

    private AccountFunctionsImpl() {}

  }
  
  public static class AccountFunctions {

    private AccountFunctions() {}

  }

  public static interface IgMSA_AccountFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d4e3c4df-2830-11eb-a351-0f02534982d8")
    public java.lang.String AccountName();

  }
  
  public static interface IgMSA_AccountFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class gMSA_AccountFunctionsImpl implements IgMSA_AccountFunctionsImpl {

    public static final IgMSA_AccountFunctionsImpl INSTANCE = new gMSA_AccountFunctionsImpl();

    private gMSA_AccountFunctionsImpl() {}

  }
  
  public static class gMSA_AccountFunctions {

    private gMSA_AccountFunctions() {}

  }

  public static interface IServiceAccountSystemFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("061362f5-3951-11eb-93f1-c3f5ad8bb73f")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> SystemConfigurations();

  }
  
  public static interface IServiceAccountSystemFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ServiceAccountSystemFunctionsImpl implements IServiceAccountSystemFunctionsImpl {

    public static final IServiceAccountSystemFunctionsImpl INSTANCE = new ServiceAccountSystemFunctionsImpl();

    private ServiceAccountSystemFunctionsImpl() {}

  }
  
  public static class ServiceAccountSystemFunctions {

    private ServiceAccountSystemFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,96deff1f-2830-11eb-a351-0f02534982d8,fxDzylmOQTcKFPujyxKd3t97Fwg=] */
