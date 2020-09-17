package cleon.common.resources.metamodel.spec.literals;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[94cc46da-f832-11ea-8aa5-7b39f57c0cbc,imports]] */

/* End Protected Region   [[94cc46da-f832-11ea-8aa5-7b39f57c0cbc,imports]] */

public class BooleanFunctionSpace {

  /* Begin Protected Region [[94cc46da-f832-11ea-8aa5-7b39f57c0cbc]] */
  
  /* End Protected Region   [[94cc46da-f832-11ea-8aa5-7b39f57c0cbc]] */


  public static interface IBooleanLiteralFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("a0a0622a-f832-11ea-8aa5-7b39f57c0cbc")
    public java.lang.Boolean isTrue();

  }
  
  public static interface IBooleanLiteralFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class BooleanLiteralFunctionsImpl implements IBooleanLiteralFunctionsImpl {

    public static final IBooleanLiteralFunctionsImpl INSTANCE = new BooleanLiteralFunctionsImpl();

    private BooleanLiteralFunctionsImpl() {}

  }
  
  public static class BooleanLiteralFunctions {

    private BooleanLiteralFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,94cc46da-f832-11ea-8aa5-7b39f57c0cbc,xG03XYhLbiF8Ah42x5fzRkfml/I=] */
