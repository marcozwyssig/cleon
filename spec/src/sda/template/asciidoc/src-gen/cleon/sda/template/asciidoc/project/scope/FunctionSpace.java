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

  public static interface IFeatureGroupFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ae48cead-ba82-11e5-b56d-4f524d402f4b")
    public java.lang.String GetDocumentPath();

  }
  
  public static interface IFeatureGroupFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class FeatureGroupFunctionsImpl implements IFeatureGroupFunctionsImpl {

    public static final IFeatureGroupFunctionsImpl INSTANCE = new FeatureGroupFunctionsImpl();

    private FeatureGroupFunctionsImpl() {}

  }
  
  public static class FeatureGroupFunctions {

    private FeatureGroupFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,d5ca7de4-b540-11e5-bc0c-f35b68c3609a,Ej4MtYZO6z9EHbchZXX+cHI2YIc=] */
