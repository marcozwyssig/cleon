package cleon.common.doc.template.docbook.chapter.about;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[229e76ff-08f9-11e9-9ee8-c54fda7ab431,imports]] */

/* End Protected Region   [[229e76ff-08f9-11e9-9ee8-c54fda7ab431,imports]] */

public class FunctionSpace_Docbook_About {

  /* Begin Protected Region [[229e76ff-08f9-11e9-9ee8-c54fda7ab431]] */
  
  /* End Protected Region   [[229e76ff-08f9-11e9-9ee8-c54fda7ab431]] */


  public static interface IAboutFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("39ac902d-08f9-11e9-9ee8-c54fda7ab431")
    public java.lang.String RenderChapters();

  }
  
  public static interface IAboutFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AboutFunctionsImpl implements IAboutFunctionsImpl {

    public static final IAboutFunctionsImpl INSTANCE = new AboutFunctionsImpl();

    private AboutFunctionsImpl() {}

  }
  
  public static class AboutFunctions {

    private AboutFunctions() {}

  }

  public static interface ILayoutFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("cd167267-08f9-11e9-9ee8-c54fda7ab431")
    public java.lang.String RenderContentElement();

  }
  
  public static interface ILayoutFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class LayoutFunctionsImpl implements ILayoutFunctionsImpl {

    public static final ILayoutFunctionsImpl INSTANCE = new LayoutFunctionsImpl();

    private LayoutFunctionsImpl() {}

  }
  
  public static class LayoutFunctions {

    private LayoutFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,229e76ff-08f9-11e9-9ee8-c54fda7ab431,sjgmGb+2RFLZA/WwkNGzI4LkuHA=] */
