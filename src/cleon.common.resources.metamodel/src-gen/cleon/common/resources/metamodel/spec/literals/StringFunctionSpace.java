package cleon.common.resources.metamodel.spec.literals;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[7548ad35-0d5f-11e6-9f44-9d0000bae4df,imports]] */
import ch.actifsource.util.character.StringUtil;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.stream.Collectors;
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
    public java.lang.String dashToUnderscore();

    @IDynamicResourceExtension.MethodId("16eee400-4879-11ec-b3cc-9dd8204a254a")
    public java.lang.String slashToUnderscore();

    @IDynamicResourceExtension.MethodId("59ce2e08-4884-11ec-b3cc-9dd8204a254a")
    public java.lang.String parenthesesToUnderscore();

    @IDynamicResourceExtension.MethodId("780f8f16-98fc-11ee-aa72-593773060f63")
    public java.lang.String whitespacesToDash();

    @IDynamicResourceExtension.MethodId("2a39baae-8afd-11ef-8165-6df4058a24dd")
    public java.lang.String pascalCaseToWhitespace();

    @IDynamicResourceExtension.MethodId("577d77d2-ac0c-11ef-afba-fb66280e2230")
    public java.lang.String pascalCaseToUnderscore();

    @IDynamicResourceExtension.MethodId("24f281dc-986b-11ef-9d7c-b5806d5ad1be")
    public java.lang.String md5();

    @IDynamicResourceExtension.MethodId("f4506904-9b89-11ef-bb4f-3decea302a61")
    public java.lang.String combine();

    @IDynamicResourceExtension.MethodId("28b111dd-ac0d-11ef-afba-fb66280e2230")
    public java.lang.String removeWhiteSpaces();

  }
  
  public static interface IStringLiteralFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("7be8d784-0d5f-11e6-9f44-9d0000bae4df")
    public java.lang.String convertToValidFileName(final java.lang.String stringLiteral);

    @IDynamicResourceExtension.MethodId("7380fb89-c0ac-11e7-a130-7198de5ddf3f")
    public java.lang.String convertDotToSlash(final java.lang.String stringLiteral);

    @IDynamicResourceExtension.MethodId("6d742e75-8648-11eb-9869-4317e18e6c88")
    public java.lang.String dashToUnderscore(final java.lang.String stringLiteral);

    @IDynamicResourceExtension.MethodId("16eee400-4879-11ec-b3cc-9dd8204a254a")
    public java.lang.String slashToUnderscore(final java.lang.String stringLiteral);

    @IDynamicResourceExtension.MethodId("59ce2e08-4884-11ec-b3cc-9dd8204a254a")
    public java.lang.String parenthesesToUnderscore(final java.lang.String stringLiteral);

    @IDynamicResourceExtension.MethodId("780f8f16-98fc-11ee-aa72-593773060f63")
    public java.lang.String whitespacesToDash(final java.lang.String stringLiteral);

    @IDynamicResourceExtension.MethodId("2a39baae-8afd-11ef-8165-6df4058a24dd")
    public java.lang.String pascalCaseToWhitespace(final java.lang.String stringLiteral);

    @IDynamicResourceExtension.MethodId("577d77d2-ac0c-11ef-afba-fb66280e2230")
    public java.lang.String pascalCaseToUnderscore(final java.lang.String stringLiteral);

    @IDynamicResourceExtension.MethodId("24f281dc-986b-11ef-9d7c-b5806d5ad1be")
    public java.lang.String md5(final java.lang.String stringLiteral);

    @IDynamicResourceExtension.MethodId("f4506904-9b89-11ef-bb4f-3decea302a61")
    public java.lang.String combine(final List<java.lang.String> stringLiteralList);

    @IDynamicResourceExtension.MethodId("28b111dd-ac0d-11ef-afba-fb66280e2230")
    public java.lang.String removeWhiteSpaces(final java.lang.String stringLiteral);

  }
  
  public static class StringLiteralFunctionsImpl implements IStringLiteralFunctionsImpl {

    public static final IStringLiteralFunctionsImpl INSTANCE = new StringLiteralFunctionsImpl();

    private StringLiteralFunctionsImpl() {}

    @Override
    public java.lang.String convertToValidFileName(final java.lang.String stringLiteral) {
      /* Begin Protected Region [[7be8d784-0d5f-11e6-9f44-9d0000bae4df]] */
      return stringLiteral.replaceAll("[^a-zA-Z0-9_\\\\/\\-]", "_");
      /* End Protected Region   [[7be8d784-0d5f-11e6-9f44-9d0000bae4df]] */
    }

    @Override
    public java.lang.String convertDotToSlash(final java.lang.String stringLiteral) {
      /* Begin Protected Region [[7380fb89-c0ac-11e7-a130-7198de5ddf3f]] */
      return stringLiteral.replace(".", "/");
      /* End Protected Region   [[7380fb89-c0ac-11e7-a130-7198de5ddf3f]] */
    }

    @Override
    public java.lang.String dashToUnderscore(final java.lang.String stringLiteral) {
      /* Begin Protected Region [[6d742e75-8648-11eb-9869-4317e18e6c88]] */
      return stringLiteral.replace('-', '_');
      /* End Protected Region   [[6d742e75-8648-11eb-9869-4317e18e6c88]] */
    }

    @Override
    public java.lang.String slashToUnderscore(final java.lang.String stringLiteral) {
      /* Begin Protected Region [[16eee400-4879-11ec-b3cc-9dd8204a254a]] */
      return stringLiteral.replace('/', '_');
      /* End Protected Region   [[16eee400-4879-11ec-b3cc-9dd8204a254a]] */
    }

    @Override
    public java.lang.String parenthesesToUnderscore(final java.lang.String stringLiteral) {
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

    @Override
    public java.lang.String pascalCaseToWhitespace(final java.lang.String stringLiteral) {
      /* Begin Protected Region [[2a39baae-8afd-11ef-8165-6df4058a24dd]] */
      if (stringLiteral == null || stringLiteral.isEmpty()) {
      	return stringLiteral;
      }

      final var result = new StringBuilder();
      result.append(stringLiteral.charAt(0)); // start with the first character

      for (var i = 1; i < stringLiteral.length(); i++) {
      	final var currentChar = stringLiteral.charAt(i);
      	if (Character.isUpperCase(currentChar)) {
      		result.append(" "); // add space before the uppercase letter
      	}
      	result.append(currentChar);
      }

      return result.toString();
      /* End Protected Region   [[2a39baae-8afd-11ef-8165-6df4058a24dd]] */
    }

    @Override
    public java.lang.String pascalCaseToUnderscore(final java.lang.String stringLiteral) {
      /* Begin Protected Region [[577d77d2-ac0c-11ef-afba-fb66280e2230]] */
        if (stringLiteral == null || stringLiteral.isEmpty()) {
          	return stringLiteral;
          }

          final var result = new StringBuilder();
          result.append(stringLiteral.charAt(0)); // start with the first character

          for (var i = 1; i < stringLiteral.length(); i++) {
          	final var currentChar = stringLiteral.charAt(i);
          	if (Character.isUpperCase(currentChar)) {
          		result.append("_"); // add underscore before the uppercase letter
          	}
          	result.append(currentChar);
          }

          return result.toString();
      /* End Protected Region   [[577d77d2-ac0c-11ef-afba-fb66280e2230]] */
    }

    @Override
    public java.lang.String md5(final java.lang.String stringLiteral) {
      /* Begin Protected Region [[24f281dc-986b-11ef-9d7c-b5806d5ad1be]] */
      try {
      	// Create an MD5 MessageDigest instance
      	final var md = MessageDigest.getInstance("MD5");

      	// Calculate the MD5 digest for the input string
      	final var hashInBytes = md.digest(stringLiteral.getBytes());

      	// Convert the byte array into a hex string
      	final var sb = new StringBuilder();
      	for (final byte b : hashInBytes) {
      		sb.append(String.format("%02x", b));
      	}

      	return sb.toString();
      } catch (final NoSuchAlgorithmException e) {
      	throw new RuntimeException("MD5 algorithm not available", e);
      }
      /* End Protected Region   [[24f281dc-986b-11ef-9d7c-b5806d5ad1be]] */
    }

    @Override
    public java.lang.String combine(final List<java.lang.String> stringLiteralList) {
      /* Begin Protected Region [[f4506904-9b89-11ef-bb4f-3decea302a61]] */
    	return stringLiteralList.stream().collect(Collectors.joining());
      /* End Protected Region   [[f4506904-9b89-11ef-bb4f-3decea302a61]] */
    }

    @Override
    public java.lang.String removeWhiteSpaces(final java.lang.String stringLiteral) {
      /* Begin Protected Region [[28b111dd-ac0d-11ef-afba-fb66280e2230]] */
        if (stringLiteral == null || stringLiteral.isEmpty()) {
          	return stringLiteral;
          }

          final var result = new StringBuilder();
          result.append(stringLiteral.charAt(0)); // start with the first character

          for (var i = 1; i < stringLiteral.length(); ++i) {
          	final var currentChar = stringLiteral.charAt(i);
          	if (Character.isWhitespace(currentChar)) {
          		continue;
          	}
          	result.append(currentChar);
          }

          return result.toString();
      /* End Protected Region   [[28b111dd-ac0d-11ef-afba-fb66280e2230]] */
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

    public static java.lang.String dashToUnderscore(final java.lang.String stringLiteral) {
      return DynamicResourceUtil.invoke(IStringLiteralFunctionsImpl.class, StringLiteralFunctionsImpl.INSTANCE, stringLiteral).dashToUnderscore(stringLiteral);
    }

    public static java.lang.String slashToUnderscore(final java.lang.String stringLiteral) {
      return DynamicResourceUtil.invoke(IStringLiteralFunctionsImpl.class, StringLiteralFunctionsImpl.INSTANCE, stringLiteral).slashToUnderscore(stringLiteral);
    }

    public static java.lang.String parenthesesToUnderscore(final java.lang.String stringLiteral) {
      return DynamicResourceUtil.invoke(IStringLiteralFunctionsImpl.class, StringLiteralFunctionsImpl.INSTANCE, stringLiteral).parenthesesToUnderscore(stringLiteral);
    }

    public static java.lang.String whitespacesToDash(final java.lang.String stringLiteral) {
      return DynamicResourceUtil.invoke(IStringLiteralFunctionsImpl.class, StringLiteralFunctionsImpl.INSTANCE, stringLiteral).whitespacesToDash(stringLiteral);
    }

    public static java.lang.String pascalCaseToWhitespace(final java.lang.String stringLiteral) {
      return DynamicResourceUtil.invoke(IStringLiteralFunctionsImpl.class, StringLiteralFunctionsImpl.INSTANCE, stringLiteral).pascalCaseToWhitespace(stringLiteral);
    }

    public static java.lang.String pascalCaseToUnderscore(final java.lang.String stringLiteral) {
      return DynamicResourceUtil.invoke(IStringLiteralFunctionsImpl.class, StringLiteralFunctionsImpl.INSTANCE, stringLiteral).pascalCaseToUnderscore(stringLiteral);
    }

    public static java.lang.String md5(final java.lang.String stringLiteral) {
      return DynamicResourceUtil.invoke(IStringLiteralFunctionsImpl.class, StringLiteralFunctionsImpl.INSTANCE, stringLiteral).md5(stringLiteral);
    }

    public static java.lang.String combine(final List<java.lang.String> stringLiteralList) {
      return DynamicResourceUtil.invoke(IStringLiteralFunctionsImpl.class, StringLiteralFunctionsImpl.INSTANCE, stringLiteralList).combine(stringLiteralList);
    }

    public static java.lang.String removeWhiteSpaces(final java.lang.String stringLiteral) {
      return DynamicResourceUtil.invoke(IStringLiteralFunctionsImpl.class, StringLiteralFunctionsImpl.INSTANCE, stringLiteral).removeWhiteSpaces(stringLiteral);
    }

  }

  public static interface ITextLiteralFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("50997b52-0aa8-11e9-b5db-cdf0b8dad9e4")
    public List<java.lang.String> distinct();

    @IDynamicResourceExtension.MethodId("097160d4-d7bc-11ea-ae00-5518e944c256")
    public java.lang.String toString();

    @IDynamicResourceExtension.MethodId("de4fe8e9-9b81-11ef-bb4f-3decea302a61")
    public java.lang.String md5();

    @IDynamicResourceExtension.MethodId("1f8226fb-9b8a-11ef-bb4f-3decea302a61")
    public java.lang.String combine();

    @IDynamicResourceExtension.MethodId("a138d035-a354-11ef-9e2b-07f537981179")
    public java.lang.String convertToValidFileName();

  }
  
  public static interface ITextLiteralFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("50997b52-0aa8-11e9-b5db-cdf0b8dad9e4")
    public List<java.lang.String> distinct(final List<java.lang.String> textLiteralList);

    @IDynamicResourceExtension.MethodId("097160d4-d7bc-11ea-ae00-5518e944c256")
    public java.lang.String toString(final java.lang.String textLiteral);

    @IDynamicResourceExtension.MethodId("1f8226fb-9b8a-11ef-bb4f-3decea302a61")
    public java.lang.String combine(final List<java.lang.String> textLiteralList);

    @IDynamicResourceExtension.MethodId("a138d035-a354-11ef-9e2b-07f537981179")
    public java.lang.String convertToValidFileName(final java.lang.String textLiteral);

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

    @Override
    public java.lang.String combine(final List<java.lang.String> textLiteralList) {
      /* Begin Protected Region [[1f8226fb-9b8a-11ef-bb4f-3decea302a61]] */
    	return textLiteralList.stream().collect(Collectors.joining());   
      /* End Protected Region   [[1f8226fb-9b8a-11ef-bb4f-3decea302a61]] */
    }

    @Override
    public java.lang.String convertToValidFileName(final java.lang.String textLiteral) {
      /* Begin Protected Region [[a138d035-a354-11ef-9e2b-07f537981179]] */
    	return StringFunctionSpace.StringLiteralFunctionsImpl.INSTANCE.convertToValidFileName(textLiteral);   
      /* End Protected Region   [[a138d035-a354-11ef-9e2b-07f537981179]] */
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

    public static java.lang.String combine(final List<java.lang.String> textLiteralList) {
      return DynamicResourceUtil.invoke(ITextLiteralFunctionsImpl.class, TextLiteralFunctionsImpl.INSTANCE, textLiteralList).combine(textLiteralList);
    }

    public static java.lang.String convertToValidFileName(final java.lang.String textLiteral) {
      return DynamicResourceUtil.invoke(ITextLiteralFunctionsImpl.class, TextLiteralFunctionsImpl.INSTANCE, textLiteral).convertToValidFileName(textLiteral);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,7548ad35-0d5f-11e6-9f44-9d0000bae4df,xckjUuL5Qi0zRr1YCs5XOQCd2gA=] */
