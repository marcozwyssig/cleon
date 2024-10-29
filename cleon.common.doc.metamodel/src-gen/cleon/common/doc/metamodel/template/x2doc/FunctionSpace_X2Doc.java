package cleon.common.doc.metamodel.template.x2doc;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[d3556ca6-7fdf-11ef-9c8a-d93340a49f34,imports]] */

/* End Protected Region   [[d3556ca6-7fdf-11ef-9c8a-d93340a49f34,imports]] */

public class FunctionSpace_X2Doc {

  /* Begin Protected Region [[d3556ca6-7fdf-11ef-9c8a-d93340a49f34]] */
  
  /* End Protected Region   [[d3556ca6-7fdf-11ef-9c8a-d93340a49f34]] */


  public static interface IDocumentElementFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d3556ca8-7fdf-11ef-9c8a-d93340a49f34")
    public java.lang.String RenderContent();

    @IDynamicResourceExtension.MethodId("d3556caa-7fdf-11ef-9c8a-d93340a49f34")
    public java.lang.String RenderAttributes();

  }
  
  public static interface IDocumentElementFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("d3556caa-7fdf-11ef-9c8a-d93340a49f34")
    public java.lang.String RenderAttributes(final cleon.common.doc.metamodel.spec.javamodel.IDocumentElement documentElement);

  }
  
  public static class DocumentElementFunctionsImpl implements IDocumentElementFunctionsImpl {

    public static final IDocumentElementFunctionsImpl INSTANCE = new DocumentElementFunctionsImpl();

    private DocumentElementFunctionsImpl() {}

    @Override
    public java.lang.String RenderAttributes(final cleon.common.doc.metamodel.spec.javamodel.IDocumentElement documentElement) {
      return null;
    }

  }
  
  public static class DocumentElementFunctions {

    private DocumentElementFunctions() {}

    public static java.lang.String RenderAttributes(final cleon.common.doc.metamodel.spec.javamodel.IDocumentElement documentElement) {
      return DynamicResourceUtil.invoke(IDocumentElementFunctionsImpl.class, DocumentElementFunctionsImpl.INSTANCE, documentElement).RenderAttributes(documentElement);
    }

  }

  public static interface IAbstractChapterFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d355933c-7fdf-11ef-9c8a-d93340a49f34")
    public java.lang.String RenderContent();

    @IDynamicResourceExtension.MethodId("d355ba8e-7fdf-11ef-9c8a-d93340a49f34")
    public java.lang.String RenderChapter();

    @IDynamicResourceExtension.MethodId("d355baa0-7fdf-11ef-9c8a-d93340a49f34")
    public java.lang.String RenderDescriptions();

    @IDynamicResourceExtension.MethodId("d355baab-7fdf-11ef-9c8a-d93340a49f34")
    public java.lang.String RenderChapterName();

    @IDynamicResourceExtension.MethodId("d355bab3-7fdf-11ef-9c8a-d93340a49f34")
    public java.lang.String RenderReference();

    @IDynamicResourceExtension.MethodId("d355bab5-7fdf-11ef-9c8a-d93340a49f34")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IAbstractChapterFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("d355bab5-7fdf-11ef-9c8a-d93340a49f34")
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

    @IDynamicResourceExtension.MethodId("d355e0fb-7fdf-11ef-9c8a-d93340a49f34")
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

  public static interface INamedTextFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d355e116-7fdf-11ef-9c8a-d93340a49f34")
    public java.lang.String RenderContent();

  }
  
  public static interface INamedTextFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class NamedTextFunctionsImpl implements INamedTextFunctionsImpl {

    public static final INamedTextFunctionsImpl INSTANCE = new NamedTextFunctionsImpl();

    private NamedTextFunctionsImpl() {}

  }
  
  public static class NamedTextFunctions {

    private NamedTextFunctions() {}

  }

  public static interface IChapterReferenceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d355e131-7fdf-11ef-9c8a-d93340a49f34")
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

    @IDynamicResourceExtension.MethodId("d355e15e-7fdf-11ef-9c8a-d93340a49f34")
    public java.lang.String RenderContent();

    @IDynamicResourceExtension.MethodId("d3560870-7fdf-11ef-9c8a-d93340a49f34")
    public java.lang.Boolean IsEmpty();

  }
  
  public static interface INumberedListFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("d3560870-7fdf-11ef-9c8a-d93340a49f34")
    public java.lang.Boolean IsEmpty(final List<cleon.common.doc.metamodel.spec.paragraph.javamodel.INumberedList> numberedListList);

  }
  
  public static class NumberedListFunctionsImpl implements INumberedListFunctionsImpl {

    public static final INumberedListFunctionsImpl INSTANCE = new NumberedListFunctionsImpl();

    private NumberedListFunctionsImpl() {}

    @Override
    public java.lang.Boolean IsEmpty(final List<cleon.common.doc.metamodel.spec.paragraph.javamodel.INumberedList> numberedListList) {
      if( numberedListList == null) {
          	return true;
      }
      return numberedListList.isEmpty();   
    }

  }
  
  public static class NumberedListFunctions {

    private NumberedListFunctions() {}

    public static java.lang.Boolean IsEmpty(final List<cleon.common.doc.metamodel.spec.paragraph.javamodel.INumberedList> numberedListList) {
      return DynamicResourceUtil.invoke(INumberedListFunctionsImpl.class, NumberedListFunctionsImpl.INSTANCE, numberedListList).IsEmpty(numberedListList);
    }

  }

  public static interface INoteFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d3560884-7fdf-11ef-9c8a-d93340a49f34")
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

    @IDynamicResourceExtension.MethodId("d35608ae-7fdf-11ef-9c8a-d93340a49f34")
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

    @IDynamicResourceExtension.MethodId("d3562fe4-7fdf-11ef-9c8a-d93340a49f34")
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

    @IDynamicResourceExtension.MethodId("d3565657-7fdf-11ef-9c8a-d93340a49f34")
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

    @IDynamicResourceExtension.MethodId("d356566c-7fdf-11ef-9c8a-d93340a49f34")
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

    @IDynamicResourceExtension.MethodId("d3565681-7fdf-11ef-9c8a-d93340a49f34")
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

    @IDynamicResourceExtension.MethodId("d3565695-7fdf-11ef-9c8a-d93340a49f34")
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

    @IDynamicResourceExtension.MethodId("d35656a9-7fdf-11ef-9c8a-d93340a49f34")
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

    @IDynamicResourceExtension.MethodId("d3567dce-7fdf-11ef-9c8a-d93340a49f34")
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

    @IDynamicResourceExtension.MethodId("d3567de2-7fdf-11ef-9c8a-d93340a49f34")
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

    @IDynamicResourceExtension.MethodId("d3567e0d-7fdf-11ef-9c8a-d93340a49f34")
    public java.lang.String RenderDocument();

    @IDynamicResourceExtension.MethodId("d3567e12-7fdf-11ef-9c8a-d93340a49f34")
    public java.lang.String RenderContent();

    @IDynamicResourceExtension.MethodId("d3567e14-7fdf-11ef-9c8a-d93340a49f34")
    public java.lang.String RenderContentElement();

    @IDynamicResourceExtension.MethodId("d3567e2a-7fdf-11ef-9c8a-d93340a49f34")
    public java.lang.String RenderDocumentHeader();

    @IDynamicResourceExtension.MethodId("d3567e2f-7fdf-11ef-9c8a-d93340a49f34")
    public java.lang.String RenderDocumentBody();

  }
  
  public static interface IDocumentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("d3567e14-7fdf-11ef-9c8a-d93340a49f34")
    public java.lang.String RenderContentElement(final cleon.common.doc.metamodel.spec.document.javamodel.IDocument document);

  }
  
  public static class DocumentFunctionsImpl implements IDocumentFunctionsImpl {

    public static final IDocumentFunctionsImpl INSTANCE = new DocumentFunctionsImpl();

    private DocumentFunctionsImpl() {}

    @Override
    public java.lang.String RenderContentElement(final cleon.common.doc.metamodel.spec.document.javamodel.IDocument document) {
      return null;
    }

  }
  
  public static class DocumentFunctions {

    private DocumentFunctions() {}

    public static java.lang.String RenderContentElement(final cleon.common.doc.metamodel.spec.document.javamodel.IDocument document) {
      return DynamicResourceUtil.invoke(IDocumentFunctionsImpl.class, DocumentFunctionsImpl.INSTANCE, document).RenderContentElement(document);
    }

  }

  public static interface IBlockFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d356f2ce-7fdf-11ef-9c8a-d93340a49f34")
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

    @IDynamicResourceExtension.MethodId("d3571a04-7fdf-11ef-9c8a-d93340a49f34")
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

    @IDynamicResourceExtension.MethodId("d3571a1f-7fdf-11ef-9c8a-d93340a49f34")
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

    @IDynamicResourceExtension.MethodId("d3571a4d-7fdf-11ef-9c8a-d93340a49f34")
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

    @IDynamicResourceExtension.MethodId("d3574180-7fdf-11ef-9c8a-d93340a49f34")
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

    @IDynamicResourceExtension.MethodId("d35741a1-7fdf-11ef-9c8a-d93340a49f34")
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

    @IDynamicResourceExtension.MethodId("d35741b1-7fdf-11ef-9c8a-d93340a49f34")
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

    @IDynamicResourceExtension.MethodId("d35741c2-7fdf-11ef-9c8a-d93340a49f34")
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

  public static interface IAboutFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d3576844-7fdf-11ef-9c8a-d93340a49f34")
    public java.lang.String RenderChapters();

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

  public static interface ILayoutFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d357b632-7fdf-11ef-9c8a-d93340a49f34")
    public java.lang.String RenderContentElement();

  }
  
  public static interface ILayoutFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class LayoutFunctionsImpl implements ILayoutFunctionsImpl {

    public static final ILayoutFunctionsImpl INSTANCE = new LayoutFunctionsImpl();

    private LayoutFunctionsImpl() {}

  }
  
  public static class LayoutFunctions {

    private LayoutFunctions() {}

  }

  public static interface IReferencesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d357ddc5-7fdf-11ef-9c8a-d93340a49f34")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IReferencesFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ReferencesFunctionsImpl implements IReferencesFunctionsImpl {

    public static final IReferencesFunctionsImpl INSTANCE = new ReferencesFunctionsImpl();

    private ReferencesFunctionsImpl() {}

  }
  
  public static class ReferencesFunctions {

    private ReferencesFunctions() {}

  }

  public static interface ISimpleDescriptionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d35803e8-7fdf-11ef-9c8a-d93340a49f34")
    public java.lang.String ConvertToPara();

  }
  
  public static interface ISimpleDescriptionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SimpleDescriptionFunctionsImpl implements ISimpleDescriptionFunctionsImpl {

    public static final ISimpleDescriptionFunctionsImpl INSTANCE = new SimpleDescriptionFunctionsImpl();

    private SimpleDescriptionFunctionsImpl() {}

  }
  
  public static class SimpleDescriptionFunctions {

    private SimpleDescriptionFunctions() {}

  }

  public static interface IListItemFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d3580409-7fdf-11ef-9c8a-d93340a49f34")
    public java.lang.String RenderContent();

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

  public static interface IBooleanLiteralFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d3580414-7fdf-11ef-9c8a-d93340a49f34")
    public java.lang.String RenderReferenceAnchor(final cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter abstractChapter);

  }
  
  public static interface IBooleanLiteralFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class BooleanLiteralFunctionsImpl implements IBooleanLiteralFunctionsImpl {

    public static final IBooleanLiteralFunctionsImpl INSTANCE = new BooleanLiteralFunctionsImpl();

    private BooleanLiteralFunctionsImpl() {}

  }
  
  public static class BooleanLiteralFunctions {

    private BooleanLiteralFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,d3556ca6-7fdf-11ef-9c8a-d93340a49f34,34MXuN3fFXyyB0YAs1Siqp0Zfis=] */
