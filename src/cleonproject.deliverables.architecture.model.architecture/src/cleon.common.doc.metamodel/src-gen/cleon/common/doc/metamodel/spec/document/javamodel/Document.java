package cleon.common.doc.metamodel.spec.document.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Document extends DynamicResource implements IDocument {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDocument> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDocument>() {
    
    @Override
    public IDocument create() {
      return new Document();
    }
    
    @Override
    public IDocument create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Document(resourceRepository, resource);
    }
  
  };

  public Document() {
    super(IDocument.TYPE_ID);
  }
  
  public Document(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDocument.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectImgDir() {
    return _getListAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_imgDir);
  }
    
  public void setImgDir(java.util.List<java.lang.String> imgDir) {
     _setListAttribute(cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_imgDir, imgDir);
  }

  @Override
  public java.lang.Boolean selectIsEnabled() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled);
  }
    
  public void setIsEnabled(java.lang.Boolean isEnabled) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, isEnabled);
  }

  @Override
  public java.lang.Boolean selectWithToC() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_withToC);
  }
    
  public void setWithToC(java.lang.Boolean withToC) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_withToC, withToC);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public Document setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public Document setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.documentlanguage.javamodel.IDocumentLanguage> selectDocumentLanguage() {
    return _getList(cleon.common.doc.metamodel.spec.documentlanguage.javamodel.IDocumentLanguage.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_documentLanguage);
  }

  public Document setDocumentLanguage(java.util.List<? extends cleon.common.doc.metamodel.spec.documentlanguage.javamodel.IDocumentLanguage> documentLanguage) {
    _setList(cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_documentLanguage, documentLanguage);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.document.properties.javamodel.IProperties selectProperties() {
    return _getSingle(cleon.common.doc.metamodel.spec.document.properties.javamodel.IProperties.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_properties);
  }

  public Document setProperties(cleon.common.doc.metamodel.spec.document.properties.javamodel.IProperties properties) {
    _setSingle(cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_properties, properties);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.document.style.javamodel.IStyle selectStyle() {
    return _getSingle(cleon.common.doc.metamodel.spec.document.style.javamodel.IStyle.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_style);
  }

  public Document setStyle(cleon.common.doc.metamodel.spec.document.style.javamodel.IStyle style) {
    _setSingle(cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_style, style);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Document setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_imgDir, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_withToC, visitor);
    // relations
    _acceptList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.documentlanguage.javamodel.IDocumentLanguage.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_documentLanguage, visitor);
    _acceptSingle(cleon.common.doc.metamodel.spec.document.properties.javamodel.IProperties.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_properties, visitor);
    _acceptSingle(cleon.common.doc.metamodel.spec.document.style.javamodel.IStyle.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_style, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.common.doc.metamodel.spec.document.javamodel.IDocument> selectToMeStyle(cleon.common.doc.metamodel.spec.document.style.javamodel.IStyle object) {
    return _getToMeList(object.getRepository(), cleon.common.doc.metamodel.spec.document.javamodel.IDocument.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_style, object.getResource());
  }
  
  public static cleon.common.doc.metamodel.spec.document.javamodel.IDocument selectToMeProperties(cleon.common.doc.metamodel.spec.document.properties.javamodel.IProperties object) {
    return _getToMeSingle(object.getRepository(), cleon.common.doc.metamodel.spec.document.javamodel.IDocument.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_properties, object.getResource());
  }
  
  public static cleon.common.doc.metamodel.spec.document.javamodel.IDocument selectToMeDocumentLanguage(cleon.common.doc.metamodel.spec.documentlanguage.javamodel.IDocumentLanguage object) {
    return _getToMeSingle(object.getRepository(), cleon.common.doc.metamodel.spec.document.javamodel.IDocument.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_documentLanguage, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,fd0b0ad8-28bc-11e5-bdaf-69a48f49df43,JF9dUUGYRKvC4+g+mUMiSmaT3hQ=] */
