package cleon.publishing.staticwebsite.spec.website.javamodel;

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
  public java.util.List<java.lang.String> selectImgDir() {
    return _getListAttribute(java.lang.String.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_imgDir);
  }
    
  public void setImgDir(java.util.List<java.lang.String> imgDir) {
     _setListAttribute(cleon.common.doc.spec.doc.document.DocumentPackage.Document_imgDir, imgDir);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.Boolean selectWithToC() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_withToC);
  }
    
  public void setWithToC(java.lang.Boolean withToC) {
     _setSingleAttribute(cleon.common.doc.spec.doc.document.DocumentPackage.Document_withToC, withToC);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters);
  }

  public Website setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.publishing.staticwebsite.spec.website.static_content.javamodel.IImage selectCover() {
    return _getSingle(cleon.publishing.staticwebsite.spec.website.static_content.javamodel.IImage.class, cleon.publishing.staticwebsite.spec.website.WebsitePackage.Website_cover);
  }

  public Website setCover(cleon.publishing.staticwebsite.spec.website.static_content.javamodel.IImage cover) {
    _setSingle(cleon.publishing.staticwebsite.spec.website.WebsitePackage.Website_cover, cover);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public Website setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.documentlanguage.javamodel.IDocumentLanguage> selectDocumentLanguage() {
    return _getList(cleon.common.doc.spec.doc.documentlanguage.javamodel.IDocumentLanguage.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_documentLanguage);
  }

  public Website setDocumentLanguage(java.util.List<? extends cleon.common.doc.spec.doc.documentlanguage.javamodel.IDocumentLanguage> documentLanguage) {
    _setList(cleon.common.doc.spec.doc.document.DocumentPackage.Document_documentLanguage, documentLanguage);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.publishing.staticwebsite.spec.website.static_content.javamodel.IImage> selectImages() {
    return _getList(cleon.publishing.staticwebsite.spec.website.static_content.javamodel.IImage.class, cleon.publishing.staticwebsite.spec.website.WebsitePackage.Website_images);
  }

  public Website setImages(java.util.List<? extends cleon.publishing.staticwebsite.spec.website.static_content.javamodel.IImage> images) {
    _setList(cleon.publishing.staticwebsite.spec.website.WebsitePackage.Website_images, images);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.publishing.staticwebsite.spec.website.static_content.javamodel.ILayout> selectLayouts() {
    return _getList(cleon.publishing.staticwebsite.spec.website.static_content.javamodel.ILayout.class, cleon.publishing.staticwebsite.spec.website.WebsitePackage.Website_layouts);
  }

  public Website setLayouts(java.util.List<? extends cleon.publishing.staticwebsite.spec.website.static_content.javamodel.ILayout> layouts) {
    _setList(cleon.publishing.staticwebsite.spec.website.WebsitePackage.Website_layouts, layouts);
    return this;
  }
    
  @Override
  public cleon.publishing.staticwebsite.spec.website.static_content.javamodel.IImage selectLogo() {
    return _getSingle(cleon.publishing.staticwebsite.spec.website.static_content.javamodel.IImage.class, cleon.publishing.staticwebsite.spec.website.WebsitePackage.Website_logo);
  }

  public Website setLogo(cleon.publishing.staticwebsite.spec.website.static_content.javamodel.IImage logo) {
    _setSingle(cleon.publishing.staticwebsite.spec.website.WebsitePackage.Website_logo, logo);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.document.properties.javamodel.IProperties selectProperties() {
    return _getSingle(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties);
  }

  public Website setProperties(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties properties) {
    _setSingle(cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties, properties);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.document.style.javamodel.IStyle selectStyle() {
    return _getSingle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_style);
  }

  public Website setStyle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle style) {
    _setSingle(cleon.common.doc.spec.doc.document.DocumentPackage.Document_style, style);
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
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_imgDir, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_withToC, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, visitor);
    _acceptSingle(cleon.publishing.staticwebsite.spec.website.static_content.javamodel.IImage.class, cleon.publishing.staticwebsite.spec.website.WebsitePackage.Website_cover, visitor);
    _acceptList(cleon.common.doc.spec.doc.documentlanguage.javamodel.IDocumentLanguage.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_documentLanguage, visitor);
    _acceptList(cleon.publishing.staticwebsite.spec.website.static_content.javamodel.IImage.class, cleon.publishing.staticwebsite.spec.website.WebsitePackage.Website_images, visitor);
    _acceptList(cleon.publishing.staticwebsite.spec.website.static_content.javamodel.ILayout.class, cleon.publishing.staticwebsite.spec.website.WebsitePackage.Website_layouts, visitor);
    _acceptSingle(cleon.publishing.staticwebsite.spec.website.static_content.javamodel.IImage.class, cleon.publishing.staticwebsite.spec.website.WebsitePackage.Website_logo, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_style, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.publishing.staticwebsite.spec.website.javamodel.IWebsite selectToMeImages(cleon.publishing.staticwebsite.spec.website.static_content.javamodel.IImage object) {
    return _getToMeSingle(object.getRepository(), cleon.publishing.staticwebsite.spec.website.javamodel.IWebsite.class, cleon.publishing.staticwebsite.spec.website.WebsitePackage.Website_images, object.getResource());
  }
  
  public static java.util.List<cleon.publishing.staticwebsite.spec.website.javamodel.IWebsite> selectToMeLogo(cleon.publishing.staticwebsite.spec.website.static_content.javamodel.IImage object) {
    return _getToMeList(object.getRepository(), cleon.publishing.staticwebsite.spec.website.javamodel.IWebsite.class, cleon.publishing.staticwebsite.spec.website.WebsitePackage.Website_logo, object.getResource());
  }
  
  public static java.util.List<cleon.publishing.staticwebsite.spec.website.javamodel.IWebsite> selectToMeCover(cleon.publishing.staticwebsite.spec.website.static_content.javamodel.IImage object) {
    return _getToMeList(object.getRepository(), cleon.publishing.staticwebsite.spec.website.javamodel.IWebsite.class, cleon.publishing.staticwebsite.spec.website.WebsitePackage.Website_cover, object.getResource());
  }
  
  public static cleon.publishing.staticwebsite.spec.website.javamodel.IWebsite selectToMeLayouts(cleon.publishing.staticwebsite.spec.website.static_content.javamodel.ILayout object) {
    return _getToMeSingle(object.getRepository(), cleon.publishing.staticwebsite.spec.website.javamodel.IWebsite.class, cleon.publishing.staticwebsite.spec.website.WebsitePackage.Website_layouts, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d9c0f89d-afd7-11e5-a976-57ed3906441a,UTQyABcE+Rrnc146HHlGIwJBQ78=] */
