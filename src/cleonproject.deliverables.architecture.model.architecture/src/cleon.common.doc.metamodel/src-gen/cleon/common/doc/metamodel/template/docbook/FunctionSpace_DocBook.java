package cleon.common.doc.metamodel.template.docbook;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[536edc4e-3de8-11e6-9bf8-29c5fda07fa3,imports]] */
import cleon.common.doc.metamodel.spec.document.javamodel.IDocument;
import cleon.common.doc.metamodel.spec.javamodel.DocumentElementComposite;
import cleon.common.doc.metamodel.spec.javamodel.IDocumentElementComposite;
/* End Protected Region   [[536edc4e-3de8-11e6-9bf8-29c5fda07fa3,imports]] */

public class FunctionSpace_DocBook {

  /* Begin Protected Region [[536edc4e-3de8-11e6-9bf8-29c5fda07fa3]] */
  
  /* End Protected Region   [[536edc4e-3de8-11e6-9bf8-29c5fda07fa3]] */


  public static interface IDocumentElementFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0638950e-3df2-11e6-9bf8-29c5fda07fa3")
    public java.lang.String RenderContent();

    @IDynamicResourceExtension.MethodId("6c18ef67-3e09-11e6-9bf8-29c5fda07fa3")
    public java.lang.String RenderAttributes();

    @IDynamicResourceExtension.MethodId("1072f3e2-2175-11e9-a054-db6d80fba790")
    public java.lang.String para();

    @IDynamicResourceExtension.MethodId("1a417b34-2175-11e9-a054-db6d80fba790")
    public java.lang.String para__U_();

    @IDynamicResourceExtension.MethodId("f15b3fb8-2175-11e9-a054-db6d80fba790")
    public java.lang.String itemizedlist();

    @IDynamicResourceExtension.MethodId("f79443f6-2175-11e9-a054-db6d80fba790")
    public java.lang.String itemizedlist__U_();

    @IDynamicResourceExtension.MethodId("4223f16d-2176-11e9-a054-db6d80fba790")
    public java.lang.String listitembullet();

    @IDynamicResourceExtension.MethodId("482a9b72-2176-11e9-a054-db6d80fba790")
    public java.lang.String listitem__U_();

    @IDynamicResourceExtension.MethodId("43e6931b-2177-11e9-a054-db6d80fba790")
    public java.lang.String table();

    @IDynamicResourceExtension.MethodId("33f7ca48-2178-11e9-a054-db6d80fba790")
    public java.lang.String table__U_();

    @IDynamicResourceExtension.MethodId("57226ed2-2177-11e9-a054-db6d80fba790")
    public java.lang.String colw40();

    @IDynamicResourceExtension.MethodId("09fb58a6-2178-11e9-a054-db6d80fba790")
    public java.lang.String colw60();

    @IDynamicResourceExtension.MethodId("4a46160c-2178-11e9-a054-db6d80fba790")
    public java.lang.String thead();

    @IDynamicResourceExtension.MethodId("530f8a02-2178-11e9-a054-db6d80fba790")
    public java.lang.String thead__U_();

    @IDynamicResourceExtension.MethodId("58fe3e65-2178-11e9-a054-db6d80fba790")
    public java.lang.String tbody();

    @IDynamicResourceExtension.MethodId("65e2b8e8-2178-11e9-a054-db6d80fba790")
    public java.lang.String tbody__U_();

    @IDynamicResourceExtension.MethodId("6c25cec6-2178-11e9-a054-db6d80fba790")
    public java.lang.String tr();

    @IDynamicResourceExtension.MethodId("73eb8e52-2178-11e9-a054-db6d80fba790")
    public java.lang.String tr__U_();

    @IDynamicResourceExtension.MethodId("7a283c08-2178-11e9-a054-db6d80fba790")
    public java.lang.String th();

    @IDynamicResourceExtension.MethodId("7a283c0b-2178-11e9-a054-db6d80fba790")
    public java.lang.String th__U_();

    @IDynamicResourceExtension.MethodId("7544a4e4-2233-11e9-a054-db6d80fba790")
    public java.lang.String td();

    @IDynamicResourceExtension.MethodId("7544a4e7-2233-11e9-a054-db6d80fba790")
    public java.lang.String td__U_();

  }
  
  public static interface IDocumentElementFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("6c18ef67-3e09-11e6-9bf8-29c5fda07fa3")
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

    @IDynamicResourceExtension.MethodId("619f52ea-3df2-11e6-9bf8-29c5fda07fa3")
    public java.lang.String RenderContent();

    @IDynamicResourceExtension.MethodId("619f5310-3df2-11e6-9bf8-29c5fda07fa3")
    public java.lang.String RenderChapter();

    @IDynamicResourceExtension.MethodId("619f531a-3df2-11e6-9bf8-29c5fda07fa3")
    public java.lang.String RenderDescriptions();

    @IDynamicResourceExtension.MethodId("7a904f0e-3e12-11e6-9bf8-29c5fda07fa3")
    public java.lang.String RenderElementName();

    @IDynamicResourceExtension.MethodId("7e5ddd3f-0a9b-11e9-9915-0d353533f3da")
    public java.lang.String RenderChapterName();

    @IDynamicResourceExtension.MethodId("75da4f80-199a-11e9-8cd4-efe75fb4587a")
    public java.lang.String RenderReference();

    @IDynamicResourceExtension.MethodId("619f5301-3df2-11e6-9bf8-29c5fda07fa3")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IAbstractChapterFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("7a904f0e-3e12-11e6-9bf8-29c5fda07fa3")
    public java.lang.String RenderElementName(final cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter abstractChapter);

    @IDynamicResourceExtension.MethodId("619f5301-3df2-11e6-9bf8-29c5fda07fa3")
    public java.lang.String RenderContentElement(final cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter abstractChapter);

  }
  
  public static class AbstractChapterFunctionsImpl implements IAbstractChapterFunctionsImpl {

    public static final IAbstractChapterFunctionsImpl INSTANCE = new AbstractChapterFunctionsImpl();

    private AbstractChapterFunctionsImpl() {}

    @Override
    public java.lang.String RenderElementName(final cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter abstractChapter) {
      /* Begin Protected Region [[7a904f0e-3e12-11e6-9bf8-29c5fda07fa3]] */
    	IDocumentElementComposite composite = DocumentElementComposite.selectToMeDocumentElements(abstractChapter);
    	if (composite instanceof IDocument)
    	{
    		return "chapter";
    	}
    	else
    	{
    		return "section";    		
    	}
      /* End Protected Region   [[7a904f0e-3e12-11e6-9bf8-29c5fda07fa3]] */
    }

    @Override
    public java.lang.String RenderContentElement(final cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter abstractChapter) {
      return null;
    }

  }
  
  public static class AbstractChapterFunctions {

    private AbstractChapterFunctions() {}

    public static java.lang.String RenderElementName(final cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter abstractChapter) {
      return DynamicResourceUtil.invoke(IAbstractChapterFunctionsImpl.class, AbstractChapterFunctionsImpl.INSTANCE, abstractChapter).RenderElementName(abstractChapter);
    }

    public static java.lang.String RenderContentElement(final cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter abstractChapter) {
      return DynamicResourceUtil.invoke(IAbstractChapterFunctionsImpl.class, AbstractChapterFunctionsImpl.INSTANCE, abstractChapter).RenderContentElement(abstractChapter);
    }

  }

  public static interface ITextFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("619f53b6-3df2-11e6-9bf8-29c5fda07fa3")
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

    @IDynamicResourceExtension.MethodId("68c5ffd3-cac4-11ec-8012-87976b97438b")
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

    @IDynamicResourceExtension.MethodId("221b5218-dbc4-11ea-b71c-ade06d3dafe4")
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

    @IDynamicResourceExtension.MethodId("619f53cf-3df2-11e6-9bf8-29c5fda07fa3")
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

  public static interface INoteFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("619f53f4-3df2-11e6-9bf8-29c5fda07fa3")
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

    @IDynamicResourceExtension.MethodId("619f5415-3df2-11e6-9bf8-29c5fda07fa3")
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

    @IDynamicResourceExtension.MethodId("619f542e-3df2-11e6-9bf8-29c5fda07fa3")
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

    @IDynamicResourceExtension.MethodId("619f5474-3df2-11e6-9bf8-29c5fda07fa3")
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

    @IDynamicResourceExtension.MethodId("619f5487-3df2-11e6-9bf8-29c5fda07fa3")
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

    @IDynamicResourceExtension.MethodId("619f54a6-3df2-11e6-9bf8-29c5fda07fa3")
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

    @IDynamicResourceExtension.MethodId("619f54b1-3df2-11e6-9bf8-29c5fda07fa3")
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

    @IDynamicResourceExtension.MethodId("619f54bc-3df2-11e6-9bf8-29c5fda07fa3")
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

    @IDynamicResourceExtension.MethodId("619f54c7-3df2-11e6-9bf8-29c5fda07fa3")
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

    @IDynamicResourceExtension.MethodId("619f54d2-3df2-11e6-9bf8-29c5fda07fa3")
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

    @IDynamicResourceExtension.MethodId("619f5529-3df2-11e6-9bf8-29c5fda07fa3")
    public java.lang.String RenderDocument();

    @IDynamicResourceExtension.MethodId("619f552e-3df2-11e6-9bf8-29c5fda07fa3")
    public java.lang.String RenderContent();

    @IDynamicResourceExtension.MethodId("619f5533-3df2-11e6-9bf8-29c5fda07fa3")
    public java.lang.String RenderContentElement();

    @IDynamicResourceExtension.MethodId("4bed296a-8d61-11eb-9f7d-b323dec096f1")
    public java.lang.String RenderDocumentHeader();

    @IDynamicResourceExtension.MethodId("506655b1-8d61-11eb-9f7d-b323dec096f1")
    public java.lang.String RenderDocumentBody();

    @IDynamicResourceExtension.MethodId("53bf169f-8d64-11eb-b45a-ad6318208ab5")
    public java.lang.String RenderCmdScript();

  }
  
  public static interface IDocumentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("619f5533-3df2-11e6-9bf8-29c5fda07fa3")
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

    @IDynamicResourceExtension.MethodId("61a19cc5-3df2-11e6-9bf8-29c5fda07fa3")
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

    @IDynamicResourceExtension.MethodId("61a19ce6-3df2-11e6-9bf8-29c5fda07fa3")
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

    @IDynamicResourceExtension.MethodId("61a19d07-3df2-11e6-9bf8-29c5fda07fa3")
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

    @IDynamicResourceExtension.MethodId("61a19d19-3df2-11e6-9bf8-29c5fda07fa3")
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

    @IDynamicResourceExtension.MethodId("0b01d8ec-117b-11e8-854a-3387d66a1f33")
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

    @IDynamicResourceExtension.MethodId("0000c7ff-e8f6-11e8-b810-cdb2b421fd42")
    public java.lang.String RenderContent();

    @IDynamicResourceExtension.MethodId("501eae2b-3d39-11eb-986d-0d884ba5cf53")
    public java.lang.Integer Count();

  }
  
  public static interface IItemizedListFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("501eae2b-3d39-11eb-986d-0d884ba5cf53")
    public java.lang.Integer Count(final cleon.common.doc.metamodel.spec.paragraph.javamodel.IItemizedList itemizedList);

  }
  
  public static class ItemizedListFunctionsImpl implements IItemizedListFunctionsImpl {

    public static final IItemizedListFunctionsImpl INSTANCE = new ItemizedListFunctionsImpl();

    private ItemizedListFunctionsImpl() {}

    @Override
    public java.lang.Integer Count(final cleon.common.doc.metamodel.spec.paragraph.javamodel.IItemizedList itemizedList) {
      /* Begin Protected Region [[501eae2b-3d39-11eb-986d-0d884ba5cf53]] */
    	int count = 0;
    	if( itemizedList.selectDescriptions() != null) {
    		count = itemizedList.selectDescriptions().size();
    	}
    	
    	if( itemizedList.selectParagraphs() != null ) {
    		count += itemizedList.selectParagraphs().size();
    	}
    	return count;
      /* End Protected Region   [[501eae2b-3d39-11eb-986d-0d884ba5cf53]] */
    }

  }
  
  public static class ItemizedListFunctions {

    private ItemizedListFunctions() {}

    public static java.lang.Integer Count(final cleon.common.doc.metamodel.spec.paragraph.javamodel.IItemizedList itemizedList) {
      return DynamicResourceUtil.invoke(IItemizedListFunctionsImpl.class, ItemizedListFunctionsImpl.INSTANCE, itemizedList).Count(itemizedList);
    }

  }

  public static interface IChapterAwareFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("619f533c-3df2-11e6-9bf8-29c5fda07fa3")
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

    @IDynamicResourceExtension.MethodId("619f532d-3df2-11e6-9bf8-29c5fda07fa3")
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

  public static interface IDocBookFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c0d81b31-2235-11e9-a054-db6d80fba790")
    public java.lang.String RenderContent(final cleon.common.doc.metamodel.spec.paragraph.javamodel.IText text);

    @IDynamicResourceExtension.MethodId("2fa0c3bf-1e85-11ea-862b-25dce7587113")
    public java.lang.String RenderDocumentContent(final cleon.common.doc.metamodel.spec.document.javamodel.IDocument document);

  }
  
  public static interface IDocBookFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DocBookFunctionsImpl implements IDocBookFunctionsImpl {

    public static final IDocBookFunctionsImpl INSTANCE = new DocBookFunctionsImpl();

    private DocBookFunctionsImpl() {}

  }
  
  public static class DocBookFunctions {

    private DocBookFunctions() {}

  }

  public static interface IAboutFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("39ac902d-08f9-11e9-9ee8-c54fda7ab431")
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

    @IDynamicResourceExtension.MethodId("cd167267-08f9-11e9-9ee8-c54fda7ab431")
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

    @IDynamicResourceExtension.MethodId("e49cbbd8-076c-11e9-8a1f-efe3fa2d8b84")
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

    @IDynamicResourceExtension.MethodId("ef28bff7-3d38-11eb-986d-0d884ba5cf53")
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

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,536edc4e-3de8-11e6-9bf8-29c5fda07fa3,JSIG33y3C80w4JYSDoR5L0FNCsE=] */
