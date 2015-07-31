package cleon.doc.template.asciidoctor;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[dd9941b6-d871-11e4-aa2f-c11242a92b60,imports]] */

/* End Protected Region   [[dd9941b6-d871-11e4-aa2f-c11242a92b60,imports]] */

public class Document__T_adoc {

  /* Begin Protected Region [[dd9941b6-d871-11e4-aa2f-c11242a92b60]] */
  
  /* End Protected Region   [[dd9941b6-d871-11e4-aa2f-c11242a92b60]] */


  public static interface IDocumentElementFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("54a23052-3527-11e5-909a-4bcced25d7ee")
    public java.lang.String RenderDocument();

  }
  
  public static interface IDocumentElementFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DocumentElementFunctionsImpl implements IDocumentElementFunctionsImpl {

    public static final IDocumentElementFunctionsImpl INSTANCE = new DocumentElementFunctionsImpl();

    private DocumentElementFunctionsImpl() {}

  }
  
  public static class DocumentElementFunctions {

    private DocumentElementFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,dd9941b6-d871-11e4-aa2f-c11242a92b60,KIl4OuzIdzhbgyLva9LZPR1pWT8=] */
