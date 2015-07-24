package cleon.doc.spec.document.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class NoParagraphDocument extends DynamicResource implements INoParagraphDocument {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<INoParagraphDocument> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<INoParagraphDocument>() {
    
    @Override
    public INoParagraphDocument create() {
      return new NoParagraphDocument();
    }
    
    @Override
    public INoParagraphDocument create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new NoParagraphDocument(resourceRepository, resource);
    }
  
  };

  public NoParagraphDocument() {
    super(INoParagraphDocument.TYPE_ID);
  }
  
  public NoParagraphDocument(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, INoParagraphDocument.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters);
  }

  public NoParagraphDocument setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.document.javamodel.IDocument> selectDocuments() {
    return _getList(cleon.doc.spec.document.javamodel.IDocument.class, cleon.doc.spec.document.DocumentPackage.Document_documents);
  }

  public NoParagraphDocument setDocuments(java.util.List<? extends cleon.doc.spec.document.javamodel.IDocument> documents) {
    _setList(cleon.doc.spec.document.DocumentPackage.Document_documents, documents);
    return this;
  }
    
  @Override
  public cleon.doc.spec.chapter.paragraph.javamodel.IParagraph selectNoParagraphs() {
    return _getSingle(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph.class, cleon.doc.spec.document.DocumentPackage.NoParagraphDocument_noParagraphs);
  }

  public NoParagraphDocument setNoParagraphs(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph noParagraphs) {
    _setSingle(cleon.doc.spec.document.DocumentPackage.NoParagraphDocument_noParagraphs, noParagraphs);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public NoParagraphDocument setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes);
  }

  public NoParagraphDocument setParagraphes(java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public NoParagraphDocument setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectUseDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements);
  }

  public NoParagraphDocument setUseDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> useDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, useDocumentElements);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters, visitor);
    _acceptList(cleon.doc.spec.document.javamodel.IDocument.class, cleon.doc.spec.document.DocumentPackage.Document_documents, visitor);
    _acceptSingle(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph.class, cleon.doc.spec.document.DocumentPackage.NoParagraphDocument_noParagraphs, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, visitor);
  }

  // toMeRelations
  
  public static cleon.doc.spec.document.javamodel.INoParagraphDocument selectToMeNoParagraphs(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph object) {
    return _getToMeSingle(object.getRepository(), cleon.doc.spec.document.javamodel.INoParagraphDocument.class, cleon.doc.spec.document.DocumentPackage.NoParagraphDocument_noParagraphs, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,286a33d3-31f7-11e5-bd99-eda9ce254b0b,KgGUqDFReH3fU4LW7vxiNQYbt8A=] */
