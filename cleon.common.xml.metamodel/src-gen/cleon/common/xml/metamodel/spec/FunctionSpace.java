package cleon.common.xml.metamodel.spec;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[37550eeb-f2bd-11e5-8010-7b34e2b59618,imports]] */
import ch.actifsource.util.character.StringUtil;
import java.util.stream.Collectors;

/* End Protected Region   [[37550eeb-f2bd-11e5-8010-7b34e2b59618,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[37550eeb-f2bd-11e5-8010-7b34e2b59618]] */

  /* End Protected Region   [[37550eeb-f2bd-11e5-8010-7b34e2b59618]] */


  public static interface ITextLiteralFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("891e4724-3767-11e5-95d9-2b04d7ab02d9")
    public java.lang.String escapeXml();

    @IDynamicResourceExtension.MethodId("272cfa17-a066-11ec-b8bd-93035f893c15")
    public java.lang.String removeDuplicates();

    @IDynamicResourceExtension.MethodId("add08ac5-a5e2-11ec-9968-b970a72504b8")
    public java.lang.Boolean isNullOrEmpty();

  }
  
  public static interface ITextLiteralFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("891e4724-3767-11e5-95d9-2b04d7ab02d9")
    public java.lang.String escapeXml(final java.lang.String textLiteral);

    @IDynamicResourceExtension.MethodId("272cfa17-a066-11ec-b8bd-93035f893c15")
    public java.lang.String removeDuplicates(final java.lang.String textLiteral);

    @IDynamicResourceExtension.MethodId("add08ac5-a5e2-11ec-9968-b970a72504b8")
    public java.lang.Boolean isNullOrEmpty(final java.lang.String textLiteral);

  }
  
  public static class TextLiteralFunctionsImpl implements ITextLiteralFunctionsImpl {

    public static final ITextLiteralFunctionsImpl INSTANCE = new TextLiteralFunctionsImpl();

    private TextLiteralFunctionsImpl() {}

    @Override
    public java.lang.String escapeXml(final java.lang.String textLiteral) {
      /* Begin Protected Region [[891e4724-3767-11e5-95d9-2b04d7ab02d9]] */
      if (textLiteral == null) {
      	return null;
      }
      final var sb = new StringBuilder();
      for (var i = 0; i < textLiteral.length(); i++) {
      	final var c = textLiteral.charAt(i);
      	switch (c) {
      	case '<':
      		sb.append("&lt;");
      		break;
      	case '>':
      		sb.append("&gt;");
      		break;
      	case '\"':
      		sb.append("&quot;");
      		break;
      	case '&':
      		sb.append("&amp;");
      		break;
      	case '\'':
      		sb.append("&apos;");
      		break;
      	default:
      		if (c > 0x7e) {
      			sb.append("&#" + (int) c + ";");
      		} else {
      			sb.append(c);
      		}
      	}
      }
      return sb.toString();
      /* End Protected Region   [[891e4724-3767-11e5-95d9-2b04d7ab02d9]] */
    }

    @Override
    public java.lang.String removeDuplicates(final java.lang.String textLiteral) {
      /* Begin Protected Region [[272cfa17-a066-11ec-b8bd-93035f893c15]] */
      var lines = ch.actifsource.template.BuiltIn.TextLiteralFunctionsImpl.INSTANCE.splitLines(textLiteral);
      lines = lines.stream().distinct().collect(Collectors.toList());
      return StringUtil.join(lines, "\n");    	
      /* End Protected Region   [[272cfa17-a066-11ec-b8bd-93035f893c15]] */
    }

    @Override
    public java.lang.Boolean isNullOrEmpty(final java.lang.String textLiteral) {
      /* Begin Protected Region [[add08ac5-a5e2-11ec-9968-b970a72504b8]] */
      if( textLiteral == null ) {
      	return true;
      }
      return textLiteral.isEmpty();
      /* End Protected Region   [[add08ac5-a5e2-11ec-9968-b970a72504b8]] */
    }

  }
  
  public static class TextLiteralFunctions {

    private TextLiteralFunctions() {}

    public static java.lang.String escapeXml(final java.lang.String textLiteral) {
      return DynamicResourceUtil.invoke(ITextLiteralFunctionsImpl.class, TextLiteralFunctionsImpl.INSTANCE, textLiteral).escapeXml(textLiteral);
    }

    public static java.lang.String removeDuplicates(final java.lang.String textLiteral) {
      return DynamicResourceUtil.invoke(ITextLiteralFunctionsImpl.class, TextLiteralFunctionsImpl.INSTANCE, textLiteral).removeDuplicates(textLiteral);
    }

    public static java.lang.Boolean isNullOrEmpty(final java.lang.String textLiteral) {
      return DynamicResourceUtil.invoke(ITextLiteralFunctionsImpl.class, TextLiteralFunctionsImpl.INSTANCE, textLiteral).isNullOrEmpty(textLiteral);
    }

  }

  public static interface IStringLiteralFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("cfe377c2-39ab-11e5-ae84-4f300f079f41")
    public java.lang.String sanitizeFileName();

    @IDynamicResourceExtension.MethodId("28b063d0-2c90-11e6-8dd6-23b9a87b3ebd")
    public java.lang.String escapeXml();

  }
  
  public static interface IStringLiteralFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("cfe377c2-39ab-11e5-ae84-4f300f079f41")
    public java.lang.String sanitizeFileName(final java.lang.String stringLiteral);

    @IDynamicResourceExtension.MethodId("28b063d0-2c90-11e6-8dd6-23b9a87b3ebd")
    public java.lang.String escapeXml(final java.lang.String stringLiteral);

  }
  
  public static class StringLiteralFunctionsImpl implements IStringLiteralFunctionsImpl {

    public static final IStringLiteralFunctionsImpl INSTANCE = new StringLiteralFunctionsImpl();

    private StringLiteralFunctionsImpl() {}

    @Override
    public java.lang.String sanitizeFileName(final java.lang.String stringLiteral) {
      /* Begin Protected Region [[cfe377c2-39ab-11e5-ae84-4f300f079f41]] */
      return stringLiteral.chars().mapToObj(i -> (char) i).map(c -> Character.isWhitespace(c) ? '_' : c)
      		.filter(c -> Character.isLetterOrDigit(c) || c == '-' || c == '_').map(String::valueOf)
      		.collect(java.util.stream.Collectors.joining());
      /* End Protected Region   [[cfe377c2-39ab-11e5-ae84-4f300f079f41]] */
    }

    @Override
    public java.lang.String escapeXml(final java.lang.String stringLiteral) {
      /* Begin Protected Region [[28b063d0-2c90-11e6-8dd6-23b9a87b3ebd]] */
      if( stringLiteral == null) {
      	return null;
      }
      return TextLiteralFunctionsImpl.INSTANCE.escapeXml(stringLiteral);
      /* End Protected Region   [[28b063d0-2c90-11e6-8dd6-23b9a87b3ebd]] */
    }

  }
  
  public static class StringLiteralFunctions {

    private StringLiteralFunctions() {}

    public static java.lang.String sanitizeFileName(final java.lang.String stringLiteral) {
      return DynamicResourceUtil.invoke(IStringLiteralFunctionsImpl.class, StringLiteralFunctionsImpl.INSTANCE, stringLiteral).sanitizeFileName(stringLiteral);
    }

    public static java.lang.String escapeXml(final java.lang.String stringLiteral) {
      return DynamicResourceUtil.invoke(IStringLiteralFunctionsImpl.class, StringLiteralFunctionsImpl.INSTANCE, stringLiteral).escapeXml(stringLiteral);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,37550eeb-f2bd-11e5-8010-7b34e2b59618,4W9uuQoq6ngTB1lYJIWR+4v9ZQI=] */
