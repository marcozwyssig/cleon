package cleon.sda.template.asciidoc.project.planning;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[67eddf6e-c02a-11e5-b927-b1b055d0575f,imports]] */

/* End Protected Region   [[67eddf6e-c02a-11e5-b927-b1b055d0575f,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[67eddf6e-c02a-11e5-b927-b1b055d0575f]] */
  
  /* End Protected Region   [[67eddf6e-c02a-11e5-b927-b1b055d0575f]] */


  public static interface ISprintBacklogFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("765eecaa-c02a-11e5-b927-b1b055d0575f")
    public java.lang.String RenderChapterContent();

  }
  
  public static interface ISprintBacklogFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SprintBacklogFunctionsImpl implements ISprintBacklogFunctionsImpl {

    public static final ISprintBacklogFunctionsImpl INSTANCE = new SprintBacklogFunctionsImpl();

    private SprintBacklogFunctionsImpl() {}

  }
  
  public static class SprintBacklogFunctions {

    private SprintBacklogFunctions() {}

  }

  public static interface ISprintCapacityFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("56b3f930-c02b-11e5-b927-b1b055d0575f")
    public java.lang.String RenderChapterContent();

  }
  
  public static interface ISprintCapacityFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SprintCapacityFunctionsImpl implements ISprintCapacityFunctionsImpl {

    public static final ISprintCapacityFunctionsImpl INSTANCE = new SprintCapacityFunctionsImpl();

    private SprintCapacityFunctionsImpl() {}

  }
  
  public static class SprintCapacityFunctions {

    private SprintCapacityFunctions() {}

  }

  public static interface IReleaseFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f0113260-c030-11e5-b927-b1b055d0575f")
    public java.lang.String RenderChapterContent();

  }
  
  public static interface IReleaseFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ReleaseFunctionsImpl implements IReleaseFunctionsImpl {

    public static final IReleaseFunctionsImpl INSTANCE = new ReleaseFunctionsImpl();

    private ReleaseFunctionsImpl() {}

  }
  
  public static class ReleaseFunctions {

    private ReleaseFunctions() {}

  }

  public static interface ISprintFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f5995d93-c030-11e5-b927-b1b055d0575f")
    public java.lang.String RenderChapterContent();

  }
  
  public static interface ISprintFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SprintFunctionsImpl implements ISprintFunctionsImpl {

    public static final ISprintFunctionsImpl INSTANCE = new SprintFunctionsImpl();

    private SprintFunctionsImpl() {}

  }
  
  public static class SprintFunctions {

    private SprintFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,67eddf6e-c02a-11e5-b927-b1b055d0575f,K/xMnVcM047W8pv7dy6QKxsP5To=] */
