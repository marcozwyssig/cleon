package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.roles;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[1c42edac-bb61-11e8-921b-c1cf01226512,imports]] */

/* End Protected Region   [[1c42edac-bb61-11e8-921b-c1cf01226512,imports]] */

public class FunctionSpace_Roles {

  /* Begin Protected Region [[1c42edac-bb61-11e8-921b-c1cf01226512]] */
  
  /* End Protected Region   [[1c42edac-bb61-11e8-921b-c1cf01226512]] */


  public static interface IRolesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("25114272-bb61-11e8-921b-c1cf01226512")
    public List<cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.roles.javamodel.IRole> GetRoles();

  }
  
  public static interface IRolesFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RolesFunctionsImpl implements IRolesFunctionsImpl {

    public static final IRolesFunctionsImpl INSTANCE = new RolesFunctionsImpl();

    private RolesFunctionsImpl() {}

  }
  
  public static class RolesFunctions {

    private RolesFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,1c42edac-bb61-11e8-921b-c1cf01226512,qMEu9IlBEfxRiqbAes33qcsFZoU=] */
