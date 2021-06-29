package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.actor;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[7fae76bb-d5e1-11eb-b02a-03222c04a898,imports]] */

/* End Protected Region   [[7fae76bb-d5e1-11eb-b02a-03222c04a898,imports]] */

public class FunctoinSpace_AuthZBuildingBlockForSystemComponent_Actor {

  /* Begin Protected Region [[7fae76bb-d5e1-11eb-b02a-03222c04a898]] */
  
  /* End Protected Region   [[7fae76bb-d5e1-11eb-b02a-03222c04a898]] */


  public static interface IAuthZBuildingBlockForSystemComponentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("92f96e6a-d5e1-11eb-b02a-03222c04a898")
    public java.lang.String CommonName();

  }
  
  public static interface IAuthZBuildingBlockForSystemComponentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AuthZBuildingBlockForSystemComponentFunctionsImpl implements IAuthZBuildingBlockForSystemComponentFunctionsImpl {

    public static final IAuthZBuildingBlockForSystemComponentFunctionsImpl INSTANCE = new AuthZBuildingBlockForSystemComponentFunctionsImpl();

    private AuthZBuildingBlockForSystemComponentFunctionsImpl() {}

  }
  
  public static class AuthZBuildingBlockForSystemComponentFunctions {

    private AuthZBuildingBlockForSystemComponentFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,7fae76bb-d5e1-11eb-b02a-03222c04a898,27I9eBqtrBQdMTDFayYVTH9PJwo=] */
