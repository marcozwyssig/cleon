package cleon.modelinglanguages.uml.template.asciidoc;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[e9f1ded3-481e-11e6-82f6-0f210765495b,imports]] */

/* End Protected Region   [[e9f1ded3-481e-11e6-82f6-0f210765495b,imports]] */

public class FunctionSpace_Structural {

  /* Begin Protected Region [[e9f1ded3-481e-11e6-82f6-0f210765495b]] */
  
  /* End Protected Region   [[e9f1ded3-481e-11e6-82f6-0f210765495b]] */


  public static interface IAbstractComponentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("434ceec8-481f-11e6-82f6-0f210765495b")
    public java.lang.String RenderDocumentContent();

  }
  
  public static interface IAbstractComponentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractComponentFunctionsImpl implements IAbstractComponentFunctionsImpl {

    public static final IAbstractComponentFunctionsImpl INSTANCE = new AbstractComponentFunctionsImpl();

    private AbstractComponentFunctionsImpl() {}

  }
  
  public static class AbstractComponentFunctions {

    private AbstractComponentFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,e9f1ded3-481e-11e6-82f6-0f210765495b,e84/76iP9GDPHgH0kbGp/AtBrC0=] */
