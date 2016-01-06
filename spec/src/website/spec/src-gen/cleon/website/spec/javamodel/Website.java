package cleon.website.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Website extends DynamicResource implements IWebsite {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWebsite> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWebsite>() {
    
    @Override
    public IWebsite create() {
      return new Website();
    }
    
    @Override
    public IWebsite create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Website(resourceRepository, resource);
    }
  
  };

  public Website() {
    super(IWebsite.TYPE_ID);
  }
  
  public Website(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IWebsite.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters);
  }

  public Website setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.website.spec.static_content.javamodel.IImage selectCover() {
    return _getSingle(cleon.website.spec.static_content.javamodel.IImage.class, cleon.website.spec.SpecPackage.Website_cover);
  }

  public Website setCover(cleon.website.spec.static_content.javamodel.IImage cover) {
    _setSingle(cleon.website.spec.SpecPackage.Website_cover, cover);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.document.javamodel.ISubDocument> selectDocuments() {
    return _getList(cleon.doc.spec.document.javamodel.ISubDocument.class, cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents);
  }

  public Website setDocuments(java.util.List<? extends cleon.doc.spec.document.javamodel.ISubDocument> documents) {
    _setList(cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents, documents);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.website.spec.static_content.javamodel.IImage> selectImages() {
    return _getList(cleon.website.spec.static_content.javamodel.IImage.class, cleon.website.spec.SpecPackage.Website_images);
  }

  public Website setImages(java.util.List<? extends cleon.website.spec.static_content.javamodel.IImage> images) {
    _setList(cleon.website.spec.SpecPackage.Website_images, images);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.website.spec.static_content.javamodel.ILayout> selectLayouts() {
    return _getList(cleon.website.spec.static_content.javamodel.ILayout.class, cleon.website.spec.SpecPackage.Website_layouts);
  }

  public Website setLayouts(java.util.List<? extends cleon.website.spec.static_content.javamodel.ILayout> layouts) {
    _setList(cleon.website.spec.SpecPackage.Website_layouts, layouts);
    return this;
  }
    
  @Override
  public cleon.website.spec.static_content.javamodel.IImage selectLogo() {
    return _getSingle(cleon.website.spec.static_content.javamodel.IImage.class, cleon.website.spec.SpecPackage.Website_logo);
  }

  public Website setLogo(cleon.website.spec.static_content.javamodel.IImage logo) {
    _setSingle(cleon.website.spec.SpecPackage.Website_logo, logo);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public Website setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes);
  }

  public Website setParagraphes(java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public cleon.doc.spec.document.style.javamodel.IStyle selectStyle() {
    return _getSingle(cleon.doc.spec.document.style.javamodel.IStyle.class, cleon.doc.spec.document.DocumentPackage.Document_style);
  }

  public Website setStyle(cleon.doc.spec.document.style.javamodel.IStyle style) {
    _setSingle(cleon.doc.spec.document.DocumentPackage.Document_style, style);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Website setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectUseDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements);
  }

  public Website setUseDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> useDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, useDocumentElements);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, visitor);
    _acceptSingle(cleon.website.spec.static_content.javamodel.IImage.class, cleon.website.spec.SpecPackage.Website_cover, visitor);
    _acceptList(cleon.doc.spec.document.javamodel.ISubDocument.class, cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents, visitor);
    _acceptList(cleon.website.spec.static_content.javamodel.IImage.class, cleon.website.spec.SpecPackage.Website_images, visitor);
    _acceptList(cleon.website.spec.static_content.javamodel.ILayout.class, cleon.website.spec.SpecPackage.Website_layouts, visitor);
    _acceptSingle(cleon.website.spec.static_content.javamodel.IImage.class, cleon.website.spec.SpecPackage.Website_logo, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, visitor);
    _acceptSingle(cleon.doc.spec.document.style.javamodel.IStyle.class, cleon.doc.spec.document.DocumentPackage.Document_style, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, visitor);
  }

  // toMeRelations
  
  public static cleon.website.spec.javamodel.IWebsite selectToMeImages(cleon.website.spec.static_content.javamodel.IImage object) {
    return _getToMeSingle(object.getRepository(), cleon.website.spec.javamodel.IWebsite.class, cleon.website.spec.SpecPackage.Website_images, object.getResource());
  }
  
  public static java.util.List<cleon.website.spec.javamodel.IWebsite> selectToMeLogo(cleon.website.spec.static_content.javamodel.IImage object) {
    return _getToMeList(object.getRepository(), cleon.website.spec.javamodel.IWebsite.class, cleon.website.spec.SpecPackage.Website_logo, object.getResource());
  }
  
  public static java.util.List<cleon.website.spec.javamodel.IWebsite> selectToMeCover(cleon.website.spec.static_content.javamodel.IImage object) {
    return _getToMeList(object.getRepository(), cleon.website.spec.javamodel.IWebsite.class, cleon.website.spec.SpecPackage.Website_cover, object.getResource());
  }
  
  public static cleon.website.spec.javamodel.IWebsite selectToMeLayouts(cleon.website.spec.static_content.javamodel.ILayout object) {
    return _getToMeSingle(object.getRepository(), cleon.website.spec.javamodel.IWebsite.class, cleon.website.spec.SpecPackage.Website_layouts, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d9c0f89d-afd7-11e5-a976-57ed3906441a,nBKdCWJn9wKtd3KKP4HX1pI9MbQ=] */
