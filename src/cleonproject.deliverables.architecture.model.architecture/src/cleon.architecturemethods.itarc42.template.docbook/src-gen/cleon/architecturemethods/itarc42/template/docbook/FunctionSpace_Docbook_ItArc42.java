package cleon.architecturemethods.itarc42.template.docbook;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[fb58b09d-d181-11e8-b18f-df1540bb7a5c,imports]] */

/* End Protected Region   [[fb58b09d-d181-11e8-b18f-df1540bb7a5c,imports]] */

public class FunctionSpace_Docbook_ItArc42 {

  /* Begin Protected Region [[fb58b09d-d181-11e8-b18f-df1540bb7a5c]] */
  
  /* End Protected Region   [[fb58b09d-d181-11e8-b18f-df1540bb7a5c]] */


  public static interface IItArc42Functions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fb58b13c-d181-11e8-b18f-df1540bb7a5c")
    public java.lang.String RenderChapters();

  }
  
  public static interface IItArc42FunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ItArc42FunctionsImpl implements IItArc42FunctionsImpl {

    public static final IItArc42FunctionsImpl INSTANCE = new ItArc42FunctionsImpl();

    private ItArc42FunctionsImpl() {}

  }
  
  public static class ItArc42Functions {

    private ItArc42Functions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,fb58b09d-d181-11e8-b18f-df1540bb7a5c,iyaCN9cHWKCnSTOphlG/7zATIPM=] */
