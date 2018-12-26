package cleon.common.doc.spec.doc;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[cc8dc39e-084c-11e9-9ee8-c54fda7ab431,imports]] */

/* End Protected Region   [[cc8dc39e-084c-11e9-9ee8-c54fda7ab431,imports]] */

public class FunctionSpace_Doc {

  /* Begin Protected Region [[cc8dc39e-084c-11e9-9ee8-c54fda7ab431]] */
  
  /* End Protected Region   [[cc8dc39e-084c-11e9-9ee8-c54fda7ab431]] */


  public static interface IDocumentElementFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d68bbf07-084c-11e9-9ee8-c54fda7ab431")
    public cleon.common.doc.spec.doc.javamodel.IDocumentElement GetParent();

    @IDynamicResourceExtension.MethodId("f6950a72-084c-11e9-9ee8-c54fda7ab431")
    public List<cleon.common.doc.spec.doc.javamodel.IDocumentElement> GetSelfAndParents();

    @IDynamicResourceExtension.MethodId("1dc27d5b-084d-11e9-9ee8-c54fda7ab431")
    public cleon.common.doc.spec.doc.document.javamodel.IDocument GetDocument();

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

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,cc8dc39e-084c-11e9-9ee8-c54fda7ab431,/7ZeEEneyrqU8eRwJP3fDubs03s=] */
