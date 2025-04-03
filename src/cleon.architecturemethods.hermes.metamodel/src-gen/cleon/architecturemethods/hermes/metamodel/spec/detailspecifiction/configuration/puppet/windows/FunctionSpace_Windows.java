package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[8392bad9-1073-11f0-b378-11a495632127,imports]] */

/* End Protected Region   [[8392bad9-1073-11f0-b378-11a495632127,imports]] */

public class FunctionSpace_Windows {

  /* Begin Protected Region [[8392bad9-1073-11f0-b378-11a495632127]] */
  
  /* End Protected Region   [[8392bad9-1073-11f0-b378-11a495632127]] */


  public static interface IPuppetConfigurationPermissionsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8b514db2-1073-11f0-b378-11a495632127")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IActivityPermission> AvailablePermissions();

    @IDynamicResourceExtension.MethodId("8fc9009e-1078-11f0-b378-11a495632127")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IActivityPermission> AllPermissions();

  }
  
  public static interface IPuppetConfigurationPermissionsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class PuppetConfigurationPermissionsFunctionsImpl implements IPuppetConfigurationPermissionsFunctionsImpl {

    public static final IPuppetConfigurationPermissionsFunctionsImpl INSTANCE = new PuppetConfigurationPermissionsFunctionsImpl();

    private PuppetConfigurationPermissionsFunctionsImpl() {}

  }
  
  public static class PuppetConfigurationPermissionsFunctions {

    private PuppetConfigurationPermissionsFunctions() {}

  }

  public static interface IUserrightsassignmentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("895bcc67-1078-11f0-b378-11a495632127")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IActivityPermission> AvailablePermissions();

  }
  
  public static interface IUserrightsassignmentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class UserrightsassignmentFunctionsImpl implements IUserrightsassignmentFunctionsImpl {

    public static final IUserrightsassignmentFunctionsImpl INSTANCE = new UserrightsassignmentFunctionsImpl();

    private UserrightsassignmentFunctionsImpl() {}

  }
  
  public static class UserrightsassignmentFunctions {

    private UserrightsassignmentFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,8392bad9-1073-11f0-b378-11a495632127,/WPZy0obFB/MPfCi9LdyPsx+Nnw=] */
