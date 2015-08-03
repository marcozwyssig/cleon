package cleon.sdp.template.xml;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[d17ca089-375d-11e5-95d9-2b04d7ab02d9,imports]] */

/* End Protected Region   [[d17ca089-375d-11e5-95d9-2b04d7ab02d9,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[d17ca089-375d-11e5-95d9-2b04d7ab02d9]] */
  
  /* End Protected Region   [[d17ca089-375d-11e5-95d9-2b04d7ab02d9]] */


  public static interface ITextFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d9dd677f-375d-11e5-95d9-2b04d7ab02d9")
    public java.lang.String RenderContent();

  }
  
  public static interface ITextFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TextFunctionsImpl implements ITextFunctionsImpl {

    public static final ITextFunctionsImpl INSTANCE = new TextFunctionsImpl();

    private TextFunctionsImpl() {}

  }
  
  public static class TextFunctions {

    private TextFunctions() {}

  }

  public static interface ITextLiteralFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("891e4724-3767-11e5-95d9-2b04d7ab02d9")
    public java.lang.String escapeXml();

  }
  
  public static interface ITextLiteralFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("891e4724-3767-11e5-95d9-2b04d7ab02d9")
    public java.lang.String escapeXml(final java.lang.String textLiteral);

  }
  
  public static class TextLiteralFunctionsImpl implements ITextLiteralFunctionsImpl {

    public static final ITextLiteralFunctionsImpl INSTANCE = new TextLiteralFunctionsImpl();

    private TextLiteralFunctionsImpl() {}

    @Override
    public java.lang.String escapeXml(final java.lang.String textLiteral) {
      /* Begin Protected Region [[891e4724-3767-11e5-95d9-2b04d7ab02d9]] */
	   StringBuilder sb = new StringBuilder();
	   for(int i = 0; i < textLiteral.length(); i++){
	      char c = textLiteral.charAt(i);
	      switch(c){
	      case '<': sb.append("&lt;"); break;
	      case '>': sb.append("&gt;"); break;
	      case '\"': sb.append("&quot;"); break;
	      case '&': sb.append("&amp;"); break;
	      case '\'': sb.append("&apos;"); break;
	      default:
	         if(c>0x7e) {
	            sb.append("&#"+((int)c)+";");
	         }else
	            sb.append(c);
	      }
	   }
	   return sb.toString();   
      /* End Protected Region   [[891e4724-3767-11e5-95d9-2b04d7ab02d9]] */
    }

  }
  
  public static class TextLiteralFunctions {

    private TextLiteralFunctions() {}

    public static java.lang.String escapeXml(final java.lang.String textLiteral) {
      return DynamicResourceUtil.invoke(ITextLiteralFunctionsImpl.class, TextLiteralFunctionsImpl.INSTANCE, textLiteral).escapeXml(textLiteral);
    }

  }

  public static interface IReproducibilityFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2077d5cf-376f-11e5-95d9-2b04d7ab02d9")
    public List<java.lang.String> RenderContent();

  }
  
  public static interface IReproducibilityFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("2077d5cf-376f-11e5-95d9-2b04d7ab02d9")
    public List<java.lang.String> RenderContent(final cleon.sdp.spec.project.backlog.defect.javamodel.IReproducibility reproducibility);

  }
  
  public static class ReproducibilityFunctionsImpl implements IReproducibilityFunctionsImpl {

    public static final IReproducibilityFunctionsImpl INSTANCE = new ReproducibilityFunctionsImpl();

    private ReproducibilityFunctionsImpl() {}

    @Override
    public List<java.lang.String> RenderContent(final cleon.sdp.spec.project.backlog.defect.javamodel.IReproducibility reproducibility) {
      /* Begin Protected Region [[2077d5cf-376f-11e5-95d9-2b04d7ab02d9]] */
      List<java.lang.String> result = new java.util.ArrayList<String>();
      List<java.lang.String> input = reproducibility.selectReproduce();
      for(int i=0; i <input.size(); ++i)
      {
    	  result.add(i + 1 + ". " + input.get(i));
      }
      return result;
      /* End Protected Region   [[2077d5cf-376f-11e5-95d9-2b04d7ab02d9]] */
    }

  }
  
  public static class ReproducibilityFunctions {

    private ReproducibilityFunctions() {}

    public static List<java.lang.String> RenderContent(final cleon.sdp.spec.project.backlog.defect.javamodel.IReproducibility reproducibility) {
      return DynamicResourceUtil.invoke(IReproducibilityFunctionsImpl.class, ReproducibilityFunctionsImpl.INSTANCE, reproducibility).RenderContent(reproducibility);
    }

  }

  public static interface IStringLiteralFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("cfe377c2-39ab-11e5-ae84-4f300f079f41")
    public java.lang.String sanitizeFileName();

  }
  
  public static interface IStringLiteralFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("cfe377c2-39ab-11e5-ae84-4f300f079f41")
    public java.lang.String sanitizeFileName(final java.lang.String stringLiteral);

  }
  
  public static class StringLiteralFunctionsImpl implements IStringLiteralFunctionsImpl {

    public static final IStringLiteralFunctionsImpl INSTANCE = new StringLiteralFunctionsImpl();

    private StringLiteralFunctionsImpl() {}

    @Override
    public java.lang.String sanitizeFileName(final java.lang.String stringLiteral) {
      /* Begin Protected Region [[cfe377c2-39ab-11e5-ae84-4f300f079f41]] */
    	return stringLiteral
    			.chars()
    			.mapToObj(i -> (char) i)
    			.map(c -> Character.isWhitespace(c) ? '_' : c)
    			.filter(c -> Character.isLetterOrDigit(c) || c == '-' || c == '_')
    			.map(String::valueOf)
    			.collect(java.util.stream.Collectors.joining());
      /* End Protected Region   [[cfe377c2-39ab-11e5-ae84-4f300f079f41]] */
    }

  }
  
  public static class StringLiteralFunctions {

    private StringLiteralFunctions() {}

    public static java.lang.String sanitizeFileName(final java.lang.String stringLiteral) {
      return DynamicResourceUtil.invoke(IStringLiteralFunctionsImpl.class, StringLiteralFunctionsImpl.INSTANCE, stringLiteral).sanitizeFileName(stringLiteral);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,d17ca089-375d-11e5-95d9-2b04d7ab02d9,TqjILQcKVeuV7nlDuop96h15xkQ=] */
