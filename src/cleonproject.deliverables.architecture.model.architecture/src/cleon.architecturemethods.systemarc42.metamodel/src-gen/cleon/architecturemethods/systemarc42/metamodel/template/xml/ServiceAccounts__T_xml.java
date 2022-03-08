package cleon.architecturemethods.systemarc42.metamodel.template.xml;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[dc66a1d9-f74c-11ea-b8c1-41c5952fbbbb,imports]] */

/* End Protected Region   [[dc66a1d9-f74c-11ea-b8c1-41c5952fbbbb,imports]] */

public class ServiceAccounts__T_xml {

  /* Begin Protected Region [[dc66a1d9-f74c-11ea-b8c1-41c5952fbbbb]] */
  
  /* End Protected Region   [[dc66a1d9-f74c-11ea-b8c1-41c5952fbbbb]] */


  public static interface IServiceAccountFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("52062e33-9ef7-11ec-8d98-a946e0e0308e")
    public java.lang.String PasswordNeverExpires();

  }
  
  public static interface IServiceAccountFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ServiceAccountFunctionsImpl implements IServiceAccountFunctionsImpl {

    public static final IServiceAccountFunctionsImpl INSTANCE = new ServiceAccountFunctionsImpl();

    private ServiceAccountFunctionsImpl() {}

  }
  
  public static class ServiceAccountFunctions {

    private ServiceAccountFunctions() {}

  }

  public static interface IgMSA_ServiceAccountFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("823bd523-9ef8-11ec-8d98-a946e0e0308e")
    public java.lang.String PasswordNeverExpires();

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

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,dc66a1d9-f74c-11ea-b8c1-41c5952fbbbb,O6LLjA3i0RIfCfxqi0AlLcyrJrE=] */
