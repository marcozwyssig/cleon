package cleon.common.doc.metamodel.spec.paragraph;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[2fcc117b-ed42-11ec-97a2-3feebb03f72b,imports]] */

/* End Protected Region   [[2fcc117b-ed42-11ec-97a2-3feebb03f72b,imports]] */

public class FunctionSpace_Paragraph {

  /* Begin Protected Region [[2fcc117b-ed42-11ec-97a2-3feebb03f72b]] */
  
  /* End Protected Region   [[2fcc117b-ed42-11ec-97a2-3feebb03f72b]] */


  public static interface IListItemFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("54f9b83f-24ef-11ef-83a6-fdf80672957b")
    public java.lang.String AllItemsPlain();

  }
  
  public static interface IListItemFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ListItemFunctionsImpl implements IListItemFunctionsImpl {

    public static final IListItemFunctionsImpl INSTANCE = new ListItemFunctionsImpl();

    private ListItemFunctionsImpl() {}

  }
  
  public static class ListItemFunctions {

    private ListItemFunctions() {}

  }

  public static interface ILanguageTextTranslationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("1a72e07e-9df1-11ef-970e-cda72e282c65")
    public java.lang.String OriginText();

    @IDynamicResourceExtension.MethodId("1a72e089-9df1-11ef-970e-cda72e282c65")
    public cleon.common.language.metamodel.spec.languages.javamodel.ILanguage SourceLanguage();

  }
  
  public static interface ILanguageTextTranslationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class LanguageTextTranslationFunctionsImpl implements ILanguageTextTranslationFunctionsImpl {

    public static final ILanguageTextTranslationFunctionsImpl INSTANCE = new LanguageTextTranslationFunctionsImpl();

    private LanguageTextTranslationFunctionsImpl() {}

  }
  
  public static class LanguageTextTranslationFunctions {

    private LanguageTextTranslationFunctions() {}

  }

  public static interface ITextAwareFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("75aed152-a5a6-11ef-97d6-5b0fa6c90c00")
    public java.lang.String translateText();

  }
  
  public static interface ITextAwareFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("75aed152-a5a6-11ef-97d6-5b0fa6c90c00")
    public java.lang.String translateText(final cleon.common.doc.metamodel.spec.paragraph.javamodel.ITextAware textAware);

  }
  
  public static class TextAwareFunctionsImpl implements ITextAwareFunctionsImpl {

    public static final ITextAwareFunctionsImpl INSTANCE = new TextAwareFunctionsImpl();

    private TextAwareFunctionsImpl() {}

    @Override
    public java.lang.String translateText(final cleon.common.doc.metamodel.spec.paragraph.javamodel.ITextAware textAware) {
      /* Begin Protected Region [[75aed152-a5a6-11ef-97d6-5b0fa6c90c00]] */
        if( textAware.selectTextTranslation().containsKey(textAware.getResource())) {
          	final var name = textAware.selectTextTranslation().get(textAware.getResource());
          	return name.selectText();
          }
        return textAware.selectText(); 
      /* End Protected Region   [[75aed152-a5a6-11ef-97d6-5b0fa6c90c00]] */
    }

  }
  
  public static class TextAwareFunctions {

    private TextAwareFunctions() {}

    public static java.lang.String translateText(final cleon.common.doc.metamodel.spec.paragraph.javamodel.ITextAware textAware) {
      return DynamicResourceUtil.invoke(ITextAwareFunctionsImpl.class, TextAwareFunctionsImpl.INSTANCE, textAware).translateText(textAware);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,2fcc117b-ed42-11ec-97a2-3feebb03f72b,VWlDjbbRbRDVxLfTCTc9aa7iepc=] */
