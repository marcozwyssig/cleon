package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.activity;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[9fbae63a-0a1c-11eb-a857-d17d567fc174,imports]] */

/* End Protected Region   [[9fbae63a-0a1c-11eb-a857-d17d567fc174,imports]] */

public class FunctionSpace_Activity_Buildingblock {

  /* Begin Protected Region [[9fbae63a-0a1c-11eb-a857-d17d567fc174]] */
  
  /* End Protected Region   [[9fbae63a-0a1c-11eb-a857-d17d567fc174]] */


  public static interface IAuthZBuildingBlockForPermissionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("11904919-0a1d-11eb-a857-d17d567fc174")
    public java.lang.String CommonName();

  }
  
  public static interface IAuthZBuildingBlockForPermissionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AuthZBuildingBlockForPermissionFunctionsImpl implements IAuthZBuildingBlockForPermissionFunctionsImpl {

    public static final IAuthZBuildingBlockForPermissionFunctionsImpl INSTANCE = new AuthZBuildingBlockForPermissionFunctionsImpl();

    private AuthZBuildingBlockForPermissionFunctionsImpl() {}

  }
  
  public static class AuthZBuildingBlockForPermissionFunctions {

    private AuthZBuildingBlockForPermissionFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,9fbae63a-0a1c-11eb-a857-d17d567fc174,I25VV7TSnT8YSqFMIPa9pkPF3hk=] */
