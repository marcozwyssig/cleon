package cleon.common.doc.metamodel.spec.chapter.about;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[fb021fad-08f9-11e9-9ee8-c54fda7ab431,imports]] */

/* End Protected Region   [[fb021fad-08f9-11e9-9ee8-c54fda7ab431,imports]] */

public class FunctionSpace_About {

  /* Begin Protected Region [[fb021fad-08f9-11e9-9ee8-c54fda7ab431]] */
  
  /* End Protected Region   [[fb021fad-08f9-11e9-9ee8-c54fda7ab431]] */


  public static interface IChapterDescriptionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("15ceeece-08fa-11e9-9ee8-c54fda7ab431")
    public java.lang.String GetDescripton();

  }
  
  public static interface IChapterDescriptionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ChapterDescriptionFunctionsImpl implements IChapterDescriptionFunctionsImpl {

    public static final IChapterDescriptionFunctionsImpl INSTANCE = new ChapterDescriptionFunctionsImpl();

    private ChapterDescriptionFunctionsImpl() {}

  }
  
  public static class ChapterDescriptionFunctions {

    private ChapterDescriptionFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,fb021fad-08f9-11e9-9ee8-c54fda7ab431,I6bLMrqM16peV25eJbMpkYwahOg=] */
