package cleon.applications.actifsource.metamodel.template.eclipse.src.gradle;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[398f1039-2fb3-11ea-a393-0bc3b1f5682f,imports]] */

/* End Protected Region   [[398f1039-2fb3-11ea-a393-0bc3b1f5682f,imports]] */

public class FunctionSpace_Gradle {

  /* Begin Protected Region [[398f1039-2fb3-11ea-a393-0bc3b1f5682f]] */
  
  /* End Protected Region   [[398f1039-2fb3-11ea-a393-0bc3b1f5682f]] */


  public static interface IGradleFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("63867935-2fb3-11ea-a393-0bc3b1f5682f")
    public java.lang.String GetPath();

  }
  
  public static interface IGradleFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class GradleFunctionsImpl implements IGradleFunctionsImpl {

    public static final IGradleFunctionsImpl INSTANCE = new GradleFunctionsImpl();

    private GradleFunctionsImpl() {}

  }
  
  public static class GradleFunctions {

    private GradleFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,398f1039-2fb3-11ea-a393-0bc3b1f5682f,16jb33Pfwb0C2sm0N3l3y68pEb8=] */
