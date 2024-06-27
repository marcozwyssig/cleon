package cleon.architecturemethods.arc42.metamodel.template.asciidoc;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[81ccce05-b9c6-11ee-a257-01d178f494ca,imports]] */

/* End Protected Region   [[81ccce05-b9c6-11ee-a257-01d178f494ca,imports]] */

public class Database_aE_View__T_adoc {

  /* Begin Protected Region [[81ccce05-b9c6-11ee-a257-01d178f494ca]] */
  
  /* End Protected Region   [[81ccce05-b9c6-11ee-a257-01d178f494ca]] */


  public static interface IViewFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8de75e52-e50d-11ee-a074-d7afe74e4a27")
    public java.lang.String ChapterRef();

    @IDynamicResourceExtension.MethodId("9afb73f1-e50d-11ee-a074-d7afe74e4a27")
    public java.lang.String Ref();

    @IDynamicResourceExtension.MethodId("9964c974-e51f-11ee-a074-d7afe74e4a27")
    public java.lang.String Name();

  }
  
  public static interface IViewFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ViewFunctionsImpl implements IViewFunctionsImpl {

    public static final IViewFunctionsImpl INSTANCE = new ViewFunctionsImpl();

    private ViewFunctionsImpl() {}

  }
  
  public static class ViewFunctions {

    private ViewFunctions() {}

  }

  public static interface IDatabaseElementFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8fbd2b16-e51f-11ee-a074-d7afe74e4a27")
    public java.lang.String Name();

    @IDynamicResourceExtension.MethodId("287ac3e9-e537-11ee-a074-d7afe74e4a27")
    public java.lang.String ChapterRef();

  }
  
  public static interface IDatabaseElementFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DatabaseElementFunctionsImpl implements IDatabaseElementFunctionsImpl {

    public static final IDatabaseElementFunctionsImpl INSTANCE = new DatabaseElementFunctionsImpl();

    private DatabaseElementFunctionsImpl() {}

  }
  
  public static class DatabaseElementFunctions {

    private DatabaseElementFunctions() {}

  }

  public static interface ITableAreaFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("be85f5d4-27c7-11ef-9acc-81efe99aa8b6")
    public java.lang.String ChapterRef();

  }
  
  public static interface ITableAreaFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TableAreaFunctionsImpl implements ITableAreaFunctionsImpl {

    public static final ITableAreaFunctionsImpl INSTANCE = new TableAreaFunctionsImpl();

    private TableAreaFunctionsImpl() {}

  }
  
  public static class TableAreaFunctions {

    private TableAreaFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,81ccce05-b9c6-11ee-a257-01d178f494ca,R0I9d368SJefU3lHUkkceRG1c14=] */