package cleon.architecturemethods.systemarc42.metamodel.template.xml;

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

    @IDynamicResourceExtension.MethodId("0d84af49-0022-11ec-96f4-af32234079d7")
    public List<ch.actifsource.core.javamodel.IResource> MembersWithoutServiceAccounts();

    @IDynamicResourceExtension.MethodId("175ab6e8-3e1c-11ec-8500-19d44560f2b7")
    public List<ch.actifsource.core.javamodel.IResource> MembersWithServiceAccounts();

    @IDynamicResourceExtension.MethodId("c28cf44b-0025-11ec-96f4-af32234079d7")
    public List<ch.actifsource.core.javamodel.IResource> MembersSorted();

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

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,6aeea562-be70-11e9-bf11-8d3e86ade1f1,nSHwlEid6LV7OFKnEPMoudpaZ/I=] */
