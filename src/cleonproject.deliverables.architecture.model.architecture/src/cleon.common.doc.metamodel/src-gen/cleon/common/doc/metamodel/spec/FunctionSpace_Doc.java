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

    @IDynamicResourceExtension.MethodId("272db3bd-c9ee-11ee-953e-1bc687172a5b")
    public java.lang.String GetTitleName();

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

  public static interface IAbstractChapterFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2e076f33-53fa-11ea-93a1-15e540ad9e0c")
    public java.lang.String Descriptions();

    @IDynamicResourceExtension.MethodId("877562ec-7bdc-11ea-9c6c-c5ad5514988f")
    public java.lang.String Comment();

    @IDynamicResourceExtension.MethodId("8645eea6-01e1-11e9-9c9d-8d52d6745026")
    public java.lang.String RenderStandardDescription();

    @IDynamicResourceExtension.MethodId("38207cb1-d24a-11ee-b255-49ab47716ebd")
    public java.lang.Boolean InASeparateFile();

    @IDynamicResourceExtension.MethodId("9b297769-d24b-11ee-b255-49ab47716ebd")
    public java.lang.String ChapterPath();

    @IDynamicResourceExtension.MethodId("9533b8ea-d64b-11ee-8014-c150876d6b6e")
    public List<cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> OnlyWithChapterPath();

    @IDynamicResourceExtension.MethodId("9d0e1eb8-d650-11ee-8014-c150876d6b6e")
    public java.lang.String FullChapterPath();

    @IDynamicResourceExtension.MethodId("e9f0dd95-d6e7-11ee-8fe2-9fdd0afb9b0b")
    public java.lang.String ChapterName();

  }
  
  public static interface IAbstractChapterFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("8645eea6-01e1-11e9-9c9d-8d52d6745026")
    public java.lang.String RenderStandardDescription(final cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter abstractChapter);

    @IDynamicResourceExtension.MethodId("38207cb1-d24a-11ee-b255-49ab47716ebd")
    public java.lang.Boolean InASeparateFile(final cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter abstractChapter);

    @IDynamicResourceExtension.MethodId("9533b8ea-d64b-11ee-8014-c150876d6b6e")
    public List<cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> OnlyWithChapterPath(final List<cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> abstractChapterList);

  }
  
  public static class AbstractChapterFunctionsImpl implements IAbstractChapterFunctionsImpl {

    public static final IAbstractChapterFunctionsImpl INSTANCE = new AbstractChapterFunctionsImpl();

    private AbstractChapterFunctionsImpl() {}

    @Override
    public java.lang.String RenderStandardDescription(final cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter abstractChapter) {
      return null;
    }

    @Override
    public java.lang.Boolean InASeparateFile(final cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter abstractChapter) {
      /* Begin Protected Region [[38207cb1-d24a-11ee-b255-49ab47716ebd]] */
      return abstractChapter.extension(IAbstractChapterFunctions.class).ChapterPath() != null;
      /* End Protected Region   [[38207cb1-d24a-11ee-b255-49ab47716ebd]] */
    }

    @Override
    public List<cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> OnlyWithChapterPath(final List<cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> abstractChapterList) {
      /* Begin Protected Region [[9533b8ea-d64b-11ee-8014-c150876d6b6e]] */
      return abstractChapterList.stream().filter(x -> x.extension(IAbstractChapterFunctions.class).ChapterPath() != null).toList();
      /* End Protected Region   [[9533b8ea-d64b-11ee-8014-c150876d6b6e]] */
    }

  }
  
  public static class AbstractChapterFunctions {

    private AbstractChapterFunctions() {}

    public static java.lang.String RenderStandardDescription(final cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter abstractChapter) {
      return DynamicResourceUtil.invoke(IAbstractChapterFunctionsImpl.class, AbstractChapterFunctionsImpl.INSTANCE, abstractChapter).RenderStandardDescription(abstractChapter);
    }

    public static java.lang.Boolean InASeparateFile(final cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter abstractChapter) {
      return DynamicResourceUtil.invoke(IAbstractChapterFunctionsImpl.class, AbstractChapterFunctionsImpl.INSTANCE, abstractChapter).InASeparateFile(abstractChapter);
    }

    public static List<cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> OnlyWithChapterPath(final List<cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> abstractChapterList) {
      return DynamicResourceUtil.invoke(IAbstractChapterFunctionsImpl.class, AbstractChapterFunctionsImpl.INSTANCE, abstractChapterList).OnlyWithChapterPath(abstractChapterList);
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

  public static interface INamedDocumentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("dbb30828-c03f-11ee-a353-4bf80e47b5e4")
    public cleon.common.language.metamodel.spec.languagesettings.javamodel.ILanguageSettings LanguageSettings();

  }
  
  public static interface INamedDocumentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class NamedDocumentFunctionsImpl implements INamedDocumentFunctionsImpl {

    public static final INamedDocumentFunctionsImpl INSTANCE = new NamedDocumentFunctionsImpl();

    private NamedDocumentFunctionsImpl() {}

  }
  
  public static class NamedDocumentFunctions {

    private NamedDocumentFunctions() {}

  }

  public static interface IResourceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("570310a9-d24c-11ee-b255-49ab47716ebd")
    public java.lang.String FileName();

  }
  
  public static interface IResourceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ResourceFunctionsImpl implements IResourceFunctionsImpl {

    public static final IResourceFunctionsImpl INSTANCE = new ResourceFunctionsImpl();

    private ResourceFunctionsImpl() {}

  }
  
  public static class ResourceFunctions {

    private ResourceFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,cc8dc39e-084c-11e9-9ee8-c54fda7ab431,liPRVoeYK11Qq0GwVZ3mimaC3xI=] */
