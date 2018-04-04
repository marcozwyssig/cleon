package cleon.common.doc.spec.doc.document;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[c73b6e10-d984-11e6-b0a8-c7d78a5235d4,imports]] */

/* End Protected Region   [[c73b6e10-d984-11e6-b0a8-c7d78a5235d4,imports]] */

public class FunctionSpace_Doc {

  /* Begin Protected Region [[c73b6e10-d984-11e6-b0a8-c7d78a5235d4]] */
  
  /* End Protected Region   [[c73b6e10-d984-11e6-b0a8-c7d78a5235d4]] */


  public static interface IAbstractDocumentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("de5cc4d4-ba80-11e5-b56d-4f524d402f4b")
    public java.lang.String GetDocumentPath();

    @IDynamicResourceExtension.MethodId("3d579331-d3ec-11e5-9dfc-cf0f3e030023")
    public java.lang.String GetFullFileName();

    @IDynamicResourceExtension.MethodId("8eea2770-d3f0-11e5-9dfc-cf0f3e030023")
    public java.lang.String GetFileName();

    @IDynamicResourceExtension.MethodId("741b9c04-5e36-11e6-a777-551543f10110")
    public java.lang.String GetDocumentName();

  }
  
  public static interface IAbstractDocumentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractDocumentFunctionsImpl implements IAbstractDocumentFunctionsImpl {

    public static final IAbstractDocumentFunctionsImpl INSTANCE = new AbstractDocumentFunctionsImpl();

    private AbstractDocumentFunctionsImpl() {}

  }
  
  public static class AbstractDocumentFunctions {

    private AbstractDocumentFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,c73b6e10-d984-11e6-b0a8-c7d78a5235d4,vAlzpfwW8D6EYi3C0aTjYs4ApiI=] */
