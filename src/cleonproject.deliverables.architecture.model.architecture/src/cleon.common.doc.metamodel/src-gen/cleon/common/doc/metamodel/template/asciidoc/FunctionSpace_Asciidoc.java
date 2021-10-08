package cleon.common.doc.metamodel.template.asciidoc;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[4ba84dc4-d872-11e4-aa2f-c11242a92b60,imports]] */
import cleon.common.doc.metamodel.spec.javamodel.DocumentElementComposite;
import cleon.common.doc.metamodel.spec.javamodel.IDocumentElementComposite;
/* End Protected Region   [[4ba84dc4-d872-11e4-aa2f-c11242a92b60,imports]] */

public class FunctionSpace_Asciidoc {

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

  public static interface IAbstractChapterFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("7eb10829-d872-11e4-aa2f-c11242a92b60")
    public java.lang.String RenderContent();

    @IDynamicResourceExtension.MethodId("62951c04-bdfe-11e5-bc2e-0b46afe7c3c9")
    public java.lang.String RenderChapter();

    @IDynamicResourceExtension.MethodId("9fad75ec-c1d8-11e5-bbf3-bdd12a9e2b3d")
    public java.lang.String RenderDescriptions();

    @IDynamicResourceExtension.MethodId("1bb83b01-d580-11ea-9bae-37ef2cb951a8")
    public java.lang.String RenderContentElement();

    @IDynamicResourceExtension.MethodId("036777ee-2806-11ec-988b-e1826086c18c")
    public java.lang.String RenderReference();

  }
  
  public static interface IAbstractChapterFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("1bb83b01-d580-11ea-9bae-37ef2cb951a8")
    public java.lang.String RenderContentElement(final cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter abstractChapter);

  }
  
  public static class AbstractChapterFunctionsImpl implements IAbstractChapterFunctionsImpl {

    public static final IAbstractChapterFunctionsImpl INSTANCE = new AbstractChapterFunctionsImpl();

    private AbstractChapterFunctionsImpl() {}

    @Override
    public java.lang.String RenderContentElement(final cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter abstractChapter) {
      return null;
    }

  }
  
  public static class AbstractChapterFunctions {

    private AbstractChapterFunctions() {}

    public static java.lang.String RenderContentElement(final cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter abstractChapter) {
      return DynamicResourceUtil.invoke(IAbstractChapterFunctionsImpl.class, AbstractChapterFunctionsImpl.INSTANCE, abstractChapter).RenderContentElement(abstractChapter);
    }

  }

  public static interface ITextFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("944c09bf-d872-11e4-aa2f-c11242a92b60")
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

  public static interface IChapterReferenceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b627b635-dbc4-11ea-b71c-ade06d3dafe4")
    public java.lang.String RenderContent();

  }
  
  public static interface IChapterReferenceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ChapterReferenceFunctionsImpl implements IChapterReferenceFunctionsImpl {

    public static final IChapterReferenceFunctionsImpl INSTANCE = new ChapterReferenceFunctionsImpl();

    private ChapterReferenceFunctionsImpl() {}

  }
  
  public static class ChapterReferenceFunctions {

    private ChapterReferenceFunctions() {}

  }

  public static interface INumberedListFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("889d84ac-d882-11e4-a5d6-b92b0ce88839")
    public java.lang.String RenderContent();

  }
  
  public static interface INumberedListFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class NumberedListFunctionsImpl implements INumberedListFunctionsImpl {

    public static final INumberedListFunctionsImpl INSTANCE = new NumberedListFunctionsImpl();

    private NumberedListFunctionsImpl() {}

  }
  
  public static class NumberedListFunctions {

    private NumberedListFunctions() {}

  }

  public static interface IDocumentElementCompositeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4f21c7c9-307c-11e5-8cdc-d5b441c8c3df")
    public java.lang.String GetIndent();

  }
  
  public static interface IDocumentElementCompositeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("4f21c7c9-307c-11e5-8cdc-d5b441c8c3df")
    public java.lang.String GetIndent(final cleon.common.doc.metamodel.spec.javamodel.IDocumentElementComposite documentElementComposite);

  }
  
  public static class DocumentElementCompositeFunctionsImpl implements IDocumentElementCompositeFunctionsImpl {

    public static final IDocumentElementCompositeFunctionsImpl INSTANCE = new DocumentElementCompositeFunctionsImpl();

    private DocumentElementCompositeFunctionsImpl() {}

    @Override
    public java.lang.String GetIndent(final cleon.common.doc.metamodel.spec.javamodel.IDocumentElementComposite documentElementComposite) {
      /* Begin Protected Region [[4f21c7c9-307c-11e5-8cdc-d5b441c8c3df]] */
      final IDocumentElementComposite parent = DocumentElementComposite.selectToMeDocumentElements(documentElementComposite);

      if( parent == null )
      {
      	return "=";
      }

      final IDocumentElementComposite parentCollection = parent; 	
      return "=" + GetIndent(parentCollection);
      /* End Protected Region   [[4f21c7c9-307c-11e5-8cdc-d5b441c8c3df]] */
    }

  }
  
  public static class DocumentElementCompositeFunctions {

    private DocumentElementCompositeFunctions() {}

    public static java.lang.String GetIndent(final cleon.common.doc.metamodel.spec.javamodel.IDocumentElementComposite documentElementComposite) {
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

  public static interface ISidebarFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2b45694f-3089-11e5-8cdc-d5b441c8c3df")
    public java.lang.String RenderContent();

  }
  
  public static interface ISidebarFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SidebarFunctionsImpl implements ISidebarFunctionsImpl {

    public static final ISidebarFunctionsImpl INSTANCE = new SidebarFunctionsImpl();

    private SidebarFunctionsImpl() {}

  }
  
  public static class SidebarFunctions {

    private SidebarFunctions() {}

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

  public static interface ITableFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("33aeb6f5-3c4b-11e5-871f-6beac6a7c24b")
    public java.lang.String RenderContent();

  }
  
  public static interface ITableFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TableFunctionsImpl implements ITableFunctionsImpl {

    public static final ITableFunctionsImpl INSTANCE = new TableFunctionsImpl();

    private TableFunctionsImpl() {}

  }
  
  public static class TableFunctions {

    private TableFunctions() {}

  }

  public static interface ISourceCodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("809f5cf9-466f-11e5-ba74-cb2e95044e1c")
    public java.lang.String RenderContent();

  }
  
  public static interface ISourceCodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SourceCodeFunctionsImpl implements ISourceCodeFunctionsImpl {

    public static final ISourceCodeFunctionsImpl INSTANCE = new SourceCodeFunctionsImpl();

    private SourceCodeFunctionsImpl() {}

  }
  
  public static class SourceCodeFunctions {

    private SourceCodeFunctions() {}

  }

  public static interface IHighlightingSourceCodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("84aef1f2-466f-11e5-ba74-cb2e95044e1c")
    public java.lang.String RenderContent();

  }
  
  public static interface IHighlightingSourceCodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class HighlightingSourceCodeFunctionsImpl implements IHighlightingSourceCodeFunctionsImpl {

    public static final IHighlightingSourceCodeFunctionsImpl INSTANCE = new HighlightingSourceCodeFunctionsImpl();

    private HighlightingSourceCodeFunctionsImpl() {}

  }
  
  public static class HighlightingSourceCodeFunctions {

    private HighlightingSourceCodeFunctions() {}

  }

  public static interface ITipFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8b19b54c-466f-11e5-ba74-cb2e95044e1c")
    public java.lang.String RenderContent();

  }
  
  public static interface ITipFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TipFunctionsImpl implements ITipFunctionsImpl {

    public static final ITipFunctionsImpl INSTANCE = new TipFunctionsImpl();

    private TipFunctionsImpl() {}

  }
  
  public static class TipFunctions {

    private TipFunctions() {}

  }

  public static interface IWarningFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("902d259f-466f-11e5-ba74-cb2e95044e1c")
    public java.lang.String RenderContent();

  }
  
  public static interface IWarningFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class WarningFunctionsImpl implements IWarningFunctionsImpl {

    public static final IWarningFunctionsImpl INSTANCE = new WarningFunctionsImpl();

    private WarningFunctionsImpl() {}

  }
  
  public static class WarningFunctions {

    private WarningFunctions() {}

  }

  public static interface ICautionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("944aeb52-466f-11e5-ba74-cb2e95044e1c")
    public java.lang.String RenderContent();

  }
  
  public static interface ICautionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class CautionFunctionsImpl implements ICautionFunctionsImpl {

    public static final ICautionFunctionsImpl INSTANCE = new CautionFunctionsImpl();

    private CautionFunctionsImpl() {}

  }
  
  public static class CautionFunctions {

    private CautionFunctions() {}

  }

  public static interface IImportantFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9b29a528-466f-11e5-ba74-cb2e95044e1c")
    public java.lang.String RenderContent();

  }
  
  public static interface IImportantFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ImportantFunctionsImpl implements IImportantFunctionsImpl {

    public static final IImportantFunctionsImpl INSTANCE = new ImportantFunctionsImpl();

    private ImportantFunctionsImpl() {}

  }
  
  public static class ImportantFunctions {

    private ImportantFunctions() {}

  }

  public static interface IDocumentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e3b00d61-47d5-11e5-9e30-e198f8ad676a")
    public java.lang.String RenderContent();

    @IDynamicResourceExtension.MethodId("4d143120-be09-11e5-ad6f-979cbb78853e")
    public java.lang.String RenderContentElement();

    @IDynamicResourceExtension.MethodId("3562a5b3-d3ef-11e5-9dfc-cf0f3e030023")
    public java.lang.String CallAsciiDoctorHtml();

    @IDynamicResourceExtension.MethodId("56290020-d3ef-11e5-9dfc-cf0f3e030023")
    public java.lang.String CallAsciiDoctorPdf();

    @IDynamicResourceExtension.MethodId("17a97aa8-d3f1-11e5-9dfc-cf0f3e030023")
    public java.lang.String CallConfluenceUpdateCommand();

    @IDynamicResourceExtension.MethodId("2a8582e2-d3f1-11e5-9dfc-cf0f3e030023")
    public java.lang.String CallConfluenceCreateCommand();

    @IDynamicResourceExtension.MethodId("fd79bbe5-4e5c-11e6-a89e-4beefb17234f")
    public java.lang.String RenderEnd();

    @IDynamicResourceExtension.MethodId("4807eeed-c369-11e5-9455-d97b1b986284")
    public java.lang.String GetAdocFullFileName();

    @IDynamicResourceExtension.MethodId("8f719cd4-d3ef-11e5-9dfc-cf0f3e030023")
    public java.lang.String GetAdocFileName();

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

  public static interface IBlockFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9431ddd9-c90a-11e5-a64e-a5d84d8f1b45")
    public java.lang.String RenderContent();

  }
  
  public static interface IBlockFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class BlockFunctionsImpl implements IBlockFunctionsImpl {

    public static final IBlockFunctionsImpl INSTANCE = new BlockFunctionsImpl();

    private BlockFunctionsImpl() {}

  }
  
  public static class BlockFunctions {

    private BlockFunctions() {}

  }

  public static interface IFencedFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9c94042a-c90a-11e5-a64e-a5d84d8f1b45")
    public java.lang.String RenderContent();

  }
  
  public static interface IFencedFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class FencedFunctionsImpl implements IFencedFunctionsImpl {

    public static final IFencedFunctionsImpl INSTANCE = new FencedFunctionsImpl();

    private FencedFunctionsImpl() {}

  }
  
  public static class FencedFunctions {

    private FencedFunctions() {}

  }

  public static interface IPassthroughFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("a1f60916-c90a-11e5-a64e-a5d84d8f1b45")
    public java.lang.String RenderContent();

  }
  
  public static interface IPassthroughFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class PassthroughFunctionsImpl implements IPassthroughFunctionsImpl {

    public static final IPassthroughFunctionsImpl INSTANCE = new PassthroughFunctionsImpl();

    private PassthroughFunctionsImpl() {}

  }
  
  public static class PassthroughFunctions {

    private PassthroughFunctions() {}

  }

  public static interface IImageFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("6098c7c5-15e8-11e6-b588-912e2ce0f2b0")
    public java.lang.String RenderContent();

  }
  
  public static interface IImageFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ImageFunctionsImpl implements IImageFunctionsImpl {

    public static final IImageFunctionsImpl INSTANCE = new ImageFunctionsImpl();

    private ImageFunctionsImpl() {}

  }
  
  public static class ImageFunctions {

    private ImageFunctions() {}

  }

  public static interface ICellFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("70f3defc-117b-11e8-854a-3387d66a1f33")
    public java.lang.String RenderContent();

  }
  
  public static interface ICellFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class CellFunctionsImpl implements ICellFunctionsImpl {

    public static final ICellFunctionsImpl INSTANCE = new CellFunctionsImpl();

    private CellFunctionsImpl() {}

  }
  
  public static class CellFunctions {

    private CellFunctions() {}

  }

  public static interface IItemizedListFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("39b91640-e8f6-11e8-b810-cdb2b421fd42")
    public java.lang.String RenderContent();

  }
  
  public static interface IItemizedListFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ItemizedListFunctionsImpl implements IItemizedListFunctionsImpl {

    public static final IItemizedListFunctionsImpl INSTANCE = new ItemizedListFunctionsImpl();

    private ItemizedListFunctionsImpl() {}

  }
  
  public static class ItemizedListFunctions {

    private ItemizedListFunctions() {}

  }

  public static interface IChapterAwareFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("3b9a5692-33bb-11e6-94cd-fbf6c8ccd08d")
    public java.lang.String RenderChapters();

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

  public static interface IParagraphAwareFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("df606084-c1d8-11e5-bbf3-bdd12a9e2b3d")
    public java.lang.String RenderParagraph();

  }
  
  public static interface IParagraphAwareFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ParagraphAwareFunctionsImpl implements IParagraphAwareFunctionsImpl {

    public static final IParagraphAwareFunctionsImpl INSTANCE = new ParagraphAwareFunctionsImpl();

    private ParagraphAwareFunctionsImpl() {}

  }
  
  public static class ParagraphAwareFunctions {

    private ParagraphAwareFunctions() {}

  }

  public static interface IAsciidocFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ccfc5d7a-2236-11e9-a054-db6d80fba790")
    public java.lang.String RenderContent(final cleon.common.doc.metamodel.spec.paragraph.javamodel.IText text);

    @IDynamicResourceExtension.MethodId("8147c739-1e85-11ea-862b-25dce7587113")
    public java.lang.String RenderTextContent(final cleon.common.doc.metamodel.spec.paragraph.javamodel.IText text);

    @IDynamicResourceExtension.MethodId("8147c741-1e85-11ea-862b-25dce7587113")
    public java.lang.String RenderDocumentContent(final cleon.common.doc.metamodel.spec.document.javamodel.IDocument document);

    @IDynamicResourceExtension.MethodId("9eff80a0-2fcc-11ea-9245-a54d8c3bd9df")
    public java.lang.String PluginId();

  }
  
  public static interface IAsciidocFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AsciidocFunctionsImpl implements IAsciidocFunctionsImpl {

    public static final IAsciidocFunctionsImpl INSTANCE = new AsciidocFunctionsImpl();

    private AsciidocFunctionsImpl() {}

  }
  
  public static class AsciidocFunctions {

    private AsciidocFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,4ba84dc4-d872-11e4-aa2f-c11242a92b60,dKsrazQlrAlKjhFAHwLW9EOQqY0=] */
