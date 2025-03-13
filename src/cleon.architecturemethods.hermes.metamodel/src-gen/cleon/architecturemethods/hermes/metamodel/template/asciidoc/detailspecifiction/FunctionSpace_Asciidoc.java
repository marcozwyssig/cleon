package cleon.architecturemethods.hermes.metamodel.template.asciidoc.detailspecifiction;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[6e104406-e64d-11e8-9ed8-5f22de89d1df,imports]] */

/* End Protected Region   [[6e104406-e64d-11e8-9ed8-5f22de89d1df,imports]] */

public class FunctionSpace_Asciidoc {

  /* Begin Protected Region [[6e104406-e64d-11e8-9ed8-5f22de89d1df]] */
  
  /* End Protected Region   [[6e104406-e64d-11e8-9ed8-5f22de89d1df]] */


  public static interface IDetailSpecificationDocumentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e262d479-2813-11ec-988b-e1826086c18c")
    public List<cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> ChapterOrder();

    @IDynamicResourceExtension.MethodId("e33a7145-282d-11ec-a022-ebea6bd1100d")
    public java.lang.String GetDocumentPath();

    @IDynamicResourceExtension.MethodId("e653876c-c9ed-11ee-953e-1bc687172a5b")
    public java.lang.String GetTitleName();

    @IDynamicResourceExtension.MethodId("7a795212-d24d-11ee-b255-49ab47716ebd")
    public java.lang.String RenderEnd(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IDetailSpecificationDocumentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DetailSpecificationDocumentFunctionsImpl implements IDetailSpecificationDocumentFunctionsImpl {

    public static final IDetailSpecificationDocumentFunctionsImpl INSTANCE = new DetailSpecificationDocumentFunctionsImpl();

    private DetailSpecificationDocumentFunctionsImpl() {}

  }
  
  public static class DetailSpecificationDocumentFunctions {

    private DetailSpecificationDocumentFunctions() {}

  }

  public static interface IStringLiteralFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("7456a29c-4879-11ec-b3cc-9dd8204a254a")
    public java.lang.String convert();

  }
  
  public static interface IStringLiteralFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class StringLiteralFunctionsImpl implements IStringLiteralFunctionsImpl {

    public static final IStringLiteralFunctionsImpl INSTANCE = new StringLiteralFunctionsImpl();

    private StringLiteralFunctionsImpl() {}

  }
  
  public static class StringLiteralFunctions {

    private StringLiteralFunctions() {}

  }

  public static interface IComponentSpecificationsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d9b44979-d6e5-11ee-8fe2-9fdd0afb9b0b")
    public java.lang.String RenderChapters(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("e479db75-d6e5-11ee-8fe2-9fdd0afb9b0b")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IComponentSpecificationsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ComponentSpecificationsFunctionsImpl implements IComponentSpecificationsFunctionsImpl {

    public static final IComponentSpecificationsFunctionsImpl INSTANCE = new ComponentSpecificationsFunctionsImpl();

    private ComponentSpecificationsFunctionsImpl() {}

  }
  
  public static class ComponentSpecificationsFunctions {

    private ComponentSpecificationsFunctions() {}

  }

  public static interface IAboutFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("edcd601f-d7a1-11ee-890b-0db639851a38")
    public java.lang.String ChapterName();

  }
  
  public static interface IAboutFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AboutFunctionsImpl implements IAboutFunctionsImpl {

    public static final IAboutFunctionsImpl INSTANCE = new AboutFunctionsImpl();

    private AboutFunctionsImpl() {}

  }
  
  public static class AboutFunctions {

    private AboutFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,6e104406-e64d-11e8-9ed8-5f22de89d1df,kQp+RzkMRpmnJuYu0+ajCXTDmvo=] */
