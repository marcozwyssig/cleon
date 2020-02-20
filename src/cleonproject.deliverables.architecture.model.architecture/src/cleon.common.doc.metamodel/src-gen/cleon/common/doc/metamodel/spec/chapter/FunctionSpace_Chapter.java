package cleon.common.doc.metamodel.spec.chapter;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[2561148d-53fa-11ea-93a1-15e540ad9e0c,imports]] */

/* End Protected Region   [[2561148d-53fa-11ea-93a1-15e540ad9e0c,imports]] */

public class FunctionSpace_Chapter {

  /* Begin Protected Region [[2561148d-53fa-11ea-93a1-15e540ad9e0c]] */
  
  /* End Protected Region   [[2561148d-53fa-11ea-93a1-15e540ad9e0c]] */


  public static interface IAbstractChapterFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2e076f33-53fa-11ea-93a1-15e540ad9e0c")
    public java.lang.String Descriptions();

  }
  
  public static interface IAbstractChapterFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractChapterFunctionsImpl implements IAbstractChapterFunctionsImpl {

    public static final IAbstractChapterFunctionsImpl INSTANCE = new AbstractChapterFunctionsImpl();

    private AbstractChapterFunctionsImpl() {}

  }
  
  public static class AbstractChapterFunctions {

    private AbstractChapterFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,2561148d-53fa-11ea-93a1-15e540ad9e0c,aZGo2nIvCo+7RPXtVqxRYU8Aa94=] */
