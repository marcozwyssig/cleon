package cleon.architecturemethods.arc42.metamodel.template.xml.rbac;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[441bf2a5-274e-11f0-bc3e-fdd30b5cbdec,imports]] */

/* End Protected Region   [[441bf2a5-274e-11f0-bc3e-fdd30b5cbdec,imports]] */

public class TestAccounts__T_xml {

  /* Begin Protected Region [[441bf2a5-274e-11f0-bc3e-fdd30b5cbdec]] */
  
  /* End Protected Region   [[441bf2a5-274e-11f0-bc3e-fdd30b5cbdec]] */


  public static interface IServiceAccountFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("441bf2ba-274e-11f0-bc3e-fdd30b5cbdec")
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

  public static interface IServiceAccount_gMSAFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("441bf2c0-274e-11f0-bc3e-fdd30b5cbdec")
    public java.lang.String PasswordNeverExpires();

  }
  
  public static interface IServiceAccount_gMSAFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ServiceAccount_gMSAFunctionsImpl implements IServiceAccount_gMSAFunctionsImpl {

    public static final IServiceAccount_gMSAFunctionsImpl INSTANCE = new ServiceAccount_gMSAFunctionsImpl();

    private ServiceAccount_gMSAFunctionsImpl() {}

  }
  
  public static class ServiceAccount_gMSAFunctions {

    private ServiceAccount_gMSAFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,441bf2a5-274e-11f0-bc3e-fdd30b5cbdec,Akmif26DAG8o1pLyJJP8B7Y+UfY=] */
