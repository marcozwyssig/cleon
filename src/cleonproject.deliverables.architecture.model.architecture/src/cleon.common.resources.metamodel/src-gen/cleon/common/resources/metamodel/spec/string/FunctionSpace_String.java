package cleon.common.resources.metamodel.spec.string;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[7548ad35-0d5f-11e6-9f44-9d0000bae4df,imports]] */

/* End Protected Region   [[7548ad35-0d5f-11e6-9f44-9d0000bae4df,imports]] */

public class FunctionSpace_String {

  /* Begin Protected Region [[7548ad35-0d5f-11e6-9f44-9d0000bae4df]] */
  
  /* End Protected Region   [[7548ad35-0d5f-11e6-9f44-9d0000bae4df]] */


  public static interface IStringLiteralFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("7be8d784-0d5f-11e6-9f44-9d0000bae4df")
    public java.lang.String convertToValidFileName();

  }
  
  public static interface IStringLiteralFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("7be8d784-0d5f-11e6-9f44-9d0000bae4df")
    public java.lang.String convertToValidFileName(final java.lang.String stringLiteral);

  }
  
  public static class StringLiteralFunctionsImpl implements IStringLiteralFunctionsImpl {

    public static final IStringLiteralFunctionsImpl INSTANCE = new StringLiteralFunctionsImpl();

    private StringLiteralFunctionsImpl() {}

    @Override
    public java.lang.String convertToValidFileName(final java.lang.String stringLiteral) {
      /* Begin Protected Region [[7be8d784-0d5f-11e6-9f44-9d0000bae4df]] */
      return stringLiteral.replaceAll("[^a-zA-Z0-9_-]", "_");
      /* End Protected Region   [[7be8d784-0d5f-11e6-9f44-9d0000bae4df]] */
    }

  }
  
  public static class StringLiteralFunctions {

    private StringLiteralFunctions() {}

    public static java.lang.String convertToValidFileName(final java.lang.String stringLiteral) {
      return DynamicResourceUtil.invoke(IStringLiteralFunctionsImpl.class, StringLiteralFunctionsImpl.INSTANCE, stringLiteral).convertToValidFileName(stringLiteral);
    }

  }

  public static interface ITextLiteralFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("50997b52-0aa8-11e9-b5db-cdf0b8dad9e4")
    public List<java.lang.String> distinct();

  }
  
  public static interface ITextLiteralFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("50997b52-0aa8-11e9-b5db-cdf0b8dad9e4")
    public List<java.lang.String> distinct(final List<java.lang.String> textLiteralList);

  }
  
  public static class TextLiteralFunctionsImpl implements ITextLiteralFunctionsImpl {

    public static final ITextLiteralFunctionsImpl INSTANCE = new TextLiteralFunctionsImpl();

    private TextLiteralFunctionsImpl() {}

    @Override
    public List<java.lang.String> distinct(final List<java.lang.String> textLiteralList) {
      return textLiteralList.stream().distinct().collect(java.util.stream.Collectors.toList());
    }

  }
  
  public static class TextLiteralFunctions {

    private TextLiteralFunctions() {}

    public static List<java.lang.String> distinct(final List<java.lang.String> textLiteralList) {
      return DynamicResourceUtil.invoke(ITextLiteralFunctionsImpl.class, TextLiteralFunctionsImpl.INSTANCE, textLiteralList).distinct(textLiteralList);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,7548ad35-0d5f-11e6-9f44-9d0000bae4df,A0jYrMsOiYijofUaRukyK9GDHD0=] */
