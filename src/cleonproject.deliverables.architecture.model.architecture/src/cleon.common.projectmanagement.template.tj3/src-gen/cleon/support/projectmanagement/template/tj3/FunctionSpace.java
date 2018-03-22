package cleon.support.projectmanagement.template.tj3;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[c576aebb-d6ab-11e6-a1b8-05a222dbc1bd,imports]] */

/* End Protected Region   [[c576aebb-d6ab-11e6-a1b8-05a222dbc1bd,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[c576aebb-d6ab-11e6-a1b8-05a222dbc1bd]] */
  
  /* End Protected Region   [[c576aebb-d6ab-11e6-a1b8-05a222dbc1bd]] */


  public static interface IWorkItemGroupFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("87e89194-d6b1-11e6-a1b8-05a222dbc1bd")
    public java.lang.String Render();

  }
  
  public static interface IWorkItemGroupFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class WorkItemGroupFunctionsImpl implements IWorkItemGroupFunctionsImpl {

    public static final IWorkItemGroupFunctionsImpl INSTANCE = new WorkItemGroupFunctionsImpl();

    private WorkItemGroupFunctionsImpl() {}

  }
  
  public static class WorkItemGroupFunctions {

    private WorkItemGroupFunctions() {}

  }

  public static interface IWorkItemFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0c660be7-24c9-11e7-90ac-916720a1b370")
    public java.lang.String Render();

  }
  
  public static interface IWorkItemFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class WorkItemFunctionsImpl implements IWorkItemFunctionsImpl {

    public static final IWorkItemFunctionsImpl INSTANCE = new WorkItemFunctionsImpl();

    private WorkItemFunctionsImpl() {}

  }
  
  public static class WorkItemFunctions {

    private WorkItemFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,c576aebb-d6ab-11e6-a1b8-05a222dbc1bd,7MKWn6BWHg2ynMCJE8NDs7AdEtI=] */
