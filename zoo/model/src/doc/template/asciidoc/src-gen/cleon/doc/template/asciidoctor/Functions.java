package cleon.doc.template.asciidoctor;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[4ba84dc4-d872-11e4-aa2f-c11242a92b60,imports]] */

/* End Protected Region   [[4ba84dc4-d872-11e4-aa2f-c11242a92b60,imports]] */

public class Functions {

  /* Begin Protected Region [[4ba84dc4-d872-11e4-aa2f-c11242a92b60]] */
  private static java.lang.String BuildChapterNo( cleon.doc.spec.javamodel.IDocumentElement chapter)
  {
  	cleon.doc.spec.javamodel.IDocumentElement parent = cleon.doc.spec.javamodel.UseDocumentElementComposite.selectToMeUseDocumentElements(chapter);
  	if( parent == null || !(parent instanceof cleon.doc.spec.javamodel.IUseDocumentElementComposite))
  	{
    	return "";	
  	}
  	cleon.doc.spec.javamodel.IUseDocumentElementComposite parentCollection = (cleon.doc.spec.javamodel.IUseDocumentElementComposite)parent;
  	java.lang.Integer index = parentCollection.selectUseDocumentElements().indexOf(chapter) + 1;
  	java.lang.String indexStr = index.toString();
  	
  	java.lang.String parentIndex = BuildChapterNo(parentCollection);
  	if( parentIndex != "")
  	{
  		indexStr = "." + indexStr;
  		return "=" + BuildChapterNo(parentCollection) + indexStr;
  	}
  	else
  	{
  		return "= " + BuildChapterNo(parentCollection) + indexStr;
  	}
  }
  /* End Protected Region   [[4ba84dc4-d872-11e4-aa2f-c11242a92b60]] */


  public static interface IDocumentElementFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5dac1efa-d872-11e4-aa2f-c11242a92b60")
    public java.lang.String RenderContent();

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

  public static interface IChapterFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("7eb10829-d872-11e4-aa2f-c11242a92b60")
    public java.lang.String RenderContent();

    @IDynamicResourceExtension.MethodId("06c933f7-d875-11e4-aa2f-c11242a92b60")
    public java.lang.String ChapterNo();

  }
  
  public static interface IChapterFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("06c933f7-d875-11e4-aa2f-c11242a92b60")
    public java.lang.String ChapterNo(final cleon.doc.spec.chapter.javamodel.IChapter chapter);

  }
  
  public static class ChapterFunctionsImpl implements IChapterFunctionsImpl {

    public static final IChapterFunctionsImpl INSTANCE = new ChapterFunctionsImpl();

    private ChapterFunctionsImpl() {}

    @Override
    public java.lang.String ChapterNo(final cleon.doc.spec.chapter.javamodel.IChapter chapter) {
      /* Begin Protected Region [[06c933f7-d875-11e4-aa2f-c11242a92b60]] */
      	return BuildChapterNo(chapter);
      /* End Protected Region   [[06c933f7-d875-11e4-aa2f-c11242a92b60]] */
    }

  }
  
  public static class ChapterFunctions {

    private ChapterFunctions() {}

    public static java.lang.String ChapterNo(final cleon.doc.spec.chapter.javamodel.IChapter chapter) {
      return DynamicResourceUtil.invoke(IChapterFunctionsImpl.class, ChapterFunctionsImpl.INSTANCE, chapter).ChapterNo(chapter);
    }

  }

  public static interface IDocumentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("93a73e3b-d872-11e4-aa2f-c11242a92b60")
    public java.lang.String RenderContent();

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

  public static interface ITextParagraphFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("944c09bf-d872-11e4-aa2f-c11242a92b60")
    public java.lang.String RenderContent();

  }
  
  public static interface ITextParagraphFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TextParagraphFunctionsImpl implements ITextParagraphFunctionsImpl {

    public static final ITextParagraphFunctionsImpl INSTANCE = new TextParagraphFunctionsImpl();

    private TextParagraphFunctionsImpl() {}

  }
  
  public static class TextParagraphFunctions {

    private TextParagraphFunctions() {}

  }

  public static interface IOrderedListFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("889d84ac-d882-11e4-a5d6-b92b0ce88839")
    public java.lang.String RenderContent();

  }
  
  public static interface IOrderedListFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class OrderedListFunctionsImpl implements IOrderedListFunctionsImpl {

    public static final IOrderedListFunctionsImpl INSTANCE = new OrderedListFunctionsImpl();

    private OrderedListFunctionsImpl() {}

  }
  
  public static class OrderedListFunctions {

    private OrderedListFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,4ba84dc4-d872-11e4-aa2f-c11242a92b60,5eVSyIHN8DTN+2e+e5UCfrSI8j4=] */
