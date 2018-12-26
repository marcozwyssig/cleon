package cleon.common.doc.spec.doc.chapter.about.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Layout extends DynamicResource implements ILayout {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILayout> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILayout>() {
    
    @Override
    public ILayout create() {
      return new Layout();
    }
    
    @Override
    public ILayout create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Layout(resourceRepository, resource);
    }
  
  };

  public Layout() {
    super(ILayout.TYPE_ID);
  }
  
  public Layout(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ILayout.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.doc.spec.doc.chapter.about.javamodel.IChapterDescription> selectChapterDescription() {
    return _getMap(cleon.common.doc.spec.doc.chapter.about.javamodel.IChapterDescription.class, cleon.common.doc.spec.doc.chapter.about.AboutPackage.Layout_chapterDescription);
  }

  public Layout setChapterDescription(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.doc.spec.doc.chapter.about.javamodel.IChapterDescription> chapterDescription) {
    _setMap(cleon.common.doc.spec.doc.chapter.about.AboutPackage.Layout_chapterDescription, chapterDescription);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IChapter> selectChapters() {
    return _getList(cleon.common.doc.spec.doc.chapter.javamodel.IChapter.class, cleon.common.doc.spec.doc.DocPackage.OnlyStandardElementsChapter_chapters);
  }

  public Layout setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.OnlyStandardElementsChapter_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public Layout setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IStandardParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IStandardParagraph.class, cleon.common.doc.spec.doc.DocPackage.OnlyStandardElementsChapter_paragraphs);
  }

  public Layout setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IStandardParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.DocPackage.OnlyStandardElementsChapter_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Layout setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptMap(cleon.common.doc.spec.doc.chapter.about.javamodel.IChapterDescription.class, cleon.common.doc.spec.doc.chapter.about.AboutPackage.Layout_chapterDescription, visitor);
    _acceptList(cleon.common.doc.spec.doc.chapter.javamodel.IChapter.class, cleon.common.doc.spec.doc.DocPackage.OnlyStandardElementsChapter_chapters, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IStandardParagraph.class, cleon.common.doc.spec.doc.DocPackage.OnlyStandardElementsChapter_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.common.doc.spec.doc.chapter.about.javamodel.ILayout selectToMeChapterDescription(cleon.common.doc.spec.doc.chapter.about.javamodel.IChapterDescription object) {
    return _getToMeSingle(object.getRepository(), cleon.common.doc.spec.doc.chapter.about.javamodel.ILayout.class, cleon.common.doc.spec.doc.chapter.about.AboutPackage.Layout_chapterDescription, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,858bbbc1-0786-11e9-99e7-97cc29f85ed6,5EViqLzbU4HzkptB7sweaO7PFKE=] */
