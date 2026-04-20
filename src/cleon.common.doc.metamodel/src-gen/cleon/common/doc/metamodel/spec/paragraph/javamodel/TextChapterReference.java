package cleon.common.doc.metamodel.spec.paragraph.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TextChapterReference extends DynamicResource implements ITextChapterReference {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITextChapterReference> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITextChapterReference>() {
    
    @Override
    public ITextChapterReference create() {
      return new TextChapterReference();
    }
    
    @Override
    public ITextChapterReference create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TextChapterReference(resourceRepository, resource);
    }
  
  };

  public TextChapterReference() {
    super(ITextChapterReference.TYPE_ID);
  }
  
  public TextChapterReference(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITextChapterReference.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Boolean selectIsEnabled() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled);
  }
    
  public void setIsEnabled(java.lang.Boolean isEnabled) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, isEnabled);
  }

  @Override
  public java.lang.String selectText() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.paragraph.ParagraphPackage.TextAware_text);
  }
    
  public void setText(java.lang.String text) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.paragraph.ParagraphPackage.TextAware_text, text);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapterRef() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.paragraph.ParagraphPackage.ChapterReference_chapterRef);
  }

  public TextChapterReference setChapterRef(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapterRef) {
    _setList(cleon.common.doc.metamodel.spec.paragraph.ParagraphPackage.ChapterReference_chapterRef, chapterRef);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.NoDocumentElementComposite_documentElements);
  }

  public TextChapterReference setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.NoDocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public TextChapterReference setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.paragraph.javamodel.IStyle selectStyle() {
    return _getSingle(cleon.common.doc.metamodel.spec.paragraph.javamodel.IStyle.class, cleon.common.doc.metamodel.spec.paragraph.ParagraphPackage.Text_style);
  }

  public TextChapterReference setStyle(cleon.common.doc.metamodel.spec.paragraph.javamodel.IStyle style) {
    _setSingle(cleon.common.doc.metamodel.spec.paragraph.ParagraphPackage.Text_style, style);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.ILanguageTextTranslation> selectTextTranslation() {
    return _getMap(cleon.common.doc.metamodel.spec.paragraph.javamodel.ILanguageTextTranslation.class, cleon.common.doc.metamodel.spec.paragraph.ParagraphPackage.TextAware_textTranslation);
  }

  public TextChapterReference setTextTranslation(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.ILanguageTextTranslation> textTranslation) {
    _setMap(cleon.common.doc.metamodel.spec.paragraph.ParagraphPackage.TextAware_textTranslation, textTranslation);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TextChapterReference setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.paragraph.ParagraphPackage.TextAware_text, visitor);
    // relations
    _acceptList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.paragraph.ParagraphPackage.ChapterReference_chapterRef, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.common.doc.metamodel.spec.paragraph.javamodel.IStyle.class, cleon.common.doc.metamodel.spec.paragraph.ParagraphPackage.Text_style, visitor);
    _acceptMap(cleon.common.doc.metamodel.spec.paragraph.javamodel.ILanguageTextTranslation.class, cleon.common.doc.metamodel.spec.paragraph.ParagraphPackage.TextAware_textTranslation, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,56be6ccf-dbc2-11ea-b71c-ade06d3dafe4,fnmSmNfkS7u2sODig+pcime6N3A=] */
