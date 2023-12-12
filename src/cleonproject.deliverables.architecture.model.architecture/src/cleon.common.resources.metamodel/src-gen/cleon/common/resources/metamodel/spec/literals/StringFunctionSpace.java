package cleon.common.resources.metamodel.spec.literals;

import ch.actifsource.util.Assert;

import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[7548ad35-0d5f-11e6-9f44-9d0000bae4df,imports]] */
import ch.actifsource.util.character.StringUtil;
/* End Protected Region   [[7548ad35-0d5f-11e6-9f44-9d0000bae4df,imports]] */

public class StringFunctionSpace {

  /* Begin Protected Region [[7548ad35-0d5f-11e6-9f44-9d0000bae4df]] */
  
  /* End Protected Region   [[7548ad35-0d5f-11e6-9f44-9d0000bae4df]] */


  public static interface IStringLiteralFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("7be8d784-0d5f-11e6-9f44-9d0000bae4df")
    public java.lang.String convertToValidFileName();

    @IDynamicResourceExtension.MethodId("7380fb89-c0ac-11e7-a130-7198de5ddf3f")
    public java.lang.String convertDotToSlash();

    @IDynamicResourceExtension.MethodId("6d742e75-8648-11eb-9869-4317e18e6c88")
    public java.lang.String replaceDashToUnderscore();

    @IDynamicResourceExtension.MethodId("16eee400-4879-11ec-b3cc-9dd8204a254a")
    public java.lang.String replaceSlashToUnderscore();

    @IDynamicResourceExtension.MethodId("59ce2e08-4884-11ec-b3cc-9dd8204a254a")
    public java.lang.String replaceParenthesesToUnderscore();

    @IDynamicResourceExtension.MethodId("780f8f16-98fc-11ee-aa72-593773060f63")
    public java.lang.String whitespacesToDash();

  }
  
  public static interface IStringLiteralFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("7be8d784-0d5f-11e6-9f44-9d0000bae4df")
    public java.lang.String convertToValidFileName(final java.lang.String stringLiteral);

    @IDynamicResourceExtension.MethodId("7380fb89-c0ac-11e7-a130-7198de5ddf3f")
    public java.lang.String convertDotToSlash(final java.lang.String stringLiteral);

    @IDynamicResourceExtension.MethodId("6d742e75-8648-11eb-9869-4317e18e6c88")
    public java.lang.String replaceDashToUnderscore(final java.lang.String stringLiteral);

    @IDynamicResourceExtension.MethodId("16eee400-4879-11ec-b3cc-9dd8204a254a")
    public java.lang.String replaceSlashToUnderscore(final java.lang.String stringLiteral);

    @IDynamicResourceExtension.MethodId("59ce2e08-4884-11ec-b3cc-9dd8204a254a")
    public java.lang.String replaceParenthesesToUnderscore(final java.lang.String stringLiteral);

    @IDynamicResourceExtension.MethodId("780f8f16-98fc-11ee-aa72-593773060f63")
    public java.lang.String whitespacesToDash(final java.lang.String stringLiteral);

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

    @Override
    public java.lang.String convertDotToSlash(final java.lang.String stringLiteral) {
      /* Begin Protected Region [[7380fb89-c0ac-11e7-a130-7198de5ddf3f]] */
    	return stringLiteral.replace(".", "/");   
      /* End Protected Region   [[7380fb89-c0ac-11e7-a130-7198de5ddf3f]] */
    }

    @Override
    public java.lang.String replaceDashToUnderscore(final java.lang.String stringLiteral) {
      /* Begin Protected Region [[6d742e75-8648-11eb-9869-4317e18e6c88]] */
        return stringLiteral.replaceAll("-", "_");   
      /* End Protected Region   [[6d742e75-8648-11eb-9869-4317e18e6c88]] */
    }

    @Override
    public java.lang.String replaceSlashToUnderscore(final java.lang.String stringLiteral) {
      /* Begin Protected Region [[16eee400-4879-11ec-b3cc-9dd8204a254a]] */
    	return stringLiteral.replaceAll("/", "_");   
      /* End Protected Region   [[16eee400-4879-11ec-b3cc-9dd8204a254a]] */
    }

    @Override
    public java.lang.String replaceParenthesesToUnderscore(final java.lang.String stringLiteral) {
      /* Begin Protected Region [[59ce2e08-4884-11ec-b3cc-9dd8204a254a]] */
        return stringLiteral.replaceAll("(", "_").replaceAll(")", "_");
      /* End Protected Region   [[59ce2e08-4884-11ec-b3cc-9dd8204a254a]] */
    }

    @Override
    public java.lang.String whitespacesToDash(final java.lang.String stringLiteral) {
      /* Begin Protected Region [[780f8f16-98fc-11ee-aa72-593773060f63]] */
    	return StringUtil.whitespacesTo(stringLiteral, "-");   
      /* End Protected Region   [[780f8f16-98fc-11ee-aa72-593773060f63]] */
    }

  }
  
  public static class StringLiteralFunctions {

    private StringLiteralFunctions() {}

    public static java.lang.String convertToValidFileName(final java.lang.String stringLiteral) {
      return DynamicResourceUtil.invoke(IStringLiteralFunctionsImpl.class, StringLiteralFunctionsImpl.INSTANCE, stringLiteral).convertToValidFileName(stringLiteral);
    }

    public static java.lang.String convertDotToSlash(final java.lang.String stringLiteral) {
      return DynamicResourceUtil.invoke(IStringLiteralFunctionsImpl.class, StringLiteralFunctionsImpl.INSTANCE, stringLiteral).convertDotToSlash(stringLiteral);
    }

    public static java.lang.String replaceDashToUnderscore(final java.lang.String stringLiteral) {
      return DynamicResourceUtil.invoke(IStringLiteralFunctionsImpl.class, StringLiteralFunctionsImpl.INSTANCE, stringLiteral).replaceDashToUnderscore(stringLiteral);
    }

    public static java.lang.String replaceSlashToUnderscore(final java.lang.String stringLiteral) {
      return DynamicResourceUtil.invoke(IStringLiteralFunctionsImpl.class, StringLiteralFunctionsImpl.INSTANCE, stringLiteral).replaceSlashToUnderscore(stringLiteral);
    }

    public static java.lang.String replaceParenthesesToUnderscore(final java.lang.String stringLiteral) {
      return DynamicResourceUtil.invoke(IStringLiteralFunctionsImpl.class, StringLiteralFunctionsImpl.INSTANCE, stringLiteral).replaceParenthesesToUnderscore(stringLiteral);
    }

    public static java.lang.String whitespacesToDash(final java.lang.String stringLiteral) {
      return DynamicResourceUtil.invoke(IStringLiteralFunctionsImpl.class, StringLiteralFunctionsImpl.INSTANCE, stringLiteral).whitespacesToDash(stringLiteral);
    }

  }

  public static interface ITextLiteralFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("50997b52-0aa8-11e9-b5db-cdf0b8dad9e4")
    public List<java.lang.String> distinct();

    @IDynamicResourceExtension.MethodId("097160d4-d7bc-11ea-ae00-5518e944c256")
    public java.lang.String toString();

  }
  
  public static interface ITextLiteralFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("50997b52-0aa8-11e9-b5db-cdf0b8dad9e4")
    public List<java.lang.String> distinct(final List<java.lang.String> textLiteralList);

    @IDynamicResourceExtension.MethodId("097160d4-d7bc-11ea-ae00-5518e944c256")
    public java.lang.String toString(final java.lang.String textLiteral);

  }
  
  public static class TextLiteralFunctionsImpl implements ITextLiteralFunctionsImpl {

    public static final ITextLiteralFunctionsImpl INSTANCE = new TextLiteralFunctionsImpl();

    private TextLiteralFunctionsImpl() {}

    @Override
    public List<java.lang.String> distinct(final List<java.lang.String> textLiteralList) {
      return textLiteralList.stream().distinct().collect(java.util.stream.Collectors.toList());
    }

    @Override
    public java.lang.String toString(final java.lang.String textLiteral) {
      return textLiteral;
    }

  }
  
  public static class TextLiteralFunctions {

    private TextLiteralFunctions() {}

    public static List<java.lang.String> distinct(final List<java.lang.String> textLiteralList) {
      return DynamicResourceUtil.invoke(ITextLiteralFunctionsImpl.class, TextLiteralFunctionsImpl.INSTANCE, textLiteralList).distinct(textLiteralList);
    }

    public static java.lang.String toString(final java.lang.String textLiteral) {
      return DynamicResourceUtil.invoke(ITextLiteralFunctionsImpl.class, TextLiteralFunctionsImpl.INSTANCE, textLiteral).toString(textLiteral);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,7548ad35-0d5f-11e6-9f44-9d0000bae4df,LDl43lHvyo0Nx4bB20Wr8Booy28=] */
