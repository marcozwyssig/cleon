package cleon.architecturemethods.arc42.metamodel.template.xml.rbac;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[6aeea562-be70-11e9-bf11-8d3e86ade1f1,imports]] */

/* End Protected Region   [[6aeea562-be70-11e9-bf11-8d3e86ade1f1,imports]] */

public class Activities__T_xml {

  /* Begin Protected Region [[6aeea562-be70-11e9-bf11-8d3e86ade1f1]] */
  
  /* End Protected Region   [[6aeea562-be70-11e9-bf11-8d3e86ade1f1]] */


  public static interface IActivityPermissionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("175ab6e8-3e1c-11ec-8500-19d44560f2b7")
    public List<ch.actifsource.core.javamodel.IResource> MembersWithServiceAccounts();

  }
  
  public static interface IActivityPermissionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ActivityPermissionFunctionsImpl implements IActivityPermissionFunctionsImpl {

    public static final IActivityPermissionFunctionsImpl INSTANCE = new ActivityPermissionFunctionsImpl();

    private ActivityPermissionFunctionsImpl() {}

  }
  
  public static class ActivityPermissionFunctions {

    private ActivityPermissionFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,6aeea562-be70-11e9-bf11-8d3e86ade1f1,JtZVUtjTEOdhkDqNjpAmqHcGpSs=] */
