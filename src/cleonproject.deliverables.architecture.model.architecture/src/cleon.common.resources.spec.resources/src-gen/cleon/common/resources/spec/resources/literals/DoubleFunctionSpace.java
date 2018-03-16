package cleon.common.resources.spec.resources.literals;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[a7a3ac82-0546-11e6-adf9-af3c4dc80bc3,imports]] */

/* End Protected Region   [[a7a3ac82-0546-11e6-adf9-af3c4dc80bc3,imports]] */

public class DoubleFunctionSpace {

  /* Begin Protected Region [[a7a3ac82-0546-11e6-adf9-af3c4dc80bc3]] */
  
  /* End Protected Region   [[a7a3ac82-0546-11e6-adf9-af3c4dc80bc3]] */


  public static interface IDoubleLiteralFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b5e76878-0546-11e6-adf9-af3c4dc80bc3")
    public java.lang.String FormatHumanReadable();

  }
  
  public static interface IDoubleLiteralFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("b5e76878-0546-11e6-adf9-af3c4dc80bc3")
    public java.lang.String FormatHumanReadable(final java.lang.Double doubleLiteral);

  }
  
  public static class DoubleLiteralFunctionsImpl implements IDoubleLiteralFunctionsImpl {

    public static final IDoubleLiteralFunctionsImpl INSTANCE = new DoubleLiteralFunctionsImpl();

    private DoubleLiteralFunctionsImpl() {}

    @Override
    public java.lang.String FormatHumanReadable(final java.lang.Double doubleLiteral) {
      /* Begin Protected Region [[b5e76878-0546-11e6-adf9-af3c4dc80bc3]] */
    	return String.format("%.2f", doubleLiteral);
      /* End Protected Region   [[b5e76878-0546-11e6-adf9-af3c4dc80bc3]] */
    }

  }
  
  public static class DoubleLiteralFunctions {

    private DoubleLiteralFunctions() {}

    public static java.lang.String FormatHumanReadable(final java.lang.Double doubleLiteral) {
      return DynamicResourceUtil.invoke(IDoubleLiteralFunctionsImpl.class, DoubleLiteralFunctionsImpl.INSTANCE, doubleLiteral).FormatHumanReadable(doubleLiteral);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,a7a3ac82-0546-11e6-adf9-af3c4dc80bc3,KTcY8Eh2bY/qgQHXsA1pgjCgrZQ=] */
