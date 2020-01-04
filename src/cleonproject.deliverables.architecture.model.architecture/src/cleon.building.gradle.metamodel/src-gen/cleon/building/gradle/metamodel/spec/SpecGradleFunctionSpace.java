package cleon.building.gradle.metamodel.spec;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[6c993fd9-c0ac-11e7-a130-7198de5ddf3f,imports]] */

/* End Protected Region   [[6c993fd9-c0ac-11e7-a130-7198de5ddf3f,imports]] */

public class SpecGradleFunctionSpace {

  /* Begin Protected Region [[6c993fd9-c0ac-11e7-a130-7198de5ddf3f]] */
  
  /* End Protected Region   [[6c993fd9-c0ac-11e7-a130-7198de5ddf3f]] */


  public static interface IStringLiteralFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("7380fb89-c0ac-11e7-a130-7198de5ddf3f")
    public java.lang.String convertDotToSlash();

  }
  
  public static interface IStringLiteralFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("7380fb89-c0ac-11e7-a130-7198de5ddf3f")
    public java.lang.String convertDotToSlash(final java.lang.String stringLiteral);

  }
  
  public static class StringLiteralFunctionsImpl implements IStringLiteralFunctionsImpl {

    public static final IStringLiteralFunctionsImpl INSTANCE = new StringLiteralFunctionsImpl();

    private StringLiteralFunctionsImpl() {}

    @Override
    public java.lang.String convertDotToSlash(final java.lang.String stringLiteral) {
      /* Begin Protected Region [[7380fb89-c0ac-11e7-a130-7198de5ddf3f]] */
      return stringLiteral.replace(".", "/");
      /* End Protected Region   [[7380fb89-c0ac-11e7-a130-7198de5ddf3f]] */
    }

  }
  
  public static class StringLiteralFunctions {

    private StringLiteralFunctions() {}

    public static java.lang.String convertDotToSlash(final java.lang.String stringLiteral) {
      return DynamicResourceUtil.invoke(IStringLiteralFunctionsImpl.class, StringLiteralFunctionsImpl.INSTANCE, stringLiteral).convertDotToSlash(stringLiteral);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,6c993fd9-c0ac-11e7-a130-7198de5ddf3f,hIOMHzpnwlfu+nApVZCodq6N2CI=] */
