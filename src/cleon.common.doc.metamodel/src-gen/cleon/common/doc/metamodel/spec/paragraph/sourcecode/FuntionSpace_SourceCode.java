package cleon.common.doc.metamodel.spec.paragraph.sourcecode;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[52147cae-04c8-11f0-a60d-7129d8434d4c,imports]] */

/* End Protected Region   [[52147cae-04c8-11f0-a60d-7129d8434d4c,imports]] */

public class FuntionSpace_SourceCode {

  /* Begin Protected Region [[52147cae-04c8-11f0-a60d-7129d8434d4c]] */
  
  /* End Protected Region   [[52147cae-04c8-11f0-a60d-7129d8434d4c]] */


  public static interface ISourceCodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("56f82a89-04c8-11f0-a60d-7129d8434d4c")
    public java.lang.String SimpleName();

  }
  
  public static interface ISourceCodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SourceCodeFunctionsImpl implements ISourceCodeFunctionsImpl {

    public static final ISourceCodeFunctionsImpl INSTANCE = new SourceCodeFunctionsImpl();

    private SourceCodeFunctionsImpl() {}

  }
  
  public static class SourceCodeFunctions {

    private SourceCodeFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,52147cae-04c8-11f0-a60d-7129d8434d4c,8nsPkwZR8xebbH8G7Y0p1pQaREs=] */
