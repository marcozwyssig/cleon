package cleon.sda.template.asciidoc.project.scope;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[d5ca7de4-b540-11e5-bc0c-f35b68c3609a,imports]] */

/* End Protected Region   [[d5ca7de4-b540-11e5-bc0c-f35b68c3609a,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[d5ca7de4-b540-11e5-bc0c-f35b68c3609a]] */
  
  /* End Protected Region   [[d5ca7de4-b540-11e5-bc0c-f35b68c3609a]] */


  public static interface IOutcomeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("eefa8d32-b540-11e5-bc0c-f35b68c3609a")
    public java.lang.String RenderChapterContent();

  }
  
  public static interface IOutcomeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class OutcomeFunctionsImpl implements IOutcomeFunctionsImpl {

    public static final IOutcomeFunctionsImpl INSTANCE = new OutcomeFunctionsImpl();

    private OutcomeFunctionsImpl() {}

  }
  
  public static class OutcomeFunctions {

    private OutcomeFunctions() {}

  }

  public static interface IBacklogFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("94204bbc-ba81-11e5-b56d-4f524d402f4b")
    public java.lang.String GetDocumentPath();

  }
  
  public static interface IBacklogFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class BacklogFunctionsImpl implements IBacklogFunctionsImpl {

    public static final IBacklogFunctionsImpl INSTANCE = new BacklogFunctionsImpl();

    private BacklogFunctionsImpl() {}

  }
  
  public static class BacklogFunctions {

    private BacklogFunctions() {}

  }

  public static interface IWorkItemFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f6a60e7d-ba91-11e5-92ed-2d7ef7ca3831")
    public java.lang.String RenderChapterContent();

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

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,d5ca7de4-b540-11e5-bc0c-f35b68c3609a,e8KIwKBR9FyH4QtcfrkuTlbz6D4=] */
