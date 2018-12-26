package cleon.common.doc.template.docbook.chapter.references;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[1076ca42-08f9-11e9-9ee8-c54fda7ab431,imports]] */

/* End Protected Region   [[1076ca42-08f9-11e9-9ee8-c54fda7ab431,imports]] */

public class FunctionSpace_Docbook_References {

  /* Begin Protected Region [[1076ca42-08f9-11e9-9ee8-c54fda7ab431]] */
  
  /* End Protected Region   [[1076ca42-08f9-11e9-9ee8-c54fda7ab431]] */


  public static interface IReferencesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e49cbbd8-076c-11e9-8a1f-efe3fa2d8b84")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IReferencesFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ReferencesFunctionsImpl implements IReferencesFunctionsImpl {

    public static final IReferencesFunctionsImpl INSTANCE = new ReferencesFunctionsImpl();

    private ReferencesFunctionsImpl() {}

  }
  
  public static class ReferencesFunctions {

    private ReferencesFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,1076ca42-08f9-11e9-9ee8-c54fda7ab431,ZaMYvBJg+r03tuYmS2GCbuSFxKk=] */
