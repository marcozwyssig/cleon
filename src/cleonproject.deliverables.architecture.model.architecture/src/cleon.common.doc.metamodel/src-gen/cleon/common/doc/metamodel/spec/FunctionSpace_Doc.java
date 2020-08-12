package cleon.common.doc.metamodel.spec;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[cc8dc39e-084c-11e9-9ee8-c54fda7ab431,imports]] */

/* End Protected Region   [[cc8dc39e-084c-11e9-9ee8-c54fda7ab431,imports]] */

public class FunctionSpace_Doc {

  /* Begin Protected Region [[cc8dc39e-084c-11e9-9ee8-c54fda7ab431]] */
  
  /* End Protected Region   [[cc8dc39e-084c-11e9-9ee8-c54fda7ab431]] */


  public static interface IDocumentElementFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d68bbf07-084c-11e9-9ee8-c54fda7ab431")
    public cleon.common.doc.metamodel.spec.javamodel.IDocumentElement GetParent();

    @IDynamicResourceExtension.MethodId("f6950a72-084c-11e9-9ee8-c54fda7ab431")
    public List<cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> GetSelfAndParents();

    @IDynamicResourceExtension.MethodId("1dc27d5b-084d-11e9-9ee8-c54fda7ab431")
    public cleon.common.doc.metamodel.spec.document.javamodel.IDocument GetDocument();

    @IDynamicResourceExtension.MethodId("add97812-dbc2-11ea-b71c-ade06d3dafe4")
    public List<cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> AllChildren();

  }
  
  public static interface IDocumentElementFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DocumentElementFunctionsImpl implements IDocumentElementFunctionsImpl {

    public static final IDocumentElementFunctionsImpl INSTANCE = new DocumentElementFunctionsImpl();

    private DocumentElementFunctionsImpl() {}

  }
  
  public static class DocumentElementFunctions {

    private DocumentElementFunctions() {}

  }

  public static interface IDocumentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("de5cc4d4-ba80-11e5-b56d-4f524d402f4b")
    public java.lang.String GetDocumentPath();

    @IDynamicResourceExtension.MethodId("3d579331-d3ec-11e5-9dfc-cf0f3e030023")
    public java.lang.String GetFullFileName();

    @IDynamicResourceExtension.MethodId("8eea2770-d3f0-11e5-9dfc-cf0f3e030023")
    public java.lang.String GetFileName();

    @IDynamicResourceExtension.MethodId("741b9c04-5e36-11e6-a777-551543f10110")
    public java.lang.String GetDocumentName();

  }
  
  public static interface IDocumentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DocumentFunctionsImpl implements IDocumentFunctionsImpl {

    public static final IDocumentFunctionsImpl INSTANCE = new DocumentFunctionsImpl();

    private DocumentFunctionsImpl() {}

  }
  
  public static class DocumentFunctions {

    private DocumentFunctions() {}

  }

  public static interface IChapterAwareFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e010b098-09c8-11e9-9915-0d353533f3da")
    public List<cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> ChapterOrder();

  }
  
  public static interface IChapterAwareFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ChapterAwareFunctionsImpl implements IChapterAwareFunctionsImpl {

    public static final IChapterAwareFunctionsImpl INSTANCE = new ChapterAwareFunctionsImpl();

    private ChapterAwareFunctionsImpl() {}

  }
  
  public static class ChapterAwareFunctions {

    private ChapterAwareFunctions() {}

  }

  public static interface IDocumentLanguageFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8c68084f-2240-11e9-a054-db6d80fba790")
    public java.lang.String RenderDocumentContent(final cleon.common.doc.metamodel.spec.document.javamodel.IDocument document);

  }
  
  public static interface IDocumentLanguageFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DocumentLanguageFunctionsImpl implements IDocumentLanguageFunctionsImpl {

    public static final IDocumentLanguageFunctionsImpl INSTANCE = new DocumentLanguageFunctionsImpl();

    private DocumentLanguageFunctionsImpl() {}

  }
  
  public static class DocumentLanguageFunctions {

    private DocumentLanguageFunctions() {}

  }

  public static interface IAbstractChapterFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2e076f33-53fa-11ea-93a1-15e540ad9e0c")
    public java.lang.String Descriptions();

    @IDynamicResourceExtension.MethodId("877562ec-7bdc-11ea-9c6c-c5ad5514988f")
    public java.lang.String Comment();

    @IDynamicResourceExtension.MethodId("8645eea6-01e1-11e9-9c9d-8d52d6745026")
    public java.lang.String RenderStandardDescription();

  }
  
  public static interface IAbstractChapterFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("8645eea6-01e1-11e9-9c9d-8d52d6745026")
    public java.lang.String RenderStandardDescription(final cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter abstractChapter);

  }
  
  public static class AbstractChapterFunctionsImpl implements IAbstractChapterFunctionsImpl {

    public static final IAbstractChapterFunctionsImpl INSTANCE = new AbstractChapterFunctionsImpl();

    private AbstractChapterFunctionsImpl() {}

    @Override
    public java.lang.String RenderStandardDescription(final cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter abstractChapter) {
      return null;
    }

  }
  
  public static class AbstractChapterFunctions {

    private AbstractChapterFunctions() {}

    public static java.lang.String RenderStandardDescription(final cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter abstractChapter) {
      return DynamicResourceUtil.invoke(IAbstractChapterFunctionsImpl.class, AbstractChapterFunctionsImpl.INSTANCE, abstractChapter).RenderStandardDescription(abstractChapter);
    }

  }

  public static interface ITextFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("559a7b1d-dcb5-11ea-b5f8-77c3980a1d0a")
    public java.lang.String SimpleName();

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

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,cc8dc39e-084c-11e9-9ee8-c54fda7ab431,jbzzSgGW8b8d3DwfL8GNP+sh1Kc=] */
