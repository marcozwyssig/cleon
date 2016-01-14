package cleon.sda.template.asciidoc.project;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[c71157fb-ba84-11e5-b56d-4f524d402f4b,imports]] */

/* End Protected Region   [[c71157fb-ba84-11e5-b56d-4f524d402f4b,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[c71157fb-ba84-11e5-b56d-4f524d402f4b]] */
  
  /* End Protected Region   [[c71157fb-ba84-11e5-b56d-4f524d402f4b]] */


  public static interface IProjectDocumentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("25929179-ba84-11e5-b56d-4f524d402f4b")
    public java.lang.String GetDocumentPath();

  }
  
  public static interface IProjectDocumentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ProjectDocumentFunctionsImpl implements IProjectDocumentFunctionsImpl {

    public static final IProjectDocumentFunctionsImpl INSTANCE = new ProjectDocumentFunctionsImpl();

    private ProjectDocumentFunctionsImpl() {}

  }
  
  public static class ProjectDocumentFunctions {

    private ProjectDocumentFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,c71157fb-ba84-11e5-b56d-4f524d402f4b,auaQ2cpcDGzKAJrTnP1qM9hEIQ0=] */
