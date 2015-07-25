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

  }
  
  public static interface IChapterFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ChapterFunctionsImpl implements IChapterFunctionsImpl {

    public static final IChapterFunctionsImpl INSTANCE = new ChapterFunctionsImpl();

    private ChapterFunctionsImpl() {}

  }
  
  public static class ChapterFunctions {

    private ChapterFunctions() {}

  }

  public static interface IDocumentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("93a73e3b-d872-11e4-aa2f-c11242a92b60")
    public java.lang.String RenderContent();

    @IDynamicResourceExtension.MethodId("6a76a89d-307b-11e5-8cdc-d5b441c8c3df")
    public List<cleon.doc.spec.javamodel.IDocumentElement> SelectSubElements();

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

  public static interface IOwnDocumentElementCompositeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("6f4165e8-3072-11e5-8cdc-d5b441c8c3df")
    public List<cleon.doc.spec.javamodel.IDocumentElement> SelectSubElements();

  }
  
  public static interface IOwnDocumentElementCompositeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class OwnDocumentElementCompositeFunctionsImpl implements IOwnDocumentElementCompositeFunctionsImpl {

    public static final IOwnDocumentElementCompositeFunctionsImpl INSTANCE = new OwnDocumentElementCompositeFunctionsImpl();

    private OwnDocumentElementCompositeFunctionsImpl() {}

  }
  
  public static class OwnDocumentElementCompositeFunctions {

    private OwnDocumentElementCompositeFunctions() {}

  }

  public static interface IUseDocumentElementCompositeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("82dcedd2-3072-11e5-8cdc-d5b441c8c3df")
    public List<cleon.doc.spec.javamodel.IDocumentElement> SelectSubElements();

  }
  
  public static interface IUseDocumentElementCompositeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class UseDocumentElementCompositeFunctionsImpl implements IUseDocumentElementCompositeFunctionsImpl {

    public static final IUseDocumentElementCompositeFunctionsImpl INSTANCE = new UseDocumentElementCompositeFunctionsImpl();

    private UseDocumentElementCompositeFunctionsImpl() {}

  }
  
  public static class UseDocumentElementCompositeFunctions {

    private UseDocumentElementCompositeFunctions() {}

  }

  public static interface IDocumentElementCompositeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("556d4ec9-3072-11e5-8cdc-d5b441c8c3df")
    public List<cleon.doc.spec.javamodel.IDocumentElement> SelectSubElements();

    @IDynamicResourceExtension.MethodId("4f21c7c9-307c-11e5-8cdc-d5b441c8c3df")
    public java.lang.String GetIndent();

  }
  
  public static interface IDocumentElementCompositeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("4f21c7c9-307c-11e5-8cdc-d5b441c8c3df")
    public java.lang.String GetIndent(final cleon.doc.spec.javamodel.IDocumentElementComposite documentElementComposite);

  }
  
  public static class DocumentElementCompositeFunctionsImpl implements IDocumentElementCompositeFunctionsImpl {

    public static final IDocumentElementCompositeFunctionsImpl INSTANCE = new DocumentElementCompositeFunctionsImpl();

    private DocumentElementCompositeFunctionsImpl() {}

    @Override
    public java.lang.String GetIndent(final cleon.doc.spec.javamodel.IDocumentElementComposite documentElementComposite) {
      /* Begin Protected Region [[4f21c7c9-307c-11e5-8cdc-d5b441c8c3df]] */
    	cleon.doc.spec.javamodel.IDocumentElement parent = null;
    	if( documentElementComposite instanceof cleon.doc.spec.javamodel.IUseDocumentElementComposite )
    	{
    		parent = cleon.doc.spec.javamodel.UseDocumentElementComposite.selectToMeUseDocumentElements((cleon.doc.spec.javamodel.IUseDocumentElementComposite)documentElementComposite);	
    	}
    	
    	if( parent == null && documentElementComposite instanceof cleon.doc.spec.javamodel.IOwnDocumentElementComposite )
    	{
    		parent = cleon.doc.spec.javamodel.OwnDocumentElementComposite.selectToMeOwnDocumentElements((cleon.doc.spec.javamodel.IOwnDocumentElementComposite)documentElementComposite);	
    	}
      	
      	if( parent == null || !(parent instanceof cleon.doc.spec.javamodel.IDocumentElementComposite))
      	{
        	return "=";	
      	}
      	
      	cleon.doc.spec.javamodel.IDocumentElementComposite parentCollection = (cleon.doc.spec.javamodel.IDocumentElementComposite)parent; 	
      	java.lang.String parentIndex = GetIndent(parentCollection);
      	if( parentIndex != "")
      	{      	
      		return "=" + GetIndent(parentCollection);
      	}
      	else
      	{
      		return "= " + GetIndent(parentCollection);
      	}
      /* End Protected Region   [[4f21c7c9-307c-11e5-8cdc-d5b441c8c3df]] */
    }

  }
  
  public static class DocumentElementCompositeFunctions {

    private DocumentElementCompositeFunctions() {}

    public static java.lang.String GetIndent(final cleon.doc.spec.javamodel.IDocumentElementComposite documentElementComposite) {
      return DynamicResourceUtil.invoke(IDocumentElementCompositeFunctionsImpl.class, DocumentElementCompositeFunctionsImpl.INSTANCE, documentElementComposite).GetIndent(documentElementComposite);
    }

  }

  public static interface INoteFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4f6e399e-3087-11e5-8cdc-d5b441c8c3df")
    public java.lang.String RenderContent();

  }
  
  public static interface INoteFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class NoteFunctionsImpl implements INoteFunctionsImpl {

    public static final INoteFunctionsImpl INSTANCE = new NoteFunctionsImpl();

    private NoteFunctionsImpl() {}

  }
  
  public static class NoteFunctions {

    private NoteFunctions() {}

  }

  public static interface IRoleFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2b45694f-3089-11e5-8cdc-d5b441c8c3df")
    public java.lang.String RenderContent();

  }
  
  public static interface IRoleFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RoleFunctionsImpl implements IRoleFunctionsImpl {

    public static final IRoleFunctionsImpl INSTANCE = new RoleFunctionsImpl();

    private RoleFunctionsImpl() {}

  }
  
  public static class RoleFunctions {

    private RoleFunctions() {}

  }

  public static interface IAdmonitionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e76a200b-308a-11e5-8cdc-d5b441c8c3df")
    public java.lang.String RenderContent();

  }
  
  public static interface IAdmonitionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AdmonitionFunctionsImpl implements IAdmonitionFunctionsImpl {

    public static final IAdmonitionFunctionsImpl INSTANCE = new AdmonitionFunctionsImpl();

    private AdmonitionFunctionsImpl() {}

  }
  
  public static class AdmonitionFunctions {

    private AdmonitionFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,4ba84dc4-d872-11e4-aa2f-c11242a92b60,FGSQnYl6o31+IwzrVr/KJOmbV9A=] */
