package cleon.modelinglanguages.uml.template.plantuml.structural.components;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[a71fceea-3f72-11e6-a833-6352f3897082,imports]] */

/* End Protected Region   [[a71fceea-3f72-11e6-a833-6352f3897082,imports]] */

public class FunctionSpace_PlantUml {

  /* Begin Protected Region [[a71fceea-3f72-11e6-a833-6352f3897082]] */
  
  /* End Protected Region   [[a71fceea-3f72-11e6-a833-6352f3897082]] */


  public static interface IAbstractComponentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("329bfba8-47fd-11e6-b388-8539f6ff7310")
    public java.lang.String RenderUml();

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

  public static interface ITextLiteralFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("44b42008-4d01-11e6-b371-a567a75dac1c")
    public java.lang.String convertToValidCmpName();

  }
  
  public static interface ITextLiteralFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("44b42008-4d01-11e6-b371-a567a75dac1c")
    public java.lang.String convertToValidCmpName(final java.lang.String textLiteral);

  }
  
  public static class TextLiteralFunctionsImpl implements ITextLiteralFunctionsImpl {

    public static final ITextLiteralFunctionsImpl INSTANCE = new TextLiteralFunctionsImpl();

    private TextLiteralFunctionsImpl() {}

    @Override
    public java.lang.String convertToValidCmpName(final java.lang.String textLiteral) {
      /* Begin Protected Region [[44b42008-4d01-11e6-b371-a567a75dac1c]] */
      return textLiteral.replaceAll("[^ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¤ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¼ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Å¡Ãƒâ€šÃ‚Â¶ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬Ãƒâ€¦Ã‚Â¾ÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã¢â‚¬Â¦ÃƒÂ¢Ã¢â€šÂ¬Ã…â€œÃƒÆ’Ã†â€™Ãƒâ€ Ã¢â‚¬â„¢ÃƒÆ’Ã‚Â¢ÃƒÂ¢Ã¢â‚¬Å¡Ã‚Â¬ÃƒÂ¢Ã¢â€šÂ¬Ã…â€œa-zA-Z0-9_]", "_");
      /* End Protected Region   [[44b42008-4d01-11e6-b371-a567a75dac1c]] */
    }

  }
  
  public static class TextLiteralFunctions {

    private TextLiteralFunctions() {}

    public static java.lang.String convertToValidCmpName(final java.lang.String textLiteral) {
      return DynamicResourceUtil.invoke(ITextLiteralFunctionsImpl.class, TextLiteralFunctionsImpl.INSTANCE, textLiteral).convertToValidCmpName(textLiteral);
    }

  }

  public static interface IUmlDiagramFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fcfaf5ee-eaac-11e8-88d3-bfc6b992bdec")
    public java.lang.String RenderUmlElement();

    @IDynamicResourceExtension.MethodId("0d089c4a-eaad-11e8-88d3-bfc6b992bdec")
    public java.lang.String RenderUmlDiagram();

    @IDynamicResourceExtension.MethodId("d2dedc91-eaae-11e8-88d3-bfc6b992bdec")
    public java.lang.String RenderUml();

  }
  
  public static interface IUmlDiagramFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class UmlDiagramFunctionsImpl implements IUmlDiagramFunctionsImpl {

    public static final IUmlDiagramFunctionsImpl INSTANCE = new UmlDiagramFunctionsImpl();

    private UmlDiagramFunctionsImpl() {}

  }
  
  public static class UmlDiagramFunctions {

    private UmlDiagramFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,a71fceea-3f72-11e6-a833-6352f3897082,dviDCoTg352c0hg4aV3/Gg1OdsM=] */
