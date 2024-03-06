package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.security.iam;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[a64d60ff-d5d2-11ec-ad12-8d6f8e00bc94,imports]] */

/* End Protected Region   [[a64d60ff-d5d2-11ec-ad12-8d6f8e00bc94,imports]] */

public class FunctionSpace_IAM {

  /* Begin Protected Region [[a64d60ff-d5d2-11ec-ad12-8d6f8e00bc94]] */
  
  /* End Protected Region   [[a64d60ff-d5d2-11ec-ad12-8d6f8e00bc94]] */


  public static interface IActiveDirectoryManagingActorFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ad5db261-d5d2-11ec-ad12-8d6f8e00bc94")
    public java.lang.String PermissionName();

  }
  
  public static interface IActiveDirectoryManagingActorFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ActiveDirectoryManagingActorFunctionsImpl implements IActiveDirectoryManagingActorFunctionsImpl {

    public static final IActiveDirectoryManagingActorFunctionsImpl INSTANCE = new ActiveDirectoryManagingActorFunctionsImpl();

    private ActiveDirectoryManagingActorFunctionsImpl() {}

  }
  
  public static class ActiveDirectoryManagingActorFunctions {

    private ActiveDirectoryManagingActorFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,a64d60ff-d5d2-11ec-ad12-8d6f8e00bc94,Pu4PDJBtsFinFaY0mAaNUfOwsRY=] */
